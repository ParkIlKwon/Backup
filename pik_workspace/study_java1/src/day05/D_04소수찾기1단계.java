package day05;

import java.util.Scanner;

public class D_04�Ҽ�ã��1�ܰ� {
	public static void main(String[] args) {
		/*
		 * # �Ҽ�ã��[1�ܰ�] 1. �Ҽ���, 1�� �ڱ��ڽ����θ� �������� �� 2. ��) 2, 3, 5, 7, 11, 13, .. 3. ��Ʈ 1)
		 * �ش� ���ڸ� 1���� �ڱ��ڽű��� ������. 2) �������� 0�� ������ ī��Ʈ�� ����. 3) �� ī��Ʈ ���� 2�̸� �Ҽ��̴�. 4) 6/1
		 * 6/2 6/3 6/4 6/5 6/6 cnt=4 �Ҽ�x
		 * 
		 * ���� �� ���� �Է¹޾�, �ش� ���ڰ� �Ҽ����� �ƴ��� �Ǻ��Ѵ�.
		 */
		int i = 1, input = 0, stop = 0;

		boolean loop = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� -100");
		while (loop) {

			System.out.print("�Ҽ�ã�� : ");
			int cnt = 0;
			i = 1;
			input = sc.nextInt();
			if (input == -100) {
				loop = false;
			}
			if (input <= 1 && input != -100) {
				System.out.println("0���� 1�Է±��� !!!");
			} else {

				while (i <= input) {
					if (input % i == 0) {
						cnt++;
					}
					i++;
				}
				System.out.println(cnt == 2 ? "�Ҽ��Ӵ�" : "�ƴԴ�");

				// ��ɱ��� 8�аɸ�. ����ó������ 15�аɸ�.
			}
		}
	}

}
