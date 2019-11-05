package sub4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/*
 * 날짜: 2019.11.05.
 * 이름: 황재호
 * 내용: 파일 리더  스트림 실습하기 교재p1032
 */
public class FileReaderTest {
	public static void main(String[] args) throws IOException {
		String file1 = "C:\\Users\\java\\Desktop\\sample1.txt";
		String file2 = "C:\\Users\\java\\Desktop\\sample2.txt";
		
		//입력스트림 생성 및 파일연결
		FileReader fis = new FileReader(file1);

		while(true) {
			//입력스트림으로 데이터 읽기
			int data = fis.read();
			
			if(data == -1) {
				break; //더이상 읽을 데이터가 없다면
			}
		
			char ch = (char) data;
			System.out.print(ch);
		
		}

		//입력스트림 해제
		fis.close();
		
		System.out.println("\n스트림 작업 끝");
	}
}
