package �迭��ȭ�޼���;


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
		// itemData ��ü ����� idao.itemList �ֱ�
		String itemData = "1001/����,1002/�����,1003/ĭ��";
		String [] item = itemData.split(",");
		ItemDAO idao = new ItemDAO();
		idao.init(item.length);
		
		for (int i = 0; i < item.length; i++) {
			String info[] = item[i].split("/");
			Item it = new Item(Integer.parseInt(info[0]),info[1]);
			idao.addItem(it,i);
		}
		
		idao.printitem();
		
		String userData = "3001/�̸���,3002/��ö��,3003/�̿���";
		
		
		
		
		
		String cartData = "";
		cartData += "3001/1001\n";
		cartData += "3001/1001\n";
		cartData += "3003/1002\n";
		cartData += "3001/1001\n";
		cartData += "3001/1003\n";
		cartData += "3003/1002\n";
		cartData += "3003/1001\n";
		cartData += "3002/1001";
   
 // UserData ��ü ����� udao.userList �ֱ� 
 // CartData ��ü ����� cartList �ֱ� 
 // quiz1()
 // quiz2()
}
  
}


public class ��ٱ���_���� {
	public static void main(String[] args) {
	
		CartDAO cdao = new CartDAO();
		cdao.run();
		// [����1] ȸ���� ������ ���Ÿ�� ��� 
		// [����1] �̸���==> ����3,ĭ��1 / ��ö�� ==> ����1 / �̿��� ==> ����1,�����2
		
		// [����2] �����ۺ��� ������ ȸ���̸� ��� 
		// [����2] ����==> �̸���,��ö��,�̿��� / �����==> �̿��� / ĭ��==> �̸���
		
	}
}