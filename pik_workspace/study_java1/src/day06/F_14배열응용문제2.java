package day06;

import java.util.Iterator;
import java.util.Scanner;

public class F_14�迭���빮��2 {
	public static void main(String[] args) {
		// ����1) �ε���(���ȣ)�� �Է��ϸ� �����
		int a[] = { 10, 20, 30, 40, 50 };
		int sel, log = -1;
		// ��) 3 ==> 40
		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		for (int i = 0; i < a.length; i++) {
			if (sel == i) {
				sel = a[i];
				log = 1;
			}
		}

		if (log == -1) {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		} else {
			System.out.println(sel);
		}

		// ����2) �Ʒ��迭�� ����ū�� ���
		int b[] = { 12, 54, 23, 87, 1 };
		int max = 0;
		// ��) 87

		for (int i = 0; i < b.length; i++) {
			if (max < b[i]) {
				max = b[i];
			}
		}

		System.out.println("[�ִ밪] " + max);

		// ����3) �Ʒ� �迭�� Ȧ���� ���� ���
		int c[] = { 12, 54, 23, 87, 1 };
		int cnt = 0;
		// ��) Ȧ���� ���� : 3

		for (int i = 0; i < c.length; i++) {
			if (c[i] % 2 == 1) {
				cnt++;
			}
		}

		System.out.println("[Ȧ���� ����] " + cnt);

		// ����4) �Ʒ��迭�� �Ųٷ� ����

		int d[] = { 1, 2, 3, 4, 5 };
		int e[] = { 0, 0, 0, 0, 0 };
		// ��) ={5,4,3,2,1};
		int index = 0;
		for (int i = d.length - 1; i >= 0; i--) {
			e[index] = d[i];
			index++;
		}
		System.out.print("[�Ųٷ� ���] ");
		for (int j = 0; j < e.length; j++) {
			System.out.print(e[j]);
		}

	}

}
