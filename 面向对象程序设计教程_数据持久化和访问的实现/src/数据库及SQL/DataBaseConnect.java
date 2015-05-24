package ���ݿ⼰SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnect {
	//ָ������Դ
	static String url = "jdbc:odbc:myDataSource";
	//����һ��java connection������ñ���
	static Connection aConnection;
	
	//�������ݿ�
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
