package sub3;

public class InterfaceTest3 {
	public static void main(String[] args) {
		
		// 인터페이스 실습3: 객체간의 결합도를 완화
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb); //다형성 적용, 소켓에서 케이블을 구현했기 때문에 가능
		
		socket.switchOn();
		socket.switchOff();
		
		
	}
}
