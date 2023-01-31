package day05;

import java.util.Scanner;

public class D_09ATM2단계 {
	public static void main(String[] args) {
		/*
		 * # ATM 2단계 
		 * 1. 로그인
		 * . 로그인 후 재 로그인 불가
		 * . 로그아웃 상태에서만 이용 가능
		 * 2. 로그아웃
		 * . 로그인 후 이용가능
		 */
		 Scanner scan = new Scanner(System.in);

			int dbAcc1 = 1111;
			int dbPw1 = 1234;

			int dbAcc2 = 2222;
			int dbPw2 = 2345;

			int id = 0;
			int pw = 0;

			int log = -1; // -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)

			boolean run = true;
			while (run) {

				System.out.println("1.로그인");
				System.out.println("2.로그아웃");
				System.out.println("0.종료");

				System.out.print("메뉴 선택 : ");
				int sel = scan.nextInt();

				if (sel == 1) {

					if (log != -1) {
						System.out.println("이미 로그인한 상태");
						continue;
					}
					// log == -1
					System.out.println("id >> ");
					id = scan.nextInt();
					System.out.println("pw >> ");
					pw = scan.nextInt();

					if (id == dbAcc1 && pw == dbPw1) {
						System.out.println("dbAcc1님 로그인 성공 ");
						log = 1;
					}else if( id == dbAcc2 && pw == dbPw2) {
						System.out.println("dbAcc2님 로그인 성공 ");
						log = 2;
					}else {
						System.out.println("로그인 실패");
					}

				} else if (sel == 2) {
					// 로그아웃
					if(log == -1 ) {
						System.out.println(" 현재 이미 로그아웃 상태입니다 ");
					}else {
						log = -1; // 로그인 -> 로그아웃 상태 변경
		                System.out.println("로그아웃 완료 ");
					}
				} else if (sel == 0) {
					run = false;
					System.out.println("프로그램 종료");
				}else {
					System.out.println("입력 오류 0-2");
				}
			}
			

	}

}
