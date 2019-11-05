package sub3;
/*
 * 날짜: 2019.10.23.
 * 이름: 황재호
 * 내용: 예외 던지기(Throws) 실습하기
 */
public class ThrowsTest {
	/*방법1
	public static void main(String[] args) throws Exception{ // 메인에서 throws를 설정
		Calc cal = new Calc();
		int rs1 = cal.plus(1, 2);
		int rs2 = cal.minus(1, 2);
		int rs3 = cal.mult(1, 2);
		int rs4 = cal.div(1, 2);
	 */
	
	
	//방법2
	
	public static void main(String[] args) {
	Calc cal = new Calc();
	int rs1 = cal.plus(1, 2);
	int rs2 = cal.minus(1, 2);
	int rs3 = cal.mult(1, 2);
	int rs4 = 0;
	try {
		rs4=cal.div(1, 0);
	}catch (Exception e) {
		//전달된 에러를 처리
		e.printStackTrace();
	}
		
		System.out.println("rs1: "+rs1);
		System.out.println("rs2: "+rs2);
		System.out.println("rs3: "+rs3);
		System.out.println("rs4: "+rs4);
	}
}
