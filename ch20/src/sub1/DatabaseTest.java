package sub1;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * ��¥: 2019.10.31.
 * �̸�: Ȳ��ȣ
 * ����: �����ͺ��̽� ���α׷��� 
 */
public class DatabaseTest {
	/*	//��� 1: try�� ���
	public static void main(String[] args) {
		try {		
		//1�ܰ� - JDBC ����̹� �ε�
		//2�ܰ� - �����ͺ��̽� ����
		//3�ܰ� - SQL ���ఴü ����
		//4�ܰ� - SQL ����
		//5�ܰ� - SELECT ����� ó��
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//6�ܰ� - �����ͺ��̽� ����			
		}
	}
	*/
	
	//���2: throws�� ���
	public static void main(String[] args) throws Exception{
	
	//DB����
	String host = "jdbc:mysql://192.168.44.9:3306/hjh";
	String user = "hjh";
	String pass = "1234";
		
	//1�ܰ� - JDBC ����̹� �ε�
	Class.forName("com.mysql.jdbc.Driver");
		
	//2�ܰ� - �����ͺ��̽� ����
	Connection conn = DriverManager.getConnection(host, user, pass);
	
	//3�ܰ� - SQL ���ఴü ����
	if(conn !=null) {
		System.out.println("�����ͺ��̽� ���� ����!");
	}
	//4�ܰ� - SQL ����
	//5�ܰ� - SELECT ����� ó��
	//6�ܰ� - �����ͺ��̽� ����	
	conn.close();
	}
}
