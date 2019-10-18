package sub2;

/*
 * 날짜: 2019.10.14.
 * 이름:황재호
 * 내용:While문 실습하기
 */
public class whilneTest {
	public static void main(String[] args) {
		
		//Whinle(조건){}
		//1부터 10까지 합
		int k=1;
		int sum=0;
		
		while(k<=10) {
			sum+=k;
			k++;
			
		}
		
		System.out.println("1~10까지 합:"+sum);
	
		//do~while
		//1~10 홀수 합
		int total=0;
		int i=1;
		do {
			if (i%2==1) {
			total+=i;
				}
			i++;
		}while(i<=10); 
		System.out.println("1~10까지 홀수 합"+total);
		
		//break사용: 반복문 종료 : while (true) { if(조건){ break;}}
		//5와 7의 최소 공배수
		int num=0;
		
		while(true) {
		 num++;
		 if(num%5==0 && num%7==0)
			 break;
		}
		System.out.println("5와 7의 최소공배수"+num);
		
		//continue
		int tot = 0;
		for(int a=1; a<=10; a++) {
			if(a%2==0) {
				continue; //다시 반복문의 상위로 감, break는 반복문을 빠져나감
			}
				tot+=a;
			
		}
		System.out.println("1~10홀수합:"+tot);
		}
		
}