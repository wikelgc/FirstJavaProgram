package 关联关系_一对一;
//定义一个联系人类，类名要大写
public class Contact {
	//声明属性变量
	
	//联系人的ID
	private int contactID;
	//联系人的姓名
	private String name;
	//是否为常用联系人
	private boolean isFreqContact;
	
	//声明构造方法
	public Contact (int contactID,String name,boolean isFreqContact){
		
		setContactID(contactID);
		setName(name);
		setFreqContact(isFreqContact);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContactID() {
		return contactID;
	}

	public void setContactID(int contactID) {
		this.contactID = contactID;
	}

	public boolean isFreqContact() {
		return isFreqContact;
	}

	public void setFreqContact(boolean isFreqContact) {
		this.isFreqContact = isFreqContact;
	}

	

}
