package day05;

import java.util.Scanner;

public class D_04소수찾기1단계 {
	public static void main(String[] args) {
		/*
		 * # 소수찾기[1단계] 1. 소수란, 1과 자기자신으로만 나눠지는 수 2. 예) 2, 3, 5, 7, 11, 13, .. 3. 힌트 1)
		 * 해당 숫자를 1부터 자기자신까지 나눈다. 2) 나머지가 0일 때마다 카운트를 센다. 3) 그 카운트 값이 2이면 소수이다. 4) 6/1
		 * 6/2 6/3 6/4 6/5 6/6 cnt=4 소수x
		 * 
		 * 정수 한 개를 입력받아, 해당 숫자가 소수인지 아닌지 판별한다.
		 */
		int i = 1, input = 0, stop = 0;

		boolean loop = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("종료 -100");
		while (loop) {

			System.out.print("소수찾기 : ");
			int cnt = 0;
			i = 1;
			input = sc.nextInt();
			if (input == -100) {
				loop = false;
			}
			if (input <= 1 && input != -100) {
				System.out.println("0이하 1입력금지 !!!");
			} else {

				while (i <= input) {
					if (input % i == 0) {
						cnt++;
					}
					i++;
				}
				System.out.println(cnt == 2 ? "소수임다" : "아님다");

				// 기능구현 8분걸림. 예외처리까진 15분걸림.
			}
		}
	}

}
