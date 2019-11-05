package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜: 2019.11.05.
 * 이름: 황재호
 * 내용: 기본 입출력 스트림 실습하기 교재 p994
 */
public class FileIOTest {
	public static void main(String[] args) throws IOException {
		String file1 = "C:\\Users\\java\\Desktop\\cameron.jpg";
		String file2 = "C:\\Users\\java\\Desktop\\cameron2.jpg";
		
		//입력스트림 생성 및 파일연결
		FileInputStream fis = new FileInputStream(file1);
		
		//출력스트림 생성 및 파일연결
		FileOutputStream fos = new FileOutputStream(file2);
		
 
		while(true) {
			//입력스트림으로 데이터 읽기
			int data = fis.read();
			
			if(data == -1) {
				break; //더이상 읽을 데이터가 없다면
			}
			
			//출력스트림으로 데이터 쓰기			
			fos.write(data);
			
			
			/*콘솔로 출력하는 경우
			char ch = (char)data;
			System.out.println(ch);
			*/
		}

		//입력스트림 해제
		fis.close();
		
		System.out.println("스트림 작업 끝");
	}
}
