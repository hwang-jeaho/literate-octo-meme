package sub1;

/*날짜: 2019.10.11.
 *이름: 황재호
 *내용: 조건문 연습문제
 */
public class IfTest {
	public static void main(String[] args) {
		
		int score = 86;
		
		if (score >=90) {
			//if (score>=90 && score<=100)
			System.out.println("A입니다.");
		}else if(score>=80) {
			//if (score>=80 && score<90)
			System.out.println("B입니다.");
		}else if(score>=70) {
			System.out.println("C입니다.");
		}else if(score>=60) {
			System.out.println("D입니다.");
		}else if(score>=50) {
			System.out.println("F입니다.");
	}
		}
}
