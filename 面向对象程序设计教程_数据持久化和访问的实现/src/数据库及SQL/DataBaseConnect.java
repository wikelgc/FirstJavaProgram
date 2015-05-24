package 数据库及SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnect {
	//指定数据源
	static String url = "jdbc:odbc:myDataSource";
	//声明一个java connection类的引用变量
	static Connection aConnection;
	
	//连接数据库
	public static Connection initialize(){
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			
			aConnection = DriverManager.getConnection(url,"","");
		}
		catch(ClassNotFoundException e){
			System.out.println(e);
		}
		catch (SQLException e) {
			System.out.println(e);// TODO: handle exception
		}
		return aConnection;
	}
	
	//close sql 
	public static void terminate(){
		try{
			aConnection.close();
		}
		catch(SQLException e){
			System.out.println(e);
		}
	}

}
