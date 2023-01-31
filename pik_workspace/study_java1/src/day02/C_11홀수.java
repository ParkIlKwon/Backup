package day02;

import java.util.Scanner;

public class C_11홀수 {

	public static void main(String[] args) {
		/*
		 * 3:52 [문제] 숫자 2개를 입력받는다. 그 숫자의 합이 홀수인지 여부를 판단해 true 또는 false로 표현하시오.
		 */
		int a, b, total = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자 입력하세요: ");
		a = sc.nextInt();
		System.out.print("두번째 숫자 입력하세요: ");
		b = sc.nextInt();
		total = a + b;
		boolean chk = total % 2 != 0;
		System.out.println(chk + "입니다");
		//3:55
	}

}
