package sub4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/*
 * ��¥: 2019.11.05.
 * �̸�: Ȳ��ȣ
 * ����: ���� ����  ��Ʈ�� �ǽ��ϱ� ����p1032
 */
public class FileReaderTest {
	public static void main(String[] args) throws IOException {
		String file1 = "C:\\Users\\java\\Desktop\\sample1.txt";
		String file2 = "C:\\Users\\java\\Desktop\\sample2.txt";
		
		//�Է½�Ʈ�� ���� �� ���Ͽ���
		FileReader fis = new FileReader(file1);

		while(true) {
			//�Է½�Ʈ������ ������ �б�
			int data = fis.read();
			
			if(data == -1) {
				break; //���̻� ���� �����Ͱ� ���ٸ�
			}
		
			char ch = (char) data;
			System.out.print(ch);
		
		}

		//�Է½�Ʈ�� ����
		fis.close();
		
		System.out.println("\n��Ʈ�� �۾� ��");
	}
}
