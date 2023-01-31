package 클래스;

import java.util.Arrays;
import java.util.Scanner;

class Sample02 {
	int[] arr = {10, 20, 30, 40, 50};
}

public class 클래스메모리그림2 {

	public static void main(String[] args) {


				
				int[] arr = {1, 2, 3, 4, 5}; // new int[5]
				
				Sample02 s4 = new Sample02();
				Scanner sc = new Scanner(System.in);
				sc = null;
				int num = sc.nextInt();
				
				System.out.println(Arrays.toString(s4.arr));
				
				Sample02 temp = s4;
				s4 = null;    //얘가 null 이라서 

			//	s4.arr = arr;	
			
		
		
		
		
		
	}

}
