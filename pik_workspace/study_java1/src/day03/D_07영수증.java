package day03;

import java.util.Scanner;

public class D_07영수증 {
	public static void main(String[] args) {
		/*
		 * [문제] 1. 메뉴판을 출력한다. 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다. 3. 현금을 입력받는다. 4. 입력받은 현금과
		 * 메뉴가격을 확인해 영수증을 출력한다. 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
		 */
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		int menu, cash, total = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우   버거 : " + price2 + "원");
		System.out.println("3.콜      라 : " + price3 + "원");
		System.out.print("\n 메뉴를 고르시오.");
		menu = sc.nextInt();
		if(menu>3||menu<=0) {
			System.out.println("입력오류");
			return;
		}
		System.out.print("지급할 현금??? ");
		cash = sc.nextInt();
		boolean err = cash < 0;
		if (err) {
			System.out.println("입력 오류");
		}
		if (!err) {
			boolean menu1 = menu == 1, menu2 = menu == 2, menu3 = menu == 3;
			String name = "";
			if (menu1) {
				total = cash - price1;
				name = "불고기 버거";
				if (price1 > cash) {
					System.out.println("현금이 부족합니다.");
					return;
				}
			}
			if (menu2) {
				total = cash - price2;
				name = "새우 버거";
				if (price2 > cash) {
					System.out.println("현금이 부족합니다.");
					return;
				}
			}
			if (menu3) {
				total = cash - price3;
				name = "콜 라";
				if (price3 > cash) {
					System.out.println("현금이 부족합니다.");
					return;
				}

			}
			System.out.println("메뉴>>" + name + "주문완료 남은 현금은" + total + " 원");
		}

	}

}
