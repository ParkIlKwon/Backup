package day06;

import java.util.Arrays;
import java.util.Random;

public class F_10�л���������1 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int sum = 0, cnt = 0;
		double avg = 0;
		Random rd = new Random();
		// ����1) arr�迭�� 1~100�� ������ ������ 5�� ����
		// �� 1) 87, 11, 92, 14, 47

		// ����2) �������� ������ ��� ���
		// �� 2) ����(251) ���(50.2)

		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// �� 3) 2��
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100) + 1;
			System.out.println(arr[i]);
						if (arr[i] >= 60) {
				System.out.println(">>�հ�");
				cnt++;
			}
		}
		//avg = sum / (float) arr.length;
		sum=Arrays.stream(arr).sum();
		avg=Arrays.stream(arr).average().orElse(0);
		System.out.printf("[����] %d\t[���]%.2f\t[�հݻ���]%d", sum, avg, cnt);
	}

}
