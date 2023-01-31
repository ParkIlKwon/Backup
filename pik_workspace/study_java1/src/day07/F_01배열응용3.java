package day07;

import java.util.Arrays;

public class F_01배열응용3 {
	public static void main(String[] args) {

		// 문제2) 아래는 시험결과 이다. 시험에 합격한사람의 번호만 win 에 저장 (60점이상합격)
		int num[] = { 1001, 1002, 1003 };
		int score[] = { 50, 83, 78 };
		int win[] = { 0,0,0 };
		int idx=0;
		// 예) win[]= {1002, 1003, 0};
		
		for(int i = 0 ; i < num.length ; i++) {
			if(score[i] >=60) {
				win[idx] = num[i];
				idx++;
			}
			
		}
		for(int i = 0 ; i < win.length ; i++) {
			System.out.print(win[i]+" ");	
		}
		System.out.println("\n 문제 3 ");

		// 문제 1) 아래 배열 a 와 b 를 비교해서 둘의 합이 짝수 일때만 c에 저장 

				//           0   1   2   3  4
				          // new int[5] ; a[0] = 10, a[1]=20 ,, 
				int a[] = { 10, 20, 30, 40, 50 }; // a.length => 배열의 길이, 갯수 == >5 
				int b[] = { 13, 54, 17, 42, 1 };
				int c[] = new int[5];
				int cidx =0; // a+b 합이 짝수일때만 인덱스 증가 
				
		                   // 0  1
				// 예) c[] = {74,82,0,0,0}
				
				for(int i = 0; i < a.length; i++ ) {
					int hap = a[i] + b[i];
					if( hap %2 == 0 ) {
						c[cidx] = hap;
						cidx++;
					}
				}
				for(int i = 0; i < c.length; i++ ) {
					System.out.print(c[i]+" ");
				}

				
				// 문제3) 아래는 시험결과 이다 시험에 합격한 사람의 번호만 win2 에 저장 (60점이상 합격)
				int wIdx =0; 
				for(int i =0; i < num.length ; i++) {
					if(score[i]>= 60) {
						win[wIdx] = num[i];
						wIdx++;
					}
				}
				System.out.println();
				
				System.out.println(Arrays.toString(win));
										// 0     1     2    3    4     5
				int data[] = { 1001, 80 , 1002, 23, 1003 , 78 };
				int win2[] = { 0,0,0 };
				// 예) win2[] = {1001, 1003, 0};
				
				wIdx = 0;    // 1  3  5  
				for(int i = 1; i < data.length; i+=2 ) {
					if(data[i] >= 60) {
						win2[wIdx] = data[i-1];
						wIdx++;
					}
				}
				
				System.out.println(Arrays.toString(win2));
	
	}

}
