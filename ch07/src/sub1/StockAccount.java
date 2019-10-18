package sub1;

public class StockAccount extends Account{

	//특성(멤버변수)
	private String stock;
	private int amount;
	private int stockPrice;
	
	//생성자
	public StockAccount(String bank, String id, String name, int money, String stock, int amount, int stockPrice){
		super(bank, id, name, money); //부모클래스의 생성사 실행
		
		this.stock = stock;
		this.amount = amount;
		this.stockPrice = stockPrice;
	}
	
	//기능(멤버메서드)
	public void sell(int amount) {
		this.amount -= amount;
	}
		
	public void buy(int amount) {
		this.amount += amount;
	}
	public void info() {
		super.info();
		System.out.println("주식종목:"+stock);
		System.out.println("주식가격:"+stockPrice);
		System.out.println("주식수량:"+amount);
	}
	
}
