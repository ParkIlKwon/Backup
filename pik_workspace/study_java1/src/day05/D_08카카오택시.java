package day05;

import java.util.Random;
import java.util.Scanner;

public class D_08카카오택시 {

	public static void main(String[] args) {
		/*
		 * # 카카오 택시 1. 손님을 태워 목적지까지 이동하는 게임이다. 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다. 3.
		 * 메뉴는 아래와 같다. 1) 속도설정 : 1~3까지만 가능 2) 방향설정 : 동(1)서(2)남(3)북(4) 3) 이동하기 : 설정된 방향으로
		 * 설정된 속도만큼 이동 4. 거리 1칸 당 50원씩 추가되어 도착시 요금도 출력한다.
		 *
		 */
		Scanner scan = new Scanner(System.in);
		Random rd = new Random();
		// 목적지(destination)
		int desX = 0;
		int desY = 0;
		int cos = 0;
		desX = rd.nextInt(21) - 10;
		desY = rd.nextInt(21) - 10;

		// 현재 위치
		int x = 0;
		int y = 0;

		// 방향(direction)
		int dir = 0;

		// 속도
		int speed = 0;

		// 요금
		int fee = 0;

		boolean run = true;
		while (run) {

			System.out.println("= 카카오 택시 =");
			System.out.println("목적지 : " + desX + "," + desY);
			System.out.println("현위치 : " + x + "," + y);
			System.out.println("방   향 : " + dir);
			System.out.println("속   도 : " + speed);
			System.out.println("============");

			System.out.println("1.방향설정");
			System.out.println("2.속도설정");
			System.out.println("3.이동하기");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				System.out.println("방향설정 : 동(1)서(2)남(3)북(4)");
				while (true) {
					dir = scan.nextInt();
					if (dir < 1 || dir > 4) {
						System.out.println("방향입력오류");
						continue;
					} else
						break;
				}

			} else if (sel == 2) {
				while (true) {
					speed = scan.nextInt();
					if (speed < 1 || speed > 3) {
						System.out.println("속도를 설정하세요.");
						continue;
					} else {
						break;
					}
				}
			} else if (sel == 3 && speed != 0 && dir != 0) {
				if (dir == 1) {
					x += speed;
		
				} else if (dir == 2) {
					x -= speed;
			
				} else if (dir == 3) {
					y -= speed;
				} else if (dir == 4) {
					y += speed;
				}
				dir = 0;
				speed = 0;
				fee += speed;
			} else {
				System.out.println("@@@@@@@@@방향과 속도를 설정해주세요\n.@@@@@@@@@@@@");
				continue;
			}
			if (x == desX && y == desY) {
				System.out.println(fee * 50 + "원");
				System.out.println("도착했습니다.");
				break;
			}
		}
	} // 예외처리는 잘 모르겠어서 설명듣겠습니다.

}
