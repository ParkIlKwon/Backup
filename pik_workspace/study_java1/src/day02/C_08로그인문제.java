package day02;

import java.util.Scanner;

public class C_08�α��ι��� {
	public static void main(String[] args) {
		/*
		 * 2:58 [����] ö���� �α����� �Ϸ��� �Ѵ�. ���̵�� ��й�ȣ�� �Է¹޴´�. ���̵�� ��й�ȣ �� �� �ϳ��� Ʋ���� �α����� �����Ѵ�.
		 * joinId�� joinPw�� ö���� �̹� ������ ���̵�� ��й�ȣ�̴�.
		 */
		int id, pw;
		int joinId, joinPw;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���̵�");
		joinId = sc.nextInt();
		System.out.println("���� ���");
		joinPw = sc.nextInt();
		System.out.print("���̵�:  ");
		id = sc.nextInt();
		System.out.print("���:  ");
		pw = sc.nextInt();

		System.out.println(joinId == id && joinPw == pw);
		
		

	}

}
	//���� 3:05