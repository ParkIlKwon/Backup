package ATM;

import java.util.ArrayList;

public class ClientDAO {
	
	static ArrayList<Client>Clientlist = new ArrayList<Client>();
	static int ClientNum  = 1000;
	
	//초기데이터 세팅
	static void dataSetting(String clientData) {
		String tempData[] = clientData.split("\n");
		for (String string : tempData) {
			String info[] = string.split("/");
			Client cl = new Client(++ClientNum, info[0] , info[1], info[2]);
			Clientlist.add(cl);
		}
		
		System.out.println("초기데이터");
		for (Client string : Clientlist) {
			System.out.println(string);
		}
	}
	
	//회원가입
	void addClient() {
		String id = Util.getString("[회원가입]아이디 ");
		if (!Util.chkString(id)) {
			System.err.println("아이디는 숫자만 쓸수 없습니다.");
			return;
		}
		
		for (Client client : Clientlist) {
			if (client.getId().equals(id)) {
				System.err.println("아이디가 중복됩니다.");
				return;
			}
		}
		
		Client cl = new Client(++ClientNum, id , Util.getString("패스워드"),
				Util.getString("이름"));
		Clientlist.add(cl);
		
		for (Client client : Clientlist) {
			System.out.println(client);
		}
	}
	
	//로그인
	void login() {
		int index = getindexforid(Util.getString("[ 로그인 ] ID "));
		if (index == -1) {
			System.err.println("아이디 입력 오류");
			return;
		}
		if (Util.getString("[로그인]패스워드").equals(Clientlist.get(index).getPw())) {
			BankController.log = index;
			return;
		}
		System.err.println("비밀번호 입력오류");
		
	}
	
	//아이디 입력시 인덱스받아옴
	int getindexforid(String id) {
		for (int i = 0; i < Clientlist.size(); i++) {
			if (Clientlist.get(i).getId().equals(id)) {
				return i ;
			}
		}
		return - 1;
		
	}
	
	//전체 회원 목록 출력
	void printClient(){
		System.out.println(Clientlist);
	}
	
	//회원정보 수정
	void editClient(){
		for (int i = 0; i < Clientlist.size(); i++) {
			System.out.print("[" + (i + 1) + "]" + Clientlist.get(i));
		}
		int sel = chksel("어떤 회원정보를 수정하시겠습니까?",1,Clientlist.size());
		
		String id = Util.getString("[회원수정]아이디 ");
		if (!Util.chkString(id)) {
			System.err.println("아이디는 숫자만 쓸수 없습니다.");
			return;
		}
		
		for (Client client : Clientlist) {
			if (client.getId().equals(id)) {
				System.err.println("아이디가 중복됩니다.");
				return;
			}
		}
		
		Client cl = new Client(Clientlist.get(sel).getClientNo(), id , Util.getString("패스워드"),
				Util.getString("이름"));
		Clientlist.set(sel, cl);
		
		
	}
	
	//회원번호 삭제
	void deleteClient(){
		for (int i = 0; i < Clientlist.size(); i++) {
			System.out.print("[" + (i + 1) + "]" + Clientlist.get(i));
		}
		int sel = chksel("어떤 회원정보를 삭제하시겠습니까?",1,Clientlist.size());
		int clientNo = Clientlist.get(sel).getClientNo();
		for (int i = 0; i < AccountDAO.Acclist.size(); i++) {
			if (clientNo == AccountDAO.Acclist.get(i).getClientNo()) {
				AccountDAO.Acclist.remove(i);
			}
		}
		Clientlist.remove(sel);
		System.out.println("삭제완료.");
	}
	
	int chksel(String msg,int n , int m) {
		int sel = -1;
		while (sel == -1) {
			sel = Util.getValue(msg, n, m);
		}
		return sel -1;
	}
	
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
