package studentManagementSystem.session;

public class SessionInfo {
	private static SessionInfo instance;
	
	public static SessionInfo getInstance() {
		if(instance == null) {
			instance =  new SessionInfo();
		}return instance;
	}
	
	private int userId;
	private String userName;
	private String userSurname;
	private String userEmail;
	
	
	public int getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public String getUserSurname() {
		return userSurname;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	@Override
	public String toString() {
		return "SessionInfo [userId=" + userId + ", userName=" + userName + ", userSurname=" + userSurname
				+ ", userEmail=" + userEmail + "]";
	}
	
	
}
