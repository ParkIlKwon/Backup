package day07;

import java.util.Arrays;
import java.util.Scanner;

public class F_05배열값교체 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int log = -1;
		Scanner sc = new Scanner(System.in);
		// 인덱스 범위 오류 와 두 인덱스가 같을때 오류

		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예 1) 인덱스1 입력 : 1 , 인덱스2 입력 : 3
		// {10, 40, 30, 20, 50}

		System.out.print("인덱스 [1] 입력: ");
		int idx1 = sc.nextInt();
		System.out.print("인덱스 [2] 입력: ");
		int idx2 = sc.nextInt();
		if (idx1 == idx2 || idx1 > 4 || idx2 > 4 || idx1 < 0 || idx2 < 0) {
			log = 1;
		}
		if (log != -1) {
			System.out.println("오류");
		} else {
			int num = arr[idx1];

			arr[idx1] = arr[idx2];
			arr[idx2] = num;
			System.out.println(Arrays.toString(arr));
		}

		log = -1;
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예 2) 값1 입력 : 40 , 값2 입력 : 20
		// {10, 20, 30, 40, 50}

		// 1번째 둘중 한개라도 값이 없으면 오류 출력

		// 1번째와 2번째 값이 서로 같으면 오류 출력

		int a, b, check = 0, check2 = 0;
		System.out.println("== 문제 2 ==");
		while (log == -1) {

			System.out.println("첫번째 값입력");
			a = sc.nextInt();
			System.out.println("두번째 값입력");
			b = sc.nextInt();

			if (a == b) {
				System.out.println("값오류");
			} else {
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == a) {
						check = i;
					}
					if (arr[i] == b) {
						check2 = i;
					}
				}
				int num2 = arr[check];

				arr[check] = arr[check2];
				arr[check2] = num2;

				log = 1;

			}

		}
		System.out.println(Arrays.toString(arr));

		// 학번 두개 정확하게 입력할때까지 반복해서 입력받기

		// 즉 학번이 없거나 , 두 학번이 같은 경우 다시 입력받기

		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예 3) 학번1 입력 : 1002 , 학번2 입력 : 1003
		// {87, 45, 11, 98, 23}

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		idx1 = -1;
		idx2 = -1;

		while (true) {
			System.out.print("[학번]첫번째 값 입력: ");
			int hak1 = sc.nextInt();
			System.out.print("[학번]두번째 값 입력: ");
			int hak2 = sc.nextInt();
			if (hak1 == hak2) {
				System.out.println("서로다른 값을 입력하여주세요.");
				continue;
			}
			for (int i = 0; i < hakbuns.length; i++) {
				if (hak1 == hakbuns[i]) {
					idx1 = i;

				}
				if (hak2 == hakbuns[i]) {
					idx2 = i;
				}
			}

			if (idx1 != -1 && idx2 != -1) {
				int score = scores[idx1];
				scores[idx1] = scores[idx2];
				scores[idx2] = score;
				break;
			} else {
				System.out.println("==값오류==");
			}
		}

		System.out.println(Arrays.toString(scores));

	}

}
