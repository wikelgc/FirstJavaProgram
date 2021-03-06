package 用接口实现多继承;
//定义超类，他是个抽象类
abstract class Door {
	private int length;
	private int width;
	
	//定义构造方法
	public Door(int length,int width){
		setLength(length);
		setWidth(width);
	}	
	//定义抽象类                                                  
	abstract void open();
	abstract void close();
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}

}
