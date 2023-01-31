package day10;

import java.util.Arrays;
import java.util.Random;

public class G01중복숫자방지2단계 {

	public static void main(String[] args) {
		
		/*
		 * # 중복숫자 금지[2단계]
		 * 1. arr배열에 1~10 사이의 랜덤 숫자 5개를 저장한다.
		 * 2. 단 중복되는 숫자가 없어야 한다.
		 */
				Random rd = new Random();
				
				int[] arr = new int[5];			
				
				for(int i = 0 ; i < arr.length ; i ++) {
					
					arr[i] = rd.nextInt(10)+1;		
					
					for(int k = 0 ; k < i ; k++) {
						if(arr[i] == arr[k]) {
							i--;			
						}
						
					}
				}

				System.out.println(Arrays.toString(arr));
				
	}

}
