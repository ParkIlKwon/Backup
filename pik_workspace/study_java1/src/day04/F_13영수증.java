package day04;

import java.util.Scanner;

public class F_13������ {
	public static void main(String[] args) {
		/*
		 * # ������ ���[2�ܰ�] 1. 5�� �ֹ��� �޴´�. 2. �ֹ��� ���� ��, ���� �Է¹޴´�. 3. �� �޴��� �ֹ������� �ѱݾ��� ����Ѵ�.
		 * 
		 * �� : �޴� ������ �������� Ƚ�� �����Ǹ� �ȵ� �޴� �ֹ��Ѱ͸� ���������� ��µǰ� 0 �� ������ ��³����� �ʰ� => �ֹ��� �޴���
		 * ���������� ���
		 *
		 * ��) �޴� ���� : 1 �޴� ���� : 1 �޴� ���� : 2 �޴� ���� : 2 �޴� ���� : 3
		 * 
		 * �� �ݾ� = 31300�� ���� �Է� : 32000 // ���ݺ��� ũ�ų� ���ٴ� ����
		 * 
		 * === �Ե����� ������ === �Ұ�� ���� : 2�� ���� ���� : 2�� // 0 �� �̸� ��� �ϸ� �ȵ� �� �� : 1�� �� �� �� :
		 * 31300�� �� �� : 700�� // change�� �������� change ���
		 */
		Scanner sc = new Scanner(System.in);
		int price1 = 8700, p1cnt = 0, total = 0;
		int price2 = 6200, p2cnt = 0;
		int price3 = 1500, p3cnt = 0;
		int menu, cash=0;
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");
		int i = 1;

		while (i <= 5) {
			System.out.print(i + "��° �޴� ����  :  ");
			menu = sc.nextInt();
			if (menu > 0 && menu < 4) {
				if (menu == 1) {
					p1cnt++;
					total += price1;
				}
				else if (menu == 2) {
					p2cnt++;
					total += price2;
				}
				else if (menu == 3) {
					p3cnt++;
					total += price3;
				}
				i++;
			} else {
				System.out.println("�Է¿���");
			}
		}
		System.out.println("��  �ݾ�  :  " + total);
		i = 0;
		boolean check = true;
		
		while (check) {
			System.out.print("�����Է� : ");
			cash = sc.nextInt();
			
			if (cash <= total) {System.out.println("������ �����մϴ�.");
			continue;}
			if (cash % 100 != 0) {System.err.println("�ٽ� �Է��Ͽ��ֽÿ�.");
			continue;}
			
			if(cash>total)check = false; 
		}
		int change = cash - total;
		if (total < cash && cash > 0 && cash % 100 == 0) {
			i++;
			System.out.println("===�Ե����� ������===");
			if (p1cnt != 0) {
				System.out.println("�Ұ�� ���� : " + p1cnt);
			}
			if (p2cnt != 0) {
				System.out.println("����  ���� : " + p2cnt);
			}
			if (p3cnt != 0) {
				System.out.println("��      �� : " + p3cnt);
			}
			if (change != 0) {
				System.out.println("�ܵ�: " + change + " ��");
				
			}
		}

	}

}
