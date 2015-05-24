package 随机文件的读写;

public class Student {
	private String name;
	private String StudentID;
	
	//构造方法
	public Student(String name,String studentID){
		setName(name);
		setStudentID(studentID);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentID() {
		return StudentID;
	}
	public void setStudentID(String studentID) {
		StudentID = studentID;
	}
}
