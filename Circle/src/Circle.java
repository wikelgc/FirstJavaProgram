//Circle.java  
public class Circle {
	//attribute
	private int radius;
	
	//method
	public Circle(int theRudius){
		setRadius(theRudius);
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//自定义类
	//计算周长
	public double calGirth(){
		return 2*3.14159*radius;
	}
	//计算面积
	public double calArea(){
		return 3.14159*radius*radius;
	}
	

}
