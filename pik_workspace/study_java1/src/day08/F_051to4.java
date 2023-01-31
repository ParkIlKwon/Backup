package day08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class F_051to4 {
	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		int[] check = new int[4];
		int idx = 0;

		while (idx != arr.length) {
			int num = rd.nextInt(arr.length);

			if (check[num] == 0) {
				check[num] = 1;
				arr[idx] = num + 1;
				idx++;
			} else {
				continue;
			}
		
		}
		idx = 1;
		int cnt = 0;

		while (cnt != arr.length) {
			System.out.println(Arrays.toString(arr));
			
			System.out.print(idx+" 의 위치를 찾아라");
			int sel = sc.nextInt();
			
			if(sel>arr.length || sel <1) {
				System.out.println("잘못된입력");
				continue;
			}
			sel--;
					if (arr[sel] == idx) {
						arr[sel] = 9;
						idx++;
						cnt++;
					} else
						continue;
					
		}
	}
}










