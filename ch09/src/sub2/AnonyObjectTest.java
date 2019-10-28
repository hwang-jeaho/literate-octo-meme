package sub2;
/*
 * 날짜: 2019.10.22.
 * 이름: 황재호
 * 내용: 익명 클래스 실습하기 교재 p404
 */
public class AnonyObjectTest {
	public static void main(String[] args) {
		
		Person p = new Person() {
				
			@Override
			public void info() {
				System.out.println("Person info...");
				
			}
			
			@Override
			public void hello() {
				System.out.println("Person hello...");
			}
		};
		
		p.info();
		p.hello();
	}
}
