package day09;

import java.util.Scanner;

public class G_04�ݺ�����ȭ {
	public static void main(String[] args) {
		/*
		 * [�ݺ��� ��ȭ����]
		 * 
		 * 1. -1�� ���� ������ �Ϸ��� ���� �Է¹޴´�. 2. �� �� �� key ���� �� ��°�� ���ԵǾ� �ִ°��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 3. ��, key�� ������ ���ԵǾ� ���� ��� �տ� ��Ÿ�� ���� ��ġ�� ����Ͻÿ�. 4. key�� �Ϸ��� �� �ȿ� ���� ���
		 * "not found"�� ����Ͻÿ�.
		 * 
		 * ��) result �� �Է� : 99
		 * 
		 * �Է� : 10 �Է� : 99 �Է� : 20 �Է� : 99 �Է� : 30 �Է� : 99 �Է� : 10 �Է� : -1
		 * 
		 * ��� : key�� 99�� ù���� ��Ÿ�� ���� 2��° �̴�.
		 */
		
		// ����� �� ==> -1 ==> Ű�� �Է¹���������.
		// ����� �� ==> 99 , 77 , -1 ==> Ű�� 1���̴�
		// ����� �� ==> 55, 99 , 99, 99, 99, 3 , -1 ==> Ű�� 2���̴�
		
		Scanner scan = new Scanner(System.in);
		int result = 99;
		int key = 0;
		int a = -1;
		int cnt = 0;
		while (key != -1) {

			System.out.print(cnt + 1 + " " + "key�� �Է� : ");
			key = scan.nextInt();

			cnt++;
			if (key == result && a == -1) {
				a = cnt;
			}

		}
		scan.close();
		if (a == -1) {
			System.out.println("not found");
		} else {
			System.out.printf("Ű�� %d �� ù��° ��Ÿ�� ���� %d��°�̴�.", result, a);
		}

	}

}
