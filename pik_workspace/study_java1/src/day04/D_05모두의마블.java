package day04;

import java.util.Random;

public class D_05모두의마블 {
	public static void main(String[] args) {
		/*
		 * [문제] 1. 철수는 지금 모두의 마블 게임을 하고있다. 2. 게임은 0 ~ 20까지 이동할 수 있는 거리가 있다. 3. 현재 철수의
		 * 차례이다. 4. 철수의 위치는 시작점으로부터 9만큼 이동한 상태이다. 5. 1 ~ 6의 숫자가 있는 주사위 2개를 던진다. 6. 주사위
		 * 숫자의 합만큼 이동할 수 있다. 7. 다음 이동할 철수의 위치를 출력하시오.
		 * 
		 * 8. 조건 1) 두 주사위 숫자가 서로 다를 경우에는 현재 위치에서 주사위 숫자의 합만큼 이동한다. 예) 3, 5 => 8만큼 이동 2)
		 * 두 주사위의 숫자가 같은 경우 보너스로 이동거리 6이 추가된다. 예) 2, 2 => 4 + 6 만큼 이동 3) 14, 15, 16 번의
		 * 위치에 함정이 있다. 함정에 걸리면 다시 주사위 2개를 던지고 그 합이 6이하이면 [패널티] 처음 위치(0)로 이동한다. 그 합이
		 * 7이상이면 [패널티 없음] 함정을 탈출한다.(현재자리 유지) 4) 20 이상의 값이 나오면 "승리"를 출력한다.
		 */
		Random rd = new Random();
		int location, dice1, dice2;
		dice1 = rd.nextInt(6) + 1;
		dice2 = rd.nextInt(6) + 1;
		System.out.printf("주사위(1),(2) %d  %d\n", dice1, dice2);
		boolean eqr = dice1 == dice2;
		if (!eqr) {
			location = dice1 + dice2 + 9;
		} else {
			location = dice1 + dice2 + 15;
		}
		if (location == 14 || location == 15 || location == 16) {	//boolean trap 처리
			System.out.println("함정걸림");
			dice1 = rd.nextInt(6) + 1;
			dice2 = rd.nextInt(6) + 1;
			location = dice1 + dice2;
			if (location <= 6) {
				System.out.println("패널티 처음위치로 이동");
				location = 0;
			} else {
				System.out.println("패널티 없음 현재위치유지");
			}
		}
		if (location >= 20) {	//로케이션 0 start , 20 end 처리
			System.out.println("승리");
		}
		System.out.printf("최종적인위치: %d", location);

	}

}
