package sub1;

public class SubThread extends SubThread {
	
	private String name;
	
	public SubThread(String name) {
		this.name= name;
	}
	
	@Override
	public void run() {
	
		for(int i=1; i<=10; i++) {
			
			try {
				SubThread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(name+"������ ����...");
		}
		System.out.println(name+"������ ����...");
	
	}
	}