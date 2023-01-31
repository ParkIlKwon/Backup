package 메서드2;

import java.util.Scanner;

class BankNoReturn {
	
		Scanner sc = new Scanner(System.in);
	
		String name = "";
		String str = "";
		int errCode;
	
		String[] arAcc = { "1111", "2222", "3333", "", "" };
		String[] arPw = { "1234", "2345", "3456", "", "" };
		int[] arMoney = { 87000, 34000, 17500, 0, 0 };
	
		int count = 3;
		int loginCheck = -1;
	
		// 리턴안쓰므로 해서 생긴변수
		int idx ;
		int checkDelete;	//인덱스
		int checkAccount;
		int checkPassword;
		
		//회원정보출력.
		void showMember() {
				System.out.println("저장된회원정보 아이디/비번/돈");
			
			for (int i = 0; i < count; i++) {
				System.out.print(" "+arAcc[i] + " / ");
				System.out.print(" "+arPw[i]+ " / ");
				System.out.println(" "+arMoney[i]);
			}
			if (loginCheck != -1) {
				System.out.println("=======================");
				System.out.println(" [현재 로그인 하신 회원] "+ arAcc[loginCheck]);
			}
			
		}
		
		//메뉴출력
		void showMenu() {
			System.out.printf("=====   %s   =====\n",name);
			if (loginCheck == -1) {
				System.out.println("[1]회원가입 [2]회원탈퇴 [3]로그인");
			}else {
				System.out.println("[1]회원가입 [2]회원탈퇴 [4]로그아웃 [5]입금"
						+ "[6]이체");
			}
		}
		
		//회원가입
		void joinMember(){
			while (true) {
				System.out.println("아이디를 입력하여주세요.");
				str = sc.next();
				checkid(str);
				if (str.equals("")) {
					System.err.println("아이디가 중복됩니다.");
					continue;
				}break;
			}
				arAcc[count] = str;
				System.out.println("비밀번호를 입력하여주세요.");
				str = sc.next();
				arPw[count] = str;
				System.out.println("회원가입완료.");
				count ++;
		}
		
		//아이디중복 체크
		void checkid(String str) {
			idx = -1;
			for (int i = 0; i < count; i++) {
				if (arAcc[i].equals(str)) {
					this.str = "";
					idx = i;
				}
			}
		}
		
		//비밀번호 체크
		void checkpw(String str){
			if (arPw[idx].equals(str)) {
				this.str = "";
			}
		}
		
		//삭제멤버
		void delMember(){
			while (true) {
			System.out.println("삭제하실 멤버를 입력하세요 !");
			str = sc.next();
			checkid(str);
			if (idx != -1) {
				if (count == arAcc.length) {
					arAcc[count] = "";
					arPw[count] = "";
					arMoney[count] = 0;
				}else {
					for (int i = idx; i < arAcc.length-1; i++) {
						arAcc[i] = arAcc[i+1]; 
						arPw[i] = arPw[i+1];
						arMoney[i] = arMoney[i+1];
					}
				}
				break;
			}
			printErr(1);
			}
			count --;
		}
		
		//로그인
		void login(){
			while (true) {
				System.out.println("아이디를 입력하여주세요.");
				str = sc.next();
				checkid(str);
				if (idx == -1) {
					printErr(1);
					continue;
				}break;
			}
			boolean chk = false;
			for (int i = 0; i < 5; i++) {
				System.out.println("비밀번호를 입력하여주세요.");
				str = sc.next();
				checkpw(str);
				if (str.equals("")) {
					chk = true;
					break;
				}else {
					System.err.printf("비밀번호입력오류 남은 횟수 : %d\n" , 4-i);
				}
			}
			if (chk) {
				System.out.println("로그인 성공 :D");
				loginCheck = idx;
			}else {
				System.err.println("입력횟수 초과 처음부터 다시하세요 :?\n");
			}
			
			
		}
		//로그아웃
		void logOut(){
			loginCheck = -1;
		}
		
		//입금 기능
		void income(){
			System.out.println("입금하실 금액을 입력하시오.");
			arMoney[loginCheck] += money();
		}
		
		//이체 기능
		void trans(){
			while (true) {
				System.out.println("이체하실 아이디를 입력하세요.");
				str = sc.next();
				checkid(str);
				if (idx == -1) {
					printErr(1);
					continue;
				}else if (idx == loginCheck) {
					System.err.println("자신의 계좌에는 이체하실수 없습니다 :<");
					continue;
				}
				break;
			}
			
			System.out.println("입금하실 금액을 입력하시오. ");
			int m = money();
			arMoney[idx] += m;
			arMoney[loginCheck] -= m;
		}
		
		int money() {
			int money = 0;
			while (true) {
				money = sc.nextInt();
				
				if (money%100 != 0) {
					System.err.println("100단위로 입력하시오 :(");
					continue;
				}break;
			}
			System.out.println("나옴");
			return money;
		}
		
		void printErr(int err) {
			if (err == 1) {
				System.err.println("아이디를 잘못 입력하셨습니다.");
			}else if (err == 2) {
				System.err.println("100");		// ?
			}
			
			
		}
		
	}



public class 메서드ATM {

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
			BankNoReturn woori = new BankNoReturn();
			woori.name = "우리은행";
			
			while (true) {
				// 전체 회원정보 출력
				woori.showMember();
				// 메뉴 출력
				woori.showMenu();
				// 메뉴 선택
				System.out.print("메뉴를 선택해주세요 : ");
				int choice = sc.nextInt();
				// 회원가입
				if (choice == 1 && woori.count <= woori.arAcc.length) {
					woori.joinMember();
				}
				// 회원탈퇴
				else if (choice == 2 && woori.count > 0 ) {
					woori.delMember();
				}
				// 로그인
				else if (choice == 3 && woori.loginCheck == -1) {
					woori.login();
				}
				// 로그아웃
				else if (choice == 4 && woori.loginCheck != -1) {
					woori.logOut();
				}
				// 입금
				else if (choice == 5 && woori.loginCheck != -1) {
					woori.income();
				}
				// 이체
				else if (choice == 6 && woori.loginCheck != -1) {
					woori.trans();
				}else{
				System.err.println("입력에러");
			}
			}

	}

}
