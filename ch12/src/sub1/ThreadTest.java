package sub1;
/*
 * ��¥: 2019.10.28.
 * �̸�: Ȳ��ȣ
 * ����: ������(Thread) �ǽ��ϱ� ���� p576
 */
public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		
		SubThread sub1 = new SubThread("����1");
		SubThread sub2 = new SubThread("����2");
		
		
		//�񵿱������� ����
		sub1.start();
		sub2.start();
		
		for(int i=1; i<=10; i++) {
			
			SubThread.sleep(1000);
			
			System.out.println("���� ������ ����...");
		}
		System.out.println("���� ������ ����...");
	}
	
}
