package day03;

import java.util.Scanner;

public class D_02�������� {
	public static void main(String[] args) {
		/*
		 * [����] 1. ���������� �Է¹޴´�. 2. ���������� �ش��ϴ� ������ ����Ѵ�. 3. �Ʒ��� ����ǥ�̴�. 91 ~ 100�� A���� 90 ~
		 * 81�� B���� 80���� ����� 4. ��, �����̰ų� A������ B������ ���� �ڸ��� 7�� �̻��̸�, +�� �߰��Ѵ�. A������ B������ ����
		 * �ڸ��� 3�� �����̸�, -�� �߰��Ѵ�.
		 * 
		 * ��) 100 => A+ 87 => B+ 82 => B- 23 => �����
		 */
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.println("���������� �Է��Ͽ� �ֽÿ�.");
		score = sc.nextInt();
		sc.close();
		if (score > 100) {
			System.out.println("�߸��Է�");
			return;
		}
		if (score >= 91) {
			System.out.print(" A ");

		} else if (score >= 81) {
			System.out.print(" B ");

		} else

			System.out.println("�����.");
		if (score % 10 > 7 || score % 10 == 0) {
			System.out.print(" + ");
		}
		if (score % 10 <= 3 && score % 10 != 0) {
			System.out.print(" - ");
		}

	} // 4��

}
