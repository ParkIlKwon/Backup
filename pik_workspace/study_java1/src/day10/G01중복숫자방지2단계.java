package day10;

import java.util.Arrays;
import java.util.Random;

public class G01�ߺ����ڹ���2�ܰ� {

	public static void main(String[] args) {
		
		/*
		 * # �ߺ����� ����[2�ܰ�]
		 * 1. arr�迭�� 1~10 ������ ���� ���� 5���� �����Ѵ�.
		 * 2. �� �ߺ��Ǵ� ���ڰ� ����� �Ѵ�.
		 */
				Random rd = new Random();
				
				int[] arr = new int[5];			
				
				for(int i = 0 ; i < arr.length ; i ++) {
					
					arr[i] = rd.nextInt(10)+1;		
					
					for(int k = 0 ; k < i ; k++) {
						if(arr[i] == arr[k]) {
							i--;			
						}
						
					}
				}

				System.out.println(Arrays.toString(arr));
				
	}

}
