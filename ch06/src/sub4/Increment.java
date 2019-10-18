package sub4;

public class Increment {

		public int num1;
		public static int num2; //num2는 정적변수 처리(static)
		
		public Increment() {
			this.num1++;
			this.num2++;
			
			System.out.println("num1: "+num1);
			System.out.println("num2: "+num2);
		}
		
		public Increment(int num1, int num2) {
			this.num1 = num1;
			this.num2 = num2;
			}
		
		// 클래스 메서드 (정적메서드)
		public static void add() {
			// static 메서드에서는 none static 변수를 참조 할 수 없다.
			// num1++;
			num2++;
			
		}
}
