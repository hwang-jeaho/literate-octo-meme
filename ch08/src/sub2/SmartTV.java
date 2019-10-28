package sub2;

public class SmartTV extends TV implements Computer{

	@Override
	public void booting() {
		System.out.println("SamrtTV booting...");
		
	}

	@Override
	public void internet() {
		System.out.println("SamrtTV internet...");
		
	}

}
