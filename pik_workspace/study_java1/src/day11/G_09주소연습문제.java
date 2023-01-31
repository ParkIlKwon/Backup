package day11;

import java.util.Arrays;

public class G_09주소연습문제 {

	public static void main(String[] args) {
		/*

		가장 많은 갯수 출력 : 3 ===> 5개 
		가장 적은 갯수 출력 : 100 ===> 1개
	 */
	    int [] a = {1,1,3,3,3,100,2,2,3,1,3};
	    int cnt = 0;
	    int idx = 0 ;
	    int [] num = new int[a.length]; // 중복 제거 배열 
	    int arr[][] = new int[a.length][2]; 	// arr[0][0] => 중복 제거된 숫자 
	    													//   arr[0][1] => 중복 제거된 숫자의 갯수
		

		for (int i = 0; i < a.length; i++) {
			int check = -1;
			for (int k = 0; k < cnt; k++) {
				if (a[i] == num[k]) {
					check = 1;
					break;
				}
			}
      
			if (check == -1) {
				num[cnt] = a[i];
				cnt++;
			}
		}
	    
	
	    System.out.println(Arrays.toString(num));
	    
	    for(int i = 0 ; i < num.length ; i ++) {
	    	arr[i][0] = num[i];
	    	 for(int k = 0 ; k < a.length ; k ++) {
	    		 if(num[i] == a[k]) {
	    			
	    	    	 arr[i][1] += 1;
	    		 }
	    		 
	    	 }
	
	    }
	    
	    for(int i = 0 ; i < arr.length ; i++) {
	    	System.err.println(Arrays.toString(arr[i]));
	    }
	    
		

	}

}








