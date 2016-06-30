package at.fhj.itm;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestPoint2d {

	Point2d point1;
	Point2d point2;
	
	@Before
	public void setUp() {
		this.point1  = new Point2d(4.0, 3.0);
		this.point2 = new Point2d();
	}

	@Test
	public void testSetX() {
		double x1 = 6.0;
		point1.setX(6.0);
		assertEquals(x1, point1.getX() , 0.0000001);
	}

	@Test
	public void testGetX() {
		double x2 = point1.getX();
		double x3 = 4.0;
		assertEquals(x3, x2, 0.0000001);
	}

	@Test
	public void testSetY() {
		double y1 = 6.0;
		point1.setY(6.0);
		assertEquals(y1, point1.getY() , 0.0000001);
	}

	@Test
	public void testGetY() {
		double y2 = point1.getX();
		double y3 = 4.0;
		assertEquals(y3, y2, 0.0000001);
	}

	@Test
	public void testDistanceFrom() {
		double dis = Math.sqrt(((point1.getX() - point2.getX())*(point1.getX() - point2.getX()))+((point1.getY() - point2.getY())*(point1.getY() - point2.getY())));
		assertEquals(dis, point1.distanceFrom(point2),  0.0000001);
	}

	@Test
	public void testDistanceFromOrigin() {
		double zero = Math.sqrt(((point1.getX())*(point1.getX()))+((point1.getY())*(point1.getY())));
		assertEquals(zero, point1.distanceFromOrigin(),  0.0000001);
	}

}
