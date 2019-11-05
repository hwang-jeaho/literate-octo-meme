package sub2;

public class LambdaThreadTest {

	public static void main(String[] args) {
		
		Runnable r = () -> {
			
		for(int i=1; i<=10; i++) {
		
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("���� ������ ����...");
			}
		};
		
		Thread t = new Thread(r);
		t.run();
		
		for(int i=1 ; i<=10; i++) {
			Thread.sleep(1000);
			System.out.println("���� ������ ����...");
		}
		System.out.println("���α׷� ����...");
	}
}
