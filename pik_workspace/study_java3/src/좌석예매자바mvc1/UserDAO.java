package 좌석예매자바mvc1;

import java.util.Arrays;

public class UserDAO {

	User user[];
	
	void init(int len) {
		user = new User[len];
	}
	void adduser(User user,int idx){
		this.user[idx] = new User();
		this.user[idx] = user;
	}
	
	@Override
	public String toString() {
		return "UserDAO [user=" + Arrays.toString(user) + "]";
	}
	
	
	
	
}
