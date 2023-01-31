package 클래스배열;

import java.util.Scanner;

class Page {
	int itemidx;
	int cnt;
	Scanner sc = new Scanner(System.in);
	// 삭제기능
	void page_delete(int itemSize, Item itemList[]) {

		page_print(itemSize, itemList, "삭제");

		for (int i = itemidx; i < itemSize - 1; i++) {
			itemList[i] = itemList[i + 1];
		}

	}

	// 쇼핑기능
	void page_shoping(int itemSize, Item itemList[], String id, Cart cartList[],
			int cartSize) {

		page_print(itemSize, itemList, "쇼핑");
		Cart cart = new Cart();
		cart.itemName = itemList[itemidx].name;
		cart.userId = id;

		cartList[cartSize] = cart;

	}

	// 장바구니 출력기능
	void showCart(Cart cartList[], Item itemList[], int cartSize, String id) {
		System.out.printf("현재 %s 님의 장바구니 다음과 같습니다.\n", id);
		int idx = 1;
		int total = 0;
		for (int i = 0; i < cartSize; i++) {
			if (cartList[i].userId.equals(id)) {
				System.out.printf("(%d) %s", idx, cartList[i].itemName);
				String name = cartList[i].itemName;
				idx++;
				for (int j = 0; j < itemList.length; j++) {
					if (name.equals(itemList[j].name)) {
						System.out.println("  " + itemList[j].price + " 원");
						total += itemList[j].price;
						break;
					}
				}
			}
		}
		if (total > 0) {
			System.out.println("=====================================");
			System.out.println(" 총 주문: " + total + " 원");
		}

	}

	// 목록출력
	void page_print(int itemSize, Item itemList[], String str) {
		int itemset = 4;
		int totalpage = itemSize / itemset;
		totalpage += itemSize % itemset != 0 ? 1 : 0;
		int page = 1;
		while (true) {
			int start = itemset * (page - 1);
			int end = start + itemset;
			int cursize = (itemSize - start) / itemset == 0
					? itemSize % itemset
					: itemset;
			for (int i = 0; i < cursize; i++) {
				System.out.printf("(%d)%-6s %-6s\n", i + 1,
						itemList[i + start].name, itemList[i + start].price);
			}
			System.out.printf("( %d / %d )", page, totalpage);
			System.out.println("[1]이전 [2]다음 [3]선택");

			int num = sc.nextInt();
			if (num == 1 && page != 1) {
				page--;
			} else if (num == 2 && page < totalpage) {
				page++;
			} else if (num == 3) {

				System.out.println(str + "하실 아이템의 번호를 입력하세요.");
				int nsel = sc.nextInt() - 1;
				if (nsel > 3 || nsel + start > itemSize - 1) {
					System.err.println("잘못입력하였습니다");
					continue;
				}

				itemidx = nsel + start;

				break;
			} else {
				System.err.println("잘못입력하셨습니다.");
			}
		}
	}

	// 회원가입
	void sign_in(User userList[], int userSize) {
		while (true) {
			System.out.println("가입하실 아이디를 입력하여주세요.");
			String id = sc.next();
			boolean dupl = false;
			for (int i = 0; i < userSize; i++) {
				if (userList[i].id.equals(id)) {
					dupl = true;
					break;
				}
			}
			if (dupl) {
				System.err.println("아이디가 겹칩니다.");
				continue;
			}
			userList[userSize] = new User();
			userList[userSize].id = id;
			break;
		}
	}

	// 탈퇴
	void sign_out(User userList[], Cart cartList[], String id, int cartSize) {
		cnt = 0;
		System.out.printf("[ %s ]님 회원탈퇴완료.\n", id);
		for (int i = 0; i < cartSize; i++) {
			if (cartList[i].userId.equals(id)) {
				cartList[i] = cartList[i + 1];
				cnt++;
			}
		}

	}
}

public class 클배_장바구니2단계삭제 {

	public static void main(String[] args) {

		String[] userIdList = {"admin", "bbb", "ccc"};

		String[] itemNameList = {"사과", "칸초", "귤", "감", "딸기"};
		int[] itemPriceList = {10000, 2000, 6500, 3300, 400};

		int max = 1000;
		User[] userList = new User[max];
		int userSize = 0;
		for (int i = 0; i < userIdList.length; i++) {
			userList[i] = new User();
			userList[i].id = userIdList[i];
			userSize += 1;
		}
		
		Item[] itemList = new Item[max];
		int itemSize = 0;
		for (int i = 0; i < itemNameList.length; i++) {
			itemList[i] = new Item();
			itemList[i].name = itemNameList[i];
			itemList[i].price = itemPriceList[i];
			itemSize += 1;
		}

		Cart[] cartList = new Cart[max];
		int cartSize = 0;

		Page p = new Page();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("[0] 종료 [1] 로그인 [2] 회원가입 ");
			int sel = sc.nextInt();
			if (sel == 0) {
				break;
			} else if (sel == 1) {
				System.out.println("[로그인] 아이디 입력 : ");
				String id = sc.next();

				boolean idCheck = false;
				for (int i = 0; i < userSize; i++) {
					if (id.equals(userList[i].id)) {
						idCheck = true;
					}
				}

				if (idCheck == false) {
					System.out.println("[로그인실패]");
					continue;
				}

				if (id.equals("admin")) {
					while (true) {
						for (int i = 0; i < itemSize; i++) {
							System.out.println(itemList[i].name + " : "
									+ itemList[i].price);

						}

						System.out.println("[관리자메뉴]");
						System.out.println("[0] 로그아웃 [1] 아이템 추가 [2] 아이템 삭제");
						sel = sc.nextInt();
						if (sel == 0) {
							break;
						} else if (sel == 1) {
							Item item = new Item();
							System.out.println("추가할 아이템 이름을 입력하세요.");
							String str = sc.next();
							System.out.println("추가할 아이템의 가격을 입력하세요.");
							int price = sc.nextInt();
							item.name = str;
							item.price = price;
							itemList[itemSize] = item;
							System.out.println("추가완료.");
							itemSize++;
						} else if (sel == 2 && itemSize != 0) {

							p.page_delete(itemSize, itemList);

							itemSize--;
						} else {
							System.err.println("잘못된 입력. :U");
						}
					}

				} else {
					while (true) {
						System.out.println("[" + id + " 로그인]");
						System.out.println("[쇼핑메뉴]");

						System.out.println("[0] 로그아웃 [1] 쇼핑 [2] 주문확인 [3] 탈퇴");
						sel = sc.nextInt();
						if (sel == 0) {
							break;
						} else if (sel == 1) {
							while (true) {
								System.out.println("[1] 뒤로가기 [2] 쇼핑하기");
								sel = sc.nextInt();
								if (sel == 1) {
									break;
								} else if (sel == 2) {
									while (true) {
										p.page_shoping(itemSize, itemList, id,
												cartList, cartSize);
										cartSize++;

										System.out.println(
												"쇼핑을 계속하시겠습니까 ? 종료하려면 1. 계속하려면 1 제외 수 ");
										sel = sc.nextInt();

										if (sel == 1) {
											break;
										}

									}

								} else {
									System.err.println("입력오류");
								}

							}

						} else if (sel == 2) {
							p.showCart(cartList, itemList, cartSize, id);
						} else if (sel == 3) {
							System.out.println(cartSize);
							p.sign_out(userList, cartList, id, cartSize);
							cartSize -= p.cnt;
							break;
						} else {
							System.err.println("잘못된 입력 :<");
						}
					}
				}
			} else if (sel == 2) {
				p.sign_in(userList, userSize);
				userSize++;

			}

		}

	}

}
