package sub2;
/*
 * ��¥: 2019.10.17.
 * �̸�: Ȳ��ȣ
 * ����: Ŭ���� ���  �ǽ��ϱ� 
 */
public class InheritanceTest {
	public static void main(String[] args) {
		
		SalaryStudent ss1 = new SalaryStudent("������", 21, "�ΰ��", "������", "�Ｚ");
		SalaryStudent ss2 = new SalaryStudent("������", 21, "�λ��", "��ǻ��", "�Ｚ");
		
		ss1.hello();
		ss2.hello();
	}
}
