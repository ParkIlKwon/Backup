package day05;

import java.util.Scanner;

public class D_11ATM4�ܰ谭�� {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;

		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;

		int log = -1;// -1(�α׾ƿ�), 1(dbAcc1�α���), 2(dbAcc2�α���)

		boolean run = true;
		while (run) {

			if (log == -1) {
				System.out.println("1.�α���");
			} else {
				System.out.println("2.�α׾ƿ�");
				System.out.println("3.�Ա�");
				System.out.println("4.���");
				System.out.println("5.��ü");
				System.out.println("6.��ȸ");
			}
			System.out.println("0.����");
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			if (sel < 0 || sel > 6) {
				System.out.println("�Է� ����");
				continue;
			}

			// sel >= 1 && sel <=6

			if (sel == 1 && log == -1) {
				// �α���
				System.out.print("id >> ");
				int id = scan.nextInt();
				System.out.print("pw >> ");
				int pw = scan.nextInt();

				if (dbAcc1 == id && dbPw1 == pw) {
					System.out.println("dbAcc1�� �α��� ����");
					log = 1;
				} else if (dbAcc2 == id && dbPw2 == pw) {
					System.out.println("dbAcc2�� �α��� ����");
					log = 2;
				} else {
					System.out.println("�α��ν���");
				}

			} else if (sel == 2 && log != -1) {
				// �α׾ƿ�
				log = -1;
				System.out.println("[ �α׾ƿ� �Ϸ� ]");
			} else if (sel == 3 && log != -1) {
				// �Ա�
				System.out.println("�Աݾ� >>");
				int money = scan.nextInt();

				if (money <= 0 || money % 1000 != 0) {
					System.out.println("�ݾ� ����");
					continue;
				}
				// money ���� ��� �̸鼭 õ������ ����������

				if (log == 1) {
					// dbAcc1
					dbMoney1 += money;
				} else {
					// dbAcc2
					dbMoney2 += money;
				}
				System.out.println("[ �Ա� �Ϸ� ]");
			} else if (sel == 4 && log != -1) {
				// ���

				System.out.println("��ݾ� >>");
				int money = scan.nextInt();

				if (money <= 0 || money % 1000 != 0) {
					System.out.println("�ݾ� ����");
					continue;
				}

				if (log == 1) {
					// dbAcc1
					if (money > dbMoney1) {
						System.out.println("[ ��� �ܾ� �ʰ� ]");
						continue;
					}
					// dbMoney1 >= money ;
					dbMoney1 -= money;
				} else {
					// dbAcc2
					if (money > dbMoney2) {
						System.out.println("[ ��� �ܾ� �ʰ� ]");
						continue;
					}
					dbMoney2 -= money;

				}

				System.out.println("[ ��� �Ϸ� ]");

			} else if (sel == 5 && log != -1) {
				// ��ü
				System.out.println("log = " + log);

				System.out.println("��ü���� >>");
				int acc = scan.nextInt();

				if (acc != 1111 && acc != 2222) {
					System.out.println("[ ���� ���� ]");
					continue;
				}

				if (log == 1 && acc == 2222) {
					// dbAcc1
					System.out.println("��ü�� >>");
					int money = scan.nextInt();

					if (money <= 0 || money % 1000 != 0) {
						System.out.println("�ݾ� ����");
						continue;
					}

					if (dbMoney1 < money) {
						System.out.println("[ �ܾ� �ʰ� ]");
						continue;
					}

					dbMoney1 -= money;
					dbMoney2 += money;

				} else if (log == 2 && acc == 1111) {
					// dbAcc2

					System.out.println("��ü�� >>");
					int money = scan.nextInt();

					if (money <= 0 || money % 1000 != 0) {
						System.out.println("�ݾ� ����");
						continue;
					}

					if (dbMoney2 < money) {
						System.out.println("[ �ܾ� �ʰ� ]");
						continue;
					}

					dbMoney2 -= money;
					dbMoney1 += money;

				} else {
					System.out.println("[ ���� ���´� ��ü �Ұ��� ]");
				}
			} else if (sel == 6 && log != -1) {
				// ��ȸ
				if (log == 1) {
					// dbAcc1
					System.out.printf("[ �� ���� : %d�� ������ %d�� ] \n", dbMoney1, dbMoney2);
				} else {
					// dbAcc2
					System.out.printf("[ �� ���� : %d�� ������ %d�� ] \n", dbMoney2, dbMoney1);

				}
			} else if (sel == 0) {
				run = false;
				System.out.println("[ ���α׷� ���� ]");
			} else {
				System.out.println("[ ���� ���� ]");
				if (log == -1) {
					System.out.println("�α��� �� �̿� ���ּ���");
				} else {
					System.out.println("�̹� �α��� �����Դϴ�");
				}
			}

		}

	}

}
