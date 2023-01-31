package day12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class test {

	public static void main(String[] args) {

/*
	[문제]
		arr 배열에서 반복을 순차적으로 진행하되
		3번째마다 바로 뒤의 값과 위치를 교환후 출력하시오.
	[정답]
		교환 전 : {10,20,30,40,50,60,70,80};
		교환 후 : {10,20,40,30,50,70,60,80};
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
		[문제] arr1배열과 arr2배열을 서로 붙여서 temp배열에 저장하시오.
		[정답] temp = {2,65,34,76,8,5,6,54,1,4}
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
	 * [문제]
	     두 배열을 temp 배열 한개로 합치고 오름차순으로정렬하시오.	
		  [정답] 1,2,3,5,7,8,9,10,12,15,19,20
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
		[문제]
			구구단 5문제를 제시하고 정답갯수 출력 
			구구단문제의 앞자리는 배열의 왼쪽쪽의 데이터이고 
			뒤자리는 배열의 오른쪽값의 데이터이다
			구구단게임을 만들어보자.
	 [정답]
			1번문제) 5 * 5
			2번문제) 3 * 7
			3번문제) 8 * 4
			4번문제) 9 * 2
			5번문제) 4 * 6
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
			System.out.print(i+1+"번문제)");
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
