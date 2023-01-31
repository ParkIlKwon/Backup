package 문자열ex;

import java.util.Arrays;

public class 장바구니삭제 {

	public static void main(String[] args) {

		/*
		[문제]
			cart데이터는 현재 장바구니 상황이다.
			
			input데이터는 삭제를 요청한 데이터이다.
			qwer은 아이디이고, 3은 삭제할 위치이다.
			qwer 입장에서는 본인 아이템은 3개 밖에 없으니
			칸쵸를 지우기 위해 3을 선택했지만 전체 데이터에서는 5번째 아이템이다.
			
			마찬가지로 abcd는 콜라와 사이다를 구입했고,
			콜라를 지우기 위해 1번을 선택했지만
			실제로는 3번 아이템이 삭제되어야 한다.
			
			삭제 후 cart배열의 정보를 출력하시오.
		[정답]
			qwer/고래밥
			qwer/새우깡
			java/칸쵸
			java/고래밥
			abcd/사이다		
	 */

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
			
			for (int i = 0; i < input.length; i++) {
				
				for (int k = 0; k < carr.length; k++) {
					if (input[i][0].equals(carr[k][0])) {
						for (int j = 0; j < idarr.length; j++) {
							if (idarr[j].equals(input[i][0])) {
								cnt[j] ++;
								if (cnt[j] == Integer.parseInt(input[i][1])) {
									carr[k][0] = null;
								}
							}
						}
					}
					
				}
				
			}
			
			

			String str [][] = new String [carr.length-2][2];
			System.out.println("삭제후 데이터");
			for (int i = 0; i < carr.length; i++) {
				boolean chk = false;
			
					if (carr[i][0] != null) {
						chk = true;
					}
				if(chk) {
					str [idx] = carr[i];
					idx++;
				}
				
			}
			
			for (int i = 0; i < str.length; i++) {
				System.out.println(Arrays.toString(str[i]));
				
			}
			
			
		
		
		
	}

}
