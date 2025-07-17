public enum EnumType {
    INT("i"),FLOAT("f"),NIL("n"),T("t"),FRACTION("r"),STRING("s"),V("v");
	private final String value;
	private EnumType(String value){
	    this.value= value;
	}
	public String value(){
	    return value;
	}
	
};