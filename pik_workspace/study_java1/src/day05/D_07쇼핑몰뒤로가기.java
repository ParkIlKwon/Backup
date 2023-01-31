package day05;

import java.util.Scanner;

public class D_07쇼핑몰뒤로가기 {

	/*
	 * # 쇼핑몰 뒤로가기
	 * 
	 * 문제) 쇼핑몰메인메뉴에서 남성의류를 선택해서 
	 *      뒤로가기 누르기전까지 남성의류 페이지 를 유지할려고한다.
	 * 힌트) 개층 별로 반복문을 추가 해주면된다. 
	 * 1. 남성의류
	 * 		1) 티셔츠
	 * 		2) 바지
	 * 		3) 뒤로가기
	 * 2. 여성의류
	 * 		1) 가디건
	 * 		2) 치마
	 * 		3) 뒤로가기
	 * 3. 종료
	 */

public static void main(String[] args) {
		
    Scanner scan = new Scanner(System.in);

		boolean run = true;
		while (run) {

			System.out.println("1.남성의류");
			System.out.println("2.여성의류");
			System.out.println("3.종료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			boolean run2 = true;

			if (sel == 1) {
				while (run2) {
					System.out.println("1)티셔츠");
					System.out.println("2)바지");
					System.out.println("3)뒤로가기");
					System.out.print("아이템 선택 : ");
					int item = scan.nextInt();
					if (item == 1) {
						System.out.println("티셔츠 선택");
					} else if (item == 2) {
						System.out.println("바지 선택");
					} else if (item == 3) {
						run2 = false;
					} else {
						System.out.println("입력 오류 1 -3 입력");
					}
				}
			} else if (sel == 2) {
				while (run2) {
					System.out.println("1)가디건");
					System.out.println("2)치마");
					System.out.println("3)뒤로가기");
					System.out.print("아이템 선택 : ");
					int item = scan.nextInt();
					if (item == 1) {
						System.out.println("가디건 선택");
					} else if (item == 2) {
						System.out.println("치마 선택");
					} else if (item == 3) {
						run2 = false;
					} else {
						System.out.println("입력 오류 1 -3 입력");
					}
				}
			} else if (sel == 3) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
		
}
}

	


