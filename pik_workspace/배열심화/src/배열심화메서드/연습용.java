package �迭��ȭ�޼���;

class Item2{
	int itemNumber;
	String itemName;
}

class ItemDAO2{
	Item2[] itemList;
	 
  void init(){
	  itemList = new Item2[3];
}
	 
  void addItem(Item2 item){
	 
	  
	  
	  
  }
}

public class ������ {

	public static void main(String[] args) {
		// itemData ��ü ����� idao.itemList �ֱ�
		String itemData = "1001/����,1002/�����,1003/ĭ��";
		String [] item = itemData.split(",");
		ItemDAO idao = new ItemDAO();
		
		for (String string : item) {
			
		}
		
		
		

	}

}
