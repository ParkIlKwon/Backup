package day07;

import java.util.Arrays;
import java.util.Random;

public class F_10�ߺ����ڱ��� {
	public static void main(String[] args) {
		/*
		 * # �ߺ����� ����[1�ܰ�] 1. 0~4 ������ ���ڸ� arr�迭�� �����Ѵ�. 2. ��, �ߺ��Ǵ� ���ڴ� ����� �Ѵ�. ��Ʈ) ���� ���ڸ�
		 * check�迭�� �ε����� Ȱ���Ѵ�.
		 * 
		 * ��) �������� : 1 check = {0, 1, 0, 0, 0} arr = {1, 0, 0, 0, 0} �������� : 3 check =
		 * {0, 1, 0, 1, 0} arr = {1, 3, 0, 0, 0} �������� : 2 check = {0, 1, 1, 1, 0} arr =
		 * {1, 3, 2, 0, 0}
		 */
		Random rd = new Random();
		int[] check = new int[5];
		int[] arr = new int[5];
		int idx = 0;
		while (true) {
			int num = rd.nextInt(arr.length);
			if (check[num] == 0) {
				check[num] = 1;
				arr[idx] = num;
				idx++;
			} else {
				continue;
			}

			if (idx ==5) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
