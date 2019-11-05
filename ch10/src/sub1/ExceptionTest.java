package sub1;
/*
 * 날짜: 2019.10.22.
 * 이름: 황재호
 * 내용: 예외처리 실습하기 교재 p422
 */
public class ExceptionTest {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 0;
		
		int rs1= num1+num2;
		int rs2= num1-num2;
		int rs3= num1*num2;
		int rs4= 0; //수정전 없는 코드
		
		try {
			//에러가 발생할 가능성이 있는 코드로직
			rs4= num1/num2;
			
		} catch(Exception e) {
			//에러가 발생했을때 처리할 로직
			e.printStackTrace();
		}
		
		/*수정전: 
		try {
			int rs4= num1/num2;
		} catch(Exception e) {
			e.printStackTrace();
		}
		이었는데
		
		System.out.println("rs4 : "+rs4); 에서 rs4가 에러가 남 (int rs4= num1/num2; 가 try문 안에 있어서)
		그래서 try문에서 int 제거 후  try문 밖에다가 int rs4= 0; 를 써서, 에러를 제거
		*/
		
		/* 어디서 에러가 나지 모를때 변수를 초기화하고 그냥 전부다 try문에 넣음 
		int num1=1;
		int num2=0;
		int rs1=0, rs2=0, rs3=0, rs4=0;
						
		try {
			//에러가 발생할 가능성이 있는 코드로직
		
			rs1= num1+num2;
			rs2= num1-num2;
			rs3= num1*num2;
			rs4= num1/num2;
			
		} catch(Exception e) {
			//에러가 발생했을때 처리할 로직
			e.printStackTrace();
		}
		*/
		
		
		
		
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		System.out.println("rs3 : "+rs3);
		System.out.println("rs4 : "+rs4);
				
		System.out.println("프로그램 종료...");
	}
}
