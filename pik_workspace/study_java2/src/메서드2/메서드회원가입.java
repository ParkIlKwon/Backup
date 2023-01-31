package 메서드2;

import java.util.Arrays;
import java.util.Scanner;

// 메서드 생성원칙 : 1. 영어로 동사로 시작 , 리턴값이 boolean 값이면 is 
// 메서드는 기능 1개만 구현한다 

	class MemberManager{
		int sel = 0;
		Scanner sc = new Scanner(System.in);
		// 추가 삭제 수정 
		int maxSize = 10;
		int initNum = 1001; // 맨 처음 추가 회원 번호 
		int cnt; // 현재 추가된 회원 수 
		int idx ;
		String str = "";
		          // [0]번호 [1]아이디 [2]비밀번호 [3]이름
		String[][] memberList = new String[maxSize][4];
		
		//회원 추가 => 중복아이디 값이 없어야한다 
		void addMember() {
				int num = 0;
			while (true) {
				str = getInputString("아이디를 입력하세요.");
				checkid(str);
				if (checkid(str)) {
					break;
				}
				printErr(0);
			}
			memberList[cnt][0] = initNum + ""; 
			memberList[cnt][1] = str;
			str = getInputString("비밀번호를 입력하세요.");
			memberList[cnt][2] = str;	
			str = getInputString("이름을 입력하세요.");
			memberList[cnt][3] = str;	
			cnt ++;
			initNum++;
		}
		//아이디 체크 
		boolean checkid(String str) {
			for (int i = 0; i < cnt; i++) {
				if (memberList[i][1].equals(str)) {
					idx = i;
					return false;
				}
			}
			return true;
		}
		//회원번호 체크
		boolean checknum(String str) {
			for (int i = 0; i < str.length() ; i++) {
				if (str.charAt(i) >'9') {
					return false;
				}
			}
			for (int i = 0; i < cnt; i++) {
				
				if (memberList[i][0].equals(str)) {
					idx = i;
					return true;
				}
			}
			return false;
		}
		
		//회원 삭제 => 아이디 입력 받아서 아이디가 있으면 회원삭제 
		void DeletAccount() {
			
			while (true) {
				str = getInputString("삭제하실 아이디를 입력");
				if (checkid(str) == false) {
					break;
				}
				printErr(0);
			}
		for (int i = idx; i < cnt; i++) {
			memberList[i] = memberList[i+1];
		}		
			cnt--;
		}
		
		//회원 수정 => 회원 번호 입력 받아서 아이디 수정하기
		void ChangeAccount() {
			while (true) {
			str = getInputString("수정할 회원번호 입력");
			if (checknum(str)) {
				break;
			}
			printErr(0);
			}
			str = getInputString("수정할 아이디 입력");
			memberList[idx][1] = str;
		}
		
		
		void printErr(int code) {
			if(code == 0) {
			if(sel == 1) {
				System.err.println("아이디 중복");
			}else if(sel == 2) {
				System.err.println("없는 아이디입니다 ");
			}else if (sel == 3) {
				System.err.println("아이디 입력오류");
			}else if (sel == 4) {
				System.err.println("회원번호 입력오류.");
			}
			}else {
				if(code == 1) {
					System.err.println("저장된 회원정보없음");
				}else if (code == 2) {
					System.err.println("메뉴 선택오류");
				}
			}
		}
		
		// 전체 회원 출력 v
		
		// 회원 번호 체크 
		
		// 회원 번호 자동으로 생성 : 자동으로 1 증가하게 v
		
		// 메뉴출력 
		 void printMenu() {
			 String menu = "==== 메가 회원 === \n";
			 menu+= "[1] 회원 추가 \n";
			 menu+= "[2] 회원 출력 \n";
			 menu+= "[3] 회원 삭제 \n";
			 menu+= "[4] 회원 수정 \n";
			 menu+= "[0] 종    료 \n";
			 
			 System.out.println(menu);
		 }
		
		// 사용자에게 입력 받아오는 기능 
		 int getInputInt(String msg) {
			 Scanner sc = new Scanner(System.in);
			 System.out.println(msg);
			 System.out.print("입력 >> ");
			 return sc.nextInt();
		 }
		 String getInputString(String msg) {
			 Scanner sc = new Scanner(System.in);
			 System.out.println(msg);
			 System.out.print("입력 >> ");
			 return sc.next();
		 }
		
		 void run() {
			 
			 while(true) {
				 printMenu();
				 sel = getInputInt("메뉴 선택하시오");
				 
				 if(sel == 0) {
					 return;
				 }else if(sel == 1) {
					 System.out.println("=== 회원 추가===");
					 addMember();
				 }else if(sel == 2 && cnt > 0) {
					 System.out.println("===회원 출력===");
					 for (int i = 0; i < cnt; i++) {
						System.out.println(Arrays.toString(memberList[i]));
					}
					 
				 }else if(sel == 3 && cnt > 0) {
					 System.out.println("=== 회원 삭제===");
					 DeletAccount();
					 
				 }else if(sel == 4 && cnt > 0) {
					 System.out.println("=== 회원 수정===");
					 ChangeAccount();
				 }else { 
					 if (cnt == 0) {
						 printErr(1);
					}
					 printErr(2);
				 }
			 }
		 }
	}

public class 메서드회원가입 {

	public static void main(String[] args) {

		MemberManager mg = new MemberManager();
		mg.run();

		
		System.out.println("=== 프로그램 종료 ===");
	}

}