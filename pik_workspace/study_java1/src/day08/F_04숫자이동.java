package day08;

import java.util.Arrays;
import java.util.Scanner;

public class F_04숫자이동 {
	public static void main(String[] args) {
		/*
		 * # 숫자이동[1단계] 1. 숫자2는 캐릭터이다. 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로 숫자2를 입력하면, 캐릭터가 오른쪽으로
		 * 이동한다. 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다. 4. {0, 0, 2, 0, 0, 0, 0}; ==> 왼쪽 ==>
		 * {0, 2, 0, 0, 0, 0, 0};
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int[] game = { 0, 0, 2, 0, 0, 0, 0 };
		int player = -1;
		while (true) {
			for (int i = 0; i < game.length; i++) {
				if (game[i] == 0) {
					System.out.print("_");
				} else {
					System.out.print("Ａ");
				}

			}
			System.out.println();
			System.out.println("1.왼쪽  2.오른쪽");
			int move = sc.nextInt();
			if (move > 0 && move < 3) {

				for (int i = 0; i < game.length; i++) {
					if (game[i] == 2) {
						player = i; // 플레이어 위치인덱스
						game[i] = 0;
					}
				}
				if ((player == game.length - 1 && move == 2) ) {
					game[0] = 2;
					continue;
				}else if(player == 0 && move == 1) {
					game[game.length-1] = 2;
					continue;
				}
				
				for (int i = 0; i < game.length; i++) {
					if (move == 1) {
						game[player - 1] = 2;
					} else {
						game[player + 1] = 2;
					}

				}

			} else {
				System.out.println("다시 입력하여주세요.");
				continue;
			}
		}

	}

}
