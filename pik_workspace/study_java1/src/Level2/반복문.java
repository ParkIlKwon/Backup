package Level2;

import java.util.Random;

public class �ݺ��� {

	public static void main(String[] args) {
		/*
		 * [����] �Ʒ������� �����ϴ� ���� �ۼ��Ͻÿ�. [����1] 10~1���� �Ųٷ� �ݺ����� �����Ѵ�. [����2] 3�� ����϶��� "�ȳ�" ��
		 * ����Ѵ�. [����3] 3�� ����� �ƴҶ��� ���ڸ� ����Ѵ�. [����] 10 �ȳ� 8 7 �ȳ� 5 4 �ȳ� 2 1
		 */
		for (int i = 10; i > 0; i--) {

			if (i % 3 == 0) {
				System.out.print(" �ȳ� ");
			} else {
				System.out.print(i + "  ");
			}

		}
		// 3��

		/*
		 * [����] [1] ���� 50 ~ 150 ������ �������� 7�ǹ���� ���������� �˻��Ѵ�. [2] �ݺ����� ������ 3��° 7�� ����� ����Ѵ�.
		 * [����] 3��° 7�� ��� : 70
		 */
		System.out.println();
		System.out.println("===���� 2===");
		int cnt = 0;

		for (int i = 50; i < 150; i++) {
			if (i % 7 == 0) {
				cnt++;
			}
			if (cnt == 3) {
				cnt = i;
				break;
			}

		}
		System.out.println(cnt);

		// 4��

		System.out.println();
		System.out.println("===���� 3===");

		/*
		 * [����] 1~ 999 �� �������� �����߿��� 8�� ����� ū������ ���ʴ�� 4�� ����Ͻÿ�. [����] 992 984 976 968
		 */
		cnt = 0;
		for (int i = 999; i > 0; i--) {
			if (i % 8 == 0) {
				System.out.println(i + " ");
				cnt++;
			}
			if (cnt == 4) {
				break;
			}

		}
		// 2��

		System.out.println();
		System.out.println("===���� 4===");

		/*
		 * [����] 9�� ����� 100���� ū���߿��� ���� �ڸ��� 6�� �ټ���° 9�� ��� ����Ͻÿ�. [����] 486
		 */
		cnt = 0;
		for (int i = 101;; i++) {
			if (i % 9 == 0) {
				if (i % 10 == 6) {
					cnt++;
				}
			}
			if (cnt == 5) {
				System.out.println(i);
				break;
			}
		}
		// 5��

		System.out.println();
		System.out.println("===���� 5===");

		/*
		 * [����] [1] 48�� ����� �����ڸ��� 2~6������ ���� ����Ͻÿ�. [2] �� ������ ����� ������ ����Ͻÿ�. [����] 2 3 4 6
		 * 12 16 24 �Ǽ��� ���� : 7��
		 */

		cnt = 0;

		for (int i = 1; i <= 48; i++) {

			if (48 % i == 0) {
				if (i % 10 >= 2 && i % 10 <= 6) {
					System.out.print(i + " ");
					cnt++;
				}
			}

		}

		System.out.println("����� ����: " + cnt);
		// 5��

		System.out.println();
		System.out.println("===���� 6===");

		/*
		 * [����] [1] 48�� ����� �����ڸ��� 3�ǹ���� ���� ���� ����Ͻÿ�. [2] �� ������ ����� �յ� ����Ͻÿ�. [����] 3 6 16
		 * �Ǽ��� �� : 25
		 */
		int sum = 0;
		for (int i = 1; i <= 48; i++) {

			if (48 % i == 0) {
				if (i % 10 % 3 == 0) {
					System.out.print(i + " ");
					sum += i;
				}
			}

		}
		System.out.println("����� ��: " + sum);

		// 2��

		System.out.println();
		System.out.println("===���� 7===");

		/*
		 * [����] 128�� 5��° ������� 2��° ����� ������ ���Ͻÿ�. [����] 5��° ������� 2��° ����� ���� : 14
		 */

		cnt = 0;
		int a = 0, b = 0;
		for (int i = 1; i <= 128; i++) {
			if (128 % i == 0) {
				cnt++;
			}
			if (cnt == 2 && a == 0) {
				a = i;
			}
			if (cnt == 5) {
				b = i;
				break;
			}

		}
		System.out.print("5��° ������� 2��° ����� ����: ");
		System.out.println(b - a);

		System.out.println();
		System.out.println("===���� 8===");

		// 5��

		/*
		 * [����] 10~100������ �������ڸ� �����ϰ�, �׼����� ����ǰ����� ���Ѵ�. ����ǰ����� ¦���̸� "¦��"�� ����ϰ�, ����ǰ�����
		 * Ȧ���̸� ���ڸ� ���� ����Ѵ�. [����] 49 : 1, 7, 49 : ����ǰ����� Ȧ���̹Ƿ� ���ڸ� ���� ����Ѵ�. 13 : 13, 1 :
		 * 13�� ���� ����ǰ����� ¦���̹Ƿ� ���ڸ� ����������� "¦��"�� ����Ѵ�. [��Ʈ] �ѹ��� �ذ��Ҽ� ����.
		 */

		Random rd = new Random();
		// int num = rd.nextInt(91)+10;
		int num = 49;
		cnt = 0;
		System.out.print(num + ":  ");

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				cnt++;
			}

		}

		if (cnt % 2 == 0) {
			System.out.println("¦��");
		} else {

			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					System.out.print(i + " ");
				}

			}
		}
		System.out.println();
		System.out.println("===���� 9===");

		// 8��

		/*
		 * [����] ö���� �� �л� 25���� ü���н��� �Ϸ� �������� ������ ���µ� , �ѿ���� 19400���̿���. ����ī�带 ����ϸ� 720���̰�
		 * , �������� �����ϸ� 1000���϶�, ����ī�带 ����� �л����� ������ ����� �л����� ����Ͻÿ�. [����] ����ī�� �л��� : 20 ����
		 * �л��� : 5
		 */
		int total = 19400;
		int cnt1 = 0;
		int cnt2 = 0;

		for (int i = 0; i < 25; i++) {
			if (total % 720 == 0) {
				total -= 720;
				cnt1++;
			} else {
				total -= 1000;
				cnt2++;
			}

		}

		System.out.println("����ī�� : " + cnt1 + " ����: " + cnt2);

		// 15�е��� �ظ�;;

		System.out.println();
		System.out.println("===���� 10===");

		/*
		 * [����] ö���� 13�� ö���� �ƹ����� 45���̴�. ����Ŀ� ö���� �ƹ����� ö�������� 3�谡�Ǵ��� ���Ͻÿ�. [��] �Ⱓ : 3
		 */
		double ö�� = 13.0;
		int �ƹ��� = 45;
		cnt = 0;

		for (int i = 0; cnt <= 3; i++) {
			ö��++;
			�ƹ���++;
			cnt++;

			if (�ƹ��� / ö�� == 3.0) {

				break;
			}

		}

		System.out.println("�Ⱓ : " + cnt);

		// 6��
		System.out.println();
		System.out.println("===���� 11===");

		/*
		 * [����] ��ȣ��ǰ���� �ҵ��� 120���� �ش� 72���� ȯ�� �Ѹ�� �Ȱ��� ���� �ҵ���� �ش븦 �����ٷ����Ѵ�. �ִ��Ѹ��� ȯ�ڿ��� �����ٶ�
		 * ������� ���Ͻÿ�. [����] 24
		 */
		int �ҵ��� = 120;
		int �ش� = 72;
		int max = 1;
		for (int i = 1; i < �ش�; i++) {
			if (�ҵ��� % i == 0 && �ش� % i == 0) {
				if (max < i) {
					max = i;
				}
			}

		}

		System.out.println("����: " + max);

		// 8��

		System.out.println();
		System.out.println("===���� 12===");

		/*
		 * �ݺ����� ����ؼ� �Ʒ��� ���� ����غ�����. [����] 
		 * 0 12 
		 * 1  2 3
		 *   2 3 4
		 *    3 4 5
		 *    4 5 6
		 */

		for (int i = 0; i < 5; i++) {

			for (int k = 0; k < 3; k++) {
				System.out.print(k + i);

			}
	
			System.out.println();

		}

		// 4��

		/*
		 * �ݺ����� ����ؼ� �Ʒ��� ���� ����غ�����. [����] 0 0 1 
		 * 																							1 2 3 
		 * 																							2 4 5
		 * 																							 3 6 7
		 * 																							 4 8 9
		 */
		int idx = 0;
		System.out.println("======");
		for (int i = 0; i < 5; i++) {
			System.out.print(i);
			for (int k = 0; k < 2; k++) {
				System.out.print(k + idx);

			}
			idx += 2;
			System.out.println();

		}
		// 4��

		/*
		 * �ݺ����� ����ؼ� �Ʒ��� ���� ����غ�����. [����] 0 0 1 1 2 3 3 6 4 10 5 15 6 21 7 28 8 36 9 45
		 */
		System.out.println("=============");
		idx = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print(i + "\t");
			idx += i;
			for (int k = 0; k < 1; k++) {

				System.out.print(idx);
			}

			System.out.println();
		}
		
		// 3��
		System.out.println();
		System.out.println("===���� 13===");

		/*
		 * �������� (1~9) ������ ���� 8���� ����Ѵ�. �� �Ʒ��� ������ �����Ѵ�.
		 * 
		 * ���� ��� ���ڰ� 4 5 6 1 2 3 4 5 �̶�� �Ѵٸ� �Ʒ��� ���� ����Ѵ�.
		 * 
		 * [���] 4 5 6 5 6 1 6 1 2 1 2 3 2 3 4 3 4 5
		 * 
		 */
		num = 0;
		for (int i = 0; i < 6; i++) {
			System.out.print(num = rd.nextInt(9) + 1);
			for (int k = 0; k < 2; k++) {
				System.out.print(num = rd.nextInt(9) + 1);

			}
			System.out.println();

		}

		// �� �𸣰ڽ��ϴ�.

		/*
		 * �ݺ����� ����ؼ� �Ʒ��� ���� ����غ�����. [����] 0 30 1 29 2 27 3 24 4 20 5 15 6 9 7 2 8 -6 9
		 * -15
		 */

		System.out.println("=============");
		idx = 30;
		for (int i = 0; i < 10; i++) {
			System.out.print(i + "\t");
			idx -= i;
			for (int k = 0; k < 1; k++) {

				System.out.print(idx);
			}

			System.out.println();
		}

		// 2��

	}

}
