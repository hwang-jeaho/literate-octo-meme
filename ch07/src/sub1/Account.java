package sub1;

public class Account {
/*main은 멤버가 아니라서 사용안함*/

	/*특성(멤버변수) private 및 생성자 적용 전 코드
	String bank; //변수 선언만 하고 초기화(변수에 값을 주는 것)는 안하였음
	String id;   
	String name; 
	int money;
	*/
	
	//특성(멤버변수) private 및 생성자 적용 후  코드
	private String bank; //변수 선언만 하고 초기화(변수에 값을 주는 것)는 안하였음
	private String id;   //private를 통해 멤버변수를 보호함(캡슐화)
	private String name; //대부분의 class의 멤버변수는 private를 하여 보호함.
	private int money;
	
	//생성자: 객체 생성 할 때 멤버변수를 초기화하는 메서드(private를 하면 초기화가 안되므로)
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money= money;
	}
	//기능(멤버 메서드)
	public void deposit(int money) {/*void: 반환타입, deposit: 메서드 이름, money(입금하는 돈)을 변수로 사용*/
		this.money = this.money+money; /*class의 멤버변수 money를 지칭하기 위해 this.를 붙임*/
		/* 윗 줄은 this.money +=money;와 같다.*/
		}
	
	public void withdraw(int money) {
		this.money-=money;
	}
	
	public void info() {
		System.out.println("====================");
		System.out.println("은 행 명:"+this.bank);
		System.out.println("계좌번호:"+id);
		System.out.println("입 금 주:"+name);
		System.out.println("현재금액:"+money);
		System.out.println("--------------------");
	}
	
	
}
