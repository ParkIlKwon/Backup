package day07;

import java.util.Scanner;

public class F_07�Ｎ���� {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//int[] lotto = { 0, 0, 7, 7, 7, 0, 0, 0 };
		 int[] lotto = {7, 0, 7, 7, 0, 7, 0, 7};
		int cnt = 0;
		boolean run = true;

		System.out.println("1) ���� ���Ȯ��");
		System.out.print("�޴� ���� : ");
		int sel = scan.nextInt();

		if (sel == 1) {

			for (int i = 0; i < lotto.length - 1; i++) {
				if (lotto[i] == 7) {
					if (lotto[i] == lotto[i + 1]) {
						cnt++;
					}
				}

			}
			if (cnt >= 2) {
				System.out.println("===��÷===");
			}else {
				System.out.println("===��=== ");
			}
		}

	}
}