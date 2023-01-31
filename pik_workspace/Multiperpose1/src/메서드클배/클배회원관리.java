package 메서드클배;
		// 가변배열로 만들기 

import java.util.Scanner;

class User {
			String id;
			String pw;
			int money;
			
			void printInfo() {
				System.out.printf("%s \t %s \t %d \t \n",id,pw,money);
			}
		}
		
		class UserDAO{
			User list[];
			int cnt;
			int log =-1;
			void addUser() {
				User temp[] = new User[cnt];
				for (int i = 0; i < cnt; i++) {
					temp[i] = list[i];
				}
				
				if(list == null) {
					list = new User[1];
					list[cnt] = new User();
				}else {
					list = new User[cnt+1];
					list[cnt] = new User();
				}
				for (int i = 0; i < cnt; i++) {
					list[i] = temp[i];
				}
				
			Scanner sc = new Scanner(System.in);	
			list[cnt].id = getString("[ 회원가입 ] 아이디");
			list[cnt].pw = getString("[ 회원가입 ] 비밀번호");
			list[cnt].money=getInteger("[ 회원가입 ] 충전금액");
			cnt ++;
			}
			
			void run(){
				while (true) {
					if (log == -1) {
						while (true) {
							Scanner sc = new Scanner(System.in);
							System.out.println("[0] 종료 [1] 회원가입 [2] 로그인 [3] 전체회원출력 ");
							int sel = sc.nextInt();
							
							if (sel == 0) {
								break;
							}else if (sel == 1) {
								addUser();
							}else if (sel == 2) {
								while (true) {
									if(!chk(0,getString("[ 로그인 ] 아이디"))) {
										err("아이디");
										continue;
									}
									break;
								}
								while (true) {
									if (!list[log].pw.equals(getString("[ 로그인 ] 비밀번호"))) {
										err("비밀번호");
										continue;
									} break;
								}
								
								System.out.println("로그인 성공");
								break;
							}else if (sel == 3) {
								for (int i = 0; i < cnt; i++) {
									System.out.print(list[i].id + " / ");
									System.out.print(list[i].pw + " / ");
									System.out.println(list[i].money);
								}
								
							}else {
								System.err.println("잘못된 입력.");
							}
							
						}
					}else {
						while (true) {
							Scanner sc = new Scanner(System.in);
							System.out.println("[1] 탈퇴 (비밀번호 일치 시)[2]금액 수정 [3] 로그아웃");
							int sel = sc.nextInt();
							if (sel == 3) {
								System.out.println("로 그 아 웃");
								log = -1;
								break;
							}else if (sel == 1) {
								
								if (list[log].pw.equals(getString("[ 탈퇴 ] 비밀번호"))) {
									log = -1;
									cnt -- ;
									delete();
									System.out.println("탈퇴완료");
									break;
								}
								err(" 비밀번호 ");
							}else if (sel == 2) {
								list[log].money = getInteger("수정하실 금액을");
								System.out.println("수정완료");
							}
						}
					}
				}
				
			}
			//문자열입력
			String getString(String str){
				Scanner sc = new Scanner(System.in);
				System.out.println(str + " 입력 >> ");
				return sc.next();
			}
			
			//정수형입력
			int getInteger(String str) {
				int num = 0;
				while (true) {
					Scanner sc = new Scanner(System.in);
					System.out.println(str + "(1000 - 100000) 입력 >> ");
					num = sc.nextInt();
					if (num < 1000 || num > 100000) {
						err("금액");
						continue;
					}
					break;
				}
				return num;
			}
			
			//인덱스받아옴
			boolean chk(int no , String str){
				if (no == 0) {
					for (int i = 0; i < list.length; i++) {
						if (list[i].id.equals(str)) {
							log = i;
							return true;
						}
					}
					
				}
				return false;
			}
			
			void err(String str) {
				System.err.println(str + "을(를) 잘못입력하셨음 :(");
			}
			
			//탈퇴기능
			void delete() {
				if (list.length == 1) {
					list = null;
					return;
				}
				
				User temp[] = new User[cnt-1];
				for (int i = 0; i < temp.length; i++) {
					if (i != log) {
						temp[i] = list[i];
					}
				}
				list = temp;
			}
		}

public class 클배회원관리 {
	public static void main(String[] args) {
		UserDAO user = new UserDAO();
		user.run();
		
		
		


	}

}
		