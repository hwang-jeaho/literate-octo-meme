package sub1;

public class Account {
/*main�� ����� �ƴ϶� ������*/

	/*Ư��(�������) private �� ������ ���� �� �ڵ�
	String bank; //���� ���� �ϰ� �ʱ�ȭ(������ ���� �ִ� ��)�� ���Ͽ���
	String id;   
	String name; 
	int money;
	*/
	
	//Ư��(�������) private �� ������ ���� ��  �ڵ�
	private String bank; //���� ���� �ϰ� �ʱ�ȭ(������ ���� �ִ� ��)�� ���Ͽ���
	private String id;   //private�� ���� ��������� ��ȣ��(ĸ��ȭ)
	private String name; //��κ��� class�� ��������� private�� �Ͽ� ��ȣ��.
	private int money;
	
	//������: ��ü ���� �� �� ��������� �ʱ�ȭ�ϴ� �޼���(private�� �ϸ� �ʱ�ȭ�� �ȵǹǷ�)
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money= money;
	}
	//���(��� �޼���)
	public void deposit(int money) {/*void: ��ȯŸ��, deposit: �޼��� �̸�, money(�Ա��ϴ� ��)�� ������ ���*/
		this.money = this.money+money; /*class�� ������� money�� ��Ī�ϱ� ���� this.�� ����*/
		/* �� ���� this.money +=money;�� ����.*/
		}
	
	public void withdraw(int money) {
		this.money-=money;
	}
	
	public void info() {
		System.out.println("====================");
		System.out.println("�� �� ��:"+this.bank);
		System.out.println("���¹�ȣ:"+id);
		System.out.println("�� �� ��:"+name);
		System.out.println("����ݾ�:"+money);
		System.out.println("--------------------");
	}
	
	
}
