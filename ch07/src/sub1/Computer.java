package sub1;

public class Computer {

	//특성(멤버변수)
	protected String cpu;
	protected String ram;
	protected String hdd;
	
	//생성자
	public Computer (String cpu, String ram, String hdd) {
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	
	//기능(멤버메서드)
	public void calc() {
		System.out.println("계산 중...");
	}
	
	public void internet() {
		System.out.println("인터넷 중...");
	}
	
	public void info() {
		System.out.println("================");
		System.out.println("CPU: "+this.cpu);
		System.out.println("RAM: "+this.ram);
		System.out.println("HDD: "+this.hdd);
		System.out.println("----------------");
	}
	
	// 객체 생성 및 기능활용을 하기 위해서는 main 함수가 필요함
	public static void main(String[] args) {
		//컴퓨터 객체생성
		Computer samsung = new Computer("INTEL i7", "8GB", "1TB");
		Computer imac	  = new Computer("INTEL i5", "4GB", "512GB");
				
		samsung.info();
		samsung.calc();
		samsung.internet();
				
		imac.info();
		imac.calc();
		imac.internet();
	}
	
}
