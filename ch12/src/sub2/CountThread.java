package sub2;

public class CountThread extends Count {

	private Count count;
	
	public CountTread(Count count) {
		this.count = count;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=1000; i++) {
			this.num = num++;
		}
		
	}
	
}
