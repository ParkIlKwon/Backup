package day07;

import java.util.Arrays;
import java.util.Random;

public class F_10중복숫자금지 {
	public static void main(String[] args) {
		/*
		 * # 중복숫자 금지[1단계] 1. 0~4 사이의 숫자를 arr배열에 저장한다. 2. 단, 중복되는 숫자는 없어야 한다. 힌트) 랜덤 숫자를
		 * check배열의 인덱스로 활용한다.
		 * 
		 * 예) 랜덤숫자 : 1 check = {0, 1, 0, 0, 0} arr = {1, 0, 0, 0, 0} 랜덤숫자 : 3 check =
		 * {0, 1, 0, 1, 0} arr = {1, 3, 0, 0, 0} 랜덤숫자 : 2 check = {0, 1, 1, 1, 0} arr =
		 * {1, 3, 2, 0, 0}
		 */
		Random rd = new Random();
		int[] check = new int[5];
		int[] arr = new int[5];
		int idx = 0;
		while (true) {
			int num = rd.nextInt(arr.length);
			if (check[num] == 0) {
				check[num] = 1;
				arr[idx] = num;
				idx++;
			} else {
				continue;
			}

			if (idx ==5) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
