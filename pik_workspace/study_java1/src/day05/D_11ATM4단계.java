package day05;

import java.util.Scanner;

public class D_11ATM4단계 {
	public static void main(String[] args) {
		/*
		 * # ATM[종합] 1. 로그인 . 로그인 후 재 로그인 불가 . 로그아웃 상태에서만 이용 가능 2. 로그아웃 . 로그인 후 이용가능 3.
		 * 입금 . 로그인 후 이용가능 4. 출금 . 로그인 후 이용가능 5. 이체 . 로그인 후 이용가능 6. 조회 . 로그인 후 이용가능 7.
		 * 종료
		 */
		Scanner scan = new Scanner(System.in);

		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		int id, pw;
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;
		int input, output,data=0;	//입출금 변수 
		int log = -1; // -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)

		boolean run = true;
		while (run) {
			if(log==-1) {
			System.out.println("1.로그인");
	}		else {
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
	}
			System.out.println("0.종료");
	
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			if (sel < 0 && sel > 7) {
			System.out.println("===입력오류===");
			continue;
			}
			
			boolean check = (sel==2||sel == 3 || sel == 4 || sel == 5 || sel == 6) && log == -1;
			if (check) {
				System.out.println("===아무도 로그인 하지 않았습니다.===");
				continue;
			}
			
			if (sel == 1) {
				if (log != -1) {
					System.out.println("====이미 로그인한상태====");
					continue;
				}
				System.out.print("아이디를 입력하시오>>");
				id = scan.nextInt();
				System.out.print("비밀번호를 입력하시오>>");
				pw = scan.nextInt();
				
				if (id == dbAcc1 && pw == dbPw1) {
					System.out.println("사용자 1 로그인완료");
					log = 1;
					data=dbMoney1;
				}else if (id == dbAcc2 && pw == dbPw2) {
					System.out.println("사용자 2 로그인완료");
					log = 2;
					data=dbMoney2;
				}else {
					System.out.println("===아이디 또는 비밀번호가 일치하지 않습니다.===");
				}
			} else if (sel == 2) {
				if (log == 1) {
					dbMoney1=data;
				}else {
					dbMoney2=data;
				}
				log = -1;
				System.out.println("로그아웃완료");
			}
			
			else if (sel == 3) {
				System.out.println("입금할 금액을 입력하시오.");
				input = scan.nextInt();
				data+=input;
				if(input%1000!=0&&input<0) {
					System.out.println("입금오류");
					continue;
				}
				
			} else if (sel == 4) {
				while (true) {
					System.out.println("출금할 금액을 입력하시오.");
					output = scan.nextInt();
					if (output < 0 || data<output) {
						System.out.println("입력오류");
						continue;
					}
					data-=output;
					System.out.println("출금완료");
					break;
				}
			} else if (sel == 5) {
				while (true) {
					System.out.println("이체 할 금액을 입력하시오.");
					output = scan.nextInt();
					if (output < 0 || data < output ) {
						System.out.println("입력오류");
						continue;
					} else if (log == 1) {
						data -= output;
						dbMoney2 += output;
					} else {
						dbMoney1 += output;
						data -= output;
					}
					break;
				}
			} else if (sel == 6) {
				System.out.println("입금된 금액은 : "+data);
			} else if (sel == 0 && log == -1) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}
}
