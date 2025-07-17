public class VarInfo {
    private Value v;
    private int num; // correponde al entero asignado a cada variable para generar el bytecode
    private EnumType type;
    public VarInfo(int num, Value v) {
        this.num = num;
        this.v = v;
    }

    public VarInfo(EnumType type, int num) {
        this.type = type;
        this.num = num;
    }

    public VarInfo(EnumType type, int num, Value v) {
        this.type = type;
        this.num = num;
        this.v = v;
    }
    //constructor para el caso de algun elemento que no tenga tipo por ejemplo la variable reservada para el read.
    public VarInfo(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public Value getValue() {
        return v;
    }
    
    public void setValue(Value v) {
        this.v = v;
    }

     public EnumType getEnumType() {
        return type;
    }
    
    public void setEnumType(EnumType type) {
        this.type =type;
    }
}