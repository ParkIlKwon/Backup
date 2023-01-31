package day07;

import java.util.Arrays;
import java.util.Scanner;

public class F_09영화관좌석예매 {
	public static void main(String[] args) {
		/*
		 * # 영화관 좌석예매 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다. 2. 예매가 완료되면 해당 좌석 값을 1로
		 * 변경한다. 3. 이미 예매가 완료된 좌석은 재구매할 수 없다. 4. 한 좌석당 예매 가격은 12000원이다. 5. 프로그램 종료 후, 해당
		 * 영화관의 총 매출액을 출력한다. 예) seat = 0 0 0 0 0 0 0
		 * 
		 * 좌석선택 : 1 seat = 0 1 0 0 0 0 0
		 * 
		 * 좌석선택 : 3 seat = 0 1 0 1 0 0 0
		 * 
		 * 좌석선택 : 3 seat = 0 1 0 1 0 0 0 이미 예매가 완료된 자리입니다. ---------------------- 매출액 :
		 * 24000원
		 */

		Scanner scan = new Scanner(System.in);
		int[] seat = new int[7];
		int money = 0;
		boolean run = true;
		int log = -1;
		while (run) {
			System.out.println("=메가 영화관=");
			System.out.println("1.좌석예매");
			System.out.println("2.종료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				System.out.print("좌석번호를 입력해주세요 .");
				int seat2 = scan.nextInt();
				if (seat2 < 0 || seat2 > 7) {
					log = 1;
				}
				if (log != -1) {
					System.out.println("잘못된 좌석번호 입력입니다.");
				} else {
					if (seat[seat2] == 1) {
						System.out.println("이미예매된 자리입니다.");
						continue;
					}
					for (int i = 0; i < seat.length; i++) {

						if (i == seat2) {
							seat[i] = 1;
							money += 12000;
						}
					}
					System.out.println("예매완료 현황 : " + Arrays.toString(seat));
					log = -1;
				}
			}

			else if (sel == 2) {

				run = false;
			}
		}
		System.out.println("총매출액: " + money);

	}

}
