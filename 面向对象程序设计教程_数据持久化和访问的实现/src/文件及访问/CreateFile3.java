package 文件及访问;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile3 {
	public static void main(String args[]){
		char message[] = "华中科技大学武昌分校".toCharArray();
		
		try{
			//创建文件实例
			File myFile = new File("testing.txt");
			
			//写字符流  写数据到文件中
			FileWriter out = new FileWriter(myFile);
			out.write(message);
			out.close();
			System.out.println("文件写入成功!"+message.hashCode());
			
			//读字符流 读文件数据到字符数组中去
			FileReader in = new FileReader(myFile);
			char text[] = new char[20];
			in.read(text);
			
			String  text1 = new String(text);
			System.out.println(text1);
			in.close();
		}
		catch (IOException e){
			System.out.println("File read/write Error" + e);
		}
	}

}
