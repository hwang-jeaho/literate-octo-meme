package sub1;

//명시가 되지 않을뿐 자바의 모든 클래스는 Object(자바의 최상위 클래스)를 상속 받고 있다. 
public class Apple extends Object{ 
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void info() {
		System.out.println("원산지: "+country);
		System.out.println("가 격: "+price);
	}
	
}
