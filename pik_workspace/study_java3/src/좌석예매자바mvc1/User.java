package 좌석예매자바mvc1;

public class User{
	String id;
	String pw;
	
	void setData(String id , String pw) {
		this.id = id; 
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return "[id=" + id + ", pw=" + pw + "]";
	}


	boolean checkLog(String id , String pw) {
		if(this.id.equals(id) && this.pw.equals(pw)) {
			return true;
		}
		return false;
	}
}