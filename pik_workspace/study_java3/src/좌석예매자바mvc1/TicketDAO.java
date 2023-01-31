package 좌석예매자바mvc1;

import java.util.Scanner;

public class TicketDAO {
	Seat st;
	User user[];
	Seat seat[];
	int idx;
	int count;
	
	void init(){
		st = new Seat();
		String earlyData = "aaa/1111,bbb/2222,ccc/3333";
		String edarr[] = earlyData.split(","); 
		user = new User[edarr.length];
		UserDAO uDAO = new UserDAO();
		uDAO.init(edarr.length);
		int userCnt = user.length;
		
		for (int i = 0; i < edarr.length; i++) {
			String info[] = edarr[i].split("/");
			User u = new User();
			u.setData(info[0], info[1]);
			uDAO.adduser(u, i);
			System.out.println(uDAO.user[i]);
		}
		
		
		
		
		for (int i = 0; i < userCnt; i++) {
			String info[] = edarr[i].split("/");
			user[i] = new User();
			user[i].setData(info[0], info[1]);
		}
		
		seat = new Seat[8];
		for (int i = 0; i < seat.length; i++) {
			seat[i] = new Seat("",i+1,false);
		}
	}
	
	int login(int log){
		while (true) {
			
		idx = chk(log, 1, getString("아이디"));
			
			if (idx != -1) {
				break;
			}
			System.err.println("없는 아이디입니다.");
		}
		
		while (true) {
			if (getString("비밀번호").equals(user[idx].pw)) {
				break;
			}
			System.err.println("비밀번호를 잘못 입력하셨습니다.");
		}
		
		return idx;
	}
	
	int logout() {
		return -1;
	}
	
	int chk(int idx, int sel, String str) {
		if (sel == 1) {
			for (int i = 0; i < user.length; i++) {
				if (user[i].id.equals(str)) {
					idx = i;
				}
			}
		}else {
			for (int i = 0; i < seat.length; i++) {
				if (true) {
					
				}
			}
		}
		return idx;
		
	}
	
	void printchk(int log) {
		System.out.println(user[log] + "님의 예매현황입니다.");
		for (int i = 0; i < seat.length; i++) {
			if (seat[i].userID.equals(user[log].id)) {
				System.out.print(seat[i].number + " 번 ");
				count++;
			}
		}
		System.out.println("자리 예매하셨습니다.");
	}
	
	
	
	String getString(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg + "를 입력하여주세요.");
		return sc.next();
	}
	
	
	void ticketing(){
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("예매하실 좌석을 입력하세요.");
			int sel = getInt("예매하실 좌석번호",-1 , seat.length)-1;
			if (!seat[sel].check) {
				seat[sel].check = true;
				seat[sel].userID = user[idx].id;
				break;
			}
			System.err.println("이미 예매되어 있는 좌석입니다.");
		}
	}
	
	void cancleTicketing() {
		printchk(idx);
		if (count < 1) {
			System.err.println("예매하신 좌석이 존재하지 않습니다.");
			return;
		}
		while (true) {
			int sel = getInt("예매 취소하실 번호",0 , seat.length)-1;
			if (seat[sel].check && seat[sel].userID.equals(user[idx].id)) {
				seat[sel]= new Seat("",sel+1,false);
				break;
			}
			System.err.println("잘못된 입력 :(");
		}
	}
	
	int getInt(String str,int m, int n) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(str + "를 입력하세요 .");
			int num = sc.nextInt();
			if (num > m && num < n) {
				return num;
			}
			System.err.println("잘못된입력.");
		}
	}
	
	void printseatall(){
		for (int i = 0; i < seat.length; i++) {
			System.out.println(seat[i]);
		}
	}
	
	
	
	
	
}
