package test;

public class TRy extends Training{

	private int go = 90;
	
	public int decrese(int x) {
		return go - x;
	}
	
	@Override
	public int doubleInt(int x) {
		return x * go;
	}
}
