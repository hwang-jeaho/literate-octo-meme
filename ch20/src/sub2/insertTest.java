package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * ��¥: 2019.10.31.
 * �̸�: Ȳ��ȣ
 * ����: INSERT �ǽ��ϱ�
 */
public class insertTest {
	
	public static void main(String[] args) throws Exception {

		//DB����
		String host = "jdbc:mysql://192.168.44.9:3306/hjh";
		String user = "hjh";
		String pass = "1234";
		
		//1�ܰ� - JDBC ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		//2�ܰ� - �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		//3�ܰ� - SQL ���ఴü ����
		Statement stmt = conn.createStatement();
		
		//4�ܰ� - SQL ����
		String sql1 = "INSERT INTO `USER2` VALUES ('A101','������','010-1234-1111',25);";		
		String sql2 = "INSERT INTO `USER2` VALUES ('A102','������','010-1234-2222',23);";		
		String sql3 = "INSERT INTO `USER2` VALUES ('A103','�庸��','010-1234-3333',32);";		
		String sql4 = "INSERT INTO `USER2` VALUES ('A104','������','010-1234-4444',45);";		
		String sql5 = "INSERT INTO `USER2` VALUES ('A105','�̼���','010-1234-5555',51);";		
		String sql6 = "INSERT INTO `USER2` VALUES ('B101','�����','010-1234-6666',34);";
		
		stmt.executeUpdate(sql1);
		stmt.executeUpdate(sql2);
		stmt.executeUpdate(sql3);
		stmt.executeUpdate(sql4);
		stmt.executeUpdate(sql5);
		stmt.executeUpdate(sql6);
		
		

		//5�ܰ� - SELECT ����� ó��
	
		//6�ܰ� - �����ͺ��̽� ����
		conn.close();
		
		System.out.println("INSERT �Ϸ�...");
	}
}
