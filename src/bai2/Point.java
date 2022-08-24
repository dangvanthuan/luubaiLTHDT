package bai2;

public class Point {
	private String ten;
	private int x;
	private int y;
	private int z;
	public Point() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Point(String ten, int x, int y, int z) {
		super();
		this.ten = ten;
		this.x = x;
		this.y = y;
		this.z = z;
	}


	public Point negate() {
		Point p = new Point("~"+ten,-x,-y,-z);
		return p;
	}
	public double getDistance() {
		return Math.sqrt(x*x+y*y+z*z);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ten+"("+x+","+y+","+z+")";
	}
}
