package sub1;
/*
 * ��¥: 2019.10.22.
 * �̸�: Ȳ��ȣ
 * ����: ��ø Ŭ���� �ǽ��ϱ� ���� p390
 */
import sub1.Outer.Inner;


public class InnerTest {

	public static void main(String[] args) {
		
		Outer out = new Outer(1);
		out.info();
		
		Inner inn = out.new Inner(2);
		inn.info();
		
	}
	
}
