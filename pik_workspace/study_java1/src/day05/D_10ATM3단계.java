package day05;

import java.util.Scanner;

public class D_10ATM3�ܰ� {
	public static void main(String[] args) {
		/*
		 * # ATM
		 * 1. �Ա�
		 * . �Ա��� �ݾ��� �Է¹޾�, myMoney�� �Ա�
		 * 2. ���
		 * . ����� �ݾ��� �Է¹޾�, myMoney���� ���
		 * . ��, ����� �ݾ��� myMoney �ܾ��� �ʰ��� ��� ��ݺҰ�
		 * 3. ��ü
		 * . yourAcc ���¹�ȣ�� �Է¹޾�, ��ü
		 * . ��ü�� �ݾ��� myMoney �ܾ��� �ʰ��� ��� ��ü �Ұ�
		 * . ��ü �� yourMoney �ܾ� ����
		 * 4. ��ȸ
		 * . myMoney�� yourMoney �ܾ� ��� ���
		 */
	Scanner scan = new Scanner(System.in);

			int myAcc = 1111;
			int myMoney = 50000;

			int yourAcc = 2222;
			int Acc,id;
			int yourMoney = 70000;
			int input=0,output=0;

			boolean run = true;
			while (run) {
				
				System.out.println("[�α��� id �Է�]");
				id  = scan.nextInt();
				
				if(id!=myAcc) {
					System.out.println("�α��ν���");
					continue;
				}
				System.out.println("1.�Ա�");
				System.out.println("2.���");
				System.out.println("3.��ü");
				System.out.println("4.��ȸ");
				System.out.println("0.����");

				System.out.print("�޴� ���� : ");
				int sel = scan.nextInt();
				
				if (sel == 1) {
				while (true) {
					System.out.println("�Ա��� �׼��� �Է��Ͻÿ�.");
					input = scan.nextInt();
					if (input<0) {
						System.out.println("�Է¿���");
						continue;
					}System.out.println("�ԱݿϷ�");
					myMoney+=input;break;
				}
				}
				else if (sel == 2) {
					while (true) {
				System.out.println("����� �ݾ��� �Է��Ͻÿ�.");
				output=scan.nextInt();
				if(output>myMoney) {
				System.out.println("�ܾ׺��� �ٽ��Է��Ͻÿ�.");
				continue;
				}if(output<0) {
				System.out.println("������ �Է� �ٽ��Է��Ͻÿ�.");
				continue;
				}
				System.out.println(output+"�� ��ݿϷ�");
				myMoney-=output;break;
					}
				} 
				else if (sel == 3) {
				while (true) {
					System.out.println("�۱��� ���¹�ȣ �Է�");
					Acc=scan.nextInt();
					
					if(Acc!=yourAcc) {
					System.out.println("���¹�ȣ ����");
					continue;
					}
					System.out.println("���� �ݾ�??");
					output = scan.nextInt();
					System.out.println(output+" �� ��ü �Ϸ�");
					myMoney-=output;
					break;
				}
				} 
				else if (sel == 4) {
					System.out.println("�����Աݵȱݾ�: ");
				System.out.println(">>"+myMoney);
				} 
				else if (sel == 0) {
					run = false;
					System.out.println("���α׷� ����");
				}
			
			}
	}

}
