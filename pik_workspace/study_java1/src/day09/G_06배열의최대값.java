package day09;

import java.util.Arrays;
import java.util.Scanner;

public class G_06배열의최대값 {
	public static void main(String[] args) {
		/*
		 * # 최대값 구하기
		 * 1. 가장 큰 값을 찾아 입력한다.
		 * 2. 정답이면 해당 값을 0으로 변경한다.
		 * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
		 * 예)
		 * 11, 87, 42, 100, 24
		 * 입력 : 100
		 * 
		 * 11, 87, 42, 0, 24
		 * 입력 : 87
		 * 
		 * 11, 0, 42, 0, 24
		 */
			int[] arr = {11, 87, 42, 100, 24};
			int cnt = arr.length ;
			Scanner sc = new Scanner(System.in);
			int idx = 0;
			
			while(cnt != 0) {
				System.out.println(Arrays.toString(arr));
				int input = sc.nextInt();
				int max = arr[0];
				for(int i = 0 ; i < arr.length ; i++) {
					if(max < arr[i]) {
						max = arr[i];
						idx = i ;
					}
					
				}
		
			
				
				if(input == max) {
					arr[idx] = 0;
					cnt--;
				}
				
			}
			
			System.out.println("==완료==");
		

	}

}
