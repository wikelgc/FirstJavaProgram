package 文件及访问;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile1 {
	public static void main(String args[]){
		//要写入的信息
		byte message[] = "welcome to china".getBytes();
		byte a[] = "\n  you are bitch".getBytes();
		//创建一个文件
		try{
			//创建一个文件
			File  file =  new File("myfile.txt");
			if(file.createNewFile())
				System.out.println("创建成功");
			else 
				System.out.println("文件已经存在");	
			
			FileOutputStream out = new   FileOutputStream(file);
			
			out.write(message);
			out.write(a);
			System.out.print("成功");
			System.out.print("长度"+file.length());
			
			out.close();
			
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		//写入信息到已创建的文件中
	
	}
}


