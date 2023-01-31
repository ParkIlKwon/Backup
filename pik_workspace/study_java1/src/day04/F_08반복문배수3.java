package day04;

public class F_08반복문배수3 {
	public static void main(String[] args) {
		/*
		 * [문제] 50에서 100까지 자연수중에서 9의 배수의 개수를 출력하시오. [예] (54 63 72 81 90 99) 6 개
		 */
		int i = 50, cnt = 0;
		System.out.print("(");
		while (i <= 100) {
			if (i % 9 == 0) {
				System.out.print(i + " ");
				cnt++;
			}
			i++;
		}
		System.out.println(" ) " + cnt + "개");
	}
}
