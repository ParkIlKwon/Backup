package day02;

import java.util.Scanner;

public class D_07���ٿ� {

	public static void main(String[] args) {
		/*
		 * [����] Up & Down ���� 1. com�� 8�̴�. 2. me�� ���� �ϳ��� �Է��Ѵ�. 3. com�� me�� ���� ������ ����
		 * �޼����� ����Ѵ�. 1) me < com : Up! 2) me > com : Down! 3) me == com : Bingo!
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
