package sub2;
/*
 * ��¥: 2019.10.22.
 * �̸�: Ȳ��ȣ
 * ����: �پ��� ����ó�� �ǽ��ϱ� ���� p433
 */
public class VarietyExceptionTest {
	
	public static void main(String[] args) {
		
		// ������ ��� �ε����� ��������
		try {
		int arr[] = {1,2,3};
		
		for(int i=0; i<=arr.length; i++) { //  <=���� =�� ���°� ���� ��������̳� ������ ���� <=�� ��
			
			System.out.println(arr[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e) { // ArrayIndexOutOfBoundsException ��� Exception �ᵵ �� 
			e.printStackTrace();
		}
		
		/* ���� ��
		// NullPoint ����
		Tiger t = new Tiger();//��ü ���� : stack�� t�� Tiger�ּҰ��� ����
		Eagle e;//��ü ������ �ƴ� e�� ���� ��: stack�� e�� Eagle�ּҰ��� �ƴ� null���� ����
		
		t.move();
		e.move();
		*/
		
		//���� �� 
		try {
			Tiger t = new Tiger();
			Eagle e = null; //null������ �ʱ�ȭ��
			
			t.move();
			e.move();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		
		// ĳ���� ����
		
		try {
		Animal ani = new Tiger(); //������(��ĳ����) ����, ani�� Tiger
		Tiger t = (Tiger) ani; // �ٿ� ĳ����
		Shark s = (Shark) ani; // �߸��� ĳ����(ani�� tiger�ε� ani�� shark�� �ٲٴ� �õ�)
		}catch(ClassCastException e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ����...");
		
	}

}
