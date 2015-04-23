//Employee.java
public class Employee {
	/*�������Ա���*/
	private int empNum;
	private String  name;
	private String deptCode;
	
	/*�Զ��幹�췽��*/
	public Employee(int theEmpNum,String theName,String theDeptCode){
		setEmpNum(theEmpNum);
		setDeptCode(theDeptCode);
		setName(theName);	
	}

	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	
	public String getBaseDetails(){
		String info;
		info = "\n���±��:"+getEmpNum()+";\n����:"+getName()+";\n���ű��:"+getDeptCode();
		return info;
	}
}