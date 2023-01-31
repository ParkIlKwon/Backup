package 메서드2;

import java.util.Arrays;
import java.util.Scanner;

class Theater {
	
		int[] seat = new int[10];
		Scanner sc = new Scanner(System.in);
		String name = ""; // 영화관 이름
		int cnt = 0; // 예매 수
		int money = 0; // 매출액
		int sel;
		
		// 좌석 출력
		void showSeat(){
			System.out.printf(" ==== %s ==== \n",name);
				System.out.println(Arrays.toString(seat));
		}
		
		// 메뉴 출력
		void showMenu(){
			System.out.println("[1] 예매하기 [2] 종료하기");
		}
		
		// 예매하기
		void choiceSeat(){
			System.out.println("예매가능하신 좌석 번호를 출력합니다.");
			for (int i = 0; i < seat.length; i++) 
				if (seat[i] == 0) {
					System.out.print(i + " ");
				}
			while (true) {
				System.out.println("예매하실 좌석 번호를 입력하세요.");
				sel = sc.nextInt();
				chk(sel);
				if (sel >= 0) { money += 10000;
					break;
				}else if (sel == -1) {
				System.err.println("이미 예약한 좌석입니다 :(");
				}else {
					System.err.println("좌석번호 입력오류 :(");
				}	
			}
			seat[sel] = 1 ; cnt ++;
			
		}
		
		void chk(int sel) {
			if (sel < 0 || sel > seat.length-1) {
				this.sel = -2;
			}else if (seat[sel] != 0) {
				this.sel = -1;
			}
		}
		
		// 매출 현황 출력하기
		void showSales(){
			System.out.println("총매출액 : "+money);
			
		}
		
	}


		
	public class 메서드좌석예매 {
	
		public static void main(String[] args) {
	
		    Scanner scan = new Scanner(System.in);
				Theater megabox = new Theater();
				megabox.name = "메가박스";
	
				while (true) {
					megabox.showSeat();
					// 메뉴 출력
					megabox.showMenu();
	
					// 메뉴 선택하기
					System.out.print("메뉴 선택 : ");
					int choice = scan.nextInt();
	
					// 예매하기
					if (choice == 1) {
						megabox.choiceSeat();
					}
					// 종료하기
					else if (choice == 2) {
						// 매출 현황 출력하기
						megabox.showSales();
	
						System.out.println("프로그램 종료");
						break;
					}
	
				}
			
			
			
			
			
			
		}
	
	}
