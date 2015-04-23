//Tester6.java
public class Tester6 {
	public static void main(String aerg[]){
		
		
		//Tester 6
		//创建一个实列
		Employee  theEmp = new Employee(2008, "张飞", "SW"); 
		//声明一个变量
		String theInfo;
		//调用自定义方法，获取员工的基本信息
		theInfo = theEmp.getBaseDetails();
		System.out.print("员工的基本信息如下:"+theInfo);
		
		
		
		//Tester 7
		FulltimeEmp theEmp2 = new FulltimeEmp(2008021, "关羽", "SW", 4000,10);
		
		String theInfoString;
		double salary;
		
		//调用自定义方法，获取员工的基本信息
		theInfo = theEmp2.getDetails();
		//计算实际工资
		salary = theEmp2.calculateSalary();
		
		//输出全职员工的基本信息和实际工资
		System.out.println("员工的基本信息如下:"+theInfo);
		System.out.println("每月的实际工资"+salary);
		
		
		
	}

}
