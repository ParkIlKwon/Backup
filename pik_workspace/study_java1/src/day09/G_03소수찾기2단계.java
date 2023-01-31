package day09;

import java.util.Scanner;

public class G_03소수찾기2단계 {
	public static void main(String[] args) {
		/*
		 * # 소수찾기[2단계]
		 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
		 * 예)
		 * 입력 : 20
		 * 2, 3, 5, 7, 11, 13, 17, 19
		 */
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		for(int i = 2 ; i < num ; i++) {
				for(int k = 1; k < num ; k++) {
					if(i%k==0) {
						cnt++;
					}
					
				}
				if(cnt ==2) {
					System.out.print(i+" ");
				}
				cnt = 0;
		}
		

	}

}
