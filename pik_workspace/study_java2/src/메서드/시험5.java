package 메서드;

import java.util.Arrays;
import java.util.Scanner;

	class User {
		String id;
	}
	class Seat {
		int y;
		int x;
		String userId;
		boolean check;
		int price;
	}

public class 시험5 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
	
			int seatPrice = 12000;
	
			String[] userIdList = {"aaa", "bbb", "ccc"};
			String[][] seatUserIdList = {{null, "aaa", "aaa", null},
					{null, null, "bbb", null}, {"ccc", "bbb", null, "bbb"}};
	
			int seatSize = 12;
			User[] userList = null;
			Seat[] seatList = new Seat[seatSize];
			int idx = 0;
	
			for (int i = 0; i < seatUserIdList.length; i++) {
				for (int k = 0; k < seatUserIdList[i].length; k++) {
					seatList[idx] = new Seat();
					seatList[idx].userId = seatUserIdList[i][k];
					seatList[idx].y = i;
					seatList[idx].x = k;
					seatList[idx].check = seatUserIdList[i][k] != null
							? true
							: false;
	
					idx++;
				}
			}
	
			// for (int i = 0; i < seatList.length; i++) {
			//
			// System.out.print(seatList[i].userId + " ");
			// System.out.print(seatList[i].y);
			// System.out.print(seatList[i].x + " ");
			// System.out.print(seatList[i].check + " "); //값전달 확인용도.
			// if (i % 4 == 3 ) {
			// System.out.println();
			// }
			// }
	
			while (true) {
				System.out.println(
						"[0] 종료\n" + "[1] 전체출력\n" + "[2] 회원 aaa가 예약한 자리와 요금출력\n"
								+ "[3] 예약가능한자리 위치출력 \n" + "[4] 예약을 가장많이한 회원출력");
				int sel = sc.nextInt();
				if (sel == 0) {
					break;
				} else if (sel == 1) {
					System.out.println("===[좌석예매]===");
					for (int i = 0; i < seatSize; i++) {
						if (seatList[i].check) {
							System.out.printf("[%5s]", seatList[i].userId);
						} else {
							System.out.printf("[%5s]", "");
						}
						if (i % 4 == 3) {
							System.out.println();
						}
					}
				} else if (sel == 2) {
					int total = 0;
					String input = "aaa";
					System.out.printf("회원 [ %s ]님이 예약한 자리와 요금 출력합니다\n", input);
					for (int i = 0; i < seatSize; i++) {
						if (seatList[i].check) {
							if (seatList[i].userId.equals(input)) {
								System.out.printf("[%5s]", seatList[i].userId);
								total += seatPrice;
							} else {
								System.out.printf("[%5s]", "X");
							}
						} else {
							System.out.printf("[%5s]", "");
						}
						if (i % 4 == 3) {
							System.out.println();
						}
					}
					System.out.printf("\n총요금은 : %d 원입니다.\n ", total);
	
				} else if (sel == 3) {
					for (int i = 0; i < seatSize; i++) {
						if (seatList[i].check) {
							System.out.printf("[%5s]", "X");
						} else {
							System.out.printf("[%5s]", "O");
						}
						if (i % 4 == 3) {
							System.out.println();
						}
					}
	
					System.out.println("예약가능한 좌석번호: ");
					for (int i = 0; i < seatSize; i++) {
						if (seatList[i].check == false) {
							System.out.printf("%-5d", i + 1);
						}
					}
					System.out.println();
	
				} else if (sel == 4) {
					System.out.println("예약을 가장많이한 회원 출력.");
					System.out.println("========================");
					int cnt[] = new int[userIdList.length];
	
					for (int i = 0; i < userIdList.length; i++) {
						for (int j = 0; j < seatSize; j++) {
							if (seatList[j].check) {
								if (userIdList[i].equals(seatList[j].userId)) {
									cnt[i]++;
								}
							}
						}
					}
					idx = 0;
					int max = 0;
					for (int i = 0; i < cnt.length; i++) {
						if (max < cnt[i]) {
							idx = i;
							max = cnt[i];
						}
					}
	
					System.out.printf("가장많이 예약을 한 회원 : %s  회원.\n", userIdList[idx]);
	
				} else {
					System.err.println("잘못된 입력 :(");
				}
	
			}

	}

}
