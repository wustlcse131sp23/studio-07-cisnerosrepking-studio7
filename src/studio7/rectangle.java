package studio7;
import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;
public class rectangle {
	
	private static final Color BLUE = null;
	private int width;
	private int length;
public rectangle (int w, int l) {
width = w;
length = l;}

public int area(int w, int l) {
	return w*l;
}
public int perimeter(int w, int l) {
	return 2*w + 2*l;
}
public boolean square (rectangle r) {
	if (r.length == r.width) {
		return true;}
		else {
			return false;}
				
	}
public boolean size (rectangle r, rectangle rx) {
	if (r.area(r.length,r.width)<rx.area(rx.length,rx.width)){
		return true;
	}
	else {
		return false;}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	rectangle r = new rectangle (5, 8); 
		System.out.println(r.width);
		r.area(5, 8);
		r.perimeter(5, 8);
		System.out.println(r.area(5, 8));
		System.out.println(r.perimeter(5, 8));
		System.out.println(r.square(r));
		
		rectangle rx = new rectangle (9, 10); 
		System.out.println(rx.width);
		rx.area(9, 10);
		rx.perimeter(9, 10);
		
		r.size(r, rx);
		System.out.println(r.size(r, rx));
		
		StdDraw.clear();
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledRectangle(.5, .5, .05 * r.width, .05 * r.length);
		
		
		
		
	}

	//private static void setPenColor(int i, int j, int k) {
		// TODO Auto-generated method stub
		
	

	//private static void StdDraw.setPenColor(int i, int j, int k) {
		// TODO Auto-generated method stub
		
	}

