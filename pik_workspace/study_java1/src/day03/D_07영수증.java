package day03;

import java.util.Scanner;

public class D_07������ {
	public static void main(String[] args) {
		/*
		 * [����] 1. �޴����� ����Ѵ�. 2. ����ڴ� �ֹ��ϰ��� �ϴ� �޴��� ��ȣ�� �Է��Ѵ�. 3. ������ �Է¹޴´�. 4. �Է¹��� ���ݰ�
		 * �޴������� Ȯ���� �������� ����Ѵ�. 5. ��, ������ ������ ��� "������ �����մϴ�."��� �޼����� ����Ѵ�.
		 */
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		int menu, cash, total = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����   ���� : " + price2 + "��");
		System.out.println("3.��      �� : " + price3 + "��");
		System.out.print("\n �޴��� ���ÿ�.");
		menu = sc.nextInt();
		if(menu>3||menu<=0) {
			System.out.println("�Է¿���");
			return;
		}
		System.out.print("������ ����??? ");
		cash = sc.nextInt();
		boolean err = cash < 0;
		if (err) {
			System.out.println("�Է� ����");
		}
		if (!err) {
			boolean menu1 = menu == 1, menu2 = menu == 2, menu3 = menu == 3;
			String name = "";
			if (menu1) {
				total = cash - price1;
				name = "�Ұ�� ����";
				if (price1 > cash) {
					System.out.println("������ �����մϴ�.");
					return;
				}
			}
			if (menu2) {
				total = cash - price2;
				name = "���� ����";
				if (price2 > cash) {
					System.out.println("������ �����մϴ�.");
					return;
				}
			}
			if (menu3) {
				total = cash - price3;
				name = "�� ��";
				if (price3 > cash) {
					System.out.println("������ �����մϴ�.");
					return;
				}

			}
			System.out.println("�޴�>>" + name + "�ֹ��Ϸ� ���� ������" + total + " ��");
		}

	}

}
