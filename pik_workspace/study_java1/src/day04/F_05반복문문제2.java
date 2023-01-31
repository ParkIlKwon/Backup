package day04;

public class F_05반복문문제2 {
	public static void main(String[] args) {
		/*
		 * [문제1] 1~10까지 중에서 3미만 7이상의 합을 출력하시오. 1 + 2 + 7 + 8 + 9 + 10 [정답1] 37
		 * 
		 * 
		 * [문제2] 1~10까지 중에서 3미만 7이상의 개수를 출력하시오. 1,2,7,8,9,10 ==> 6개 [정답2] 6
		 * 
		 */
		System.out.println("===문제1===");
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
		System.out.println("===문제2===");
		System.out.println(cnt);

	}

}
