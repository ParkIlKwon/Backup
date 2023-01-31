package 문자열ex;

import java.util.Scanner;

public class 장바구니관리자2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[][] items = new String[100][2];
		for (int i = 0; i < items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}

		int itemCount = 0;

		while (true) {
			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리"); // 카데고리 추가 삭제 구현
			System.out.println("[2]아 이 템  관리"); // 아이템 추가 삭제 구현
			System.out.println("[3]전체품목 출력");
			System.out.println("[0]프로그램 종료");

			System.out.print("* 번호입력 ==> ");
			int mainSel = sc.nextInt();

			if (mainSel == 1) {
				while (true) {
					System.out.println("[카테고리]");
					System.out.println("[1]카테고리 추가"); // 카데고리 추가 삭제 구현
					System.out.println("[2]카테고리 삭제");
					System.out.println("[0]뒤로가기");

					System.out.print("* 번호입력 ==> ");
					int cataSel = sc.nextInt();

					if (cataSel == 0) {
						break;
					} else if (cataSel == 1) {
						System.out.println("* 카테고리 이름을 입력해주세요");
						String cateName = sc.next();

						int pass = 0;
						for (int i = 0; i < itemCount; i++) { // (예외)이름 중복확인
							if (items[i][0].equals(cateName)) {
								System.out.println("중복된 카테고리가 있습니다.");
								pass = -1;
								break;
							}
						}
						if (pass == 0) { // 중복없을경우 카테고리 생성
							items[itemCount][0] = cateName;
							itemCount++;
							System.out.printf("[ %s ]카테고리가 생성 되었습니다.", cateName);
						}
					} else if (cataSel == 2) {
						if (itemCount == 0) { // (예외)카테고리가 없을경우 continue
							System.out.println("카테고리가 없습니다.");
							continue;
						}

						System.out.println("[ 전체 카테고리 ]"); // 카테고리 전체 보기 표시
						int count = 1; // 카테고리 앞 넘버 표시
						for (int i = 0; i < itemCount; i++) {
							System.out.printf("%2d. %s \n", count, items[i][0]);
							count++;
						}

						System.out.println("* 삭제할 카테고리 번호를 입력해주세요");
						int cateNum = sc.nextInt();
						if (cateNum > itemCount || cateNum < 1) { // (예외)카테고리 넘버가 맞지않을 경우
							System.out.println("카테고리 번호를 다시 확인해주세요");
							continue;
						}

						int del = 0;
						for (int i = 0; i < itemCount; i++) {
							if (i == cateNum - 1) { // 선택번호 건너뛰고 items 값 이동
								continue;
							}
							items[del] = items[i];
							del++;
						}
						items[itemCount][0] = ""; // 마지막 값 삭제 , itemcount 감소
						items[itemCount][1] = "";
						itemCount--;
						System.out.printf(" %d 번 카테고리를 삭제했습니다.", cateNum);
						continue;
					}
				}
			} else if (mainSel == 2) {
				while (true) {
					if (itemCount == 0) {
						System.out.println("[ 카테고리를 먼저 만들어 주세요 ]"); // (예외)카테고리 없을시
						break;
					}
					System.out.println("[아이템]");
					System.out.println("[1]아이템 추가"); // 아이템 추가 삭제 구현
					System.out.println("[2]아이템 삭제");
					System.out.println("[0]뒤로가기");

					System.out.print("* 번호입력 ==> ");
					int itemSel = sc.nextInt();

					if (itemSel == 0) {
						break;
					} else if (itemSel == 1) {
						while (true) {
							System.out.println("[ 전체 카테고리 ]"); // 카테고리 전체 보기 표시
							int count = 1; // 카테고리 앞 넘버 표시
							for (int i = 0; i < itemCount; i++) {
								System.out.printf("%2d. %s \n", count, items[i][0]);
								count++;
							}
							System.out.println("* 아이템을 추가할 카테고리를 선택해 주세요 ([0]뒤로가기)");
							int cateNum = sc.nextInt();
							if (cateNum == 0) {// 뒤로가기
								break;
							}
							if (cateNum > itemCount || cateNum < 1) { // (예외)카테고리 넘버가 맞지않을 경우
								System.out.println("카테고리 번호를 다시 확인해주세요");
								continue;
							}

							while (true) {
								System.out.printf("[ %s ]\n", items[cateNum - 1][0]);
								System.out.printf(" %s \n", items[cateNum - 1][1]);

								System.out.println("* 추가할 아이템 이름을 입력해주세요 ([0]뒤로가기)");
								String itemName = sc.next();

								if (itemName.equals("0")) {// 뒤로가기
									break;
								}

								int pass = 0;
								String itemList[] = items[cateNum - 1][1].split("/"); // 아이템리스트 분해
								for (int i = 0; i < itemList.length; i++) { // (예외)이름 중복확인
									if (itemList[i].equals(itemName)) {
										System.out.println("중복된 아이템이 있습니다.");
										pass = -1;
										break;
									}
								}
								if (pass == 0) { // 중복없을경우 아이템 생성
									items[cateNum - 1][1] += itemName + "/";
									System.out.printf("[ %s ]아이템이 생성 되었습니다. \n", itemName);
								}
							}
						}
					} else if (itemSel == 2) {
						System.out.println("[ 전체 카테고리 ]"); // 카테고리 전체 보기 표시
						int count = 1; // 카테고리 앞 넘버 표시
						for (int i = 0; i < itemCount; i++) {
							System.out.printf("%2d. %s \n", count, items[i][0]);
							count++;
						}
						System.out.println("* 아이템을 삭제할 카테고리를 선택해 주세요 ([0]뒤로가기)");
						int cateNum = sc.nextInt();
						if (cateNum > itemCount || cateNum < 1) { // (예외)카테고리 넘버가 맞지않을 경우
							System.out.println("카테고리 번호를 다시 확인해주세요");
							continue;
						}
						if (cateNum == 0) { // 뒤로가기
							break;
						}

						if (items[cateNum - 1][1].equals("")) { // (예외)아이템이 없을경우 continue
							System.out.println("아이템이 없습니다.");
							continue;
						}
						while (true) {
							System.out.printf("[ %s ]\n", items[cateNum - 1][0]);
							String itemList[] = items[cateNum - 1][1].split("/"); // 아이템리스트 분해
							int itemNum = 1;
							for (int i = 0; i < itemList.length; i++) { // 분해 출력
								System.out.printf("[%2d ] %s \n", itemNum, itemList[i]);
								itemNum++;
							}

							System.out.println("* 삭제할 아이템번호를 입력해주세요 ([0]뒤로가기)");
							int del = sc.nextInt();

							if (del == 0) { // 뒤로가기
								break;
							}

							if (del < 1 || del > itemList.length) {
								System.out.println("[ 아이템 번호를 다시 확인해주세요 ]");
								continue;
							}

							int delIdx = 0;
							for (int i = 0; i < itemList.length; i++) { // 이름 중복 확인
								if (i == del - 1) {
									continue;
								}
								itemList[delIdx] = itemList[i];
								delIdx++;
							}

							items[cateNum - 1][1] = "";
							for (int i = 0; i < itemList.length - 1; i++) {
								items[cateNum - 1][1] += itemList[i] + "/";
							}
							System.out.printf("%2d 번 아이템이 삭제 되었습니다. \n", itemNum);
							if (items[cateNum - 1][1].equals("")) {
								System.out.println("[ 카테고리에 삭제할 아이템이 없습니다 ]");  // 삭제 후 아이템이 없으면 브레이크
								break;
							}
						}
					}
				}
			} else if (mainSel == 3) {
				System.out.println("[ 전체 품목 출력 ]");
				int count = 1; // 카테고리 앞 넘버 표시
				for (int i = 0; i < itemCount; i++) {
					System.out.printf("%2d. %s : %s  \n", count, items[i][0], items[i][1]);
					count++;
				}

			} else if (mainSel == 0) {
				System.out.println(" 프로그램 종료 ");
				break;
			}
		}

	}

}
