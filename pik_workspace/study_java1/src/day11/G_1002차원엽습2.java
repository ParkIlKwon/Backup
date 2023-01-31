package day11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class G_1002Â÷¿ø¿±½À2 {
	public static void main(String[] args) {
		
			Random rd = new Random() ;
	    	int[] lot1 = { 0, 0, 7, 7, 7, 0, 7, 7 }; 
			int[] lot2 = {7, 0, 7, 7, 0, 7, 0, 7}; 
			int[] lot3 = new int[lot1.length]; // 0 7
			
			for(int i = 0 ; i < lot3.length ; i++) {
				int num = rd.nextInt(2)+1;
				if(num == 1) {
					lot3[i] = 0;
				}else {
					lot3[i] =7;
				}
				
			}
			
			int[][]Set = {lot1, lot2, lot3};
			
			for(int i = 0 ; i < Set.length ; i++) {
				System.out.println(Arrays.toString(Set[i]));
				System.out.println();
				
				
			}
			

			
			
			
			

		
		

	}

}
