package 关联关系_多对多;

import java.util.ArrayList;

public class Tester12 {
	public static void main(String[] args){
		//创建一个Contact实例
		Contact theContact = new Contact(123, "晓宇", true);
		//创建3个Phone实例
		Phone phone1 = new Phone("88888888", "办公", theContact);
		Phone phone2 = new Phone("77777777", "住宅", theContact);
		Phone phone3 = new Phone("66666666", "手机", theContact);

		//验证Contact到Phone的关联关系
		ArrayList  phones =theContact.getPhone();
		
		String theName = theContact.getName();
		
		for(int i=0;i<phones.size();i++){
			Phone aPhone = (Phone) phones.get(i);
		
			System.out.println("联系人:"+theName
						  +";  联系人电话号码:"+aPhone.getPhoneNum()
						  +";  类型:"+aPhone.getType());
		}
		
		System.out.println("第一个电话号码的联系人是:"
						  +phone1.getaContact().getName());
		
	}

}
