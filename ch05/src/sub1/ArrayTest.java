package sub1;

/*
 * ��¥: 2019.10.15.
 * �̸�: Ȳ��ȣ
 * ����: �迭 �ǽ��ϱ�
 */
public class ArrayTest {
	public static void main(String[] args) {
		//����
		int num1= 1;
		int num2= 2;
		int num3= 3;
		int num4= 4;
		int num5= 5;
		//�迭
		int num[] = {1,2,3,4,5};
		
		System.out.println("num �迭�� 1��° ����:"+num[0]);
		System.out.println("num �迭�� 2��° ����:"+num[1]);
		System.out.println("num �迭�� 3��° ����:"+num[2]);
		System.out.println("num �迭�� 4��° ����:"+num[3]);
		System.out.println("num �迭�� 5��° ����:"+num[4]);
		for(int i=0; i<5; i++) {
			System.out.println("num �迭��" +(i+1)+"��° ����:"+num[i]);
			
		//Ȯ�ο���
		String person1 = "������";
		String person2 = "������";
		String person3 = "�庸��";
		String person4 = "������";
		String person5 = "�̼���";
		
		String person[]= {"������", "������", "�庸��", "������", "�̼���"};
		
		for(int a=0 ; a<5; a++) {
			System.out.println("person["+a+"]="+person[a]);
		}
		}
		
		}
	}
