package day10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class G03_1to18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int SIZE = 9; // ����� �׻� ���� �̸� ��� �빮�ڷ� ����
		Random rd = new Random();
		int[] front = new int[SIZE];
		int[] back = new int[SIZE];
		final int FULLSIZE = front.length + back.length;
		int gameNum = 1;
		
		for (int i = 0; i < SIZE; i++) {
			front[i] = i + 1;
			back[i] = SIZE + 1 + i;
		}
		
		for (int i = 0; i < 100; i++) {
			int idx1 = rd.nextInt(SIZE);
			int temp1 = front[0];
			front[0] = front[idx1];
			front[idx1] = temp1;
			
			int idx2 = rd.nextInt(SIZE);
			int temp2 = back[0];
			back[0] = back[idx1];
			back[idx1] = temp2;
			
		}

		int idx = 0;
		int cnt = 1;
		int backCnt = 10;
		int fPos = 0;
		int bPos = 0;

		while (true) {
			if (cnt == FULLSIZE + 1) {
				break;
			}
			System.err.println(Arrays.toString(front));
			System.err.println(Arrays.toString(back));

			for (int i = 0; i < SIZE; i++) {
				if (front[i] == cnt) {
					System.out.println(cnt + "�� " + (i + 1) + "��° �ڸ��� �ֽ��ϴ�.");
					fPos = i;
				}
				if (back[i] == backCnt) {
					bPos = i;
				}
			}

			int input = sc.nextInt();
			if (input < 1 || input > 9) {
				System.err.println("=====���Է¿���=====");
				continue;
			}

			input--;
			if (fPos == input) {
				front[fPos] = back[bPos];
				cnt++;
				backCnt++;
				back[bPos] = 0;

			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				continue;
			}

		}

		System.out.println("��������");

	}

}
