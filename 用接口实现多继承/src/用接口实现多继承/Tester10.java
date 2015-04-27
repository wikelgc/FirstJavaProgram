package 用接口实现多继承;

public class Tester10 {
	public static void main(String args[]){
		AlarmDoor aDoor = new AlarmDoor(2, 1);//(长,宽)
		System.out.println("门的长度:"+aDoor.getLength());
		System.out.println("门的宽度:"+aDoor.getWidth());
		aDoor.open();
		aDoor.close();
		aDoor.alarm();
	}

}
