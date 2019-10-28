package 확인문제;

public class Cat implements Soundable {
	Soundable soundable = new Soundable(); 
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
