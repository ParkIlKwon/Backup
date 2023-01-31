package day06;

import java.util.Iterator;
import java.util.Scanner;

public class F_14배열응용문제2 {
	public static void main(String[] args) {
		// 문제1) 인덱스(방번호)를 입력하면 값출력
		int a[] = { 10, 20, 30, 40, 50 };
		int sel, log = -1;
		// 예) 3 ==> 40
		Scanner sc = new Scanner(System.in);
		sel = sc.nextInt();

		for (int i = 0; i < a.length; i++) {
			if (sel == i) {
				sel = a[i];
				log = 1;
			}
		}

		if (log == -1) {
			System.out.println("잘못입력하셨습니다.");
		} else {
			System.out.println(sel);
		}

		// 문제2) 아래배열중 가장큰값 출력
		int b[] = { 12, 54, 23, 87, 1 };
		int max = 0;
		// 예) 87

		for (int i = 0; i < b.length; i++) {
			if (max < b[i]) {
				max = b[i];
			}
		}

		System.out.println("[최대값] " + max);

		// 문제3) 아래 배열중 홀수의 개수 출력
		int c[] = { 12, 54, 23, 87, 1 };
		int cnt = 0;
		// 예) 홀수의 개수 : 3

		for (int i = 0; i < c.length; i++) {
			if (c[i] % 2 == 1) {
				cnt++;
			}
		}

		System.out.println("[홀수의 개수] " + cnt);

		// 문제4) 아래배열을 거꾸로 저장

		int d[] = { 1, 2, 3, 4, 5 };
		int e[] = { 0, 0, 0, 0, 0 };
		// 예) ={5,4,3,2,1};
		int index = 0;
		for (int i = d.length - 1; i >= 0; i--) {
			e[index] = d[i];
			index++;
		}
		System.out.print("[거꾸로 출력] ");
		for (int j = 0; j < e.length; j++) {
			System.out.print(e[j]);
		}

	}

}
