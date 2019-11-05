package sub1;

import java.util.ArrayList;
import java.util.List;

/*
 * ��¥: 2019.10.24.
 * �̸�: Ȳ��ȣ
 * ����: �÷��� �����ӿ�ũ List �ǽ��ϱ� ���� p724
 */
public class ListTest {

		public static void main(String[] args) {
			
			//����Ʈ ���� �� ������ ����
			List<Integer> list1 = new ArrayList<>();
			list1.add(1);
			list1.add(2);
			list1.add(3);
			list1.add(4);
			list1.remove(2); // �͵�����ȣ 2�� ���� -> {1,2,4}
			list1.add(0, 5); // �ε�����ȣ 0�� 5�� �߰��� -> {5,1,2,4}
			list1.add(3, 3); // �ε�����ȣ 2�� 3�� �߰��� -> {5,1,2,3,4}
			
			//����Ʈ ���� ���
			System.out.println("list1 1��° ���:"+list1.get(0));
			System.out.println("list1 3��° ���:"+list1.get(2));
			System.out.println("list1 4��° ���:"+list1.get(3));
			
			//����Ʈ ���� �� ������ ����
			List<String> list2 = new ArrayList<>();
			
			list2.add("������");
			list2.add("�̼���");
			list2.add("�����");
			
			//����Ʈ �ݺ���
			for(String name: list2) {
				System.out.println("list2����: "+name);
			}
			
			//��� ����Ʈ ���� �� ��� ����
			Apple a1 = new Apple("�ѱ�", 3000);
			Apple a2 = new Apple("�̱�", 2000);
			Apple a3 = new Apple("�Ϻ�", 1000);
			
			List<Apple> list3 = new ArrayList<>();
			
			list3.add(a1);
			list3.add(a2);
			list3.add(a3);
			
			//�����ü ����
			System.out.println("��ü ��� ����: "+list3.size());
			
			//��� ���
			Apple apple = list3.get(1);
			apple.info();
			
			list3.get(2).info();
		}
}
