package 문자열ex;

public class 장바구니삭제2 {

	public static void main(String[] args) {
		String item = "칸초/새우깡/고래밥/콜라/사이다";
		String id = "qwer/abcd/java";
		
		String cart = "";
		cart += "qwer/고래밥\n";
		cart += "qwer/새우깡\n";
		cart += "abcd/콜라\n";
		cart += "java/칸쵸\n";
		cart += "qwer/칸쵸\n";
		cart += "java/고래밥\n";
		cart += "abcd/사이다";
		
		String[][] input = {
			{"qwer" , "3"}, 
			{"abcd" , "1"}
		};
		
		String [] iarr = item.split("/");
		String [] idarr = id.split("/");
		String [] temp = cart.split("\n");
		String [][]carr = new String[temp.length][2];
		int [] cnt = new int [idarr.length];
		for (int i = 0; i < temp.length; i++) {
			carr[i] = temp[i].split("/");
			
		}
		
		int idx=0;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
