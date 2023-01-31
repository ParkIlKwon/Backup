package day03;

import java.util.Scanner;

public class D_05가위바위보 {
	public static void main(String[] args) {
		/*
		 * [문제] 가위(0) 바위(1) 보(2) 게임 1. player1은 0~2 사이의 숫자를 입력받는다. 2. player2는 0~2 사이의
		 * 숫자를 입력받는다. 3. 가위, 바위, 보를 0, 1, 2, 숫자로 대신 표현한다. 4. player1과 player2를 비교해서
		 * "비김", "승리", "패배"를 출력한다.
		 */
		int player1, player2;
		Scanner sc = new Scanner(System.in);

		System.out.println(" player 1 ");
		player1 = sc.nextInt();
		System.out.println(" player 2 ");
		player2 = sc.nextInt();
		sc.close(); // 가위 0 바위 1 보 2
		boolean draw = player1 == player2, 
				player1win = (player1 == 0 && player2 == 2) || (player1 == 1 && player2 == 0)
				|| (player1 == 2 && player2 == 1);
		if (draw) {
			System.out.println("비김");
			return;
		}
		if (player1win) {
			System.out.println("player1 이김");
			System.out.println("player2 짐");
		}
		if (!player1win) {
			System.out.println("player1 짐");
			System.out.println("player2 이김");
		}
	}

}
