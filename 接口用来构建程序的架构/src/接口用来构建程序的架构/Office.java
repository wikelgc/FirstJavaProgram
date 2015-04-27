package 接口用来构建程序的架构;

public class Office {
	//打印机接口作为类的属性成员的类型
	private PrinterTnterface Printer; 
	//设置打印机的类型
	public void setPrinter(PrinterTnterface p){
		this.Printer = p;
	}
	//输出打印机的类型方法
	public void print(String detail){
		Printer.print(detail);
	}

}
