package sub2;
/*
 * ��¥: 2019.10.16.
 * �̸�: Ȳ��ȣ
 * ����: �ڹ� Ŭ���� �ǽ��ϱ�
 */
public class ClassTest {
	public static void main(String[] args) {
		
		//private �� ������ ���� �� �ڵ�//
		/*�������� ��ü����
		Account kb= new Account(); /*kb:��ü�̸� ����� 7��(Account.java���� 7���̹Ƿ�)�̸� �����ʹ� ��������*/
		//����kb�� Account�� �ּҰ��� �޴´�.->kb�� ��ü Account�� �����ϴ� ��������
			
		
		/*������� �ʱ�ȭ
		kb.bank = "��������";
		kb.id = "121-11-1234";
		kb.name = "������";
		kb.money = 10000;
		*/
		/*���Ȱ��
		kb.deposit(20000);
		kb.withdraw(5000);
		kb.money -=1; //����ڵ� (���� ���������� �ȵǹǷ�)
		
		kb.info();
		*/
		
		/*�츮���� ��ü���� �� �ʱ�ȭ (Account.java���� �����ڸ� ���� �� ) 
		Account wr = new Account(); /*wr�� Account�� �ּҰ��� �޴´�. ������ kb�ʹ� �ٸ� �ּҸ� ���� ���ο� Account��*/
		
		//������� �ʱ�ȭ
		/*
		wr.bank = "�츮����";
		wr.id = "851-5122-555";
		wr.name = "�̼���";
		wr.money = 35000;
		*/
		
		/*
		//���Ȱ��
		wr.deposit(1500);
		wr.withdraw(50000);
		wr.info();
		*/
		
		//�������� ��ü���� �� �ʱ�ȭ 
		Account kb = new Account("��������", "121-11-24", "������", 10000);
		//���Ȱ��
		kb.deposit(20000);
		kb.withdraw(5000);
		kb.info();
		
		//��ǻ�� ��ü����
		Computer samsung = new Computer("INTEL i7", "8GB", "1TB");
		Computer imac	  = new Computer("INTEL i5", "4GB", "512GB");
		
		samsung.info();
		samsung.calc();
		samsung.internet();
		
		imac.info();
		imac.calc();
		imac.internet();
		
	}
}
