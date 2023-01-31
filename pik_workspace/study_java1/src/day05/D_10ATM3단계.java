package day05;

import java.util.Scanner;

public class D_10ATM3단계 {
	public static void main(String[] args) {
		/*
		 * # ATM
		 * 1. 입금
		 * . 입금할 금액을 입력받아, myMoney에 입금
		 * 2. 출금
		 * . 출금할 금액을 입력받아, myMoney에서 출금
		 * . 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
		 * 3. 이체
		 * . yourAcc 계좌번호를 입력받아, 이체
		 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
		 * . 이체 후 yourMoney 잔액 증가
		 * 4. 조회
		 * . myMoney와 yourMoney 잔액 모두 출력
		 */
	Scanner scan = new Scanner(System.in);

			int myAcc = 1111;
			int myMoney = 50000;

			int yourAcc = 2222;
			int Acc,id;
			int yourMoney = 70000;
			int input=0,output=0;

			boolean run = true;
			while (run) {
				
				System.out.println("[로그인 id 입력]");
				id  = scan.nextInt();
				
				if(id!=myAcc) {
					System.out.println("로그인실패");
					continue;
				}
				System.out.println("1.입금");
				System.out.println("2.출금");
				System.out.println("3.이체");
				System.out.println("4.조회");
				System.out.println("0.종료");

				System.out.print("메뉴 선택 : ");
				int sel = scan.nextInt();
				
				if (sel == 1) {
				while (true) {
					System.out.println("입금할 액수를 입력하시오.");
					input = scan.nextInt();
					if (input<0) {
						System.out.println("입력오류");
						continue;
					}System.out.println("입금완료");
					myMoney+=input;break;
				}
				}
				else if (sel == 2) {
					while (true) {
				System.out.println("출금할 금액을 입력하시오.");
				output=scan.nextInt();
				if(output>myMoney) {
				System.out.println("잔액부족 다시입력하시오.");
				continue;
				}if(output<0) {
				System.out.println("음수값 입력 다시입력하시오.");
				continue;
				}
				System.out.println(output+"원 출금완료");
				myMoney-=output;break;
					}
				} 
				else if (sel == 3) {
				while (true) {
					System.out.println("송금할 계좌번호 입력");
					Acc=scan.nextInt();
					
					if(Acc!=yourAcc) {
					System.out.println("계좌번호 오류");
					continue;
					}
					System.out.println("보낼 금액??");
					output = scan.nextInt();
					System.out.println(output+" 원 이체 완료");
					myMoney-=output;
					break;
				}
				} 
				else if (sel == 4) {
					System.out.println("현재입금된금액: ");
				System.out.println(">>"+myMoney);
				} 
				else if (sel == 0) {
					run = false;
					System.out.println("프로그램 종료");
				}
			
			}
	}

}
