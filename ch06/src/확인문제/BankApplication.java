package Ȯ�ι���;

import java.util.Scanner;

public interface BankApplication {
	private static Account[] accountArry = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.���»��� | 2. ���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("--------------------------------------------");
			System.out.println("����>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo==1) {
				createAccount();
			}else if(selectNo==2) {
				accountList();
			}else if(selectNo==3) {
				deposit();
			}else if(selectNo==4) {
			}
		}
	}
}
