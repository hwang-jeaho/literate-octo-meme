package sub2;
/*
 * 날짜: 2019.10.22.
 * 이름: 황재호
 * 내용: 다양한 예외처리 실습하기 교재 p433
 */
public class VarietyExceptionTest {
	
	public static void main(String[] args) {
		
		// 범위에 벗어난 인덱스값 참조에러
		try {
		int arr[] = {1,2,3};
		
		for(int i=0; i<=arr.length; i++) { //  <=에서 =를 빼는게 가장 좋은방법이나 수업을 위해 <=로 씀
			
			System.out.println(arr[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e) { // ArrayIndexOutOfBoundsException 대신 Exception 써도 됨 
			e.printStackTrace();
		}
		
		/* 수정 전
		// NullPoint 에러
		Tiger t = new Tiger();//객체 생성 : stack에 t는 Tiger주소값을 가짐
		Eagle e;//객체 생성이 아닌 e를 선언만 함: stack에 e는 Eagle주소값이 아닌 null값을 가짐
		
		t.move();
		e.move();
		*/
		
		//수정 후 
		try {
			Tiger t = new Tiger();
			Eagle e = null; //null값으로 초기화함
			
			t.move();
			e.move();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		
		// 캐스팅 에러
		
		try {
		Animal ani = new Tiger(); //다형성(업캐스팅) 적용, ani는 Tiger
		Tiger t = (Tiger) ani; // 다운 캐스팅
		Shark s = (Shark) ani; // 잘못된 캐스팅(ani는 tiger인데 ani를 shark로 바꾸는 시도)
		}catch(ClassCastException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
		
	}

}
