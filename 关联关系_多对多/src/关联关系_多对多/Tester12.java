package ������ϵ_��Զ�;

import java.util.ArrayList;

public class Tester12 {
	public static void main(String[] args){
		//����һ��Contactʵ��
		Contact theContact = new Contact(123, "����", true);
		//����3��Phoneʵ��
		Phone phone1 = new Phone("88888888", "�칫", theContact);
		Phone phone2 = new Phone("77777777", "סլ", theContact);
		Phone phone3 = new Phone("66666666", "�ֻ�", theContact);

		//��֤Contact��Phone�Ĺ�����ϵ
		ArrayList  phones =theContact.getPhone();
		
		String theName = theContact.getName();
		
		for(int i=0;i<phones.size();i++){
			Phone aPhone = (Phone) phones.get(i);
		
			System.out.println("��ϵ��:"+theName
						  +";  ��ϵ�˵绰����:"+aPhone.getPhoneNum()
						  +";  ����:"+aPhone.getType());
		}
		
		System.out.println("��һ���绰�������ϵ����:"
						  +phone1.getaContact().getName());
		
	}

}
