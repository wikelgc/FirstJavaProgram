package �ýӿ�ʵ�ֶ�̳�;

public class Tester10 {
	public static void main(String args[]){
		AlarmDoor aDoor = new AlarmDoor(2, 1);//(��,��)
		System.out.println("�ŵĳ���:"+aDoor.getLength());
		System.out.println("�ŵĿ��:"+aDoor.getWidth());
		aDoor.open();
		aDoor.close();
		aDoor.alarm();
	}

}
