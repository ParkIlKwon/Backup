package day07;

import java.util.Arrays;
import java.util.Random;

public class F_08���� {
	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 60 };
		Random rd = new Random();
		// ����
		// 1) �ε��� 2���� ����(0~5)���� �����ϰ� �� �ε����� ���� ��ȯ
		// 2) �� 1���� 10 �� �ݺ��ϸ� ���� ���

		// ��) 1 , 2 ==> {10,30,20,40,50,60}; // 20 �� 30�� ��ȯ��.

		// ��) 4 , 1 ==> {10,50,20,40,30,60}; // 50 �� 30�� ��ȯ��.

		// ��) 3 , 3 ==> {10,50,20,40,30,60}; // ������ �ƹ��ϵ��Ȼ����.

		for (int i = 0; i < 10; i++) {
			int idx1 = rd.nextInt(6);
			int idx2 = rd.nextInt(6);	// arr.length
			int num = arr[idx1];
			System.out.print(idx1 + "   " + idx2);
			if (idx1 == idx2) {
				System.out.print(Arrays.toString(arr));
				System.out.println("  ������ �ƹ��ϵ� �� �����.");
				continue;

			}

			arr[idx1] = arr[idx2];
			arr[idx2] = num;

			System.out.print(Arrays.toString(arr));
			System.out.printf("%d �� %d�� ��ȯ��\n", arr[idx1], arr[idx2]);

		}

	}

}
