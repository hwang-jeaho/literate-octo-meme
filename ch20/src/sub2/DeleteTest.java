package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTest {
	public static void main(String[] args) throws Exception{
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
		String sql = "DELETE FROM `USER2` WHERE `uid`='B101'; ";
				
				
		stmt.executeUpdate(sql);

		//5단계 - SELECT 결과셋 처리
			
		//6단계 - 데이터베이스 종료
		conn.close();
		
		/*try문 사용
		 
		 //DB정보
		String host = "jdbc:mysql://192.168.44.9:3306/hjh";
		String user = "hjh";
		String pass = "1234";
		Connection conn = null
		 
		 try{
		  	//1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
		
			//2단계 - 데이터베이스 접속
			conn = DriverManager.getConnection(host, user, pass);
		
			//3단계 - SQL 실행객체 생성
			Statement stmt = conn.createStatement();
		
			//4단계 - SQL 실행		
			stmt.executeUpate("DELETE FROM `USER2` WHERE `uid`='B101';");

			//5단계 - SELECT 결과셋 처리
			
			//6단계 - 데이터베이스 종료
			conn.close();
			
		}catch (Exception e){
		e.printStackTrace();
		}
		 */
		
		System.out.println("DELETE 완료...");
	}
}
