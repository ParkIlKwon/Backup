package day07;

import java.util.Arrays;
import java.util.Random;

public class F_08셔플 {
	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 60 };
		Random rd = new Random();
		// 셔플
		// 1) 인덱스 2개를 랜덤(0~5)으로 저장하고 각 인덱스의 값을 교환
		// 2) 위 1번을 10 번 반복하며 과정 출력

		// 예) 1 , 2 ==> {10,30,20,40,50,60}; // 20 과 30이 교환됨.

		// 예) 4 , 1 ==> {10,50,20,40,30,60}; // 50 과 30이 교환됨.

		// 예) 3 , 3 ==> {10,50,20,40,30,60}; // 같을땐 아무일도안생긴다.

		for (int i = 0; i < 10; i++) {
			int idx1 = rd.nextInt(6);
			int idx2 = rd.nextInt(6);	// arr.length
			int num = arr[idx1];
			System.out.print(idx1 + "   " + idx2);
			if (idx1 == idx2) {
				System.out.print(Arrays.toString(arr));
				System.out.println("  같을땐 아무일도 안 생긴다.");
				continue;

			}

			arr[idx1] = arr[idx2];
			arr[idx2] = num;

			System.out.print(Arrays.toString(arr));
			System.out.printf("%d 와 %d이 교환됨\n", arr[idx1], arr[idx2]);

		}

	}

}
