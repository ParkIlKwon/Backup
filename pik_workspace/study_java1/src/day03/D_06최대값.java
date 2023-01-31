package day03;

import java.util.Scanner;

public class D_06최대값 {
	public static void main(String[] args) {
		/*
		 * [문제] 1. 숫자 3개를 입력받는다. 2. 입력받은 3개의 숫자를 비교한다. 3. 가낭 큰 수(min)를 출력한다.
		 */
		int a, b, c;
		Scanner sc = new Scanner(System.in);

		System.out.println("a값 입력하시오.");
		a = sc.nextInt();
		System.out.println("b값 입력하시오.");
		b = sc.nextInt();
		System.out.println("c값 입력하시오.");
		c = sc.nextInt();
		sc.close();
		int min = a;
		boolean err = a == b || b == c || a == c;
		if (err) {
			System.out.println("숫자가 같아요.");
		}
		if (!err) {
			if (min > b) {
				min= b;
			}
			if (min > c) {
				min = c;
			}
			System.out.println(min);
		}
	}

}
