package sub2;
/*
 * ��¥: 2019.10.22.
 * �̸�: Ȳ��ȣ
 * ����: �͸� Ŭ���� �ǽ��ϱ� ���� p404
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
