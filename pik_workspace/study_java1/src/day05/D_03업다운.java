package day05;

import java.util.Random;
import java.util.Scanner;

public class D_03���ٿ� {
	public static void main(String[] args) {

		/*
		 * # Up & Down ����[2�ܰ�] 1. com �� �������� 1~100���̸� �����Ѵ�. 2. me �� 1~100���̸� �Է��Ѵ�. 3.
		 * com �� me �� ���ؼ� com ũ�� "ũ��" , com �������� "�۴�" ��Ʈ���� 4. ������ ���߸� ������ ����ȴ�. 5. �ѹ���
		 * ���߸� 100�� 1���� Ʋ�������� 20�� �����ȴ� 6. 5�� Ʋ���� ���ӿ��� / ���߸� ���� ���� ���
		 */
		int com, me, score = 100;
		boolean run = true;
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		com = rd.nextInt(100) + 1;
		System.out.println("���¼�: " + com);
		int i = 1;
		while (run) {
			System.out.println("�õ�Ƚ��:" + i);
			System.out.print("�� �Է�:  ");
			me = sc.nextInt();
			if (me < 0 || me > 100) {
				System.out.println("1~100���̰��� �Է��Ͻÿ�.");
				continue;
			}
			if (com > me) {
				System.out.println("�� ũ��");
				score -= 20; i++;
			} else if (me > com) {
				System.out.println("�� �۰�");
				score -= 20; i++;
			} else {
				System.out.println("����");
				run = false;
			}
			if(score<20) {System.out.println("���ӿ���");break;}
		}
		if(score!=0) {
			System.out.println("�� �õ�Ƚ��:"+i);
			System.out.println("�� ����: " + score);
		}
		

	}

}
