package day02;

import java.util.Scanner;

public class D_05��ū���� {
	public static void main(String[] args) {
		/*
		 * [����] ���� 2���� �Է¹ް�, �� ū ������ ���� ����Ͻÿ�.
		 * 
		 * ��) ����1 �Է� : ����2 �Է� : �� ū ���ڴ� ? �Դϴ�.
		 */

		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° �����Է��ϙJ�� :");
		a = sc.nextInt();
		System.out.println("�ι�° �����Է��ϙJ�� :");
		b = sc.nextInt();

		if (a == b) {
			System.out.println("���� ���� �����Դϴ�");
		}
		if (a>b) {
			System.out.printf("�� ū ���ڴ� %d �Դϴ�", a);
		}
		if (b>a) {
			System.out.printf("�� ū ���ڴ� %d �Դϴ�", b);
		}

	}

}
