package sub2;

public class Count {

	private int num;
	
	public int getNum() {
		return num;
	}
	

	//동기화 불럭선언으로 쓰레드 간 경합을 막는다.
	public synchronized void setNum() {
		this.num++;
	}
}
