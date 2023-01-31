package 좌석예매자바mvc1;

import java.util.Scanner;

public class TicketController {
	Seat st;
	TicketDAO DAO ;
	int log = -1;
	
	void init(){
		st = new Seat();
		DAO = new TicketDAO();
		DAO.init();
	}
	
	void run(){
		
		while (true) { 
			if (log == -1) {
				System.out.println("1)로그인 2)종료");
				int sel = getInt("메뉴",0,3);
				
				if (sel == 1) {
					log = DAO.login(log);
					
				}else if (sel == 2) {
					break;
				}
				
			}else {
				printseat();
				System.out.printf("[%-4s] 님 로그인상태 \n" , DAO.user[log]);
				System.out.println("=====================================");
				System.out.println("1)영화관예매 2)예매취소 3)예매확인 4)로그아웃 5)전체출력" );
				int sel = getInt("메뉴",0,6);
				
				if (sel ==  5) {
					DAO.printseatall();
				}
				else if (sel == 4) {
					log = DAO.logout();
				}else if (sel == 3) {
					DAO.printchk(log);
				}else if (sel == 2) {
					DAO.cancleTicketing();
					
				}else if (sel == 1) {
					DAO.ticketing();
					}
				} 
			}
		}
		
	
	
	String getdata(String str) {
		Scanner sc = new Scanner(System.in);
		System.out.println(str + "를 입력하세요 .");
		return sc.next();
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
	
	void printseat() {
		System.out.println("[1][2][3][4][5][6][7][8]");
		for (int i = 0; i < DAO.seat.length; i++) {
			DAO.seat[i].showData();
			System.out.print(" ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
}
