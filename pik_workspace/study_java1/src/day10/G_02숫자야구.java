package day10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class G_02���ھ߱� {
	public static void main(String[] args) {

		// int[] com = {1, 7, 3}; // ��ȭ -> com ������ �ߺ� ���ŵ� ���� ������ ����
		Random rd = new Random();
		int[] com = new int[3];
		for (int i = 0; i < com.length; i++) {
			com[i] = rd.nextInt(9) + 1;
			for (int k = 0; k < i; k++) {
				if (com[i] == com[k]) {
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(com));

		int[] me = new int[3];
		int ball = 0;
		int strike = 0;

		Scanner sc = new Scanner(System.in);

		while (strike != 3) {

			for (int i = 0; i < me.length; i++) {
				System.out.printf("[%d] �Է�:", i + 1);
				me[i] = sc.nextInt();
				for (int k = 0; k < i; k++) {
					if (me[i] == me[k]) {
						i--;
					}
				}
				System.out.println("=======");
			}
			System.out.println(Arrays.toString(me));

			ball = 0;
			strike = 0;

			for (int i = 0; i < com.length; i++) {
				if (com[i] == me[i]) {
					strike++;
				} else {
					for (int k = 0; k < com.length; k++) {
						if (com[k] == me[i]) {
							ball++;
						}

					}
				}

			}

			System.out.println("strike: " + strike + "ball: " + ball);

		}
		System.out.println("��������");

	}

}
