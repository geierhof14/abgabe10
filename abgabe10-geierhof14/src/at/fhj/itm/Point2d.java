package at.fhj.itm;
/**
 * The purpose of this class is, the calculation of two points in a two-dimensional space
 * 
 * @author Roman-Franz Geierhofer
 *
 *@version 1.0
 */
class Point2d {
	private boolean debug;
	public double x;
	public double y;

	/**
	 * Constructor of Point2d
	 * 
	 * @param px - value of the x-coordinate
	 * @param py - value of the y-coordinate
	 */
	public Point2d (double px, double py) {
		this.x=px;
		this.y=py;
	}

	/**
	 * Constructor of Point2d has by default 0/0
	 */
	public Point2d() {		
		this.x=0;
		this.y=0;
	}

	/**
	 * Constructor of Point2d -  duplicates another point
	 * 
	 * @param pt - used Point2d
	 */
	public Point2d(Point2d pt) {
		this.x=pt.getX();
		this.y=pt.getY();
	}

	/**
	 * if the debug is true, it prints a String in the console
	 * 
	 * @param s - the printed String
	 */
	public void dprint(String s) {
		if(debug)
			System.out.println("Debug: " + s);
	}

	/**
	 * sets the debug true | false
	 * 
	 * @param b - true | false to set debug
	 */
	public void setDebug(boolean b) {
		this.debug=b;
	}

	/**
	 * sets the x-coordinate, prints a String if debug is true
	 * 
	 * @param px - the new x-coordinate
	 */
	public void setX(double px) {
		dprint("setX(): Changing value of X from " + x + " to " + px );
		this.x=px;
	}
	
	/**
	 * gives the x-coordinate back
	 * 
	 * @return - the sat x-coordinate
	 */
	public double getX() {
		return this.x;
	}

	/**
	 * sets the y-coordinate, prints a String if debug is true
	 * 
	 * @param py - the new x-coordinate
	 */
	public void setY(double py)  {
		dprint("setY(): Changing value of Y from " + y + " to " + py );
		this.y=py;
	}

	/**
	 * gives the y-coordinate back
	 * 
	 * @return - the sat y-coordinate
	 */
	public double getY() {
		return this.y;
	}

	/**
	 * sets the x and y-coordinates at the same time
	 * 
	 * @param px - the x-coordinate
	 * @param py - the y-coordinate
	 */
	public void setXY(double px, double py) {
		this.x=px;
		this.y=py;
	}

	/**
	 * calculates the distance between two points
	 * 
	 * @param pt - the other point from which the distance is calculatet
	 * @return - the distance
	 */
	public double distanceFrom (Point2d pt) {
		double x2 = pt.getX();
		double y2 = pt.getY();
		return Math.sqrt(((this.x - x2)*(this.x - x2))+((this.y - y2)*(this.y - y2)));
	}

	/**
	 * calculates the distance between 0/0 and the point
	 * 
	 * @return - the distance
	 */
	public double distanceFromOrigin () {
		return Math.sqrt(((this.x)*(this.x))+((this.y)*(this.y)));
	}

	/**
	 * formats the point to (x, y)
	 * 
	 * @return - a String for the point
	 */
	public String toString() {
		return " x= " + this.x + ", y= " + this.y;
	}
}

