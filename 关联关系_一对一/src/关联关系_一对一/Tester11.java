package 关联关系_一对一;

public class Tester11 {
	public static void main(String args[]){
		//创建一个联系人contact
		Contact theContact = new Contact(123, "李观称", true);
		
		//创建一个Phone的实例
		Phone thePhone = new Phone("18086507045", "学校");
		
		//建立thecontact和thePhone的联系
		thePhone.setaContact(theContact);  
		
		System.out.println("contact:"+thePhone.getaContact().getName()
							+"\nFrequency Contact:"
							+thePhone.getaContact().getContactID()
							);
		System.out.println("Phone Number:"+thePhone.getType());
	}

}
