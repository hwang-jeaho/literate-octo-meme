package sub1;
/*
 * ��¥: 2019.10.15.
 * �̸�: Ȳ��ȣ
 * ����: �����ε� �޼���(�Լ�) �ǽ��ϱ� 
 */
public class MethodOverload {
	public static void main(String[] args) {
		overload(1);
		overload(1,9);
		overload("������");
		overload(false);
		
	}
	
	//overload �޼��� : �޼��� �̸��� �Ȱ����� �ŰԺ����� �����ϴ� �޼��� 
	public static void overload(int a) {
		System.out.println("ù��° �����ε� �޼��� ����...");
	}
	
	public static void overload(int a, int b) {
		System.out.println("�ι�° �����ε� �޼��� ����...");
	}
	
	public static void overload(String name) {
		System.out.println("����° �����ε� �޼��� ����...");
	}
	
	public static void overload(boolean isOk) {
		System.out.println("�׹�° �����ε� �޼��� ����...");
	}
	
}
