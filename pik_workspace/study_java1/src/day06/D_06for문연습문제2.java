package day06;

public class D_06for����������2 {
	public static void main(String[] args) {
		// for�� ����ؼ� Ǯ�����
		// ����1) 9�� ����� ���� �ڸ��� 6�� ù��° ��� ��� ==> �� : 36
		// ����2) 9�� ����� ���� �ڸ��� 6�� ù��° ��� ��� ==> �� : 63
		// ����3) 8�� ����� 150���� �۰� 150 �� ���� �������� ��� ==> �� : 144

		System.out.println("===���� 1===");
		for (int i = 0;; i += 9) {
			if (i % 10 == 6) {
				System.out.println(i);
				break;
			}
		}
		System.out.println("===���� 2===");
		for (int i = 0;; i += 9) {
			if (i / 10 == 6) {
				System.out.println(i);
				break;
			}
		}
		System.out.println("===���� 3===");
		int max = 0;
		for (int i = 0; i < 150; i += 8) {
			if (i > max) {
				max = i;
			}
		}
		System.out.println(max);
	}

}
