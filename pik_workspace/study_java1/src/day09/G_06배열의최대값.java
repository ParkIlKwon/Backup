package day09;

import java.util.Arrays;
import java.util.Scanner;

public class G_06�迭���ִ밪 {
	public static void main(String[] args) {
		/*
		 * # �ִ밪 ���ϱ�
		 * 1. ���� ū ���� ã�� �Է��Ѵ�.
		 * 2. �����̸� �ش� ���� 0���� �����Ѵ�.
		 * 3. arr�迭�� ��� ���� 0���� ����Ǹ� ���α׷��� ����ȴ�.
		 * ��)
		 * 11, 87, 42, 100, 24
		 * �Է� : 100
		 * 
		 * 11, 87, 42, 0, 24
		 * �Է� : 87
		 * 
		 * 11, 0, 42, 0, 24
		 */
			int[] arr = {11, 87, 42, 100, 24};
			int cnt = arr.length ;
			Scanner sc = new Scanner(System.in);
			int idx = 0;
			
			while(cnt != 0) {
				System.out.println(Arrays.toString(arr));
				int input = sc.nextInt();
				int max = arr[0];
				for(int i = 0 ; i < arr.length ; i++) {
					if(max < arr[i]) {
						max = arr[i];
						idx = i ;
					}
					
				}
		
			
				
				if(input == max) {
					arr[idx] = 0;
					cnt--;
				}
				
			}
			
			System.out.println("==�Ϸ�==");
		

	}

}
