package day07;

import java.util.Arrays;
import java.util.Scanner;

public class F_05�迭����ü {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int log = -1;
		Scanner sc = new Scanner(System.in);
		// �ε��� ���� ���� �� �� �ε����� ������ ����

		// ���� 1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 1) �ε���1 �Է� : 1 , �ε���2 �Է� : 3
		// {10, 40, 30, 20, 50}

		System.out.print("�ε��� [1] �Է�: ");
		int idx1 = sc.nextInt();
		System.out.print("�ε��� [2] �Է�: ");
		int idx2 = sc.nextInt();
		if (idx1 == idx2 || idx1 > 4 || idx2 > 4 || idx1 < 0 || idx2 < 0) {
			log = 1;
		}
		if (log != -1) {
			System.out.println("����");
		} else {
			int num = arr[idx1];

			arr[idx1] = arr[idx2];
			arr[idx2] = num;
			System.out.println(Arrays.toString(arr));
		}

		log = -1;
		// ���� 2) �� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 2) ��1 �Է� : 40 , ��2 �Է� : 20
		// {10, 20, 30, 40, 50}

		// 1��° ���� �Ѱ��� ���� ������ ���� ���

		// 1��°�� 2��° ���� ���� ������ ���� ���

		int a, b, check = 0, check2 = 0;
		System.out.println("== ���� 2 ==");
		while (log == -1) {

			System.out.println("ù��° ���Է�");
			a = sc.nextInt();
			System.out.println("�ι�° ���Է�");
			b = sc.nextInt();

			if (a == b) {
				System.out.println("������");
			} else {
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == a) {
						check = i;
					}
					if (arr[i] == b) {
						check2 = i;
					}
				}
				int num2 = arr[check];

				arr[check] = arr[check2];
				arr[check2] = num2;

				log = 1;

			}

		}
		System.out.println(Arrays.toString(arr));

		// �й� �ΰ� ��Ȯ�ϰ� �Է��Ҷ����� �ݺ��ؼ� �Է¹ޱ�

		// �� �й��� ���ų� , �� �й��� ���� ��� �ٽ� �Է¹ޱ�

		// ���� 3) �й� 2���� �Է¹޾� ���� ��ü�ϱ�
		// �� 3) �й�1 �Է� : 1002 , �й�2 �Է� : 1003
		// {87, 45, 11, 98, 23}

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		idx1 = -1;
		idx2 = -1;

		while (true) {
			System.out.print("[�й�]ù��° �� �Է�: ");
			int hak1 = sc.nextInt();
			System.out.print("[�й�]�ι�° �� �Է�: ");
			int hak2 = sc.nextInt();
			if (hak1 == hak2) {
				System.out.println("���δٸ� ���� �Է��Ͽ��ּ���.");
				continue;
			}
			for (int i = 0; i < hakbuns.length; i++) {
				if (hak1 == hakbuns[i]) {
					idx1 = i;

				}
				if (hak2 == hakbuns[i]) {
					idx2 = i;
				}
			}

			if (idx1 != -1 && idx2 != -1) {
				int score = scores[idx1];
				scores[idx1] = scores[idx2];
				scores[idx2] = score;
				break;
			} else {
				System.out.println("==������==");
			}
		}

		System.out.println(Arrays.toString(scores));

	}

}
