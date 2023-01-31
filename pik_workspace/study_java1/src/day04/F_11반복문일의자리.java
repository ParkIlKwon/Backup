package day04;

public class F_11반복문일의자리 {
	public static void main(String[] args) {
		/*
		 * [문제] 9의 배수중 일의 자리가 6인 첫번째 배수 출력하시오. 답 : 36
		 */
		int i = 0;
		while (i % 10 != 6) {
			i+=9;
					
		}
		System.out.println(i);
		
	}

}
