package sub3;

public class Cable implements Socket{ //케이블이 소켓을 구현함. 전구는 갈아끼우고, 소켓이랑 케이블이 연결되어있으니까

	private Bulb bulb;
	
	public Cable(Bulb bulb) {
		this.bulb = bulb;
	}
	
	@Override
	public void switchOn() {
		bulb.lightOn();
		
	}

	@Override
	public void switchOff() {
		bulb.lightOff();
		
	}

}
