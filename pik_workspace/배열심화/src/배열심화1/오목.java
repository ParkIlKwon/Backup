package �迭��ȭ1;

import java.util.Arrays;
import java.util.Scanner;

public class ���� { 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tx = 0;
		int ty =0;
		int turn = 1;
		int size = 10;
		int x=0,y=0;
		int cnt =0;

		int xa[] = {-4,-3,-2,-1,0,1,2,3,4    };
		int xy[] = {4,3,2,1,0,-1,-2,-3,-4};


		int[][] omok =           {
								{0,0,0,0,0,0,0,0,0,0},
								{0,1,1,1,1,0,0,0,0,0},
								{0,1,1,1,1,0,0,0,0,0},
								{0,1,1,1,1,2,0,0,0,0},
								{0,1,1,1,1,2,0,2,0,0},
								{0,0,0,0,0,2,2,2,2,0},
								{0,0,2,0,0,0,2,2,0,0},
								{0,1,0,0,0,0,2,2,0,0},
								{0,0,0,0,2,0,0,0,0,0},
							       {0,0,0,0,0,2,0,0,0,0},
		};
		System.out.println("0   1   2  3  4  5  6  7  8  9");
		for (int i = 0; i < size; i++) {
			System.out.println(Arrays.toString(omok[i])+ "��" +i);

		}

		int log = -1;


		while (log != 1 && log != 2) {

			while (true) {

				System.out.printf("==[p%d]��==\n", turn);
				System.out.println("y�� ��ǥ�� �Է��ϼ���.");
				y = sc.nextInt();
				System.out.println("x�� ��ǥ�� �Է��ϼ���.");
				x = sc.nextInt();

				if (y < 0 || x < 0 || y > size - 1 || x > size - 1) {
					System.err.println("�ٽ� �Է��Ͽ��ּ���.");
					continue;
				}
				if (omok[y][x] != 0 || y < 0 || x < 0 || y > size - 1 || x > size - 1) {
					System.err.println("�ٽ� �Է��Ͽ��ּ���.");
				} else {
					break;
				}
			}


			omok[y][x] = turn == 1 ? 1 : 2;

			System.out.println(log);

			System.out.println("0   1   2  3  4  5  6  7  8  9");
			for (int i = 0; i < size; i++) {
				System.out.println(Arrays.toString(omok[i]) + "��" + i);

			}
			System.out.println(turn);
			for (int i = 0; i < size; i++) {

				for (int k = 0; k < size; k++) {
					// ���ν¸����� 
					if (omok[i][k] ==turn ) {
						cnt++;
					}
					else {
						cnt = 0;
					}
					if (cnt == 5) {
						log = turn;
						break;
					}

				}

			}

			cnt = 0;
			for (int i = 0; i < size; i++) {

				for (int k = 0; k < size; k++) {
					//���ν¸�����
					if (omok[k][i] ==turn ) {
						cnt++;
					}
					else {
						cnt = 0;
					}
					if (cnt == 5) {
						log = turn;
						break;
					}

				}

			}
			cnt = 0;

			// �밢����
			for (int i = 0; i < size; i++) {
				for (int k = 0; k < size; k++) {
					if (omok[i][k] == turn) {
						for (int j = 0; j < xa.length; j++) {
							tx = k + xa[j];
							ty = i + xa[j];
							if (tx < 0 || ty < 0 || tx > size - 1
									|| ty > size - 1) {
								continue;
							}
							if (omok[ty][tx] == turn) {
								cnt++;
							} else {
								cnt = 0;
							}
							if (cnt == 5) {
								log = turn;
								break;
							}
						}

					}

					cnt = 0;
					// �ݴ�밢����
					if (omok[i][k] == turn) {
						for (int j = 0; j < xa.length; j++) {
							tx = k + xy[j];
							ty = i + xa[j];
							if (tx < 0 || ty < 0 || tx > size - 1
									|| ty > size - 1) {
								continue;
							}
							if (omok[ty][tx] == turn) {
								cnt++;
							} else {
								cnt = 0;
							}
							if (cnt == 5) {
								log = turn;
								break;
							}
						}

					}
					cnt = 0;

				}

				if (log == turn) {
					break;
				}
			}

			turn = turn == 1 ? 2 : 1;

		}

		System.out.println(log == 1 ? "==p1�¸�==" : "==p2�¸�==");
		for (int i = 0; i < size + 10; i++) {
			System.out.println();
		}
		sc.close();


	}




}


