package day06;

public class D_06for문연습문제2 {
	public static void main(String[] args) {
		// for를 사용해서 풀어보세요
		// 문제1) 9의 배수중 일의 자리가 6인 첫번째 배수 출력 ==> 답 : 36
		// 문제2) 9의 배수중 십의 자리가 6인 첫번째 배수 출력 ==> 답 : 63
		// 문제3) 8의 배수중 150보다 작고 150 에 가장 가까운수를 출력 ==> 답 : 144

		System.out.println("===문제 1===");
		for (int i = 0;; i += 9) {
			if (i % 10 == 6) {
				System.out.println(i);
				break;
			}
		}
		System.out.println("===문제 2===");
		for (int i = 0;; i += 9) {
			if (i / 10 == 6) {
				System.out.println(i);
				break;
			}
		}
		System.out.println("===문제 3===");
		int max = 0;
		for (int i = 0; i < 150; i += 8) {
			if (i > max) {
				max = i;
			}
		}
		System.out.println(max);
	}

}
