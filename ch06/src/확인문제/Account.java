package 확인문제;

public class Account {
	private int balance;
	public int getBalance() { //get은 필드의값을 그대로 리턴 하도록 함
		return balance;
	}
	public static int MIN_BALANCE = 0;
	public static int MAX_BALANCE = 1000000;
	
	
	
	public void setBalance(int balance) { //set은 외부에서 값을 받아서 저장하는것
		if(balance < Account.MIN_BALANCE || balance>Account.MAX_BALANCE) {
			return; //balance값이 범위 초과하면 retrun으로 if문을 종료시킴
		}
		this.balance=balance; //if문 종료 후 balance값을 유지 시킴
		}
		
		//30만원이 들어오면 if문은 실행되지만 if문의 내용이 없으므로 그냥 this.bl~실행하여 1만원이 30만원 됨
	}

