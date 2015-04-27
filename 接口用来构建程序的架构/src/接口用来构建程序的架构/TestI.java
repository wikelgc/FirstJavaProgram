package 接口用来构建程序的架构;

public class TestI {
	public static void main(String args[]){
		//创建office实例
		Office theOffice = new Office();
		//为该打印机配备黑白打印机
		theOffice.setPrinter(new BWPrinter());
		theOffice.print("我是黑白打印机");
		//为该办公室配备彩色打印机
		theOffice.setPrinter(new ColorPrinter());
		theOffice.print("你是彩色打印机");
	}
}
