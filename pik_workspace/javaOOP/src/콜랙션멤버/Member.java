package 콜랙션멤버;

public class Member {
	private String id;
	private String pw;
	
	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return "Member [아이디 : " + id + ", 패스워드 : " + pw + "]";
	}
	
	
	
}
