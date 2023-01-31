package day03;

import java.util.Random;
import java.util.Scanner;

public class D_15랜덤369 {
	public static void main(String[] args) {
		/*
		[문제]
			1. 1~50 사이의 랜덤 숫자를 저장한다.
			2. 랜덤 숫자 중에서 3이나 6이나 9의 개수가 2개면, 짝짝을 출력한다.
			3. 랜덤 숫자 중에서 3이나 6이나 9의 개수가 1개면, 짝을 출력한다.
			4. 랜덤 숫자 중에서 3이나 6이나 9의 개수가 0이면, 해당 숫자를 출력한다.
				예)
					33		=>		짝짝
					16		=>		짝
					7		=>		7
	 */
		int a;
		Random rd = new Random();
		a=rd.nextInt(50)+1;
		int total=a,count=0;
		boolean check ;
		System.out.println(a);
		if(a/10==3) {
			System.out.println("짝");
		}
		if(a%10%3==0&&a%10!=0) {
			System.out.println("짝");
		}
		
		
		

}
}