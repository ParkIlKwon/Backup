package day05;

import java.util.Scanner;

public class D_11ATM4�ܰ� {
	public static void main(String[] args) {
		/*
		 * # ATM[����] 1. �α��� . �α��� �� �� �α��� �Ұ� . �α׾ƿ� ���¿����� �̿� ���� 2. �α׾ƿ� . �α��� �� �̿밡�� 3.
		 * �Ա� . �α��� �� �̿밡�� 4. ��� . �α��� �� �̿밡�� 5. ��ü . �α��� �� �̿밡�� 6. ��ȸ . �α��� �� �̿밡�� 7.
		 * ����
		 */
		Scanner scan = new Scanner(System.in);

		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		int id, pw;
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;
		int input, output,data=0;	//����� ���� 
		int log = -1; // -1(�α׾ƿ�), 1(dbAcc1�α���), 2(dbAcc2�α���)

		boolean run = true;
		while (run) {
			if(log==-1) {
			System.out.println("1.�α���");
	}		else {
			System.out.println("2.�α׾ƿ�");
			System.out.println("3.�Ա�");
			System.out.println("4.���");
			System.out.println("5.��ü");
			System.out.println("6.��ȸ");
	}
			System.out.println("0.����");
	
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			if (sel < 0 && sel > 7) {
			System.out.println("===�Է¿���===");
			continue;
			}
			
			boolean check = (sel==2||sel == 3 || sel == 4 || sel == 5 || sel == 6) && log == -1;
			if (check) {
				System.out.println("===�ƹ��� �α��� ���� �ʾҽ��ϴ�.===");
				continue;
			}
			
			if (sel == 1) {
				if (log != -1) {
					System.out.println("====�̹� �α����ѻ���====");
					continue;
				}
				System.out.print("���̵� �Է��Ͻÿ�>>");
				id = scan.nextInt();
				System.out.print("��й�ȣ�� �Է��Ͻÿ�>>");
				pw = scan.nextInt();
				
				if (id == dbAcc1 && pw == dbPw1) {
					System.out.println("����� 1 �α��οϷ�");
					log = 1;
					data=dbMoney1;
				}else if (id == dbAcc2 && pw == dbPw2) {
					System.out.println("����� 2 �α��οϷ�");
					log = 2;
					data=dbMoney2;
				}else {
					System.out.println("===���̵� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.===");
				}
			} else if (sel == 2) {
				if (log == 1) {
					dbMoney1=data;
				}else {
					dbMoney2=data;
				}
				log = -1;
				System.out.println("�α׾ƿ��Ϸ�");
			}
			
			else if (sel == 3) {
				System.out.println("�Ա��� �ݾ��� �Է��Ͻÿ�.");
				input = scan.nextInt();
				data+=input;
				if(input%1000!=0&&input<0) {
					System.out.println("�Աݿ���");
					continue;
				}
				
			} else if (sel == 4) {
				while (true) {
					System.out.println("����� �ݾ��� �Է��Ͻÿ�.");
					output = scan.nextInt();
					if (output < 0 || data<output) {
						System.out.println("�Է¿���");
						continue;
					}
					data-=output;
					System.out.println("��ݿϷ�");
					break;
				}
			} else if (sel == 5) {
				while (true) {
					System.out.println("��ü �� �ݾ��� �Է��Ͻÿ�.");
					output = scan.nextInt();
					if (output < 0 || data < output ) {
						System.out.println("�Է¿���");
						continue;
					} else if (log == 1) {
						data -= output;
						dbMoney2 += output;
					} else {
						dbMoney1 += output;
						data -= output;
					}
					break;
				}
			} else if (sel == 6) {
				System.out.println("�Աݵ� �ݾ��� : "+data);
			} else if (sel == 0 && log == -1) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}
	}
}
