package day07;

import java.util.Scanner;

public class F_02�迭����4 {
	public static void main(String[] args) {
		// ���� 1) �Ʒ� �迭 a ���� ���� �Է��� ���� ���� b �� ����
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 0, 0, 0, 0, 0 };
		int idx = 0;
		int num = 0;
		// ��) 30 ==> b[] = {10,20,40,50,0};
		Scanner sc = new Scanner(System.in);
		while (true) {
			num = sc.nextInt();
			if (num % 10 != 0 || num > 50 || num < 0) {
				System.out.println("�������ٽ��Է��ϼ���.");
				continue;
			} else {
				for (int i = 0; i < a.length; i++) {

					if (a[i] == num) {
						continue;
					} else {
						b[idx] = a[i];
					}
					idx++;
				}
				for (int i = 0; i < b.length; i++) {

					System.out.print(b[i] + " ");

				}
				break;
			}
		}
		System.out.println();
		// ���� 2) �Ʒ� �迭���� ���� �Է��� ��ȣ �� �� �� ���� d �� ����
		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
		int d[] = { 0, 0, 0, 0, 0, 0 };
		int e = 0;
		// ��) 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};

		idx = 0;
		while (true) {
			int num2 = sc.nextInt();
			if (num2 == 1001 || num2 == 1002 || num2 == 1003) {
				for (int i = 0; i < c.length - 1; i += 2) {

					if (c[i] == num2) {
						e = i;
						break;
					}
				}
				for (int i = 0; i < c.length; i++) {
					if (i == e) {
						i++;
						continue;
					} else {
						d[idx] = c[i];
					}
					idx++;

				}
				break;
			} else {
				System.out.println("�������ٽ��Է��ϼ���");
			}
		}
		for (int i = 0; i < d.length; i++) {

			System.out.print(d[i] + " ");

		}

	}

}
