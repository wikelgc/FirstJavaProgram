package 文件及访问;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CreateFile2 {
	public static void main(String[] args){
		byte message[] = new byte[35];
		try{
			//创建一个文件的实例
			File myfile = new File("hello.txt");
			
			//创建一个输入文件流
			FileInputStream in = new FileInputStream(myfile);
			//读数据到message中
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
