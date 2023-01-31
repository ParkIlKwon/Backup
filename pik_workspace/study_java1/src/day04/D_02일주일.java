package day04;

import java.util.Random;

public class D_02일주일 {
	public static void main(String[] args) {
		/*
		 * 
		 0 월 
		 1 화 
		 2 수 
		 3 목 
		 4 금 
		 5 토 
		 6 일 
		[문제]
		    2023년 03월
			이번달 1일이 수요일이라고 할 때
			랜덤으로 1 ~ 31을 저장하고 해당 요일을 출력하시오.
			
			예)
				3일  ==> 금요일
				
				16일 ==> 목요일 
	 */
		Random rd = new Random();
		int day = rd.nextInt();
		int week = (day+1)%7; // 수요일
		
		if(week==0) {
			System.out.println("월요일");
		}else if (week==1) {
			System.out.println("화요일");
		}else if (week==2) {
			System.out.println("수요일");
		}else if (week==3) {
			System.out.println("목요일");
		}else if (week==4) {
			System.out.println("금요일");
		}else if (week==5) {
			System.out.println("토요일");
		}else {
			System.out.println("일요일");
	}
}
}
