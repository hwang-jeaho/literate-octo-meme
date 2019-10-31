package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜: 2019.10.31.
 * 이름: 황재호
 * 내용: INSERT 실습하기
 */
public class insertTest {
	
	public static void main(String[] args) throws Exception {

		//DB정보
		String host = "jdbc:mysql://192.168.44.9:3306/hjh";
		String user = "hjh";
		String pass = "1234";
		
		//1단계 - JDBC 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");
		
		//2단계 - 데이터베이스 접속
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		//3단계 - SQL 실행객체 생성
		Statement stmt = conn.createStatement();
		
		//4단계 - SQL 실행
		String sql1 = "INSERT INTO `USER2` VALUES ('A101','김유신','010-1234-1111',25);";		
		String sql2 = "INSERT INTO `USER2` VALUES ('A102','김춘추','010-1234-2222',23);";		
		String sql3 = "INSERT INTO `USER2` VALUES ('A103','장보고','010-1234-3333',32);";		
		String sql4 = "INSERT INTO `USER2` VALUES ('A104','강감찬','010-1234-4444',45);";		
		String sql5 = "INSERT INTO `USER2` VALUES ('A105','이순신','010-1234-5555',51);";		
		String sql6 = "INSERT INTO `USER2` VALUES ('B101','정약용','010-1234-6666',34);";
		
		stmt.executeUpdate(sql1);
		stmt.executeUpdate(sql2);
		stmt.executeUpdate(sql3);
		stmt.executeUpdate(sql4);
		stmt.executeUpdate(sql5);
		stmt.executeUpdate(sql6);
		
		

		//5단계 - SELECT 결과셋 처리
	
		//6단계 - 데이터베이스 종료
		conn.close();
		
		System.out.println("INSERT 완료...");
	}
}
