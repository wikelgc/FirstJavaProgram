package �ļ�������;

import java.io.File;
import java.io.IOException;


public class CreateFile {
	public static void main(String args[]){
		try{
			//����һ���ļ�
			File  file =  new File("myfile.txt");
			if(file.createNewFile())
				System.out.println("�����ɹ�");
			else 
				System.out.println("�ļ��Ѿ�����");
			
			System.out.println("�ļ���Ŀ¼�Ƿ���ڣ�"+file.exists());
			System.out.println("��Ŀ¼��"+file.isDirectory());
			System.out.println("�ļ�����"+file.getName());
			System.out.println("����·��:"+file.getAbsolutePath());
			
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
	

}
