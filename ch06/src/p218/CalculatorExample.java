package p218;
import p217.Calculator;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5,6);
		System.out.println("result: "+result1);
		
		byte x=10;
		byte y= 4;
		double result2= myCalc.divide(x,y);
		System.out.println("result2:"+result2);
	}
}
