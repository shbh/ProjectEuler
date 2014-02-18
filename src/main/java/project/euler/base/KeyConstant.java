package project.euler.base;

public interface KeyConstant {

	public static final int ALLOWEDTIME = 60000;
	public static final String COMMA = ",";
	public static final String FORWARD_SLASH = "\"";
	public static final String BLANK = "";
	public static final int[] COINS = new int[] { 1, 2, 5, 10, 20, 50, 100, 200 };
	public static final int[] NON_LEAP_YEAR = {31,28,31,30,31,30,31,31,30,31,30,31};
	public static final int[] A_LEAP_YEAR = {31,29,31,30,31,30,31,31,30,31,30,31};
	
    public static final String SPACE =  " ";
    public static final String HYPHEN =  "-";
    public static final String AND =  "and";
    
    public static final String HYPHENSPACEREGEX= "[\\s\\-()]";
   	public static final String MULTISTAR = "----------------------------------------";
   	public static final String DOUBLEMULTILINE=MULTISTAR+MULTISTAR+MULTISTAR+MULTISTAR;
   	public static final String NEWLINE = "\n";
   	
    public enum NUMBER {
        zero(0),one(1), two(2),three(3), four(4), five(5),six(6), seven(7), eight(8), nine(9), ten(10), eleven(11), twelve(12), thirteen(31), fourteen(14), fifteen(15), sixteen(16), seventeen(17),
        eighteen(18), nineteen(19), twenty(20), thirty(30), forty(40), fifty(50), sixty(60), seventy(70), eighty(80), ninety(90),hundred(100), thousand(1000);

        private final int number;
        NUMBER(final int number) { this.number = number; }
        public int getValue() { return number; }

    }
   
	public enum FourState {
	    PASS,
	    FAIL,
	    TIME_EXCEEDED,
	    MISMATCH
	};
}
