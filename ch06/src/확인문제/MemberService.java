package Ȯ�ι���;

public class MemberService {
	public String id="hong";
	public String password="1234";
	
	boolean login(String id, String password) {
		this.id=id;
		this.password=password;
		return true;
	}
	
	void logout(String id) {
		this.id=id;
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}
