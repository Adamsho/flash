package test;

public class Training {

	private int s = 2;

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}
	
	public int doubleInt(int x) {
		return this.s * x;
	}
	
	public static int doubleInt(int x, int y) {
		return y * x;
	}
	
	public static double doubleInt(int x, int y, int z) {
		return y * x * z;
	}
	
}
