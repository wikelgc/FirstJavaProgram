package �ӿ�������������ļܹ�;

public class Office {
	//��ӡ���ӿ���Ϊ������Գ�Ա������
	private PrinterTnterface Printer; 
	//���ô�ӡ��������
	public void setPrinter(PrinterTnterface p){
		this.Printer = p;
	}
	//�����ӡ�������ͷ���
	public void print(String detail){
		Printer.print(detail);
	}

}
