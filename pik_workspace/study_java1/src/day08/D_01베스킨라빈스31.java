package day08;

import java.util.Scanner;

public class D_01����Ų���31 {

	public static void main(String[] args) {
		/*
		 * # ����Ų���31
		 * 1. p1�� p2�� �����ư��鼭 1~3�� �Է��Ѵ�.
		 * 2. br�� p1�� p2�� �Է°��� �����ؼ� �����Ѵ�.
		 * 3. br�� 31�� ������ ������ ����ȴ�.
		 * 4. �¸��ڸ� ����Ѵ�.
		 * 
		 * ��) 
		 * 1�� : p1(2)	br(2)
		 * 2�� : p2(1)	br(3)
		 * 3�� : p1(3)	br(6)
		 * ...
		 */
				Scanner sc = new Scanner(System.in);
				int p1 = 0;
				int p2 = 0;
				
				int br = 0;
				int turn = 0;
				
				while(br < 31) {
					
					System.out.print("p1>> ");
					p1 = sc.nextInt();
					if(p1>3||p1<1) {
						System.out.println("���� �߸��Է��Ͽ����ϴ�. [ 1 ~ 3 ]");
						continue;
					}
					turn = 1;
					br+=p1;
					System.out.println("������ �� :" + br);
					
					
					while(true) {
					System.out.print("p2>> ");
					p2 = sc.nextInt();
					if(p2>3||p2<1) {
						System.out.println("���� �߸��Է��Ͽ����ϴ�. [ 1 ~ 3 ]");
						continue;
						}else break;
					}
					turn = 2;
					br+=p2;
					System.out.println("������ �� :" + br);
										
				}
				if(turn == 1) {
					System.out.println("p2�¸�");
					}else {
						System.out.println("p1�¸�");	
					}

	}

}
