package sub2;

public class Product <A, B>{ //치환 변수가 2개 이상
	
	private A item;
	private B spec;
	
	public Product(A item, B spec) {
		this.item = item;
		this.spec = spec;
	}	
	public void info() {
		System.out.println("종류: "+item);
		System.out.println("정보: "+spec);
		
	
	}

}
