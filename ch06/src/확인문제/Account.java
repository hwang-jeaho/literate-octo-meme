package Ȯ�ι���;

public class Account {
	private int balance;
	public int getBalance() { //get�� �ʵ��ǰ��� �״�� ���� �ϵ��� ��
		return balance;
	}
	public static int MIN_BALANCE = 0;
	public static int MAX_BALANCE = 1000000;
	
	
	
	public void setBalance(int balance) { //set�� �ܺο��� ���� �޾Ƽ� �����ϴ°�
		if(balance < Account.MIN_BALANCE || balance>Account.MAX_BALANCE) {
			return; //balance���� ���� �ʰ��ϸ� retrun���� if���� �����Ŵ
		}
		this.balance=balance; //if�� ���� �� balance���� ���� ��Ŵ
		}
		
		//30������ ������ if���� ��������� if���� ������ �����Ƿ� �׳� this.bl~�����Ͽ� 1������ 30���� ��
	}

