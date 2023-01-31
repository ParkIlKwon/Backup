package study_java3;

import java.util.Arrays;

class sum{
	int [] arr = {1};
	
	void b() {
		arr[0] ++;
	}
	
	void a(){
		arr[0]++;
	}
	
	
}



public class 배열연습 {

	public static void main(String[] args) {
		
		int arr[][] = new int [3][3];
		int temp[][] = new int [3][3];
		int idx = 1;
		
		sum s = new sum();
		s.b();
		s.a();
		System.out.println(s.arr[0]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 00 -> 02 ; 01 -> 12 ;  02 -> 22 
		// 10 -> 01 ; 11 -> 11 ;  12 -> 21
		// 20 -> 00 ; 
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int k = 0; k < arr[i].length; k++) {
//				arr[i][k] = idx;
//				temp[i][k] = idx;
//				idx++;
//			}
//		}
//		
//		
//		for (int i = 0; i < arr.length; i++) {
//			int index = 2;
//			for (int k = 0; k < arr.length; k++) {
//			arr[k][i] = temp[i][index] ;
//			index--;
//			}
//		}
//		
//		
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
