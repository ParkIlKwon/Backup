package day10;

import java.util.Arrays;
import java.util.Scanner;

public class G_04ATM {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int MAX = 5;

		int[] arId = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX];
		int getId = 0; // ���̵� �Է¹����� ��
		int getPw = 0; // ��й�ȣ �Է¹�����
		int count = 0; // ȸ�����Ե� ȸ���� üũ
		int log = -1; // �α��� ���� üũ , �α��� ���� �ҷ��ö� ���� ����
		int getMoney = 0; // �Ա�,��ü�� ���� ����

		String menu = "=== �׸� IT ATM ===\n";
		String menu2 = "=== �׸� IT ATM ===\n";
		menu += "1.ȸ������\n3.�α���\n0.����\n";
		menu2 += "1.ȸ������\n2.ȸ��Ż��\n3.�α���\n4.�α׾ƿ�\n5.�Ա�\n6.��ü\n7.�ܾ���ȸ\n0����";

		while (true) {
			System.out.println("ȸ����: " + count);
			System.out.println("---------------");
			for (int i = 0; i < count; i++) {
				System.out.printf("%d : %d ( %d )\n", arId[i], arPw[i], arMoney[i]);

			}
			System.out.println();

			if (log == -1) {
				System.out.println("[ �� �� ��] : ����");
				System.out.println(menu);
			} else {
				System.out.println("--------------------------");
				System.out.println("[ �� �� ��] : " + arId[log]);
				System.out.println("--------------------------");
				System.out.println(menu2);
			}
			int sel = scan.nextInt();
			if (log == -1 && (sel > 3 || sel == 2 || sel < 0)) {
				System.err.println("�߸����Է�");
				continue;
			} else if (log != -1 && (sel == 2 || sel == 3)) {
				System.err.println("�α׾ƿ��� ���� �����Ͽ� �ֽÿ�.");
				continue;
			}
			if (sel < 0 || sel > 7) {
				System.err.println("�߸����Է�");
				continue;
			}

			if (sel == 1) {
				int overlap = -1;
				if (count == MAX) {
					System.err.println("������ ������ �ε����� �����մϴ�.");
					continue;
				}
				System.out.println("ȸ�������� ���̵� �Է��ϼ���.");
				getId = scan.nextInt();
				for (int i = 0; i < MAX; i++) {
					if (getId == arId[i]) {
						overlap = 1;
					}
				}
				if (overlap == 1) {
					System.out.println("���̵� �ߺ��˴ϴ�.");
					continue;
				}
				System.out.println("ȸ�������� ��й�ȣ�� �Է��ϼ���.");
				getPw = scan.nextInt();

				arId[count] = getId;
				arPw[count] = getPw;
				arMoney[count] = 1000;

				count++;
			} else if (sel == 0) {
				System.out.println("�����մϴ�.");
				break;
			} else if (sel == 2) {
				System.out.println("ȸ��Ż���� ���̵� �Է��Ͻÿ�.");
				int idx = 0;
				getId = scan.nextInt();
				for (int i = 0; i < MAX; i++) {
					if (getId == arId[i]) {
						idx = i;
					}
				}
				arId[idx] = 0;
				arPw[idx] = 0;
				arMoney[idx] = 0;
				count--;

			} else if (sel == 3) {
				if (count == 0) {
					System.err.println("ȸ�����Ե� ������ �����ϴ�.");
					continue;
				}
				System.out.println("�α����� ���̵� �Է����ּ���.");
				getId = scan.nextInt();
				for (int i = 0; i < MAX; i++) {
					if (getId == arId[i]) {
						log = i;
					}
				}
				if (log == -1) {
					System.err.println("���� ���̵� �Դϴ�.");
					continue;
				}
				System.out.printf("����� %d ���� ��й�ȣ�� �Է����ּ���.", arId[log]);
				System.out.println();
				getPw = scan.nextInt();
				if (arPw[log] != getPw) {
					System.err.println("��й�ȣ �Է� ����");
					log = -1;
					continue;
				}
			} else if (sel == 4) {
				System.out.println("�α׾ƿ� �Ϸ�");
				log = -1;
			} else if (sel == 5) {
				while (true) {
					System.out.println("�Ա��� ���� �Է��ϼ���.");
					getMoney = scan.nextInt();
					arMoney[log] += getMoney;
					if (getMoney < 1000) {
						System.err.println("1000�� �̻��� �ݾ��� �Է�");
						continue;
					}
					break;
				}
			} else if (sel == 6) {
				int to = 0; // ��ü�� ���� �ε��� ��� ����

				System.out.println("��ü�� ���¹�ȣ�� �Է��ϼ���");
				int getNum = scan.nextInt();
				if (getNum == arId[log]) {
					System.err.println("�ڽŰ��¿��� ���� ������ �����ϴ�.");
					continue;
				}
				for (int i = 0; i < MAX; i++) {
					if (getNum == arId[i]) {
						to = i;
					}
				}
				if (to == 0) {
					System.err.println("������� ���� �����Դϴ�.");
					continue;
				}
				System.out.println("�۱��� �ݾ��� �Է��ϼ���.");
				getMoney = scan.nextInt();
				if (getMoney > arMoney[log]) {
					System.err.println("�ܾ��� �����մϴ�.");
				}
				if (getMoney < 1000) {
					System.err.println("1000�� �̻��� �Է��Ͽ��ּ���.");
				}
				arMoney[log] -= getMoney;
				arMoney[to] += getMoney;

			} else if (sel == 7) {
				System.out.printf("����� %d ���� �ܾ��� ��ȸ�մϴ� :  %d ", arId[log], arMoney[log]);
				System.out.println();
			}

		}

	}

}
