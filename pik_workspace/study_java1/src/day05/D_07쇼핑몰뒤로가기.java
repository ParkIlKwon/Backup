package day05;

import java.util.Scanner;

public class D_07���θ��ڷΰ��� {

	/*
	 * # ���θ� �ڷΰ���
	 * 
	 * ����) ���θ����θ޴����� �����Ƿ��� �����ؼ� 
	 *      �ڷΰ��� ������������ �����Ƿ� ������ �� �����ҷ����Ѵ�.
	 * ��Ʈ) ���� ���� �ݺ����� �߰� ���ָ�ȴ�. 
	 * 1. �����Ƿ�
	 * 		1) Ƽ����
	 * 		2) ����
	 * 		3) �ڷΰ���
	 * 2. �����Ƿ�
	 * 		1) �����
	 * 		2) ġ��
	 * 		3) �ڷΰ���
	 * 3. ����
	 */

public static void main(String[] args) {
		
    Scanner scan = new Scanner(System.in);

		boolean run = true;
		while (run) {

			System.out.println("1.�����Ƿ�");
			System.out.println("2.�����Ƿ�");
			System.out.println("3.����");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			boolean run2 = true;

			if (sel == 1) {
				while (run2) {
					System.out.println("1)Ƽ����");
					System.out.println("2)����");
					System.out.println("3)�ڷΰ���");
					System.out.print("������ ���� : ");
					int item = scan.nextInt();
					if (item == 1) {
						System.out.println("Ƽ���� ����");
					} else if (item == 2) {
						System.out.println("���� ����");
					} else if (item == 3) {
						run2 = false;
					} else {
						System.out.println("�Է� ���� 1 -3 �Է�");
					}
				}
			} else if (sel == 2) {
				while (run2) {
					System.out.println("1)�����");
					System.out.println("2)ġ��");
					System.out.println("3)�ڷΰ���");
					System.out.print("������ ���� : ");
					int item = scan.nextInt();
					if (item == 1) {
						System.out.println("����� ����");
					} else if (item == 2) {
						System.out.println("ġ�� ����");
					} else if (item == 3) {
						run2 = false;
					} else {
						System.out.println("�Է� ���� 1 -3 �Է�");
					}
				}
			} else if (sel == 3) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}
		
}
}

	


