package day02;

import java.util.Scanner;

public class D_03_4의배수 {

	public static void main(String[] args) {
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하시오.");
		score = sc.nextInt();
		boolean check = score % 4 == 0;
		if (check) {
			System.out.println("4의 배수입니다 ");
		}
		if (!check) {    //else
			System.out.println("4의 배수가 아닙니다 ");
		}

	}

}
