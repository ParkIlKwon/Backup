package day02;

import java.util.Scanner;

public class D_02ȸ������ {
	public static void main(String[] args) {
		/*
		 * [����] ȸ�����԰� �α��� 1. ���� ���̵�� ��й�ȣ�� �Է��ؼ� ȸ�������� �Ѵ�. 2. ���� �α����� ���� �ٽ� ���̵�� ��й�ȣ��
		 * �Է¹޴´�. 3. ���Ե� ������ �α��ν� �Է��� ������ ���Ѵ�. 4. "�α��� ����" �Ǵ� "�α��� ����"�� ����Ѵ�.
		 * 
		 */
		int id, pw, getId, getPw;
		Scanner sc = new Scanner(System.in);

		System.out.print("ȸ�����Ծ��̵�");
		getId = sc.nextInt();
		System.out.print("ȸ�������н�����");
		getPw = sc.nextInt();
		System.out.print("���̵�");
		id = sc.nextInt();
		System.out.print("�н�����");
		pw = sc.nextInt();

		if (getId == id && getPw == pw) {
			System.out.println("�α��� ����");

		} else
			System.out.println("�α��� ����");

	}

}
