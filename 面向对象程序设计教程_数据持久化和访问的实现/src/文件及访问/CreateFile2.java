package �ļ�������;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CreateFile2 {
	public static void main(String[] args){
		byte message[] = new byte[35];
		try{
			//����һ���ļ���ʵ��
			File myfile = new File("hello.txt");
			
			//����һ�������ļ���
			FileInputStream in = new FileInputStream(myfile);
			//�����ݵ�message��
			in.read(message);
			
			String text = new String(message);
			System.out.println(text);
			
			in.close();
		}
		catch(IOException e){
			System.out.println("File read File" + e);
		}
	}

}
