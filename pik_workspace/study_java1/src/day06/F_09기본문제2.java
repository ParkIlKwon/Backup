package day06;

public class F_09�⺻����2 {
	public static void main(String[] args) {
		int[] arr = new int[5]; // 10 20 30 40 50
		int sum = 0, cnt = 0;
		// ����1) 4�� ����� ���
		// ����1) 20 40

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10 * i + 10;
			if (arr[i] % 4 == 0) {
				System.out.println(arr[i]);
				sum += arr[i];
				cnt++;
			}
		}

		// ����2) 4�� ����� �� ���
		// ����2) 60
		System.out.println("[ �� ] " + sum);
		// ����3) 4�� ����� ���� ���
		// ����3) 2
		
		System.out.println("[4�� ��� ����] "+cnt);
	}

}
