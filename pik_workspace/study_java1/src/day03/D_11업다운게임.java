package day03;

import java.util.Random;
import java.util.Scanner;

public class D_11���ٿ���� {

	public static void main(String[] args) {
		/*
		 * [����] 1. 10-60 ������ �������� com�� ���� 2. ����ڿ��� �� �Է� �ޱ� 3. ����ڰ� �Է��� ���� com ���� ũ�� down
		 * ����ڰ� �Է��� ���� com ���� ������ up ���߸� bingo!
		 */
		int com, in,ex;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		
		com = rd.nextInt(51) + 10;
		System.out.println("���°�" + com);
		in = sc.nextInt();
		
		boolean err = in > 60 || in < 10, logic = com > in;
		if (err) {
			System.out.println("�߸��Է�");
			return;
		}
		if (in == com) {
			System.out.println("bingo!");
		}
		if (logic) {
			System.out.println("UP");
		}
		if (!logic && in != com) {
			System.out.println("DOWN");
		}
	}

}
