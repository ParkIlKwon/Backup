package day05;

import java.util.Scanner;

public class ex {
	public static void main(String[] args) {
		/*
		 * # �Ҽ�ã��[1�ܰ�] 1. �Ҽ���, 1�� �ڱ��ڽ����θ� �������� �� 2. ��) 2, 3, 5, 7, 11, 13, .. 3. ��Ʈ 1)
		 * �ش� ���ڸ� 1���� �ڱ��ڽű��� ������. 2) �������� 0�� ������ ī��Ʈ�� ����. 3) �� ī��Ʈ ���� 2�̸� �Ҽ��̴�. 4) 6/1
		 * 6/2 6/3 6/4 6/5 6/6 cnt=4 �Ҽ�x
		 * 
		 * ���� �� ���� �Է¹޾�, �ش� ���ڰ� �Ҽ����� �ƴ��� �Ǻ��Ѵ�.
		 */
		
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("��� �Է� >> [���� : -100]");
			int num = sc.nextInt();
			if(num == -100) {
				System.out.println("����");
				break;
			}
			if(num <= 0) {
				System.out.println("�Է� ���� ");
				continue;
			}
			
			int count = 0;

			int i = 1;
			while (i <= num) {
				System.out.printf("%d/%d ", num, i);
				if (num % i == 0) {
					count++;
				}
				i++;
			}
			System.out.println(" cnt =" + count);
			// System.out.println("count=" + count);
			if (count == 2) {
				System.out.println("�Ҽ��Դϴ�");
			} else {
				System.out.println("�Ҽ��� �ƴմϴ�");
			}
			
		}
		

	}

}
