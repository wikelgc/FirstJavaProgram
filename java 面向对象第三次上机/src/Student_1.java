import java.util.Calendar;


//Circle.java  
public class Student_1 {
	//attribute
	private String name;
	private int year;
	private int month;
	private int day;
	
	//method
	public Student_1(String name,int year,int month,int day){
		setDay(day);
		setMonth(month);
		setName(name);
		setYear(year);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	public  int calAge(){
		Calendar c1 = Calendar.getInstance();
		int year = c1.get(Calendar.YEAR);
		int month = c1.get(Calendar.MONTH);
		if(this.month>month)
		{
			return (year-this.year-1);
		}
		else
		{
			return (year-this.year);
		}
	}
	
	

}
