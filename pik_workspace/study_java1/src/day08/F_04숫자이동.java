package day08;

import java.util.Arrays;
import java.util.Scanner;

public class F_04�����̵� {
	public static void main(String[] args) {
		/*
		 * # �����̵�[1�ܰ�] 1. ����2�� ĳ�����̴�. 2. ����1�� �Է��ϸ�, ĳ���Ͱ� �������� ����2�� �Է��ϸ�, ĳ���Ͱ� ����������
		 * �̵��Ѵ�. 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�. 4. {0, 0, 2, 0, 0, 0, 0}; ==> ���� ==>
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
					System.out.print("��");
				}

			}
			System.out.println();
			System.out.println("1.����  2.������");
			int move = sc.nextInt();
			if (move > 0 && move < 3) {

				for (int i = 0; i < game.length; i++) {
					if (game[i] == 2) {
						player = i; // �÷��̾� ��ġ�ε���
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
				System.out.println("�ٽ� �Է��Ͽ��ּ���.");
				continue;
			}
		}

	}

}
