package day04;


public class F_10반복문약수 {
	public static void main(String[] args) {

		/*
		 * [문제] 48의 약수를 전부 출력하시오. 약수란? 0 보다 큰 수 중에서 어떤 수를 나누어 떨어지게 하는 수를 그 수의 약수라고 한다.
		 * 예) 8의 약수 => 1, 2, 4, 8 [정답] 1, 2, 3, 4, 6, 8, 12, 16, 24, 48
		 */
		int i = 1;

		while (i <= 48) {
			
			if (48 % i == 0)
				System.out.print(i + "\t");
			i++;
		}
	}

}
