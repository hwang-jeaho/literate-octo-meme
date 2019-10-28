package sub1;

public interface RemoteControl { //  (ㄱ)

	public abstract void powerOn(); // (ㄱ)에서 인터페이스 클래스로 정의했기 때문에 추상메서드 선언(abstract)생략 가능
	public abstract void powerOff();
	
	public void chUp();
	public void chDown();
	
	public void soundUp();
	public void soundDown();
	
	
	
	
}
