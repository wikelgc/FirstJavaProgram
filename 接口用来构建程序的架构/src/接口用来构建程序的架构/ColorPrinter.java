package 接口用来构建程序的架构;

public class ColorPrinter implements PrinterTnterface {
	//打印方法
	public void print(String content){
		System.out.println("彩色打印");
		System.out.println(content);
	}

}
