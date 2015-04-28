package 关联关系_多对多;

public class Phone {
	//声明属性变量
	private String phoneNum;
	private String type;
	
	//声明一个Contact实例变量，用来指向Contact的一个实例
	private Contact aContact;
	
	
	
	//构造方法
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
	
	//Contact的构造和实例
	public Contact getaContact() {
		return aContact;
	}

	public void setaContact(Contact aContact) {
		this.aContact = aContact;
	}
	

}
