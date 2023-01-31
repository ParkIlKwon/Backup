package day04;

import java.util.Scanner;

public class F_13영수증 {
	public static void main(String[] args) {
		/*
		 * # 영수증 출력[2단계] 1. 5번 주문을 받는다. 2. 주문이 끝난 후, 돈을 입력받는다. 3. 각 메뉴별 주문수량과 총금액을 출력한다.
		 * 
		 * 단 : 메뉴 오류가 떳을때는 횟수 차감되면 안됨 메뉴 주문한것만 영수증으로 출력되게 0 개 영수증 출력나오지 않게 => 주문한 메뉴만
		 * 영수증으로 출력
		 *
		 * 예) 메뉴 선택 : 1 메뉴 선택 : 1 메뉴 선택 : 2 메뉴 선택 : 2 메뉴 선택 : 3
		 * 
		 * 총 금액 = 31300원 현금 입력 : 32000 // 가격보다 크거나 같다는 조건
		 * 
		 * === 롯데리아 영수증 === 불고기 버거 : 2개 새우 버거 : 2개 // 0 개 이면 출력 하면 안됨 콜 라 : 1개 총 금 액 :
		 * 31300원 잔 돈 : 700원 // change이 있을때만 change 출력
		 */
		Scanner sc = new Scanner(System.in);
		int price1 = 8700, p1cnt = 0, total = 0;
		int price2 = 6200, p2cnt = 0;
		int price3 = 1500, p3cnt = 0;
		int menu, cash=0;
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		int i = 1;

		while (i <= 5) {
			System.out.print(i + "번째 메뉴 선택  :  ");
			menu = sc.nextInt();
			if (menu > 0 && menu < 4) {
				if (menu == 1) {
					p1cnt++;
					total += price1;
				}
				else if (menu == 2) {
					p2cnt++;
					total += price2;
				}
				else if (menu == 3) {
					p3cnt++;
					total += price3;
				}
				i++;
			} else {
				System.out.println("입력오류");
			}
		}
		System.out.println("총  금액  :  " + total);
		i = 0;
		boolean check = true;
		
		while (check) {
			System.out.print("현금입력 : ");
			cash = sc.nextInt();
			
			if (cash <= total) {System.out.println("현금이 부족합니다.");
			continue;}
			if (cash % 100 != 0) {System.err.println("다시 입력하여주시오.");
			continue;}
			
			if(cash>total)check = false; 
		}
		int change = cash - total;
		if (total < cash && cash > 0 && cash % 100 == 0) {
			i++;
			System.out.println("===롯데리아 영수증===");
			if (p1cnt != 0) {
				System.out.println("불고기 버거 : " + p1cnt);
			}
			if (p2cnt != 0) {
				System.out.println("새우  버거 : " + p2cnt);
			}
			if (p3cnt != 0) {
				System.out.println("콜      라 : " + p3cnt);
			}
			if (change != 0) {
				System.out.println("잔돈: " + change + " 원");
				
			}
		}

	}

}
