package day03;

import java.util.Scanner;

public class D_05���������� {
	public static void main(String[] args) {
		/*
		 * [����] ����(0) ����(1) ��(2) ���� 1. player1�� 0~2 ������ ���ڸ� �Է¹޴´�. 2. player2�� 0~2 ������
		 * ���ڸ� �Է¹޴´�. 3. ����, ����, ���� 0, 1, 2, ���ڷ� ��� ǥ���Ѵ�. 4. player1�� player2�� ���ؼ�
		 * "���", "�¸�", "�й�"�� ����Ѵ�.
		 */
		int player1, player2;
		Scanner sc = new Scanner(System.in);

		System.out.println(" player 1 ");
		player1 = sc.nextInt();
		System.out.println(" player 2 ");
		player2 = sc.nextInt();
		sc.close(); // ���� 0 ���� 1 �� 2
		boolean draw = player1 == player2, 
				player1win = (player1 == 0 && player2 == 2) || (player1 == 1 && player2 == 0)
				|| (player1 == 2 && player2 == 1);
		if (draw) {
			System.out.println("���");
			return;
		}
		if (player1win) {
			System.out.println("player1 �̱�");
			System.out.println("player2 ��");
		}
		if (!player1win) {
			System.out.println("player1 ��");
			System.out.println("player2 �̱�");
		}
	}

}
