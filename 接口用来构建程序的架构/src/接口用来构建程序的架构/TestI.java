package �ӿ�������������ļܹ�;

public class TestI {
	public static void main(String args[]){
		//����officeʵ��
		Office theOffice = new Office();
		//Ϊ�ô�ӡ���䱸�ڰ״�ӡ��
		theOffice.setPrinter(new BWPrinter());
		theOffice.print("���Ǻڰ״�ӡ��");
		//Ϊ�ð칫���䱸��ɫ��ӡ��
		theOffice.setPrinter(new ColorPrinter());
		theOffice.print("���ǲ�ɫ��ӡ��");
	}
}
