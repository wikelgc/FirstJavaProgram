package 数据访问类的实现;

public class TesterUserDA {
	//public static void main(String args[]){
		//生成两个user的实例
		User firstUser  = new User("SW1234", "Liping", "123456789");
		User secondUser = new User("SW2678", "lihong", "45678912");
//		
//		//connect database 连接数据库
//		UserDA.initialize();
//		
//		//测试add方法
//		try{
//			UserDA.add(firstUser);			
//			UserDA.add(secondUser);
//			System.out.println("添加两个账户");
//			
//		}
//		catch(DuplicateException e){
//			System.out.print(e);
//		}

		
		//测试delect方法	
		try{
			UserDA.delete(secondUser);
			System.out.println("要删除"+secondUser.getDetails());
			
			//try to find the user jusr delected 
			secondUser = UserDA.find("SW1112");
			//Sytem.out.println("删除后查询"+secondUser.getDetails());
		}
		catch(NotFoundException e){
			System.out.println(e);
		}
//		
//		//测试update方法
//		try{
//			firstUser = UserDA.find("SW1112");
//			firstUser.setPassword("88888888");
//			UserDA.updata(firstUser);
//			
//			//display info after change 
//			firstUser = UserDA.find("SW1111");
//			//System.out.println("更新后"+firstUser.getDetails());	
//		}
//		catch(NotFoundException e){
//			System.out.println(e);
//		}
//		
		//测试find方法
		try{
			firstUser = UserDA.find("SW1111");
			System.out.println("查询"+firstUser.getDetails());
		}
		catch(NotFoundException e){
			System.out.println(e);
			
		}
		
		//release resourse
		UserDA.terminate();
	}

}
