package sub1;
/*
 * 날짜: 2019.10.15.
 * 이름: 황재호
 * 내용: 다차원 배열 실습하기
 */
public class ArrayTest2 {
	public static void main(String[] args) {
		//1차원 배열
		int score[]= {80, 60, 78, 69, 87, 92};
		
		int sum=0;
		for(int i=0; i<6; i++) {
			sum+=score[i];
		}
		
		int avg=sum/score.length; //length는 배열의 길이
		
		System.out.println("점수의 합:"+sum);
		System.out.println("점수의 평균"+avg);
		
		//배월의 반복문
		int jumsu[] = {10, 20, 30, 40, 50, 60};
		int total = 0;
		
		for(int n : jumsu) {
		//배열의 길이만큼 반복함, 첫번째 반복시 n은10, 두번째 반복시 n은 20...
			total +=n;
			}
		System.out.println("jumsu의 합:"+total);
		
		//2차원 배열
		int arr[][] = {{1, 2, 3},
					   {4, 5, 6},
					   {7, 8, 9},
					   {10, 11, 12}};
		//1의 인덱스 번호: (0,0) 왜냐하면 행과 열은 모두 0행 0렬 부터 시작
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

