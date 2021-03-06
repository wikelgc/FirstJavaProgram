//Employee.java
public class Employee {
	/*声明属性变量*/
	private int empNum;
	private String  name;
	private String deptCode;
	
	/*自定义构造方法*/
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
		info = "\n人事编号:"+getEmpNum()+";\n姓名:"+getName()+";\n部门编号:"+getDeptCode();
		return info;
	}
}
