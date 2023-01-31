package todayC;

import java.util.Arrays;

class Item {
	int itemNumber;
	String itemName;
	
	
}

class ItemDAO {
	Item[] itemList;
	
	void addItem() {
		String itemData = "1001/고래밥,1002/새우깡,1003/칸쵸";
		String arr [] = itemData.split(",");
		itemList = new Item[arr.length];
		
		for (int i = 0; i < itemList.length; i++) {
			String temp[] = arr[i].split("/");
			itemList[i] = new Item();
			itemList[i].itemName = temp[1];
			itemList[i].itemNumber = Integer.parseInt(temp[0]);
		}
	}
}

class User {
	int userNumber;
	String userName;
	
}

class UserDAO {
	User[] userList;
	
	void addUser() {
		String userData = "3001/이만수,3002/김철민,3003/이영희";
		String arr [] = userData.split(",");
		userList = new User[arr.length];
		
		for (int i = 0; i < userList.length; i++) {
			String temp[] = arr[i].split("/");
			userList[i] = new User();
			userList[i].userName = temp[1];
			userList[i].userNumber = Integer.parseInt(temp[0]);
		}
	}
	
	
}

class Cart {
	int userNumber;
	int itemNumber;
}

class CartDAO {
	Cart[] cartList;
	
	void addCart() {
		String cartData = "";
		cartData += "3001/1001\n";
		cartData += "3001/1001\n";
		cartData += "3003/1002\n";
		cartData += "3001/1001\n";
		cartData += "3001/1003\n";
		cartData += "3003/1002\n";
		cartData += "3003/1001\n";
		cartData += "3002/1001";
		
		String carr [] = cartData.split("\n");
		CartDAO usercart[] = new CartDAO [carr.length];		
		cartList = new Cart[carr.length];
		
		for (int i = 0; i < usercart.length; i++) {
			String temp[] = carr[i].split("/");
			cartList[i] = new Cart();
			cartList[i].itemNumber = Integer.parseInt(temp[1]) ;
			cartList[i].userNumber = Integer.parseInt(temp[0]);	
		}
	}
	
}

class totalDAO{
	CartDAO cart = new CartDAO();
	ItemDAO item = new ItemDAO();
	UserDAO user = new UserDAO();
	
	void init(){
		cart.addCart();
		item.addItem();
		user.addUser();
	}
	
	void print(){
		
		for (int i = 0; i < cart.cartList.length; i++) {
			System.out.print(cart.cartList[i].itemNumber + " ");
			System.out.println(cart.cartList[i].userNumber);
	}
		
		System.out.println("=============================");
		
		for (int i = 0; i < item.itemList.length; i++) {
			System.out.print(item.itemList[i].itemNumber + " ");
			System.out.println(item.itemList[i].itemName);
	}
		
		System.out.println("=============================");
		
		for (int i = 0; i < user.userList.length; i++) {
			System.out.print(user.userList[i].userNumber + " ");
			System.out.println(user.userList[i].userNumber);
	}
		System.out.println("=============================");
		
	}
	
	void solutionA() {
		
		// [문제1] 회원별 아이템 구매목록 출력 
		// [정답1] 이만수==> 고래밥3,칸쵸1 / 김철민 ==> 고래밥1 / 이영희 ==> 고래밥1,새우깡2
		
		for (int i = 0; i < user.userList.length; i++) {
			System.out.println(user.userList[i].userName);
			for (int k = 0; k < item.itemList.length; k++) {
				int cnt = 0;
				
				for (int j = 0; j < cart.cartList.length; j++) {
					if (user.userList[i].userNumber == cart.cartList[j].userNumber 
							&& item.itemList[k].itemNumber == cart.cartList[j].itemNumber) {
						cnt ++;
					}
				}
				
				if (cnt != 0) {
					System.out.printf("%-4s" , item.itemList[k].itemName);
					System.out.println(cnt);
				}
			}
			System.out.println();
		}
		System.out.println("=============================");
	}
	
	void solutionB() {

		// [문제2] 아이템별로 구입한 회원이름 출력 
		// [정답2] 고래밥==> 이만수,김철민,이영희 / 새우깡==> 이영희 / 칸쵸==> 이만수
		
		for (int i = 0; i < item.itemList.length; i++) {
			System.out.println(item.itemList[i].itemName);
			
			for (int j = 0; j < user.userList.length; j++) {
				for (int k = 0; k < cart.cartList.length; k++) {
					if ((user.userList[j].userNumber == cart.cartList[k].userNumber)
						&& (item.itemList[i].itemNumber == cart.cartList[k].itemNumber)	 ) {
						System.out.println(user.userList[j].userName);
						break;
					}
				}
			}
			
				System.out.println();
		}
	}
}


public class J2_장바구니_문제 {
	public static void main(String[] args) {
		
		totalDAO total = new totalDAO();
		total.init();
		total.print();
		total.solutionA(); // 1번문제
		total.solutionB(); // 2번문제
		
	
		// [문제2] 아이템별로 구입한 회원이름 출력 
		// [정답2] 고래밥==> 이만수,김철민,이영희 / 새우깡==> 이영희 / 칸쵸==> 이만수
		
	}
}
		