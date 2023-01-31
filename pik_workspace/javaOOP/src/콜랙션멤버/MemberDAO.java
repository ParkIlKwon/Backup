package 콜랙션멤버;

import java.util.ArrayList;

public class MemberDAO {
	int index;
	private MemberDAO(){
		init();
	}
	private static MemberDAO instance = new MemberDAO();
	public static MemberDAO getIntance() {
		return instance;
	}
	ArrayList<Member> memberlist;
	private void init() {
		memberlist = new ArrayList<>();
	}
	
	void insert(Member member) {
		memberlist.add(member);
	}
	
	boolean checkId(String id) {
		
		for(Member m : memberlist) {
			if(m.getId().equals(id)) {
				return true;
			}
			index ++;
		}
		return false;
	}
	
	int getIndex(String id) {
		
		if (!checkId(id)) {
			return -1;
		} else {
			return index;
		}
	}
	
	boolean isExistinfo() {
		if (memberlist.size() == 0) {
			return false;
		}return true;
		
	}
	
	
	
	
}
