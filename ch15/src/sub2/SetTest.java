package sub2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
 * ��¥: 2019.10.24.
 * �̸�: Ȳ��ȣ
 * ����: �÷��� �����ӿ�ũ Set �ǽ��ϱ� ���� p724
 */
public class SetTest {

	public static void main(String[] args) {
		
		//���� ���� �� ������ ����
		Set<Double> set = new HashSet<>();
		
		set.add(1.0);
		set.add(2.0);
		set.add(3.0);
		set.add(4.0);
		set.add(2.0); //2�� 2�� ����. 
		
		System.out.println("���� ����: "+set.size()); // 2�� �ߺ��ǹǷ� 1���� ó����. ��, ������ �ߺ� ��� ����.
		
		//���� ���� ������
		Iterator<Double> it = set.iterator(); // ���� ���Ҹ� �������ִ� �ݺ���
		
		while(it.hasNext()) {
			System.out.println("����: "+it.next());
		}
		
		
		
	}
}