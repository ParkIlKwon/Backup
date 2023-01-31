package day07;

import java.util.Scanner;

public class F_02배열응용4 {
	public static void main(String[] args) {
		// 문제 1) 아래 배열 a 에서 내가 입력한 값만 빼고 b 에 저장
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 0, 0, 0, 0, 0 };
		int idx = 0;
		int num = 0;
		// 예) 30 ==> b[] = {10,20,40,50,0};
		Scanner sc = new Scanner(System.in);
		while (true) {
			num = sc.nextInt();
			if (num % 10 != 0 || num > 50 || num < 0) {
				System.out.println("값오류다시입력하세요.");
				continue;
			} else {
				for (int i = 0; i < a.length; i++) {

					if (a[i] == num) {
						continue;
					} else {
						b[idx] = a[i];
					}
					idx++;
				}
				for (int i = 0; i < b.length; i++) {

					System.out.print(b[i] + " ");

				}
				break;
			}
		}
		System.out.println();
		// 문제 2) 아래 배열에서 내가 입력한 번호 와 값 만 빼고 d 에 저장
		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
		int d[] = { 0, 0, 0, 0, 0, 0 };
		int e = 0;
		// 예) 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};

		idx = 0;
		while (true) {
			int num2 = sc.nextInt();
			if (num2 == 1001 || num2 == 1002 || num2 == 1003) {
				for (int i = 0; i < c.length - 1; i += 2) {

					if (c[i] == num2) {
						e = i;
						break;
					}
				}
				for (int i = 0; i < c.length; i++) {
					if (i == e) {
						i++;
						continue;
					} else {
						d[idx] = c[i];
					}
					idx++;

				}
				break;
			} else {
				System.out.println("값오류다시입력하세요");
			}
		}
		for (int i = 0; i < d.length; i++) {

			System.out.print(d[i] + " ");

		}

	}

}
