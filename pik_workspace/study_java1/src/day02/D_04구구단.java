package day02;

import java.util.Scanner;

public class D_04������ {

	public static void main(String[] args) {
		/*
		 * [����] ������ ���� 1. ������ ������ �����ϱ� ���� ���� 2���� �Է¹޴´�. 2. �Է¹��� ���ڸ� ���� ������ ������ ����Ѵ�. ��)
		 * 3 x 7 = ? 3. ������ �ش��ϴ� ������ �Է¹޴´�. 4. ������ ���� "����" �Ǵ� "����"�� ����Ѵ�.
		 */
		int a, b, c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° �� �Է�:  ");
		a = sc.nextInt();
		System.out.println("�ι�° �� �Է�:  ");
		b = sc.nextInt();

		System.out.printf("���� : %d X %d ", a, b);
		c = sc.nextInt();

		boolean check = a * b == c;
		if (check) {
			System.out.println("����");
		}
		
		
		if (!check) {
			System.out.println("����");
		}
	}

}
