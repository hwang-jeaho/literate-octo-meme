package sub4;

public class Calc {

	//�̱���(����) ��ü
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	public Calc() {}  // private���� Calc�� �ϸ� ��ü������ �� �� ����.
	
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
