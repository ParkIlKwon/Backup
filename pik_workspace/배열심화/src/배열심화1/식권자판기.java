package �迭��ȭ1;

import java.util.Scanner;

public class �ı����Ǳ� {

	public static void main(String[] args) {
		/*
		 [�ı� ���Ǳ� ���α׷�]		// 9:53 - 11:21
			 1) ������   2) ����� 
			������ ==> 1) �ı�����   2) �ܵ� ���� 	 3)�ڷΰ���
			����� ==> 1) ���� ==> ==> �Ա� �ݾ� �Է� ==> ���� �ż� �Է�  ==> �ܵ���� 	
		    	       2)�ڷΰ���
			 ���� ) ��) �ܵ��� 7600���̴�. 5000������ ������ 1000��¥�� 7��Ž����ش�. 
			ȭ�� 
			 �ı� ���� : 3200�� 
			 �ı� 	  : ??��  (������ ����) 
			 50000�� : ?? ��  	// 10000�� : ?? ��	// 5000�� : ?? ��
			 1000�� : ?? ��		//  500�� : ?? ��	  	//  100�� : ?? �� 
		*/
	 Scanner sc = new Scanner(System.in);
			
			int[] money   = {50000, 10000, 5000, 1000, 500, 100};
			int[] charges = {    1,     1,    1,    1,   5,  10};
			
			int tickets = 5;		// �ı� ����
			final int  price = 3200;		// �ı� ����
			int input = 0;
			int log = -1;
			int idx = 0;
			int i = 0;
			int total = 0;
			while(true) {
				
				
				System.out.println("[1]������");
				System.out.println("[2]�����");
				System.out.println("[0]���α׷�����");
				System.out.print("�޴� ���� : ");
				int sel = sc.nextInt();
				if(sel <0 || sel >2) {
					System.out.println("�޴����� ����");
					continue;
				}
				if(sel == 0) {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
				if(sel == 1) {
					while(true) {
						
						System.out.println("���� ���� �ı�:"+tickets);
						System.out.println("===���� �ܵ� ����===");
						for ( i = 0; i < charges.length; i++) {
							System.out.print(money[i] + " : " + charges[i]);
							if(i>3) {
								System.out.print("��");
							}else {
								System.out.print("��");
							}
							System.out.println();
							
						}
						System.out.println("1)�ı�����");
						System.out.println("2)�ܵ�����");
						System.out.println("0)�ڷΰ���");
						
						System.out.print("�޴� ���� : ");
						int choice = sc.nextInt();
						if(choice == 1) {
							System.out.println("������ �ı� �ż��� �Է��Ͻÿ�.");
							input = sc.nextInt();
							if(input < 0) {
								System.out.println("�������� �Էµɼ� �����ϴ�.");
								continue;
							}
							tickets += input;
							if(input == 0) {
								System.err.println("0������ ��");
							}
						}
						else if(choice == 2) {
							log = -1;
							System.out.println("������ �ܵ��� �Է��Ͻÿ�.");
							input = sc.nextInt();
							for ( i = 0; i < money.length; i++) {
								if(money[i] == input) {
									log = i;
									break;
								}
							}
							
							if(log == -1) {
								System.err.println("�ܵ��� �߸��Է��ϼ̽��ϴ�.");
								continue;
							}
							
							System.out.printf("[%d]�� ��������??",money[i]);
							input = sc.nextInt();
							
							if(input < 0) {
								System.err.println("�߸��� �Է�");
								continue;
							}
							
							for ( i = 0; i < charges.length; i++) {
								if(log == i) {
									charges[i]+=input;
									break;
								}
							}
							
							System.out.println("�����Ϸ�");
							
							
						}
						else if(choice == 0) {
							break;
						}
					}
					
				}
				////////////////////////////////////////////////////////////////////////
				else if(sel == 2 && tickets != 0) {	
					while(true) {
						System.out.println("���� �ı� �ż�:" + tickets);
						System.out.println("�ıǰ���: "+price);
						System.out.println("===���� �ܵ� ����===");
						for ( i = 0; i < charges.length; i++) {
							System.out.print(money[i] + " : " + charges[i]);
							if(i>3) {
								System.out.print("��");
							}else {
								System.out.print("��");
							}
							System.out.println();
							
						}
						
						System.out.println("1)����");					
						System.out.println("0)�ڷΰ���");				
						System.out.print("�޴� ���� : ");
						int choice = sc.nextInt();
						if(choice == 1) {
							idx = 0;
							System.out.println("������ �ı� �ż��� �Է��Ͻÿ�. [�����ı�]" + tickets);
							int cnt = sc.nextInt();
							
							if(cnt <= 0) {
								System.err.println("�߸��Է��Ͽ����ϴ�.");
								continue;
							}
							total = cnt * price;
							System.out.printf("�ı�[%d]�� ���� %d�� �Դϴ�. ���Ǳݾ��� �Է����ֽÿ�\n",cnt,total);
							input = sc.nextInt();
							if(input < total) {
								System.err.println("������ �����մϴ�.");
								continue;
							}else if (input % 100 != 0) {
								System.err.println("100���� �̻��� �Է��Ͻÿ�.");
								continue;
							}
							
							total = input - total;
							int[] output = new int [charges.length];
							
							for (i = 0; i < charges.length; i++) {
								cnt = 0;
								if(total >= money[i] && charges[i]!=0) {
									while(charges[i] != 0) {
										if(total < money[i]) {
											break;
										}
									total -= money[i];
									charges[i] --;
									output[i] ++;
									}
								}
							
							}
							
							if(total > 0) {
								System.err.println("�˼��մϴ� �Ž������� �����մϴ�. �����ּ���.");
								for (int j = 0; j < output.length; j++) {
									charges[j] += output[j];
								}
								break;
							}else {
								System.out.println("[�Ž���������]");
								for (int j = 0; j < output.length; j++) {
									if(output[j] != 0) {
										System.out.print(money[j]+": "+output[j]);
										System.out.println();
									}
								}
								tickets--;
							}
							
							
						}
						else if(choice == 0) {
							break;
						}
					}
				}else {
					System.out.println("�ı��� �����Ǿ����ϴ�.");
					
				}
				
				
				
				
				
			}
			
			
			

	}

}
