package 数据访问类的实现;

public class User {
	private String UserID;
	private String name;
	private String password;
	
	
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public User(String UserID,String name,String password){
		setName(name);
		setPassword(password);
		setUserID(UserID);	
	}
	
	public  String  getDetails(){
		return 	"用户ID:"+getUserID()+"用户名:"+getName()+"用户密码:*****";
	}

}
