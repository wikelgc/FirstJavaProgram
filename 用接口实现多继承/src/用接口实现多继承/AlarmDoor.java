package �ýӿ�ʵ�ֶ�̳�;

public class AlarmDoor extends Door implements Alarm{
	//�Զ��幹�췽��
	public AlarmDoor(int length,int width){
		super(length,width);
	}
	//��д������Door�ĳ��󷽷�
	public void open(){
		System.out.println("����");
	}
	public void close(){
		System.out.println("����");
	}
	public void alarm(){
		System.out.print("����");
	}

}
