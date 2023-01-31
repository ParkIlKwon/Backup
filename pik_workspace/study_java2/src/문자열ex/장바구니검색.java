package 문자열ex;

import java.util.Arrays;

public class 장바구니검색 {

	public static void main(String[] args) {

String itemData = "1001/고래밥,1002/새우깡,1003/칸쵸";
		
		String userData = "3001/이만수,3002/김철민,3003/이영희";
		
		String cartData = "";
		cartData += "3001/1001\n";
		cartData += "3001/1001\n";
		cartData += "3003/1002\n";
		cartData += "3001/1001\n";
		cartData += "3001/1003\n";
		cartData += "3003/1002\n";
		cartData += "3003/1001\n";
		cartData += "3002/1001";
		
		String arr[] = cartData.split("\n");
		String uarr[] =  userData.split(",");
		String iarr[] =  itemData.split(",");
		
		System.out.println();
		
		int cnt [][] = new int [3][3];
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(uarr));
		System.out.println(Arrays.toString(iarr));
		
		
		for (int i = 0; i < arr.length; i++) {
			int idx = Integer.parseInt(arr[i].substring(0,4)); 
			for (int k = 0; k < cnt.length; k++) {
				if (idx == Integer.parseInt(uarr[k].substring(0,4))) {
					for (int j = 0; j < cnt.length; j++) {
						if(Integer.parseInt(arr[i].substring(5, 9)) ==Integer.parseInt(iarr[j].substring(0, 4)) ) {
							cnt[k][j] ++;
						}

					}

				}
			}


		}
		
		System.out.println("===아이템 목록===");
		for (int i = 0; i < cnt.length; i++) {
			System.out.println(iarr[i]);
		}
		System.out.println("===유저 목록===");
		for (int i = 0; i < cnt.length; i++) {
			System.out.println(uarr[i]);
		}
		System.out.println("===장바구니 목록===");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println();
		
		for (int i = 0; i < cnt.length; i++) {
			System.out.printf("%3s(",uarr[i].substring(5,uarr[i].length()));
			for (int k = 0; k < cnt.length; k++) {
				if (cnt[i][k] != 0) {
					System.out.printf("%4s %3s",iarr[k].subSequence(5,iarr[k].length()),cnt[i][k]);
				}
			}
			System.out.println(")");
			
		}
		
		for (int i = 0; i < cnt.length; i++) {
			System.out.printf("%3s(",iarr[i].substring(5,iarr[i].length()));
			for (int k = 0; k < cnt[i].length; k++) {
				if(cnt[k][i] != 0) {
					System.out.printf("%3s ",uarr[k].substring(5, uarr[k].length()));
				}
				
				
			}
			System.out.println(")");
			
		}
		
		
		
		
	}

}
