package ¹è¿­½ÉÈ­¸Þ¼­µå;

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

public class ¿¬½À¿ë {

	public static void main(String[] args) {
		// itemData °´Ã¼ ¸¸µé±â idao.itemList ³Ö±â
		String itemData = "1001/°í·¡¹ä,1002/»õ¿ì±ø,1003/Ä­ÃÝ";
		String [] item = itemData.split(",");
		ItemDAO idao = new ItemDAO();
		
		for (String string : item) {
			
		}
		
		
		

	}

}
