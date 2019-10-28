package sub3;

public class Cable implements Socket{ //���̺��� ������ ������. ������ ���Ƴ����, �����̶� ���̺��� ����Ǿ������ϱ�

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
