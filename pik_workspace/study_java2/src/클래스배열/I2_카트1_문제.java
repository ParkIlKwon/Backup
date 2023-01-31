package 클래스배열;

import java.util.Arrays;

class User{
		String id;
	}
	
	class Item{
		String name;
		int price;
	}
	
	class Cart{
		String userId;
		String itemName;
	}

public class I2_카트1_문제 {
	public static void main(String[] args) {
		
		String data1 = "qwer/asdf/zxcv"; String tdata1[] = data1.split("/");
		String data2 = "새우깡,1200/감자깡,3200/고구마깡,2100"; String tdata2[] = data2.split("/");
		String data3 = "qwer,새우깡/qwer,고구마깡/asdf,감자깡/qwer,새우깡/zxcv,새우깡"; String tdata3[] = data3.split("/");
		User[] userList = new User[tdata1.length];
		Item[] itemList = new Item[tdata2.length];
		Cart[] cartList = new Cart[tdata3.length];
		
		for (int i = 0; i < tdata2.length; i++) {
			User u = new User();
			Item it = new Item();
			u.id = tdata1[i];
			String tarr [] = new String [2]; tarr = tdata2[i].split(",");
			it.name = tarr[0];
			it.price = Integer.parseInt(tarr[1]);
			userList[i] = u ;
			itemList[i] = it;
		}
		for (int i = 0; i < cartList.length; i++) {
			String tarr [] = new String [2]; tarr = tdata3[i].split(",");
			Cart cart = new Cart();
			cart.userId = tarr[0];
			cart.itemName = tarr[1];
			cartList[i] = cart;
		}
		for (User user : userList) {
			System.out.println(user.id);
		}
		System.out.println("===============");
		for (Item item : itemList) {
			System.out.print(item.name);
			System.out.println(item.price);
		}
		System.out.println("===============");
		for (Cart cart : cartList) {
			System.out.print(cart.userId);
			System.out.println(cart.itemName);
		}
		System.out.println("===============");
		int arr [] = new int [tdata1.length];
	
		// [문제] 문자열을 각각의 클래스배열에 저장하고, 회원별로 구매한 상품 총 금액을 출력하시오.
		// [정답] qwer(4500), asdf(3200), zxcv(1200)
		
		for (int i = 0; i < userList.length; i++) {
			for (int k = 0; k < cartList.length; k++) {
				if (userList[i].id.equals(cartList[k].userId)) {
					for (int j = 0; j < itemList.length; j++) {
						if (cartList[k].itemName.equals(itemList[j].name)) {
						  arr[i] += itemList[j].price; 
						}
					}
				}
				
				
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("(%-4s)  %-4s\n",tdata1[i],arr[i]);

		}
//		System.out.println("qwer   asdf    zxcv");
//		System.out.println(Arrays.toString(arr));
//
		
		
		
		
		
	}
}