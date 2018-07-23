
public class Point {

	private double x ; 
	private double y ; 

	Point (double x, double y) {
		this.x = x ;
		this.y = y ;	
	}
	
	public boolean coincide (Point pt) {
		return ((pt.x == x) && (pt.y==y));
	}
	
	public static void main (String args []) {
		Point p1 = new Point (1, 3); 
		Point p2 = new Point (2, 9);
		Point p3 = new Point (1, 3);
		
		System.out.println ("p1 et p2 " + p1.coincide(p2)); // équivalent à p2.coincide (p1)
		System.out.println ("p1 et p3 " + p1.coincide(p3));
		
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
