package day08;

import java.util.Scanner;

public class F_07ƽ���� {
	public static void main(String[] args) {

		int[] game = new int[9];
		int log = -1;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < game.length; i++) {
			if (game[i] == 0) {
				System.out.print("[]");
			}
			if (i % 3 == 2) {
				System.out.println();
			}

		}

		while (log == -1) {

			System.out.print("p1 >> ");
			int p1 = sc.nextInt();
			p1--;
			System.out.print("p2 >> ");
			int p2 = sc.nextInt();
			p2--;

			if (p1 == p2) {
				System.out.println("���� ���� �Է��Ͽ����ϴ�.");
				continue;
			}

			if (game[p1] != 0) {

			}
			game[p1] = 1;
			game[p2] = 2;

			for (int i = 0; i < game.length; i++) {
				if (game[i] == 0) {
					System.out.print(" [] ");
				} else if (game[i] == 1) {
					System.out.printf("[O]");
				} else {
					System.out.printf("[X]");
				}
				if (i % 3 == 2) {
					System.out.println();
				}

			}

			for (int i = 0; i < game.length; i++) {
				if (game[i] == 1) {
					if (i < 3 && (game[i] == game[i + 3] && game[i] == game[i + 6])) { // ���κ���
						System.out.println("===p1�¸�===");
						log = 1;
						break;

					}
					if (game[i] == game[i + 1] && game[i] == game[i + 2] && i % 3 != 2) {
						System.out.println("===p1�¸�==="); // ���κ���
						log = 1;
						break;
					}

				}
				if (game[0] == 1 && game[4] == 1 && game[8] == 1) {
					System.out.println("===p1�¸�==="); // �밢����
					log = 1;
					break;
				}
				if (game[i] == 2) {
					if (i < 3 && (game[i] == game[i + 3] && game[i] == game[i + 6])) { // ���κ���
						System.out.println("===p2�¸�===");
						log = 1;
						break;

					}
					if (game[i] == game[i + 1] && game[i] == game[i + 2] && i % 3 != 2) {
						System.out.println("===p2�¸�==="); // ���κ���
						log = 1;
						break;
					}

				}
				if (game[0] == 2 && game[4] == 2 && game[8] == 2) {
					System.out.println("===p2�¸�==="); // �밢����
					log = 1;
					break;
				}

			}

		}

	}

}
