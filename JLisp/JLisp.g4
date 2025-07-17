grammar JLisp;


@parser::header {
  import java.util.HashMap;
}

@lexer::header {
  import java.util.HashMap;
}

@members{
  int numOps = 1; //numero de operaciones, comienza en 1 porque al menos se carga el argumento del main
  HashMap<String,VarInfo> memory = new HashMap<String, VarInfo>(); //mapea el ID con el numero para la variable local
  int localVarNum = 1; // cantidad de variables locales.
  boolean comand=false;
}

/**The start rule; beging parsing here.*/
program : sexpr
        | comands{comand=true;};

comands : help
        | compile
        | genBytecode
        | interprete
        | execute;

help : ('--help'|'--h');        
compile : ('--compile'|'--c');
interprete : ('--interprete'|'--i');
execute :   ('--execute'|'--e');
genBytecode:('--gbytecode'|'--g');

sexpr	returns [EnumType type=EnumType.INT]  :b=atom{$type=$b.type;}
                                            |a=list {$type=$a.type;};

atom  returns [EnumType type=EnumType.INT]
                                  :  a=num_atom{$type=$a.type;}
                                  |  string{$type=EnumType.STRING;}
                                  |  b=symb_atom{$type=$b.type;};

num_atom returns [EnumType type] 
                                 : decimal{$type=EnumType.INT;}
                                 | real{$type=EnumType.FRACTION;}
                                 | racional{$type=EnumType.FLOAT;};

decimal : INT;

real : REAL;

racional :decimal '.' decimal epart?;

epart : E decimal;

string : '\"'(WSP|UC|LC|DIGIT)+ '\"';

symb_atom returns [EnumType type]
                  : symbol{
                    if(memory.get($symbol.text)!=null)
                        $type=memory.get($symbol.text).getEnumType();
                  }
		             | p=special_symbol{$type=$p.type;};

symbol : (init_symbol)?(alpha)(alpha|INT|init_symbol)*; 

init_symbol : A_OPERATOR
            | L_OPERATOR
            | SIMPLE_PUNC;

special_symbol returns [EnumType type] 
                                       : NIL {$type=EnumType.NIL;}
                                       | T {$type=EnumType.T;};

list returns [EnumType type=EnumType.INT] : LP WSP* l=list_body? RP {$type=$l.type;};

list_body returns [EnumType type=EnumType.INT] 
                                       : a=aritm_expr{$type=$a.type;}
                                       | l=logic_expr{$type=$l.type;}
                                       | cond_expr
                                       | m=macro_expr{$type=$m.type;}
                                       | b=break_expr{$type=$b.type;};

break_expr returns [EnumType type=EnumType.V]: WSP* BREAK WSP*;

aritm_expr returns [EnumType type=EnumType.INT] :
                                     A_OPERATOR (WSP|se+=sexpr)+{
                                                 for(int i = 0; i < $se.size(); i++){
                                                       if($se.get(i).type==EnumType.FLOAT){
                                                            $type=EnumType.FLOAT;
                                                            break;
                                                        }
                                                       }
                                                numOps++;
                                               };

logic_expr returns [EnumType type=EnumType.T]: L_OPERATOR (WSP|sexpr)+ {numOps++;};

cond_expr         : if_statement
                  | loop_statement;

if_statement : WSP* IF WSP* condition  WSP* true_cond WSP* false_cond? WSP*; 

condition : sexpr; 
true_cond  : sexpr;
false_cond : sexpr;
 
loop_statement: WSP* LOOP (WSP|sexpr)+ WSP*;

macro_expr returns [EnumType type=EnumType.INT]
           : b=macro_setf{$type=$b.type;}
           | a=macro_print{$type=$a.type;}
           | p=macro_progn{$type=$p.type;}
           | macro_quote{$type=EnumType.STRING;}
           | r=macro_read{$type=$r.type;}
           | e=macro_expt{$type=$e.type;}
           | m=macro_max{$type=$m.type;};

macro_expt returns [EnumType type=EnumType.INT] : WSP* EXPT WSP* a=sexpr WSP* b=sexpr WSP*
                                                  {
                                                      if($a.type==EnumType.FLOAT || $b.type==EnumType.FLOAT)
                                                        $type=EnumType.FLOAT; 
                                                       numOps++;  
                                                  };

macro_max returns [EnumType type=EnumType.INT]:  WSP* MAX WSP* (WSP|s+=sexpr)+ WSP*{
                                                     for(int i = 0; i < $s.size(); i++){
                                                       if($s.get(i).type==EnumType.FLOAT){
                                                            $type=EnumType.FLOAT;
                                                            break;
                                                        }
                                                       }
                                                      numOps++; 
                                                   };

macro_setf returns [EnumType type=EnumType.INT]
                                : WSP* SETF WSP* symbol WSP* e=sexpr WSP*{
                                                  if(memory.get($symbol.text)==null)
                                                     memory.put($symbol.text,new VarInfo($e.type,++localVarNum));
                                                   else
                                                     memory.put($symbol.text,new VarInfo($e.type,memory.get($symbol.text).getNum()));
                                                    $type=$e.type;
                                                  };

macro_quote : WSP* QUOTE WSP* (string|sexpr) WSP*;

macro_print returns [EnumType type] 
                                      : WSP* PRINT WSP* a=sexpr WSP*{
                                                                      $type=$a.type;
                                                                    };

macro_read returns [EnumType type=EnumType.INT]
                                  : WSP* READ WSP*{
                                                    if(memory.get($READ.text) == null)
                                                    { //adiciona var read una vez y deja espacio para dos variables locales
                                                      memory.put($READ.text, new VarInfo(localVarNum));
                                                      localVarNum++;
                                                    }
                                                  };

macro_progn returns [EnumType type]: WSP* PROGN (WSP|a=sexpr)+{$type=$a.type;};


alpha     	:     UC
                | LC 
                | DIGIT ;

SIMPLE_PUNC   : '.'| '_' | ':'|'\\';

A_OPERATOR :   '+'
               | '-'
               | '*'
               | '/';

L_OPERATOR :     '<'
                | '>'
 		            | '=';
 
NIL        	: ('n'|'N')('i'|'I')('l'|'L');

T          :  ('T'|'t');

WSP   : (' ' | '\t' | '\r' | '\n' )+ ;
REAL: [0-9]+'/'[0-9]+;
E :'E';
INT :DIGIT+;
LC    : [a-z];
UC    : [A-Z];
DIGIT : [0-9];
LP : '(';
RP : ')';
IF : 'if';

MAX : ('m'|'M')('a'|'A')('x'|'X');

EXPT : ('e'|'E')('x'|'X')('p'|'P')('t'|'T');

LOOP : ('l'|'L')('o'|'O')('o'|'O')('p'|'P');

BREAK : ('r'|'R')('e'|'E')('t'|'T')('u'|'U')('r'|'R')('n'|'N');

SETF : ('s'|'S')('e'|'E')('t'|'T')('f'|'F');

QUOTE : ('q'|'Q')('u'|'U')('o'|'O')('t'|'T')('e'|'E');

PRINT : ('p'|'P')('r'|'R')('i'|'I')('n'|'N')('t'|'T');

READ :  ('r'|'R')('e'|'E')('a'|'A')('d'|'D');

PROGN : ('p'|'P')('r'|'R')('o'|'O')('g'|'G')('n'|'N');

WS :[ \t]+ -> skip ;