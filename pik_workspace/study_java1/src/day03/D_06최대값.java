package day03;

import java.util.Scanner;

public class D_06�ִ밪 {
	public static void main(String[] args) {
		/*
		 * [����] 1. ���� 3���� �Է¹޴´�. 2. �Է¹��� 3���� ���ڸ� ���Ѵ�. 3. ���� ū ��(min)�� ����Ѵ�.
		 */
		int a, b, c;
		Scanner sc = new Scanner(System.in);

		System.out.println("a�� �Է��Ͻÿ�.");
		a = sc.nextInt();
		System.out.println("b�� �Է��Ͻÿ�.");
		b = sc.nextInt();
		System.out.println("c�� �Է��Ͻÿ�.");
		c = sc.nextInt();
		sc.close();
		int min = a;
		boolean err = a == b || b == c || a == c;
		if (err) {
			System.out.println("���ڰ� ���ƿ�.");
		}
		if (!err) {
			if (min > b) {
				min= b;
			}
			if (min > c) {
				min = c;
			}
			System.out.println(min);
		}
	}

}
