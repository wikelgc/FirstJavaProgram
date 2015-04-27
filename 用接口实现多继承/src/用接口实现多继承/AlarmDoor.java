package 用接口实现多继承;

public class AlarmDoor extends Door implements Alarm{
	//自定义构造方法
	public AlarmDoor(int length,int width){
		super(length,width);
	}
	//重写抽象类Door的抽象方法
	public void open(){
		System.out.println("开门");
	}
	public void close(){
		System.out.println("关门");
	}
	public void alarm(){
		System.out.print("报警");
	}

}
