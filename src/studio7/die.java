package studio7;

public class die {
	private int sides;
	
	
	public die (int n) {
		sides = n;
	}
	public int roll(die d) {
		return (int)(Math.random()*(d.sides)) + 1;
	}

	public static void main(String[] args) {
die d = new die (6);
	d.roll(d);
	System.out.println(d.roll(d));
	}
	
	

}
