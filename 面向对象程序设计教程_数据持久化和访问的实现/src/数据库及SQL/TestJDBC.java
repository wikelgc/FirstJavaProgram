//编写一个TestJDBC程序，查询数据库phonebook。mdb中联系人

package 数据库及SQL;

import java.sql.*;

public class TestJDBC {
	private static Class<?> forName;

	public static void main(String args[]){
		//声明全局变量
		String url;
		Connection conn = null;
		Statement stmt = null;
		String contactID;
		String name;
		
		//生产查询语句
		String sqlx = "select contactID,name from contact_T";
		
		//连接数据库并执行查询语句，释放连接等
		try{
			
			//转载jdbc—odbc bridge driver
			try {
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//指定数据源
			url = "jdbc:odbc:myDataSourse";
			
			//创建一个到给定数据库URL的连接
			conn = DriverManager.getConnection(url);
			
			//创建一个Statement的实例
			stmt = conn.createStatement();
			
			//执行sql查询语句Sqlx
			ResultSet rs = stmt.executeQuery(sqlx);
			
			//从结果集合rs中读取数据
			while(rs.next()){
				contactID = rs.getString("contactID");
				name = rs.getString("name");
				//显示读取的数据
				System.out.println(contactID+","+name);
			}
			rs.close();
		}
		
		catch(ClassCastException e){
			System.out.print(e);
		}
		
		catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			// TODO: handle exception
		}
		
		finally{
			try{
				if(stmt != null)
					stmt.close();
				if(conn != null)
					conn.close();
			}
			catch(SQLException e){
				System.out.println(e.getMessage());
				e.printStackTrace();	
			}
		}
	}

}
