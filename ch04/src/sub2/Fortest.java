package sub2;

/*
 * ��¥: 2019.10.14.
 * �̸�: Ȳ��ȣ
 * ����: for�� �ǽ��ϱ�
 */
public class Fortest {

	public static void main(String[] args) {
		
		
		//for�� : for( �ʱ��; ���ǽ�; ������){ }
		for(int i=1; i<=5; i++) {
			System.out.println("Hello Java!");
		}
		
		
		//1~10������ ��
		int sum=0 ;
		for(int k=1; k<=10; k++) {
		 sum = sum + k; // <- sum+= k;
		}
		System.out.println("sum:"+sum);
		
		// 1~10���� ¦����
		int total = 0;
		for(int k=1; k<=10; k++) {
			// �ٸ���� for(int k=2; k<=10; k+=2)
			if(k%2==0) {
			total+=k;
			}

		}
		System.out.println("¦����:"+total);
		
		//��ø for��: for�� �ȿ� for��: for(){ for(){} }
		for(int a=1; a<=3; a++) {
			System.out.println("a:"+a);
			for(int b=1; b<=5; b++) {
				System.out.println("b:"+b);
			}
		}
		//���������
		for(int a=2; a<=9; a++) {
			System.out.println(a+"��");
			for(int b=1; b<=9; b++) {
				int c=a*b;
				System.out.println(a+"x"+b+"="+c);
				
			}
		}
		
		// ���ﰢ�� ���1
		for(int start=1; start<=10; start++) {
			//���ﰢ��: for(int start=10; start>=1; start--) {
			for(int end=1; end<=start; end++) {
				System.out.print("��");
			}
			System.out.print("\n");
		}

		// ���ﰢ�� ���2
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=5-a; b++) {
			System.out.print("��");
			}
			
			for(int c=1; c<=a; c++) {
			System.out.print("��");
			}
		System.out.print("\n");
		}
		
	}
	}
