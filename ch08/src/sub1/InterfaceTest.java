package sub1;
/*
 * ��¥: 2019.10.22.
 * �̸�: Ȳ��ȣ
 * ����: �������̽� �ǽ��ϱ� ���� p344
 */
public class InterfaceTest {
	public static void main(String[] args) {
		
		//�������̽� �ǽ�1: Ŭ���� ������ ǥ�� ���̵� ����
		RemoteLG lg = new RemoteLG();
		RemoteSamsung samsung = new RemoteSamsung();
		
		/* ���� 2���� �������� �̿��Ͽ� ǥ�� (���� ���� ����ϴ� ǥ���̴�.)
		RemoteControl lg = new RemoteLG();
		RemoteControl samsung = new RemoteSamsung();
		*/
		
		lg.powerOn();
		lg.chUp();
		lg.soundDown();
		
		samsung.powerOn();
		samsung.chUp();
		samsung.soundDown();
		
	}
	
}
