package sub1;
/*
 * ��¥: 2019.10.15.
 * �̸�: Ȳ��ȣ
 * ����: ������ �迭 �ǽ��ϱ�
 */
public class ArrayTest2 {
	public static void main(String[] args) {
		//1���� �迭
		int score[]= {80, 60, 78, 69, 87, 92};
		
		int sum=0;
		for(int i=0; i<6; i++) {
			sum+=score[i];
		}
		
		int avg=sum/score.length; //length�� �迭�� ����
		
		System.out.println("������ ��:"+sum);
		System.out.println("������ ���"+avg);
		
		//����� �ݺ���
		int jumsu[] = {10, 20, 30, 40, 50, 60};
		int total = 0;
		
		for(int n : jumsu) {
		//�迭�� ���̸�ŭ �ݺ���, ù��° �ݺ��� n��10, �ι�° �ݺ��� n�� 20...
			total +=n;
			}
		System.out.println("jumsu�� ��:"+total);
		
		//2���� �迭
		int arr[][] = {{1, 2, 3},
					   {4, 5, 6},
					   {7, 8, 9},
					   {10, 11, 12}};
		//1�� �ε��� ��ȣ: (0,0) �ֳ��ϸ� ��� ���� ��� 0�� 0�� ���� ����
		System.out.println("arr[0][0]="+arr[0][0]);
		System.out.println("arr[0][1]="+arr[0][1]);
		System.out.println("arr[0][2]="+arr[0][2]);
		
		System.out.println("arr[1][0]="+arr[1][0]);
		System.out.println("arr[1][1]="+arr[1][1]);
		System.out.println("arr[1][2]="+arr[1][2]);
		
		System.out.println("arr[2][0]="+arr[2][0]);
		System.out.println("arr[2][1]="+arr[2][1]);
		System.out.println("arr[2][2]="+arr[2][2]);
		
		System.out.println("arr[3][0]="+arr[3][0]);
		System.out.println("arr[3][1]="+arr[3][1]);
		System.out.println("arr[3][2]="+arr[3][2]);
		
		for(int i=0; i<4; i++ ) {
			for(int j=0; j<3; j++) {
				System.out.println("arr["+i+"]["+j+"]="+arr[i][j]);
			}
		}
		
		
			}
		
		
	}

