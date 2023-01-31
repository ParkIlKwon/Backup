package day02;

import java.util.Scanner;

public class C_06입력 {
	public static void main(String[] args) {

		/*
		 * [문제] 숫자 2개를 입력받고, 그 합을 구하시오. 예) 3, 5 ==> 8
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("첫째입력");
		int a = sc.nextInt();
		System.out.println("둘째입력");
		int b = sc.nextInt();
		System.out.println(a + b);
		sc.close();
		
		
		

	}

}
