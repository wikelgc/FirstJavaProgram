package 文件及访问;

import java.io.File;
import java.io.IOException;


public class CreateFile {
	public static void main(String args[]){
		try{
			//创建一个文件
			File  file =  new File("myfile.txt");
			if(file.createNewFile())
				System.out.println("创建成功");
			else 
				System.out.println("文件已经存在");
			
			System.out.println("文件或目录是否存在？"+file.exists());
			System.out.println("是目录吗"+file.isDirectory());
			System.out.println("文件名称"+file.getName());
			System.out.println("绝对路径:"+file.getAbsolutePath());
			
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
	

}
