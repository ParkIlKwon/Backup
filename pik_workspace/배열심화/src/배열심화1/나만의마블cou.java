package 배열심화1;

import java.util.Random;
import java.util.Scanner;

public class 나만의마블cou {

	public static void main(String[] args) {
		Random rd = new Random();

		Scanner scan = new Scanner(System.in);
		int[][] marble = new int[5][5];
		int player = 2;
		int road = 1;
		int wall = 0;
		int idx = 0;
		int pIdx = 0;
		int Lgh = marble.length - 1;
		for (int i = 0; i < (marble.length + 1) / 2; i++) {
			int minIdx = 0 + idx;
			int maxIdx = Lgh + 1 - idx;
			for (int j = minIdx; j < maxIdx; j++) {
				if (idx == 0) {
					marble[idx][j] = 1;
					marble[j][Lgh - idx] = 1;
				} else {
					marble[idx][j] = 0;
					marble[j][Lgh - idx] = 0;
				}
			}
			for (int j = maxIdx - 1; j >= minIdx; j--) {
				if (idx == 0) {
					marble[Lgh - idx][j] = 1;
					marble[j][idx] = 1;

				} else {
					marble[Lgh - idx][j] = 0;
					marble[j][Lgh - idx] = 0;
				}
			}
			idx++;
		}
		int a = 0;
		int b = 0;
		int x = 0;
		int y = 0;
		marble[y][x] = 2;
		int dir = 0;
		while (true) {
			for (int i = 0; i < Lgh + 1; i++) {
				for (int j = 0; j < Lgh + 1; j++) {
					if (marble[i][j] == 0) {
						System.out.print(" ■ ");
					} else if (marble[i][j] == 1) {
						System.out.print(" □ ");
					} else {
						System.out.print(" 옷 ");
					}
				}
				System.out.println("\n");
			}
			System.out.println("[1]주사위굴리기[0]종료");
			int input = scan.nextInt();
			if (input != 1 && input != 0) {
				System.err.println("1-0입력");
				continue;
			}
			if (input == 0) {
				System.out.println("종료");
				break;
			}
			int dice = rd.nextInt(6) + 1;
			System.out.println("주사위 숫자 : " + dice);
			marble[y][x] = 1;
			b += dice;
			if (b > Lgh) {
				dir = b / Lgh + dir;
				if (b % 4 == 0) {
					dir -= b / Lgh;
					dir++;
				}
				if (dir >= 4) {
					dir %= 4;
				}
				b -= Lgh;
				while (b > Lgh) {
					b -= Lgh;
				}
			}
			if (dir == 0) {
				y = a;
				x = b;
				System.out.println("dir 0");
			} else if (dir == 1) {
				y = b;
				x = Lgh - a;
				System.out.println("dir 1");
			} else if (dir == 2) {
				y = Lgh - a;
				x = Lgh - b;
				System.out.println("dir 2");
			} else {
				y = Lgh - b;
				x = a;
				System.out.println("dir 3");
			}
			marble[y][x] = 2;
		}

	}

}
