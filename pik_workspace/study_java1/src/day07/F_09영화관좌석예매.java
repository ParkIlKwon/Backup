package day07;

import java.util.Arrays;
import java.util.Scanner;

public class F_09��ȭ���¼����� {
	public static void main(String[] args) {
		/*
		 * # ��ȭ�� �¼����� 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�. 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1��
		 * �����Ѵ�. 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����. 4. �� �¼��� ���� ������ 12000���̴�. 5. ���α׷� ���� ��, �ش�
		 * ��ȭ���� �� ������� ����Ѵ�. ��) seat = 0 0 0 0 0 0 0
		 * 
		 * �¼����� : 1 seat = 0 1 0 0 0 0 0
		 * 
		 * �¼����� : 3 seat = 0 1 0 1 0 0 0
		 * 
		 * �¼����� : 3 seat = 0 1 0 1 0 0 0 �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�. ---------------------- ����� :
		 * 24000��
		 */

		Scanner scan = new Scanner(System.in);
		int[] seat = new int[7];
		int money = 0;
		boolean run = true;
		int log = -1;
		while (run) {
			System.out.println("=�ް� ��ȭ��=");
			System.out.println("1.�¼�����");
			System.out.println("2.����");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				System.out.print("�¼���ȣ�� �Է����ּ��� .");
				int seat2 = scan.nextInt();
				if (seat2 < 0 || seat2 > 7) {
					log = 1;
				}
				if (log != -1) {
					System.out.println("�߸��� �¼���ȣ �Է��Դϴ�.");
				} else {
					if (seat[seat2] == 1) {
						System.out.println("�̹̿��ŵ� �ڸ��Դϴ�.");
						continue;
					}
					for (int i = 0; i < seat.length; i++) {

						if (i == seat2) {
							seat[i] = 1;
							money += 12000;
						}
					}
					System.out.println("���ſϷ� ��Ȳ : " + Arrays.toString(seat));
					log = -1;
				}
			}

			else if (sel == 2) {

				run = false;
			}
		}
		System.out.println("�Ѹ����: " + money);

	}

}
