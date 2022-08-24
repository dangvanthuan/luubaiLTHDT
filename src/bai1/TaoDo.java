package bai1;

public class TaoDo {
	private String ten;
	private int x;
	private int y;
	public TaoDo() {
		// TODO Auto-generated constructor stub
	}
	public TaoDo(String ten, int x, int y) {
		super();
		this.ten = ten;
		this.x = x;
		this.y = y;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ten+"("+x+","+y+")";
	}
}
