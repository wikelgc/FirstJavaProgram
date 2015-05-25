package 数据访问类的实现;

import java.sql.*;
import java.util.DuplicateFormatFlagsException;

import org.omg.CosNaming.NamingContextPackage.NotFound;

public class UserDA {
	static User aUser;
	//mydataSource是数据源名
	static String url = "jdbc:odbc:myDataSource";
	static Connection aConnection;
	static Statement aStatement;
	
	//declare variables for User attribute value
	static String userID;
	static String name;
	static String password;
	
	//DB --database
	public static Connection initialize(){
		try{
			//loading jdbc - odbc bridge driver --加载驱动
			Class.forName("sun.jdbc.odbc.JdbdOdbcDerver");
			//创建一个给定数据库的url的连接和statememt的实例
			aConnection = DriverManager.getConnection(url);
			//创建statement的实例
			aStatement = aConnection.createStatement();
		}
		catch(ClassNotFoundException e){
			System.out.print(e);
		}
		catch (SQLException e) {
			System.out.print(e);
			// TODO: handle exception
		}
		return aConnection;	
	}
	
	//释放数据库
	public static void terminate(){
		try{
			aStatement.close();
			aConnection.close();	
		}
		catch(SQLException e){
			System.out.println(e);
		}
	}
	
	
	//重数据库中检索特定用户额属性植
	public static User find(String key) throws NotFoundException{
		//retrieve User
		aUser = null;
		//define the SQL query statement using the phone number key
		String sql = "select userID,name,password form userT"
						+ "where userID = "+key ;
		//execute the sql query statement
		try{
			ResultSet rs = aStatement.executeQuery(sql);
			boolean gotIt = rs.next();
			if(gotIt ){
				userID = rs.getString(1);
				name = rs.getString(2);
				password = rs.getString(3);
				
				//create user instance
				aUser = new User(userID, name , password);
			}
			else 
				throw(new NotFoundException("没有发现这个记录"));
			rs.close();
		}
		catch(SQLException e){
			System.out.println(e);
		}
		return aUser;
	}
	
	
	//添加一个记录
	public static void add(User aUser) throws DuplicateException{
		//retrieve the user attribute value
		name = aUser.getName();
		userID = aUser.getUserID();
		password = aUser.getPassword();
		
		//create the sql insert statement using attribute values
		String sql = "insert into userI(userID,name,password)"
					+"values('"+userID+"','"+name+ "','"+password+"')'";
		System.out.println(sql);
		
		//see if this user already in ths database 
		try{
			User c = find(userID);
			throw (new DuplicateException("该用户已存在"));
		}
		// if notfoundexception add user to database 
		catch(NotFoundException e){
			try{
				//execute the sql updata statement
				int result = aStatement.executeUpdate(sql);
			}
			catch(SQLException ee){
				System.out.println(ee);
			}
		}
	}
	
	
	//delete DB
	public static void delete(User aUser){
		//retrieve the userID(key)
		userID = aUser.getUserID();
		
		//create the sql delete statement 
		String sql = "delete from UserT"+"where userID = "+"'" + userID + "'";
		
		try{
			int result = aStatement.executeUpdate(sql);
			
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		
	}
	
	
	//更新指定的记录
	public static void updata(User aUser)throws NotFoundException{
		//retrieve the user attribute values
		userID = aUser.getUserID();
		name = aUser.getName();
		password = aUser.getPassword();
		
		String sql = "update userT set Name = " + "'" + name + "'"
				+"Password     = " + "'" + password + "'"
				+"where userID = " + "'" + userID   + "'";
		System.out.println(sql);
		try{
			int result = aStatement.executeUpdate(sql);
		}
		catch(SQLException e){
			System.out.println(e);
		}
	}

}
