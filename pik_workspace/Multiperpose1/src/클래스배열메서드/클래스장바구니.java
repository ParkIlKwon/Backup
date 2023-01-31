package 클래스배열메서드;

class Item{
		int itemNumber;
		String itemName;
		
		public Item(int itemNumber, String itemName) {
			super();
			this.itemNumber = itemNumber;
			this.itemName = itemName;
		}
	}
	
	class ItemDAO{
		Item[] itemList;

		public ItemDAO(Item[] itemList) {
			super();
			this.itemList = itemList;
		}
		
		void addItem() {
			
			String itemData = "1001/고래밥,1002/새우깡,1003/칸쵸";
			String [] item = itemData.split(",");
			
			
			
			
		}
	}
	
	class User{
		int userNumber;
		String userName;
		
		public User(int userNumber, String userName) {
			super();
			this.userNumber = userNumber;
			this.userName = userName;
		}
	}
	
	class UserDAO{
		User[] userList;

		public UserDAO(User[] userList) {
			super();
			this.userList = userList;
		}
	void addUser() {
			
		}
	}
	
	class Cart{
		int userNumber;
		int itemNumber;
		
		public Cart(int userNumber, int itemNumber) {
			super();
			this.userNumber = userNumber;
			this.itemNumber = itemNumber;
		}
	}
	
	class CartDAO{
		Cart[] cartList;
	
		public CartDAO(Cart[] cartList) {
			super();
			this.cartList = cartList;
		}
	void addCart() {
			
		}
	}

	class totalDAO{
		
		void init(){

			String itemData = "1001/고래밥,1002/새우깡,1003/칸쵸";
			String [] item = itemData.split(",");
			ItemDAO [] ilist = new ItemDAO[item.length];
			
			for (int i = 0; i < ilist.length; i++) {
				String info[] = item[i].split("/");
				Item it[] = new Item[1];
				it[0] = new Item(Integer.parseInt(info[0]),info[1]);
				ilist[i] = new ItemDAO(it);
				System.out.println(ilist[i].itemList[0].itemNumber+ "   " + ilist[i].itemList[0].itemName );
			}
			
			System.out.println("=================================");
			
			String userData = "3001/이만수,3002/김철민,3003/이영희";
			String [] user = userData.split(",");
			UserDAO [] ulist = new UserDAO[item.length];
			
			for (int i = 0; i < ulist.length; i++) {
				String info[] = user[i].split("/");
				User us[] = new User[1];
				us[0] = new User(Integer.parseInt(info[0]),info[1]);
				ulist[i] = new UserDAO(us);
				System.out.println(ulist[i].userList[0].userNumber+ "   " + ulist[i].userList[0].userName );
			}
			
			System.out.println("=================================");
			
			String cartData = "";
			cartData += "3001/1001\n";
			cartData += "3001/1001\n";
			cartData += "3003/1002\n";
			cartData += "3001/1001\n";
			cartData += "3001/1003\n";
			cartData += "3003/1002\n";
			cartData += "3003/1001\n";
			cartData += "3002/1001";
			String [] cart = cartData.split("\n");
			CartDAO [] clist = new CartDAO[cart.length];
			
			for (int i = 0; i < clist.length; i++) {
				String info[] = cart[i].split("/");
				Cart ca[] = new Cart[1];
				ca[0] = new Cart(Integer.parseInt(info[0]),Integer.parseInt(info[1]));
				clist[i] = new CartDAO(ca);
				System.out.println(clist[i].cartList[0].userNumber+ "   " + clist[i].cartList[0].itemNumber);
			}
			
			System.out.println("=======================================");
			
			for (UserDAO users : ulist) {
				System.out.print(users.userList[0].userName + "===>");
				for (ItemDAO items : ilist) {
					solutionA(users.userList[0].userNumber, items.itemList[0].itemNumber, clist,items.itemList[0].itemName);
				}System.out.println();
			}
			System.out.println("=======================================");
			
			for (ItemDAO items : ilist) {
				System.out.println(items.itemList[0].itemName + "===>");
				for (UserDAO users : ulist) {
					if (solutionB(items.itemList[0].itemNumber , users.userList[0].userNumber,
							clist)) {
						System.out.print(users.userList[0].userName);
					}
				}System.out.println();
			}
			
		}
		
		// [문제1] 회원별 아이템 구매목록 출력 
		// [정답1] 이만수==> 고래밥3,칸쵸1 / 김철민 ==> 고래밥1 / 이영희 ==> 고래밥1,새우깡2
		void solutionA(int userid,int itemid,CartDAO[] cart , String itname){
			int cnt = 0;
			
			for (int i = 0; i < cart.length; i++) {
				if (userid == cart[i].cartList[0].userNumber && itemid == cart[i].cartList[0].itemNumber ) {
					cnt++;
				}
			}
				if (cnt != 0) {
					System.out.print(itname+" ");
					System.out.print(cnt+ " ");
				}
		}
		// [문제2] 아이템별로 구입한 회원이름 출력 
		// [정답2] 고래밥==> 이만수,김철민,이영희 / 새우깡==> 이영희 / 칸쵸==> 이만수
		boolean solutionB(int item, int user, CartDAO[] cart ) {
			for (int i = 0; i < cart.length; i++) {
				if (user == cart[i].cartList[0].userNumber && item == cart[i].cartList[0].itemNumber) {
					return true;
				}
			}
			return false;
		}
		
		void run(){
			init();
			
		}
	}
		

public class 클래스장바구니 {

	public static void main(String[] args) {
		totalDAO DAO = new totalDAO();
		DAO.run();
		
		
	}

}
