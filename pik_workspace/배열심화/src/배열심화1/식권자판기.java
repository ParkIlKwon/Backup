package 배열심화1;

import java.util.Scanner;

public class 식권자판기 {

	public static void main(String[] args) {
		/*
		 [식권 자판기 프로그램]		// 9:53 - 11:21
			 1) 관리자   2) 사용자 
			관리자 ==> 1) 식권충전   2) 잔돈 충전 	 3)뒤로가기
			사용자 ==> 1) 구입 ==> ==> 입금 금액 입력 ==> 구매 매수 입력  ==> 잔돈출력 	
		    	       2)뒤로가기
			 조건 ) 예) 잔돈이 7600원이다. 5000원권이 없으면 1000원짜리 7장거슬러준다. 
			화면 
			 식권 가격 : 3200원 
			 식권 	  : ??매  (매진시 매진) 
			 50000원 : ?? 매  	// 10000원 : ?? 매	// 5000원 : ?? 매
			 1000원 : ?? 매		//  500원 : ?? 개	  	//  100원 : ?? 개 
		*/
	 Scanner sc = new Scanner(System.in);
			
			int[] money   = {50000, 10000, 5000, 1000, 500, 100};
			int[] charges = {    1,     1,    1,    1,   5,  10};
			
			int tickets = 5;		// 식권 개수
			final int  price = 3200;		// 식권 가격
			int input = 0;
			int log = -1;
			int idx = 0;
			int i = 0;
			int total = 0;
			while(true) {
				
				
				System.out.println("[1]관리자");
				System.out.println("[2]사용자");
				System.out.println("[0]프로그램종료");
				System.out.print("메뉴 선택 : ");
				int sel = sc.nextInt();
				if(sel <0 || sel >2) {
					System.out.println("메뉴선택 오류");
					continue;
				}
				if(sel == 0) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				if(sel == 1) {
					while(true) {
						
						System.out.println("현재 남은 식권:"+tickets);
						System.out.println("===현재 잔돈 내역===");
						for ( i = 0; i < charges.length; i++) {
							System.out.print(money[i] + " : " + charges[i]);
							if(i>3) {
								System.out.print("개");
							}else {
								System.out.print("매");
							}
							System.out.println();
							
						}
						System.out.println("1)식권충전");
						System.out.println("2)잔돈충전");
						System.out.println("0)뒤로가기");
						
						System.out.print("메뉴 선택 : ");
						int choice = sc.nextInt();
						if(choice == 1) {
							System.out.println("충전할 식권 매수를 입력하시오.");
							input = sc.nextInt();
							if(input < 0) {
								System.out.println("음수값은 입력될수 없습니다.");
								continue;
							}
							tickets += input;
							if(input == 0) {
								System.err.println("0장충전 ㅎ");
							}
						}
						else if(choice == 2) {
							log = -1;
							System.out.println("충전할 잔돈을 입력하시오.");
							input = sc.nextInt();
							for ( i = 0; i < money.length; i++) {
								if(money[i] == input) {
									log = i;
									break;
								}
							}
							
							if(log == -1) {
								System.err.println("잔돈을 잘못입력하셨습니다.");
								continue;
							}
							
							System.out.printf("[%d]권 몇장충전??",money[i]);
							input = sc.nextInt();
							
							if(input < 0) {
								System.err.println("잘못된 입력");
								continue;
							}
							
							for ( i = 0; i < charges.length; i++) {
								if(log == i) {
									charges[i]+=input;
									break;
								}
							}
							
							System.out.println("충전완료");
							
							
						}
						else if(choice == 0) {
							break;
						}
					}
					
				}
				////////////////////////////////////////////////////////////////////////
				else if(sel == 2 && tickets != 0) {	
					while(true) {
						System.out.println("현재 식권 매수:" + tickets);
						System.out.println("식권가격: "+price);
						System.out.println("===현재 잔돈 내역===");
						for ( i = 0; i < charges.length; i++) {
							System.out.print(money[i] + " : " + charges[i]);
							if(i>3) {
								System.out.print("개");
							}else {
								System.out.print("매");
							}
							System.out.println();
							
						}
						
						System.out.println("1)구입");					
						System.out.println("0)뒤로가기");				
						System.out.print("메뉴 선택 : ");
						int choice = sc.nextInt();
						if(choice == 1) {
							idx = 0;
							System.out.println("구매할 식권 매수를 입력하시오. [남은식권]" + tickets);
							int cnt = sc.nextInt();
							
							if(cnt <= 0) {
								System.err.println("잘못입력하였습니다.");
								continue;
							}
							total = cnt * price;
							System.out.printf("식권[%d]장 가격 %d원 입니다. 내실금액을 입력해주시오\n",cnt,total);
							input = sc.nextInt();
							if(input < total) {
								System.err.println("현금이 부족합니다.");
								continue;
							}else if (input % 100 != 0) {
								System.err.println("100단위 이상을 입력하시오.");
								continue;
							}
							
							total = input - total;
							int[] output = new int [charges.length];
							
							for (i = 0; i < charges.length; i++) {
								cnt = 0;
								if(total >= money[i] && charges[i]!=0) {
									while(charges[i] != 0) {
										if(total < money[i]) {
											break;
										}
									total -= money[i];
									charges[i] --;
									output[i] ++;
									}
								}
							
							}
							
							if(total > 0) {
								System.err.println("죄송합니다 거스름돈이 부족합니다. 나가주세요.");
								for (int j = 0; j < output.length; j++) {
									charges[j] += output[j];
								}
								break;
							}else {
								System.out.println("[거스름돈내역]");
								for (int j = 0; j < output.length; j++) {
									if(output[j] != 0) {
										System.out.print(money[j]+": "+output[j]);
										System.out.println();
									}
								}
								tickets--;
							}
							
							
						}
						else if(choice == 0) {
							break;
						}
					}
				}else {
					System.out.println("식권이 매진되었습니다.");
					
				}
				
				
				
				
				
			}
			
			
			

	}

}
