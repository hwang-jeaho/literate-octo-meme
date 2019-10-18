package sub1;

public class SmartPhone extends Computer {

	//특성
	private String brand;
	private String tel;
	private int price;
	
	//생성자
	public SmartPhone(String cpu, String ram, String hdd, String brand, String tel, int price) {
		super(cpu, ram, hdd);
		this.brand = brand;
		this.tel = tel;
		this.price = price;
	}
		
	//기능
	public void call() {
		System.out.println(tel+"번호로 전화 거는 중...");
	}
	public void info() {
		System.out.println("CPU: "+super.cpu);
		System.out.println("RAM: "+super.ram);
		System.out.println("HDD: "+super.hdd);
		System.out.println("제품명: "+brand);
		System.out.println("폰번호: "+tel);
		System.out.println("제품가격: "+price);
	}
	
	
	
}
