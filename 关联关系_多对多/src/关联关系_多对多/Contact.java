package 关联关系_多对多;

import java.util.ArrayList;

public class Contact {
	//声明属性
	private int contactID;
	private String name;
	private boolean isFreqContact;
	
	/* ArrayList就是传说中的动态数组
	 * •动态的增加和减少元素
     * •实现了ICollection和IList接口
     * •灵活的设置数组的大小 
     * 
     * ArrayList的使用
     * • ArrayList<E> = new ArrayList<E>();
     * • ArrayList<E> = new ArrayList<E>(int num);
     * 
     * *<E>代表动态数组中的元素类型
     * *num表示ArrayList的初始长度
	 */
	
	
	//声明一个ArrayList类的实例变量phoneArray 
	private ArrayList<Phone> phoneArray;
	
	//构造方法
	public Contact(int contactID,String name,boolean isFreqContact){
		setContactID(contactID);
		setName(name);
		setFreqContact(isFreqContact);
		phoneArray = new ArrayList<Phone>(3); //create ArrayList instance
	}
	
	//获得动态数组 phoneArray
	public ArrayList getPhone(){
		return phoneArray;
	}
	
	//添加Phone reference 到动态数组phoneArray
	//建立aPhone和这里Contact的联系
	public void addPhonetoContact(Phone aPhone){
		phoneArray.add(aPhone);
		aPhone.setaContact(this);
	}
	
	
	public int getContactID() {
		return contactID;
	}
	public void setContactID(int contactID) {
		this.contactID = contactID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFreqContact() {
		return isFreqContact;
	}
	public void setFreqContact(boolean isFreqContact) {
		this.isFreqContact = isFreqContact;
	}
	

}
