package day04;

public class F_05�ݺ�������2 {
	public static void main(String[] args) {
		/*
		 * [����1] 1~10���� �߿��� 3�̸� 7�̻��� ���� ����Ͻÿ�. 1 + 2 + 7 + 8 + 9 + 10 [����1] 37
		 * 
		 * 
		 * [����2] 1~10���� �߿��� 3�̸� 7�̻��� ������ ����Ͻÿ�. 1,2,7,8,9,10 ==> 6�� [����2] 6
		 * 
		 */
		System.out.println("===����1===");
		int i = 1, total = 0, cnt = 0;
		while (i <= 10) {

			if (i < 3) {
				total += i;
				cnt++;
			} else if (i >= 7) {
				total += i;
				cnt++;
			}
			i++;
		}
		System.out.println(total);
		System.out.println("===����2===");
		System.out.println(cnt);

	}

}
