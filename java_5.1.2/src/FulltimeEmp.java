
public class FulltimeEmp extends Employee {
	private double baseSalary;
	private int workAge;
	
	//自定义构造方法
	public FulltimeEmp(int theEmpNum,String theName,String theDeptCode,
			double theBaseSalary,int theWorkedAge){
		super(theEmpNum, theName, theDeptCode);
		setBaseSalary(theBaseSalary);
		setWorkAge(theWorkedAge);
		
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public int getWorkAge() {
		return workAge;
	}

	public void setWorkAge(int workAge) {
		this.workAge = workAge;
	}
	
	/*计算每月的实际工资*/
	public double calculateSalary(){
		double Salary;
		Salary = baseSalary + 500*(workAge -1);
		return Salary;	
	}
	
	public String getDetails(){
		String Info;
		Info = "\n人事编号:"+getEmpNum()
				+"\n姓名:"+getName()
				+"\n部门编码:"+getDeptCode()
				+"\n基本工资"+getBaseSalary()
				+"\n工资"+getWorkAge();
		return Info;
	}
}
