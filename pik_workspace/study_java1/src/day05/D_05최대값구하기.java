package day05;

import java.util.Scanner;

public class D_05최대값구하기 {
	public static void main(String[] args) {
		/*
		 * # 최대값 구하기[2단계]
		 * 1. 3회 반복을 하면서 정수를 입력받는다.
		 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
		 */
		int min=0,num,i=0;
		Scanner sc = new Scanner(System.in);
		
		while(i<3) {
		num = sc.nextInt();
		if(i==0)min=num;
		if(min>num) {
			min=num;
		}
			i++;
		}
		System.out.println(min);
	}
}
