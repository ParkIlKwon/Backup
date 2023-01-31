package day02;

import java.util.Scanner;

public class D_07업다운 {

	public static void main(String[] args) {
		/*
		 * [문제] Up & Down 게임 1. com은 8이다. 2. me는 숫자 하나를 입력한다. 3. com과 me를 비교해 다음과 같은
		 * 메세지를 출력한다. 1) me < com : Up! 2) me > com : Down! 3) me == com : Bingo!
		 */
		int com = 8, me;
		Scanner sc = new Scanner(System.in);
		me = sc.nextInt();

		if (me < com) {
			System.out.println("up!");
		}
		if (me > com) {
			System.out.println("Down!");
		}
		if (me == com) {
			System.out.println("Bingo!");
		}

	}

}
