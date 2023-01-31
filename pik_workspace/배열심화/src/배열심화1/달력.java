package 배열심화1;

import java.util.Arrays;
import java.util.Scanner;

public class 달력 {

	public static void main(String[] args) {
		/*
		 * [달력만들기] 년도와 월을 입력받고 달력을 만드시오.
		 * 
		 * [윤년계산법] 아래의 경우는 윤년 이다.
		 * 
		 * 1. 해(year)가 4로 나눠지면 윤년. 2. 1번 조건이 맞더라도 100으로 나눠지면 윤년이 아니다. 3. 2번 조건이 맞더라도
		 * 400으로 나눠지면 윤년이다.
		 * 
		 * [요일계산법] 1년1월1일 이 월요일이다.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("연도 입력 : ");
		int setyear = sc.nextInt();
		int monthList[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int yun = 0;
		String startDay[] = { "", "\t", "\t\t", "\t\t\t", "\t\t\t\t", "\t\t\t\t\t", "\t\t\t\t\t\t" };
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		boolean yoon = false;
		//boolean chk1 = 
		
		for (int i = 1; i < setyear; i++) {
			if (i % 4 == 0 && i % 100 != 0) {
				yun++;
			}
			if (i % 400 == 0) {
				yun++;
			}

		}

		if (setyear % 4 == 0 && setyear % 100 != 0) {
			yoon = true;
			if (month > 2) {
				yun++;
			}
		}
		if (setyear % 400 == 0) {
			yoon = true;
			if (month > 2) {
				yun++;
			}
		}
		
		int day = 1 + (365 * (setyear - 1)) + yun; // 월요일을 의미

		for (int i = 0; i < month - 1; i++) {

			for (int k = 1; k <= monthList[i]; k++) {
				day++;
				if (i == monthList[i]) {
					i = 1;
				}
			}
		}

		System.out.printf("\t\t%d년 %d월\n", setyear, month);
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");

		int idx = day % 7;
		System.out.print(startDay[idx]);

		for (int i = 1; i <= monthList[month - 1]; i++) {

			System.out.print(i + "\t");
			idx++;
			if (idx >= 7) {
				System.out.println();
			}
			if (idx >= 7) {
				idx = 0;
			}

		}

		if (yoon == true && month == 2) {
			System.out.print("29");
		}

	}

}
