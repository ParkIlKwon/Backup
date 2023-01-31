package day08;

import java.util.Arrays;

public class F_03미니빙고 {

	
	public static void main(String[] args) {
		int cnt = 0;
		int arr[] = {
				3,0,0,
				3,3,0,
				3,3,3
		};
		
		//문제1) 만약에 가로에 3이 연속으로 3개있으면 "빙고" 출력
   	//문제2) 만약에 세로에 3이 연속으로 3개있으면 "빙고" 출력
	  //문제3) 만약에 대각선에 3이 연속으로 3개있으면 "빙고" 출력
	for(int i = 0 ; i < arr.length ; i++) {
		if(i%3==0) {
			System.out.println();
		}
		if(arr[i] == 0) {
			System.out.print("○");
		}else {
			System.out.print("●");
		}
		
	}
		System.out.println();

	for (int i = 0; i < arr.length - 2; i++) {
		
		if (arr[i] == 3) {					//3을인식
			
			if (arr[i] == arr[i + 1] && arr[i] == arr[i + 2]) {	//그 시점에 가로빙고 조건
				
				System.out.println("가로빙고");

			} 
				if (i < 3) {	//세로빙고는 첫번째줄 3이 있어야 하므로 그 조건
				if (arr[i] == arr[i + 3] && arr[i] == arr[i + 6]) {	
					
				System.out.println("세로빙고");
					
			}
			if(i == 0)	{	//대각빙고는 인덱스0과 2에 3이있어야 하므로 그 조건
				if (arr[i] == arr[i + 4] && arr[i] == arr[i + 8]) {
					
					System.out.println("대각빙고");	
				}
			}
			if(i == 2) {
				if(arr[i] == arr [i+2] && arr[i] == arr [i+4] ) {
					
					System.out.println("대각빙고");		
				}
			}
				
			}
			}

	}
		
	
	}

}
