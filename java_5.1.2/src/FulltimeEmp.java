
public class FulltimeEmp extends Employee {
	private double baseSalary;
	private int workAge;
	
	//�Զ��幹�췽��
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
	
	/*����ÿ�µ�ʵ�ʹ���*/
	public double calculateSalary(){
		double Salary;
		Salary = baseSalary + 500*(workAge -1);
		return Salary;	
	}
	
	public String getDetails(){
		String Info;
		Info = "\n���±��:"+getEmpNum()
				+"\n����:"+getName()
				+"\n���ű���:"+getDeptCode()
				+"\n��������"+getBaseSalary()
				+"\n����"+getWorkAge();
		return Info;
	}
}
