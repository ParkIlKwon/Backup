package day10;

import java.util.Arrays;
import java.util.Scanner;

public class G_04ATM {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int MAX = 5;

		int[] arId = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX];
		int getId = 0; // 아이디 입력받을때 씀
		int getPw = 0; // 비밀번호 입력받을때
		int count = 0; // 회원가입된 회원수 체크
		int log = -1; // 로그인 상태 체크 , 로그인 정보 불러올때 쓰는 변수
		int getMoney = 0; // 입금,이체때 쓰는 변수

		String menu = "=== 그린 IT ATM ===\n";
		String menu2 = "=== 그린 IT ATM ===\n";
		menu += "1.회원가입\n3.로그인\n0.종료\n";
		menu2 += "1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n5.입금\n6.이체\n7.잔액조회\n0종료";

		while (true) {
			System.out.println("회원수: " + count);
			System.out.println("---------------");
			for (int i = 0; i < count; i++) {
				System.out.printf("%d : %d ( %d )\n", arId[i], arPw[i], arMoney[i]);

			}
			System.out.println();

			if (log == -1) {
				System.out.println("[ 접 속 자] : 없음");
				System.out.println(menu);
			} else {
				System.out.println("--------------------------");
				System.out.println("[ 접 속 자] : " + arId[log]);
				System.out.println("--------------------------");
				System.out.println(menu2);
			}
			int sel = scan.nextInt();
			if (log == -1 && (sel > 3 || sel == 2 || sel < 0)) {
				System.err.println("잘못된입력");
				continue;
			} else if (log != -1 && (sel == 2 || sel == 3)) {
				System.err.println("로그아웃을 먼저 진행하여 주시오.");
				continue;
			}
			if (sel < 0 || sel > 7) {
				System.err.println("잘못된입력");
				continue;
			}

			if (sel == 1) {
				int overlap = -1;
				if (count == MAX) {
					System.err.println("정보를 저장할 인덱스가 부족합니다.");
					continue;
				}
				System.out.println("회원가입할 아이디를 입력하세요.");
				getId = scan.nextInt();
				for (int i = 0; i < MAX; i++) {
					if (getId == arId[i]) {
						overlap = 1;
					}
				}
				if (overlap == 1) {
					System.out.println("아이디가 중복됩니다.");
					continue;
				}
				System.out.println("회원가입할 비밀번호를 입력하세요.");
				getPw = scan.nextInt();

				arId[count] = getId;
				arPw[count] = getPw;
				arMoney[count] = 1000;

				count++;
			} else if (sel == 0) {
				System.out.println("종료합니다.");
				break;
			} else if (sel == 2) {
				System.out.println("회원탈퇴할 아이디를 입력하시오.");
				int idx = 0;
				getId = scan.nextInt();
				for (int i = 0; i < MAX; i++) {
					if (getId == arId[i]) {
						idx = i;
					}
				}
				arId[idx] = 0;
				arPw[idx] = 0;
				arMoney[idx] = 0;
				count--;

			} else if (sel == 3) {
				if (count == 0) {
					System.err.println("회원가입된 정보가 없습니다.");
					continue;
				}
				System.out.println("로그인할 아이디를 입력해주세요.");
				getId = scan.nextInt();
				for (int i = 0; i < MAX; i++) {
					if (getId == arId[i]) {
						log = i;
					}
				}
				if (log == -1) {
					System.err.println("없는 아이디 입니다.");
					continue;
				}
				System.out.printf("사용자 %d 님의 비밀번호를 입력해주세요.", arId[log]);
				System.out.println();
				getPw = scan.nextInt();
				if (arPw[log] != getPw) {
					System.err.println("비밀번호 입력 오류");
					log = -1;
					continue;
				}
			} else if (sel == 4) {
				System.out.println("로그아웃 완료");
				log = -1;
			} else if (sel == 5) {
				while (true) {
					System.out.println("입금할 돈을 입력하세요.");
					getMoney = scan.nextInt();
					arMoney[log] += getMoney;
					if (getMoney < 1000) {
						System.err.println("1000원 이상의 금액을 입력");
						continue;
					}
					break;
				}
			} else if (sel == 6) {
				int to = 0; // 이체시 상대방 인덱스 담길 변수

				System.out.println("이체할 계좌번호를 입력하세요");
				int getNum = scan.nextInt();
				if (getNum == arId[log]) {
					System.err.println("자신계좌에는 돈을 보낼수 없습니다.");
					continue;
				}
				for (int i = 0; i < MAX; i++) {
					if (getNum == arId[i]) {
						to = i;
					}
				}
				if (to == 0) {
					System.err.println("저장되지 않은 계좌입니다.");
					continue;
				}
				System.out.println("송금할 금액을 입력하세요.");
				getMoney = scan.nextInt();
				if (getMoney > arMoney[log]) {
					System.err.println("잔액이 부족합니다.");
				}
				if (getMoney < 1000) {
					System.err.println("1000원 이상을 입력하여주세요.");
				}
				arMoney[log] -= getMoney;
				arMoney[to] += getMoney;

			} else if (sel == 7) {
				System.out.printf("사용자 %d 님의 잔액을 조회합니다 :  %d ", arId[log], arMoney[log]);
				System.out.println();
			}

		}

	}

}
