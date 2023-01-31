package day03;

import java.util.Scanner;

public class D_08택시요금 {
	public static void main(String[] args) {
		/*
		[문제]
			택시 기본요금은 10,000원이다.
			기본 요금으로 10km까지 이동할 수 있다.
			10km이상 이동 시 추가요금이 발생한다.
			추가요금은 3km를 이동할 때마다 2,300원씩 요금이 추가된다.
			이동거리를 입력받고 요금을 출력하시오.
			
			예)
				8km			=>		10,000원
				11km		=> 		12,300원
				16km		=>		14,600원
	 */
	    int fee = 10000;
			int extra = 0;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("이동거리 : ");
			int km = sc.nextInt();
			
			if( km <= 0 ) {
				System.out.println("입력 오류 : 0보다 큰 정수 값 입력 ");
			}
		
			if(km > 10) {
				int extraKm = km - 10;
				extra = extraKm/3;
				if( extraKm %3 != 0 ) {
					extra = extra +1 ;
				}
				fee = fee + extra*2300;
			}
			
			System.out.println("요금 : " + fee);

	}
}
