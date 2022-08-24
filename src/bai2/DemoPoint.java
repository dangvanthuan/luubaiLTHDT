package bai2;

public class DemoPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point("A", 1, 2, 3);
		System.out.println("Khoang cach tu O den no:"+p1.getDistance());
		System.out.println(p1);
		System.out.println("Diem doi qua goc: "+p1.negate());
	}

}
