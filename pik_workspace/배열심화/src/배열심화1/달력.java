package �迭��ȭ1;

import java.util.Arrays;
import java.util.Scanner;

public class �޷� {

	public static void main(String[] args) {
		/*
		 * [�޷¸����] �⵵�� ���� �Է¹ް� �޷��� ����ÿ�.
		 * 
		 * [�������] �Ʒ��� ���� ���� �̴�.
		 * 
		 * 1. ��(year)�� 4�� �������� ����. 2. 1�� ������ �´��� 100���� �������� ������ �ƴϴ�. 3. 2�� ������ �´���
		 * 400���� �������� �����̴�.
		 * 
		 * [���ϰ���] 1��1��1�� �� �������̴�.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int setyear = sc.nextInt();
		int monthList[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int yun = 0;
		String startDay[] = { "", "\t", "\t\t", "\t\t\t", "\t\t\t\t", "\t\t\t\t\t", "\t\t\t\t\t\t" };
		System.out.print("�� �Է� : ");
		int month = sc.nextInt();
		boolean yoon = false;
		//boolean chk1 = 
		
		for (int i = 1; i < setyear; i++) {
			if (i % 4 == 0 && i % 100 != 0) {
				yun++;
			}
			if (i % 400 == 0) {
				yun++;
			}

		}

		if (setyear % 4 == 0 && setyear % 100 != 0) {
			yoon = true;
			if (month > 2) {
				yun++;
			}
		}
		if (setyear % 400 == 0) {
			yoon = true;
			if (month > 2) {
				yun++;
			}
		}
		
		int day = 1 + (365 * (setyear - 1)) + yun; // �������� �ǹ�

		for (int i = 0; i < month - 1; i++) {

			for (int k = 1; k <= monthList[i]; k++) {
				day++;
				if (i == monthList[i]) {
					i = 1;
				}
			}
		}

		System.out.printf("\t\t%d�� %d��\n", setyear, month);
		System.out.printf("��\t��\tȭ\t��\t��\t��\t��\n");

		int idx = day % 7;
		System.out.print(startDay[idx]);

		for (int i = 1; i <= monthList[month - 1]; i++) {

			System.out.print(i + "\t");
			idx++;
			if (idx >= 7) {
				System.out.println();
			}
			if (idx >= 7) {
				idx = 0;
			}

		}

		if (yoon == true && month == 2) {
			System.out.print("29");
		}

	}

}
