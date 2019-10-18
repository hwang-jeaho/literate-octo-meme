package sub4;

public class Calc {

	//싱글톤(정적) 객체
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	public Calc() {}  // private으로 Calc를 하면 객체생성을 할 수 없다.
	
	public int plus(int x, int y) {
		int z = x+y;
		return z;
	}
	public int minus(int x, int y) {
		int z = x-y;
		return z;
	}
	public int multi(int x, int y) {
		int z = x*y;
		return z;
	}
	public int div(int x, int y) {
		int z = x/y;
		return z;
	}
	
}
