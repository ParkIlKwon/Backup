package day06;

import java.util.Scanner;

public class F_11�л���������3 {
	public static void main(String[] args) {
		// ����) �й��� �Է¹޾� ���� ���
		// ��, �����й� �Է� �� ����ó��
		// ��)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.
		Scanner sc = new Scanner(System.in);
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };
		int idx=-1;
		System.out.print("�й��� �Է��Ͽ��ֽÿ�: ");
		int sel = sc.nextInt();
		
		for(int i=0;i<hakbuns.length;i++) {
			if(sel == hakbuns[i]) {
				idx=i;
				break;
			}
		}
		if(idx==-1) {
		System.out.println("�й��� �߸��Է��Ͽ����ϴ�.");
		}else {
		System.out.println(scores[idx]);
		}
		
	
	}

}
