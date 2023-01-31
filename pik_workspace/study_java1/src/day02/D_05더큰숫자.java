package day02;

import java.util.Scanner;

public class D_05더큰숫자 {
	public static void main(String[] args) {
		/*
		 * [문제] 정수 2개를 입력받고, 더 큰 숫자의 값을 출력하시오.
		 * 
		 * 예) 숫자1 입력 : 숫자2 입력 : 더 큰 숫자는 ? 입니다.
		 */

		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자입력하섿요 :");
		a = sc.nextInt();
		System.out.println("두번째 숫자입력하섿요 :");
		b = sc.nextInt();

		if (a == b) {
			System.out.println("둘이 같은 숫자입니다");
		}
		if (a>b) {
			System.out.printf("더 큰 숫자는 %d 입니다", a);
		}
		if (b>a) {
			System.out.printf("더 큰 숫자는 %d 입니다", b);
		}

	}

}
