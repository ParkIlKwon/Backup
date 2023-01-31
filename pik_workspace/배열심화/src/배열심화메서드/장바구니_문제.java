package ¹è¿­½ÉÈ­¸Þ¼­µå;


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
	
  void init(int size){
		itemList = new Item[size];
	}
	
  void addItem(Item item, int idx){
	  itemList[idx] = item;
  }
  void printitem() {
	  for (Item item : itemList) {
		System.out.println(item.itemName);
	}
  }
}

class User{
	int userNumber;
	String userName;
}

class UserDAO{
	User[] userList;
  void addUesr(User user){
	  
  }
}

class Cart{
	int userNumber;
	int itemNumber;;
}

class CartDAO{
  UserDAO udao;
	ItemDAO idao;
	Cart[] cartList;

	CartDAO(){
  UserDAO udao = new UserDAO();
	ItemDAO idao = new ItemDAO();
   }
  void addCart(Cart cart){}

void quiz1(){
	int[][] itemCnt = null;

 }

//void [][] quiz2(){
//	int[][] itemCnt = null;
//
// }

void run(){
		// itemData °´Ã¼ ¸¸µé±â idao.itemList ³Ö±â
		String itemData = "1001/°í·¡¹ä,1002/»õ¿ì±ø,1003/Ä­ÃÝ";
		String [] item = itemData.split(",");
		ItemDAO idao = new ItemDAO();
		idao.init(item.length);
		
		for (int i = 0; i < item.length; i++) {
			String info[] = item[i].split("/");
			Item it = new Item(Integer.parseInt(info[0]),info[1]);
			idao.addItem(it,i);
		}
		
		idao.printitem();
		
		String userData = "3001/ÀÌ¸¸¼ö,3002/±èÃ¶¹Î,3003/ÀÌ¿µÈñ";
		
		
		
		
		
		String cartData = "";
		cartData += "3001/1001\n";
		cartData += "3001/1001\n";
		cartData += "3003/1002\n";
		cartData += "3001/1001\n";
		cartData += "3001/1003\n";
		cartData += "3003/1002\n";
		cartData += "3003/1001\n";
		cartData += "3002/1001";
   
 // UserData °´Ã¼ ¸¸µé±â udao.userList ³Ö±â 
 // CartData °´Ã¼ ¸¸µé±â cartList ³Ö±â 
 // quiz1()
 // quiz2()
}
  
}


public class Àå¹Ù±¸´Ï_¹®Á¦ {
	public static void main(String[] args) {
	
		CartDAO cdao = new CartDAO();
		cdao.run();
		// [¹®Á¦1] È¸¿øº° ¾ÆÀÌÅÛ ±¸¸Å¸ñ·Ï Ãâ·Â 
		// [Á¤´ä1] ÀÌ¸¸¼ö==> °í·¡¹ä3,Ä­ÃÝ1 / ±èÃ¶¹Î ==> °í·¡¹ä1 / ÀÌ¿µÈñ ==> °í·¡¹ä1,»õ¿ì±ø2
		
		// [¹®Á¦2] ¾ÆÀÌÅÛº°·Î ±¸ÀÔÇÑ È¸¿øÀÌ¸§ Ãâ·Â 
		// [Á¤´ä2] °í·¡¹ä==> ÀÌ¸¸¼ö,±èÃ¶¹Î,ÀÌ¿µÈñ / »õ¿ì±ø==> ÀÌ¿µÈñ / Ä­ÃÝ==> ÀÌ¸¸¼ö
		
	}
}