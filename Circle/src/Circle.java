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
	
	//�Զ�����
	//�����ܳ�
	public double calGirth(){
		return 2*3.14159*radius;
	}
	//�������
	public double calArea(){
		return 3.14159*radius*radius;
	}
	

}
