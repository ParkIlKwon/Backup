package day11;

import java.util.Arrays;
import java.util.Random;

public class G_06_2차원정렬 {

	public static void main(String[] args) {

		int darr[][] = new int[3][3];
		int arr[] = new int[9];
		int idx = 0;

		Random rd = new Random();
		for (int i = 0; i < darr.length; i++) {
			for (int k = 0; k < darr[i].length; k++) {
				darr[i][k] = rd.nextInt(100) + 1;
				arr[idx] = darr[i][k];
				idx++;
			}

		}

		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr.length; k++) {
				if (arr[i] < arr[k]) {
					int temp = arr[i];
					arr[i] = arr[k];
					arr[k] = temp;
				}

			}

		}
		System.out.println(Arrays.toString(arr));
		idx = 0;
		for (int i = 0; i < darr.length; i++) {
			for (int k = 0; k < darr[i].length; k++) {
				darr[i][k] = arr[idx];
				idx++;
			}

		}
		for (int i = 0; i < darr.length; i++) {
			System.out.println(Arrays.toString(darr[i]));
		}

	}

}
