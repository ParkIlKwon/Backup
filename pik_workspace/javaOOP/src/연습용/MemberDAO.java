package 연습용;

import java.util.ArrayList;

public class MemberDAO {

	ArrayList<Member>mlist = new ArrayList<Member>();
	private MemberDAO() {};
	static private MemberDAO instance = new MemberDAO();
			
	public static MemberDAO getinstance() {
		return instance;
	}
	
	boolean chkid(String id) {
		for (Member m : mlist) {
			if (id.equals(m.getId())) {
				return true;
			}
		}
		return false;
	}
	
	void insert(Member m){
		mlist.add(m);
	}
	
	
	
	
}
