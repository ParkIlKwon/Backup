package day06;

public class F_12�л���������4�ܰ� {
	public static void main(String[] args) {
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 98, 98, 23 };
		int max = 0, k = 0, cnt = 0;
		// ����) 1���л��� �й��� ���� ���
		// ����) 1004��(98��)

		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i]) {
				max = scores[i];
				k = i;
				cnt++;
			}
		}
			for (int i = 0; i < scores.length; i++) {
				if (max == scores[i]) {
					System.out.println("[�й�] " + hakbuns[i]);
				}
			}
			System.out.println("[1�� ����] " + max);
		
	}
}
