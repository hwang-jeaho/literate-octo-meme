package sub1;
/*
 * 날짜: 2019.10.24.
 * 이름: 황재호
 * 내용: 제네릭클래스 실습하기 교재 p654
 */
public class GenericTest {
	public static void main(String[] args) {
		
		Apple a = new Apple("한국", 2000);
		Banana b = new Banana("일본", 1500);
		
		FruitBox<Apple> box1 = new FruitBox<>();
		box1.setFruit(a);
		
		FruitBox<Banana> box2 = new FruitBox<>();
		box2.setFruit(b);
		
		Apple fr1 = box1.getFruit();
		Banana fr2 = box2.getFruit();
		
		fr1.info();
		fr2.info();
	}
}
