package day10;

public class G10�������迭����1 {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];
		int sum = 0;

		int k = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}

		// ���� 1) ��ü �� ���
		// ���� 1) 450
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				sum += arr[i][j];
			}
		}
		System.out.println(sum);

		// ���� 2) 4�� ����� ���
		// ���� 2) 20 40 60 80

		System.out.println("���� 2 >>");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 4 == 0) {
					System.out.print(arr[i][j] + " ");

				}

			}
		}
		System.out.println();

		// ���� 3) 4�� ����� �� ���
		// ���� 3) 200
		sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 4 == 0) {
					sum += arr[i][j];
				}

			}
		}
		System.out.println("����3>>");
		System.out.println(sum);

		// ���� 4) 4�� ����� ���� ���
		// ���� 4) 4

		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 4 == 0) {
					cnt++;
				}

			}
		}

		System.out.println("����4>>");
		System.err.println(cnt);

	}

}
