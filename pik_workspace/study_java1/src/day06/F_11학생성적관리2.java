package day06;

import java.util.Scanner;

public class F_11�л���������2 {
	public static void main(String[] args) {
		// �ε��� 0 1 2 3 4
		Scanner sc = new Scanner(System.in);
		int[] arr = { 87, 11, 45, 98, 23 };
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		int idx, num, score, hak;
		
		while(true) {
		System.out.print("�ε��� �Է�: ");
		idx = sc.nextInt();
		if(idx>0&&idx<5) {break;}
		}
		// ����1) �ε����� �Է¹޾� ���� ���
		// ����1) �ε��� �Է� : 1 ���� : 11��

		// ����2) ������ �Է¹޾� �ε��� ���
		// ����2) ���� �Է� : 11 �ε��� : 1
		System.out.println(arr[idx] + "��");

		System.out.print("���� �Է�: ");
		score = sc.nextInt();
		
		for (int i = 0; i < scores.length; i++) {
			num = scores[i];
			if (num == score) {
				System.out.println("�ε���: " + i);
			}
		}

		// ����3) �й��� �Է¹޾� ���� ���
		// ����3) �й� �Է� : 1003 ���� : 45��

		System.out.print("�й� �Է�: ");
		hak = sc.nextInt();

		for (int i = 0; i < hakbuns.length; i++) {
			if (hak == hakbuns[i]) {
				hak = i;
				
			}
		}
		System.out.println(scores[hak] + "��");

	}

}
