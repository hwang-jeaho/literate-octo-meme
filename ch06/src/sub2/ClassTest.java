package sub2;
/*
 * 날짜: 2019.10.16.
 * 이름: 황재호
 * 내용: 자바 클래스 실습하기
 */
public class ClassTest {
	public static void main(String[] args) {
		
		//private 및 생성자 적용 전 코드//
		/*국민은행 객체생성
		Account kb= new Account(); /*kb:객체이며 멤버는 7개(Account.java에서 7개이므로)이며 데이터는 아직없음*/
		//변수kb는 Account의 주소값을 받는다.->kb는 객체 Account를 참조하는 참조변수
			
		
		/*멤버변수 초기화
		kb.bank = "국민은행";
		kb.id = "121-11-1234";
		kb.name = "김유신";
		kb.money = 10000;
		*/
		/*기능활용
		kb.deposit(20000);
		kb.withdraw(5000);
		kb.money -=1; //취약코드 (돈이 빠져나가면 안되므로)
		
		kb.info();
		*/
		
		/*우리은행 객체생성 및 초기화 (Account.java에서 생성자를 적용 후 ) 
		Account wr = new Account(); /*wr도 Account의 주소값을 받는다. 하지만 kb와는 다른 주소를 가진 새로운 Account임*/
		
		//멤버변수 초기화
		/*
		wr.bank = "우리은행";
		wr.id = "851-5122-555";
		wr.name = "이순신";
		wr.money = 35000;
		*/
		
		/*
		//기능활용
		wr.deposit(1500);
		wr.withdraw(50000);
		wr.info();
		*/
		
		//국민은행 객체생성 및 초기화 
		Account kb = new Account("국민은행", "121-11-24", "김유신", 10000);
		//기능활용
		kb.deposit(20000);
		kb.withdraw(5000);
		kb.info();
		
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
