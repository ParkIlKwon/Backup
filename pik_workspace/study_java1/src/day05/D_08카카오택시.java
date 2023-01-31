package day05;

import java.util.Random;
import java.util.Scanner;

public class D_08īī���ý� {

	public static void main(String[] args) {
		/*
		 * # īī�� �ý� 1. �մ��� �¿� ���������� �̵��ϴ� �����̴�. 2. -10~10 ������ ���� ���� 2���� ������ �������� �����Ѵ�. 3.
		 * �޴��� �Ʒ��� ����. 1) �ӵ����� : 1~3������ ���� 2) ���⼳�� : ��(1)��(2)��(3)��(4) 3) �̵��ϱ� : ������ ��������
		 * ������ �ӵ���ŭ �̵� 4. �Ÿ� 1ĭ �� 50���� �߰��Ǿ� ������ ��ݵ� ����Ѵ�.
		 *
		 */
		Scanner scan = new Scanner(System.in);
		Random rd = new Random();
		// ������(destination)
		int desX = 0;
		int desY = 0;
		int cos = 0;
		desX = rd.nextInt(21) - 10;
		desY = rd.nextInt(21) - 10;

		// ���� ��ġ
		int x = 0;
		int y = 0;

		// ����(direction)
		int dir = 0;

		// �ӵ�
		int speed = 0;

		// ���
		int fee = 0;

		boolean run = true;
		while (run) {

			System.out.println("= īī�� �ý� =");
			System.out.println("������ : " + desX + "," + desY);
			System.out.println("����ġ : " + x + "," + y);
			System.out.println("��   �� : " + dir);
			System.out.println("��   �� : " + speed);
			System.out.println("============");

			System.out.println("1.���⼳��");
			System.out.println("2.�ӵ�����");
			System.out.println("3.�̵��ϱ�");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				System.out.println("���⼳�� : ��(1)��(2)��(3)��(4)");
				while (true) {
					dir = scan.nextInt();
					if (dir < 1 || dir > 4) {
						System.out.println("�����Է¿���");
						continue;
					} else
						break;
				}

			} else if (sel == 2) {
				while (true) {
					speed = scan.nextInt();
					if (speed < 1 || speed > 3) {
						System.out.println("�ӵ��� �����ϼ���.");
						continue;
					} else {
						break;
					}
				}
			} else if (sel == 3 && speed != 0 && dir != 0) {
				if (dir == 1) {
					x += speed;
		
				} else if (dir == 2) {
					x -= speed;
			
				} else if (dir == 3) {
					y -= speed;
				} else if (dir == 4) {
					y += speed;
				}
				dir = 0;
				speed = 0;
				fee += speed;
			} else {
				System.out.println("@@@@@@@@@����� �ӵ��� �������ּ���\n.@@@@@@@@@@@@");
				continue;
			}
			if (x == desX && y == desY) {
				System.out.println(fee * 50 + "��");
				System.out.println("�����߽��ϴ�.");
				break;
			}
		}
	} // ����ó���� �� �𸣰ھ �����ڽ��ϴ�.

}
