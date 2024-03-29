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
				
				System.out.println("서브 쓰레드 실행...");
			}
		};
		
		Thread t = new Thread(r);
		t.run();
		
		for(int i=1 ; i<=10; i++) {
			Thread.sleep(1000);
			System.out.println("메인 쓰레드 실행...");
		}
		System.out.println("프로그램 종료...");
	}
}
