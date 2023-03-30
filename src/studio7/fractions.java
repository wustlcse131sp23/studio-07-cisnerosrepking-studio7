package studio7;

public class fractions {

	private int top;
	private int bottom;
	
	public fractions (int t, int b) {
		top = t;
		bottom = b;
	}
	
	public int multiplyTop (fractions f, fractions k) {
		return f.top * k.top;
	}
	public int multiplyBottom (fractions f, fractions k) {
		return f.bottom * k.bottom;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
fractions f = new fractions (1,2);
fractions k = new fractions (1, 4);
System.out.println(f.multiplyTop(f, k) + "/" + f.multiplyBottom(f, k));

	}

}
