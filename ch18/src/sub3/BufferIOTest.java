package sub3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ��¥: 2019.11.05.
 * �̸�: Ȳ��ȣ
 * ����: ���� ���� ����� ��Ʈ�� �ǽ��ϱ� ����p1032
 */
public class BufferIOTest {
	public static void main(String[] args) throws IOException {
		String file1 = "C:\\Users\\java\\Desktop\\cameron.jpg";
		String file2 = "C:\\Users\\java\\Desktop\\cameron2.jpg";
		
		//�Է½�Ʈ�� ���� �� ���Ͽ���
		FileInputStream fis = new FileInputStream(file1);
		FileOutputStream fos = new FileOutputStream(file2);

		//���۽�Ʈ�� ���� �� ����
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		while(true) {
			//�Է½�Ʈ������ ������ �б�
			int data = bis.read();
			
			if(data == -1) {
				break; //���̻� ���� �����Ͱ� ���ٸ�
			}
			
			//��½�Ʈ������ ������ ����			
			bos.write(data);
			
			
			
		}

		//�Է½�Ʈ�� ����
		fis.close();
		
		System.out.println("��Ʈ�� �۾� ��");
	}
}
