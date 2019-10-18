package sub2;

/*
 * 날짜: 2019.10.14.
 * 이름: 황재호
 * 내용: for문 실습하기
 */
public class Fortest {

	public static void main(String[] args) {
		
		
		//for문 : for( 초기식; 조건식; 증감식){ }
		for(int i=1; i<=5; i++) {
			System.out.println("Hello Java!");
		}
		
		
		//1~10까지의 합
		int sum=0 ;
		for(int k=1; k<=10; k++) {
		 sum = sum + k; // <- sum+= k;
		}
		System.out.println("sum:"+sum);
		
		// 1~10까지 짝수합
		int total = 0;
		for(int k=1; k<=10; k++) {
			// 다른방법 for(int k=2; k<=10; k+=2)
			if(k%2==0) {
			total+=k;
			}

		}
		System.out.println("짝수합:"+total);
		
		//중첩 for문: for문 안에 for문: for(){ for(){} }
		for(int a=1; a<=3; a++) {
			System.out.println("a:"+a);
			for(int b=1; b<=5; b++) {
				System.out.println("b:"+b);
			}
		}
		//구구단출력
		for(int a=2; a<=9; a++) {
			System.out.println(a+"단");
			for(int b=1; b<=9; b++) {
				int c=a*b;
				System.out.println(a+"x"+b+"="+c);
				
			}
		}
		
		// 별삼각형 출력1
		for(int start=1; start<=10; start++) {
			//역삼각형: for(int start=10; start>=1; start--) {
			for(int end=1; end<=start; end++) {
				System.out.print("☆");
			}
			System.out.print("\n");
		}

		// 별삼각형 출력2
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=5-a; b++) {
			System.out.print("☆");
			}
			
			for(int c=1; c<=a; c++) {
			System.out.print("★");
			}
		System.out.print("\n");
		}
		
	}
	}
