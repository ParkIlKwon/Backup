package day12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class test {

	public static void main(String[] args) {

/*
	[����]
		arr �迭���� �ݺ��� ���������� �����ϵ�
		3��°���� �ٷ� ���� ���� ��ġ�� ��ȯ�� ����Ͻÿ�.
	[����]
		��ȯ �� : {10,20,30,40,50,60,70,80};
		��ȯ �� : {10,20,40,30,50,70,60,80};
 */

		int [] arr = {10,20,30,40,50,60,70,80};
		
		for(int i = 0 ; i < arr.length ; i ++) {
			if(i % 3 == 2) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("=====================");
		
		/*
		[����] arr1�迭�� arr2�迭�� ���� �ٿ��� temp�迭�� �����Ͻÿ�.
		[����] temp = {2,65,34,76,8,5,6,54,1,4}
	 */
			int arr1[] = {2,65,34,76,8,5};
			int arr2[] = {6,54,1,4};
			
			int temp[] = null;
			temp = new int [ arr1.length + arr2.length];
			
			for(int i = 0 ; i < arr1.length  ; i++) {
				temp[i] = arr1[i];
				
			}
			int idx = 0;
			for(int i = arr1.length ; i < arr1.length + arr2.length  ; i++) {
				temp[i] = arr2[idx];
				idx++;
			}
			
			System.out.println(Arrays.toString(temp));
			System.out.println("=====================");

/*
	 * [����]
	     �� �迭�� temp �迭 �Ѱ��� ��ġ�� �����������������Ͻÿ�.	
		  [����] 1,2,3,5,7,8,9,10,12,15,19,20
	 */
		int[] arr3 = {9,10,3,2,20,19};
		int[] arr4 = {15,12,1,5,7,8};
		int size = arr3.length + arr4.length;
		
		temp = null;
			
		temp = new int [arr3.length + arr4.length];
		
		for(int i = 0 ; i < arr1.length  ; i++) {
			temp[i] = arr3[i];
			
		}
		
		idx = 0 ;
		for(int i = arr3.length ; i < size ; i++) {
			temp[i] = arr4[idx];
			idx++;
		}
		
		for(int i = 0 ; i < size ; i++) {
			for(int k = i ; k < size ; k++) {
				if(temp[i] > temp[k]) {
					int temp2 = temp[k];
					temp[k] = temp[i];
					temp[i] = temp2;
			
				}
				
			}
		}
		
		
		
		System.out.println(Arrays.toString(temp));
		System.out.println("=====================");
		
		/*
		[����]
			������ 5������ �����ϰ� ���䰹�� ��� 
			�����ܹ����� ���ڸ��� �迭�� �������� �������̰� 
			���ڸ��� �迭�� �����ʰ��� �������̴�
			�����ܰ����� ������.
	 [����]
			1������) 5 * 5
			2������) 3 * 7
			3������) 8 * 4
			4������) 9 * 2
			5������) 4 * 6
	*/
		Scanner sc =new Scanner(System.in);
	int gugudan[][] = {
					{5,5},
					{3,7},
					{8,4},
					{9,2},
					{4,6},
			};
		int cnt = 0 ;
		for(int i= 0 ;i< gugudan.length ; i++) {
			System.out.print(i+1+"������)");
			for(int k = 0 ; k <gugudan[i].length-1 ; k++) {
				System.out.print(gugudan[i][k]+" * "+gugudan[i][k+1]);
				
			}
			System.out.print(" = ");
			System.out.println();
			int dap = sc.nextInt();
			
		//	if(dap == gugudan[i][k])
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
