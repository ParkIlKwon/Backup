package day04;

import java.util.Scanner;

public class D_04ATM {
	public static void main(String[] args) {
		/*
		[����]
			ATM ��� �� �α��� ����� �����Ѵ�.
			
			1. ���� ����
				cash	: 	�������ִ� ����
				balance	:	����
				joinId	:	������ ���̵�
				joinPw	:	������ �н�����
			
			2. ��ɼ���
				1) ���� �޴� ����
					[1.�α��� 0.����]
				2) �α����� ������ ���,
				   ���̵�� ��й�ȣ�� �Է¹ް� �����ϸ� "�α��� ����" �޼����� ����ϰ�
				   [1.�Ա� 2.���]�� ���ο� �޴��� ����
				   
				   2-1) �Ա��� ������ ���
				   		�Ա��� ���� �Է¹ް� ������ �پ��� ������ �þ��.
				   2-2) ����� ������ ���
				   		����� ���� �Է¹ް� ������ �پ��� ������ �þ��.
				    
				3) �α��ο� ������ ��� "�α��� ����" �޼��� ���
	 */
			Scanner scan = new Scanner(System.in);
			
			int cash = 20000;
			int balance = 30000;
			
			int joinId = 1111;
			int joinPw = 1234;
			
			System.out.println("=== [ATM] ===");
			System.out.println("[1.�α��� 0.����]");
			
			int select = scan.nextInt();
			
			if(select == 1) {
				int id,pw;
				System.out.print("ID�Է�:");
				id=scan.nextInt();
				System.out.print("PW�Է�:");
				pw=scan.nextInt();
				boolean check = joinId == id && joinPw == pw ;
				if(check) {
				int mode;
				System.out.println("��弱�� [1.�Ա� 2.���]");
				mode = scan.nextInt();
				if(mode == 1) {
					System.out.println("�Ա��Ͻ� ������ �Է��Ͻÿ�.");
					int in = scan.nextInt();boolean err2= cash>20000;
					if(!err2) {
					cash = cash -in;
					balance+=in;
					}else {
						System.out.println("������");
						cash = 20000;
					}
					
					
				}
				if(mode == 2) {
					System.out.println("����Ͻ� ������ �Է��Ͻÿ�.");
					cash = scan.nextInt();
					boolean err = balance - cash < 0 ;
					if(!err) {
						System.out.printf("��ݿϷ� ���� ������= %d",balance-cash);
					}else {
						System.out.println("---�� ����---");
					}
				}
				}else {
					System.out.println("�α��� ����");
				}
				
			}else if(select == 0) {
				System.out.println("���α׷��� �����մϴ�.");
			}
			System.out.printf("����:  %d ����:  %d   ",cash,balance);
	}

}
