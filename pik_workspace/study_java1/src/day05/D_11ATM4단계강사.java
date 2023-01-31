package day05;

import java.util.Scanner;

public class D_11ATM4단계강사 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;

		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;

		int log = -1;// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)

		boolean run = true;
		while (run) {

			if (log == -1) {
				System.out.println("1.로그인");
			} else {
				System.out.println("2.로그아웃");
				System.out.println("3.입금");
				System.out.println("4.출금");
				System.out.println("5.이체");
				System.out.println("6.조회");
			}
			System.out.println("0.종료");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel < 0 || sel > 6) {
				System.out.println("입력 오류");
				continue;
			}

			// sel >= 1 && sel <=6

			if (sel == 1 && log == -1) {
				// 로그인
				System.out.print("id >> ");
				int id = scan.nextInt();
				System.out.print("pw >> ");
				int pw = scan.nextInt();

				if (dbAcc1 == id && dbPw1 == pw) {
					System.out.println("dbAcc1님 로그인 성공");
					log = 1;
				} else if (dbAcc2 == id && dbPw2 == pw) {
					System.out.println("dbAcc2님 로그인 성공");
					log = 2;
				} else {
					System.out.println("로그인실패");
				}

			} else if (sel == 2 && log != -1) {
				// 로그아웃
				log = -1;
				System.out.println("[ 로그아웃 완료 ]");
			} else if (sel == 3 && log != -1) {
				// 입금
				System.out.println("입금액 >>");
				int money = scan.nextInt();

				if (money <= 0 || money % 1000 != 0) {
					System.out.println("금액 오류");
					continue;
				}
				// money 값이 양수 이면서 천단위로 떨어질때만

				if (log == 1) {
					// dbAcc1
					dbMoney1 += money;
				} else {
					// dbAcc2
					dbMoney2 += money;
				}
				System.out.println("[ 입금 완료 ]");
			} else if (sel == 4 && log != -1) {
				// 출금

				System.out.println("출금액 >>");
				int money = scan.nextInt();

				if (money <= 0 || money % 1000 != 0) {
					System.out.println("금액 오류");
					continue;
				}

				if (log == 1) {
					// dbAcc1
					if (money > dbMoney1) {
						System.out.println("[ 출금 잔액 초과 ]");
						continue;
					}
					// dbMoney1 >= money ;
					dbMoney1 -= money;
				} else {
					// dbAcc2
					if (money > dbMoney2) {
						System.out.println("[ 출금 잔액 초과 ]");
						continue;
					}
					dbMoney2 -= money;

				}

				System.out.println("[ 출금 완료 ]");

			} else if (sel == 5 && log != -1) {
				// 이체
				System.out.println("log = " + log);

				System.out.println("이체계좌 >>");
				int acc = scan.nextInt();

				if (acc != 1111 && acc != 2222) {
					System.out.println("[ 없는 계좌 ]");
					continue;
				}

				if (log == 1 && acc == 2222) {
					// dbAcc1
					System.out.println("이체액 >>");
					int money = scan.nextInt();

					if (money <= 0 || money % 1000 != 0) {
						System.out.println("금액 오류");
						continue;
					}

					if (dbMoney1 < money) {
						System.out.println("[ 잔액 초과 ]");
						continue;
					}

					dbMoney1 -= money;
					dbMoney2 += money;

				} else if (log == 2 && acc == 1111) {
					// dbAcc2

					System.out.println("이체액 >>");
					int money = scan.nextInt();

					if (money <= 0 || money % 1000 != 0) {
						System.out.println("금액 오류");
						continue;
					}

					if (dbMoney2 < money) {
						System.out.println("[ 잔액 초과 ]");
						continue;
					}

					dbMoney2 -= money;
					dbMoney1 += money;

				} else {
					System.out.println("[ 본인 계좌는 이체 불가능 ]");
				}
			} else if (sel == 6 && log != -1) {
				// 조회
				if (log == 1) {
					// dbAcc1
					System.out.printf("[ 내 계좌 : %d원 상대계좌 %d원 ] \n", dbMoney1, dbMoney2);
				} else {
					// dbAcc2
					System.out.printf("[ 내 계좌 : %d원 상대계좌 %d원 ] \n", dbMoney2, dbMoney1);

				}
			} else if (sel == 0) {
				run = false;
				System.out.println("[ 프로그램 종료 ]");
			} else {
				System.out.println("[ 접근 오류 ]");
				if (log == -1) {
					System.out.println("로그인 후 이용 해주세요");
				} else {
					System.out.println("이미 로그인 상태입니다");
				}
			}

		}

	}

}
