package 멤버pakage;

import java.util.Scanner;

public class MemberDAO {

	Scanner sc;
	int max;
	int memberCnt;
	Member[] memberList;
	
	void init(int size) {
		sc = new Scanner(System.in);
		memberList = new Member[size];
		max = size;
	}
	
	void join(){
		
		System.out.println("=== 회원가입 메뉴 ===");
		memberList[memberCnt] = new Member();
		
		while (true) {
			int idx = -1;
			String id = getstr("아이디");
			if (chk(idx,id) == -1) {
				
				memberList[memberCnt].id = id;
				break;
			}
			printerr("아이디",1);
		}
		
		memberList[memberCnt].pw = getstr("패스워드");
		memberList[memberCnt].name = getstr("이름");
		
		System.out.println(memberList[memberCnt] + "추가완료.");
		memberCnt++;
	}
	
	void delete(){
		
		if (memberCnt == 0) {
			printerr("", 2);
			return;
		}
		
		int idx = chk(memberCnt, getstr("삭제할 아이디를 "));
		if (idx == -1) {
			printerr("", 2);
			
		} else {
			for (int i = idx; i < memberCnt; i++) {
				memberList[i] = memberList[i+1];
			}
			memberCnt--;
		}
	}
	
	void update(){
		int idx = -1;
		
		while (true) {
			idx = chk(memberCnt, getstr("수정할 아이디 "));
			if (idx != -1) {
				break;
			}
			printerr("", 2);
		}
		
		while (true) {
			String str = getstr("[ 수정 ] 아이디");
			if (chk(0, str) == -1) {
				memberList[idx].id = str;
				break;
			}
			printerr("아이디", 1);
		}
		
		memberList[idx].pw = getstr("[ 수정 ] 비밀번호 ");
		memberList[idx].name = getstr("[ 수정 ] 이름 ");
		
	}
	
	void printAll(){
		
		if (memberCnt == 0) {
			printerr("", 2);
			return;
		}
		
		for (int i = 0; i < memberCnt; i++) {
			System.out.println(memberList[i]);
		}
		
	}
	
	void printerr(String msg,int pos) {
		if (pos == 1) {
			System.err.println("이미 있는 " + msg +"입니다.");
		}else if (pos == 2) {
			System.err.println("저장 된 회원정보가 존재하지 않습니다.");
		}
	}
	
	
	String getstr(String msg) {
		System.out.println(msg + "를 입력하세요.");
		String str = sc.next();
		
		return str;
	}
	
	int chk(int idx ,String str) {
		for (int i = 0; i < memberCnt; i++) {
			if (memberList[i].id.equals(str)) {
				return i;
			}
		}
		return -1;
	}

	
	
	
	
}