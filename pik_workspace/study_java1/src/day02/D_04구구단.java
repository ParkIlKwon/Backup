package day02;

import java.util.Scanner;

public class D_04구구단 {

	public static void main(String[] args) {
		/*
		 * [문제] 구구단 게임 1. 구구단 문제를 출제하기 위해 숫자 2개를 입력받는다. 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다. 예)
		 * 3 x 7 = ? 3. 문제에 해당하는 정답을 입력받는다. 4. 정답을 비교해 "정답" 또는 "오답"을 출력한다.
		 */
		int a, b, c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 값 입력:  ");
		a = sc.nextInt();
		System.out.println("두번째 값 입력:  ");
		b = sc.nextInt();

		System.out.printf("문제 : %d X %d ", a, b);
		c = sc.nextInt();

		boolean check = a * b == c;
		if (check) {
			System.out.println("정답");
		}
		
		
		if (!check) {
			System.out.println("오답");
		}
	}

}
