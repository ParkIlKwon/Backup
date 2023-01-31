package day08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class F_06�׸����߱����sol {

	public static void main(String[] args) {
		/*
		 * # ���� ���� 1. ���� ������ ��ġ�� 2�� �Է��� ������ ���ߴ� �����̴�. 2. 1 1 2 2 3 3 4 4 5 5 �� ���ڵ���
		 * 1000�� ���´� (���� ) 3. ����ڰ� �ε��� ��ȣ 2���� �Է��ؼ� �� ���� ���Ѵ� 4. �� �ε��� ���� ������ ��, ������ ���߸�
		 * back�� �ش� ���ڸ� ������, back�� ��� ���� ä������ ������ ����ȴ�. ��) front = [1, 1, 2, 2, 3, 3, 4,
		 * 4, 5, 5] back = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0] �Է�1 : 0 �Է�2 : 4
		 * 
		 * front = [1, 3, 2, 5, 1, 4, 3, 2, 4, 5] back = [1, 0, 0, 0, 1, 0, 0, 0, 0, 0]
		 */

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int[] front = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		int size = 10; // front.length
		int[] back = new int[size];

		// ����
		for (int i = 0; i < 1000; i++) {
			int rdIdx = rd.nextInt(size); // 0
			int temp = front[0];
			front[0] = front[rdIdx];
			front[rdIdx] = temp;
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(" " + i + " ");
		}
		System.out.println();

		System.out.println(Arrays.toString(front));

		// ���� ����

		int cnt = 0;
		while (true) {
          // ������� 
			for (int i = 0; i < size; i++) {
				if (back[i] == 0) {
					System.out.print("[]");
				} else {
					System.out.printf("[%d]", back[i]);
				}
			}
            // �������� 
			if (cnt == 5) {
				break;
			}

			System.out.println();
			System.out.print("�ε���1 >> ");
			int idx1 = sc.nextInt();
			System.out.print("�ε���2 >> ");
			int idx2 = sc.nextInt();

			if (idx1 < 0 || idx2 < 0 || idx1 >= size || idx2 >= size) {
				System.err.println("�ε��� ���� ���� 0 - 9 ");
				continue;
			}

			if (idx1 == idx2) {
				System.err.println("���� �ε����Դϴ�");
				continue;
			}

			if (back[idx1] != 0 || back[idx2] != 0) {
				System.err.println("�̹� �������� ī�尡 �����մϴ�");
				continue;
			}

			for (int i = 0; i < size; i++) {
				if (i == idx1 || i == idx2) {
					System.out.printf("[%d]", front[i]);
				} else if (back[i] == 0) {
					System.out.print("[]");
				} else {
					System.out.printf("[%d]", back[i]);
				}
			}

			System.out.println();

			System.out.println("====");
			if (front[idx1] == front[idx2]) {
				back[idx1] = front[idx1];
				back[idx2] = front[idx2];
				cnt++;
			}

		}
		System.out.println();
		System.out.println("[ ���� ���� ]");
	}

}
