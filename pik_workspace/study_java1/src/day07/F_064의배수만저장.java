package day07;

import java.util.Arrays;

public class F_064의배수만저장 {
	public static void main(String[] args) {

		/*
		 * # 4의 배수만 저장
		 * - arr 배열에서 4의 배수만 골라 temp 배열에 저장
		 * - 단! temp 의 길이를 4의 배수만큼만 설정한다. 
		 */

			int[] arr = {44, 11, 29, 24, 76},k;
			int cnt = 0,idx=0;
	
			for(int i = 0 ; i < arr.length ; i++) {
				if(arr[i]%4==0) {
					cnt++;
				}
			}
					
			int[] temp = new int[cnt];
			for(int i = 0 ; i < arr.length ; i++) {
				if(arr[i]%4==0) {
					temp[idx] = arr[i];
					idx++;
				}
			}
			
			System.out.println(Arrays.toString(temp));
		
		
	}

}
