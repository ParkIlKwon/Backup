package day10;

import java.util.Arrays;

public class G_04최대값정렬하기 {
	public static void main(String[] args) {
		/*
		 * # 정렬하기
		 * 1. 인덱스 0번이 나머지를 검사한다.
		 * 2. 제일 큰 값을 찾아 교환한다.
		 * 3. 인덱스 1증가한다.
		 * 4. [1~3]을 끝까지 반복한다.
		 * 예)
		 * 10, 50, 30, 40, 80, 7
		 * 80, 50, 30, 40, 10, 7
		 * 80, 50, 30, 40, 10, 7
		 * 80, 50, 40, 30, 10, 7
		 */

	int[] score = {10, 50, 30, 40, 80, 7};
	int size = score.length;
	
	for(int i = 0 ; i < score.length ; i++) {
		for(int k = i ; k < score.length ; k++) {
			if(score[i] < score[k]) {
				int temp = score[k];
				score[k] = score[i];
				score[i] = temp;
		
			}
			
		}
	}
	
	
		System.out.println(Arrays.toString(score));
		
		
	}

}
