//Tester6.java
public class Tester6 {
	public static void main(String aerg[]){
		
		
		//Tester 6
		//����һ��ʵ��
		Employee  theEmp = new Employee(2008, "�ŷ�", "SW"); 
		//����һ������
		String theInfo;
		//�����Զ��巽������ȡԱ���Ļ�����Ϣ
		theInfo = theEmp.getBaseDetails();
		System.out.print("Ա���Ļ�����Ϣ����:"+theInfo);
		
		
		
		//Tester 7
		FulltimeEmp theEmp2 = new FulltimeEmp(2008021, "����", "SW", 4000,10);
		
		String theInfoString;
		double salary;
		
		//�����Զ��巽������ȡԱ���Ļ�����Ϣ
		theInfo = theEmp2.getDetails();
		//����ʵ�ʹ���
		salary = theEmp2.calculateSalary();
		
		//���ȫְԱ���Ļ�����Ϣ��ʵ�ʹ���
		System.out.println("Ա���Ļ�����Ϣ����:"+theInfo);
		System.out.println("ÿ�µ�ʵ�ʹ���"+salary);
		
		
		
	}

}
