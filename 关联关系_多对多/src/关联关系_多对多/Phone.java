package ������ϵ_��Զ�;

public class Phone {
	//�������Ա���
	private String phoneNum;
	private String type;
	
	//����һ��Contactʵ������������ָ��Contact��һ��ʵ��
	private Contact aContact;
	
	
	
	//���췽��
	public Phone (String phoneNum,String type,Contact aContact){
		setPhoneNum(phoneNum);
		setType(type);
		setaContact(aContact);
		aContact.addPhonetoContact(this);
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	//Contact�Ĺ����ʵ��
	public Contact getaContact() {
		return aContact;
	}

	public void setaContact(Contact aContact) {
		this.aContact = aContact;
	}
	

}
