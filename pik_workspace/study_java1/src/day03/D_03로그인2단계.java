package day03;

import java.util.Scanner;

public class D_03�α���2�ܰ� {
	public static void main(String[] args) {
		/*
		 * [����] ��ø ���ǹ� �α����� ��ø if������ �ٽ� ǥ���Ͻÿ�.
		 * 
		 * 1. id�� �Է¹޾� joinId�� ��ġ�� ��쿡�� pw�� �Է��� �� �ִ�. 2. id�� Ʋ�� ���, "ID�� Ȯ�����ּ���." ���
		 * �޼����� ����Ѵ�. 3. pw�� Ʋ�� ���, "PW�� Ȯ�����ּ���." ��� �޼����� ����Ѵ�. 4. id�� pw�� ��� ��ġ�ϴ� ���,
		 * "�α��� �����Դϴ�."��� �޼����� ����Ѵ�.
		 */

		Scanner sc = new Scanner(System.in);
		int dbId = 1111;
		int dbPw = 1234;
		int id, pw;
		boolean success = false;
	
		System.out.println("-�⺻�������̵�-\n1111\t1234");
		System.out.print("���̵� �Է����ֽÿ� ");
		id = sc.nextInt();
		
		if (id != dbId) {
			System.out.println("���̵� Ȯ�����ּ���");
			
		}
		if (id == dbId) {
			System.out.print("��й�ȣ�� �Է����ֽÿ� ");
			pw = sc.nextInt();
			if (pw == dbPw) {
				System.out.println("�α��� �����Դϴ�.");
				success = true;
			}
			if (pw != dbPw) {
				System.out.println("��й�ȣ�� Ȯ�����ּ���.");

			}
		
	}
		if(!success) {
			System.err.println("�α��� ����");
		}
}
}
