import java.util.Arrays;
import java.util.Random;

public class D_06·£´ıÇĞ»ı {
	public static void main(String[] args) {
		   int[] arr3 = {1,2,3,1,2,3};
			int[] arr4 = {3,2,1,3,2,1};
		int cnt = 0 ;
	 	
	 	for(int i = 0 ; i  < arr3.length ; i++) {
	 		for (int j = 0; j < arr4.length; j++) {
	 		
				if(arr3[i] == arr4[j]) {
				
					arr4[j] = 0;
					cnt ++;
					break;
				}
	 			
			}
	 		System.out.println(Arrays.toString(arr4));
	 	}
	System.out.println(cnt);
		
		System.out.println(cnt == arr3.length ? "true":"false");
	}

}
