package sub1;

public class FruitBox<T> { //<T>:���׸� ��ȣ

	private T fruit;

	// Getter: �ܺη� Ŭ������ ����� �����ϱ� ���� �޼���	
	public T getFruit() {
		return fruit;
	}
	
	// Setter: �ܺο��� Ŭ������ ����� ���� �ޱ� ���� �޼���
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
	
}