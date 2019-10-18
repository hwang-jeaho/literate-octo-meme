package sub1;

/*
 * 날짜: 2019.10.17.
 * 이름: 황재호
 * 내용: 클래스 상속  실습하기 교재 p288
 */
public class InheritanceTest {
	
	public static void main(String[] args) {
		
		StockAccount kw = new StockAccount("키움증권", "121-11-113", "김춘추", 100000, "삼성전자", 10, 30000);
		kw.deposit(30000);
		kw.buy(15);
		kw.sell(5);
		kw.info();
		
		SmartPhone iphone = new SmartPhone("A10", "4GB", "128GB", "iphon 10", "010-1234-1234", 100);
		SmartPhone galaxy = new SmartPhone("2.3GHz", "4GB", "516GB", "galaxy 10", "010-1234-4567", 110);

		
		iphone.info();
		iphone.call();
		iphone.internet();

		galaxy.info();
		galaxy.call();
		galaxy.internet();
	}
	
}
