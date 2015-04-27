//黑白打印机BWPrinter的代码
package 接口用来构建程序的架构;

public class BWPrinter implements PrinterTnterface {
	//打印方法
	public void print(String content){
		System.out.println("黑白打印");
		System.out.println(content);
	}
}
