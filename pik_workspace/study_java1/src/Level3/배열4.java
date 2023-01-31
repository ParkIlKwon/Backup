package Level3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class 배열4 {

	public static void main(String[] args) {

		/*
		 * [문제]
		     두 배열을 하나로 합치고 오름차순으로정렬하시오.	
			 예) 1,2,3,5,7,8,9,10,12,15,19,20
		 */
		
			System.out.println();
			System.out.println("===문제1===");	// 9 : 31 - 10:05
		
			int[] arr1 = {9,10,3,2,20,19};
			int[] arr2 = {15,12,1,5,7,8};	
			int[] temp = null;
			int idx = 0;
			temp = new int [arr1.length + arr2.length];
			
			for (int i = 0; i < arr1.length; i++) {
				
				temp[idx] = arr1[i];
				temp[idx+1] = arr2[i];
				idx+=2;
				
			}
			
			
			System.out.println(Arrays.toString(temp));
			
			for (int i = 0; i < temp.length; i++) {
				for (int k = i; k < temp.length; k++) {
					if(temp[i] > temp[k]) {
						int t = temp[k];
						temp[k] = temp[i];
						temp[i] = t;
						
					}
					
					
				}
			}
			
			System.out.println(Arrays.toString(temp));
			
			System.out.println();
			System.out.println("===문제2===");	
			
			/*
			   [문제]	//10:15 - 11:03
				 input 의 배열안의 값들이   array배열의 값들과 일치하고,
				  그순서도 일치하면  true , 아니면 false 출력 	
				  
				예) input1의 값들은  6,1,8  이고 array 의  
					index 5~7(6,1,8) 의 값과 순서가 일치한다.
				결과)  true	
					  	
				예) input2의 값들을 array 배열에 있는값들과 일치하지만, 
				   input2 순서가 6,3 이고, array 의 값은 3,6 으로 순서가 다르다.
				결과) false
			*/
			int array[] = {1,3,3,6,5,6,1,8,9};	
			int input1[] = {6,1,8};
			int input2[] = {6,3};
			int gap1 = input1.length-2;
			int gap2 = input2.length-1;
			int temp1[] = new int [input1.length];
			int cnt =0;
			int index = 0 ;
			boolean chk = false;
			
			for(int i = 0 ; i < array.length-gap1 ; i++) {
				if(input1[0] == array[i] &&i < array.length-gap1) {
					if(input1[1] == array[i+1] && input1[2]==array[i+2]) {
						chk = true;
						
					}
				}
				
			}
			
			System.out.println(chk);
			chk = false;
			
			for(int i = 0 ; i < array.length-gap2 ; i++) {
				if(input2[0] == array[i] &&i < array.length-gap2) {
					if(input2[1] == array[i+1] ) {
						chk = true;
					}
				}
				
			}
			System.out.println(chk);
			
			
			
			
			System.out.println();
			System.out.println("===문제3===");	//11:04 - 12:02
			
			/*
			  [문제]	
		    input = {8,4,2,2,4,4,8};	
			  
				 [1] input 의 데이터를 순차적으로 a에 저장한다.
				 [2] 저장할려는 수와 그앞의 수가 서로같으면 합친다. (계속 중첩적용)
				 input = {8,4,2,2,4,4,8}	
				 8  ==> a[] =  {8}
				 4  ==> a[] =  {8,4}
				 2  ==> a[] =  {8,4,2}
				 2  ==> a[] =  {8,4,2,2} ==> {8,4,4} ==> {8,8} ==> {16}
				 4 ==>  a[] =  {16,4} 
				 4  ==> a[] =  {16,4,4} ==> {16,8}
				 8  ==> a[] =  {16,8,8} ==> {16,16} ==> {32}	
			 */
			int [] input = {8,4,2,2,4,4,8};
			int [] a = null;
			int []temp34 = new int [input.length];
			idx = 0;
			
			for (int i = 0; i < input.length; i++) {
				
				temp34[idx] = input[i];
				
				for (int k = temp34.length-1; k > 0; k--) {
					if(temp34[k] == temp34[k-1] && temp34[k] != 0) {
						temp34[k-1] *= 2;
						temp34[k] = 0;
						idx--;
						
					}
					
				}
				a = new int [idx+1];
				
				for (int k = 0; k < a.length; k++) {
					a[k] = temp34[k];
				}
				
				idx ++;
				
			}
		 
		 
		 System.out.println(Arrays.toString(a));
				
		
				
				System.out.println();
				System.out.println("===문제4===");	

				/*
				 * 
				 * 	System.out.println();
					System.out.println("===문제4===");	// 12:06 - 12:25
				    [문제]	
						 * arr 배열에 vlaue의 값을 삽입할예정이다 
						 * 위치는 index 의 위치에 삽입한다. 
						 * 
						 */
						
						
						/*
						 * [1] index = 2 , value = 60
						 *    	{10,20,60,30,40};
						 *   
						 * [2] index = 1 , value = 70
						 * 	  	{10,70,20,60,30}
						 * 
						 * [3] index = 0 , value = 80
						 * 		{80,10,70,20,60}
						 * 
						 * [4] index = 3 , value = 90
						 * 		{80,10,70,90,20}
						 * 
						 */

						int arr[] = {10,20,30,40,50};
						
						int indexList[] = {2,1,0,3};
						int valueList[] = {60,70,80,90};
						temp = null;
						
						
						int size = arr.length;
						
						for (int i = 0; i <indexList.length	; i++) {
							 temp = new int [size+1];
							  index = 0;
							 
							for (int k = 0; k < temp.length; k++) {
									
									if(indexList[i] != k) {
										temp[k] = arr[index];
												
												index ++;
									}else {
										
										temp[k] = valueList[i];
									}
								
								
							}
							
							for (int k = 0; k < arr.length; k++) {
								
								arr[k] = temp[k];
								
							}
							
							
							System.out.printf("[%d]",i+1);
							System.out.println(Arrays.toString(arr));
							
							
						}
				
				
		
		
		System.out.println();
		System.out.println("===문제5===");	
		
		/*  [문제]	
	 	아래 배열에서 혼자있는 숫자를 제거한후 나머지값들만 출력해보자.
			 
	  	(예)
			{1,2,3,2,1}  ==>  {1,2,2,1}    // 3이 혼자있음\
			{1 2 3 2 1}
			
		    {1,3,4,4,2}  ==>  {4,4}        // 1,2,3 혼자있음
		    {1,1,1,1,1}  ==>  {1,1,1,1,1}  // 없음
	 
	 */

		int test[] = {1,1,3,1,1} ;			
					
		 temp = new int[5];
		int temp2[] = new int [temp.length];
		int tcnt = 0;
		int tnum = 0;
		temp = test;
		
		for(int i = 0 ; i < test.length ; i++) {
			 cnt = 0;
			 tnum = 0;
			for (int k = 0; k < temp.length; k++) {
				if(temp[i] == test[k]) {
					cnt++;
				}
			}
			if(cnt <=1) {
				tnum = temp[i];
				temp2[tcnt] = tnum;
				tcnt ++;
			}else {
				System.out.print(test[i]+" ");
			}
			
		}
		
		if(tcnt !=0) {
			
		for (int i = 0; i < temp2.length; i++) {
			if(temp2[i] != 0) {
			System.out.printf("{%d}" , temp2[i]);
			}
		}	
			
		
		System.out.println("이 혼자있음.");
		}else {
			System.out.println("없음");
		}
				System.out.println();
				System.out.println("===문제9===");		//2시간 .
				
				/*
			    array[][] = {3,2},{5,6},{2,1},{4,3}
				 위 데이터는 압축한 데이터이다.
				 위데이터의 규칙은 2개씩 짝을 이룬다.
				  1) 앞의 숫자 ==> 데이터 
				  2) 뒤의 숫자 ==> 개수이다.
				 예) {3,2} ==> 33
				 예) {5,6} ==> 555555
				 예) {2,1} ==> 2
				 예) {4,3} ==> 444
					 실제 데이터는 335555552444 인것이다. 
				 문제) 위데이터사이즈만큼 배열을 만들고 각각의 값을 저장후 출력 
				 예) temp = {3,3,5,5,5,5,5,5,2,4,4,4}
			 */
				int count = 0;

		    int array1[][] = {
				    				{3,2},
				    				{5,6},
				    				{2,1},
				    				{4,3}
								        };
				int [] temp3 = null;
				int [] tp = null;
				
				
				for(int i = 0 ; i < array1.length ; i++) {
					cnt = 0;
					for (int k = 1; k < array1[i].length; k++) {
						
						count += array1[i][k];
						  tp = new int [count];
						  
					}
					
					if (i>0) {
						for (int j = 0; j < temp3.length; j++) {
							tp[j] = temp3[j];
							cnt++;
						}
						
					}
					System.out.println(Arrays.toString(temp3));
					System.out.println(cnt);
					
					for (int k = 0; k < tp.length-cnt; k++) {
						
						tp[k+cnt] = array1[i][0];
									
						
							}
							
					
					temp3 = tp;
					tp = null;
					
						}
						
						
				System.out.println(Arrays.toString(temp3));
				
				System.out.println();
				System.out.println("===문제8===");	//1시간 .
				
				/*
				 * [시험지나눠주기]
				  
				  	아래 2차원배열은 3학년1반의 학생수를 표현한다.
				   	세로 4 가로 5의 총 학생수는 20명이고,
				   	각각의 값들은 각학생별 시험을보기위한 필요한 페이지 수이다. 
				   	학생마다 필요한 페이지수가 다르다. 	
				   	시험지를 나눠줄려고 한다. 인덱스위치 (0,0) 부터 나눠줄려고하는데	
					
				   	나눠주기 편하게하기위해서 지그재그로 나눠줄려고 한다. 		
					첫번째줄은 앞에서 부터 뒤로 이동한다. 3,1,5,4,1 
					두번째줄은 뒤에서 부터 앞으로 이동한다. 8,2,4,6,1
					다시 세번째줄은 앞에서부터 뒤로이동한다. 2,3,5,5,2 
					다시 네번째줄은 뒤에서부터 앞으로 이동한다. 2,1,7,1,6 
					  
					랜덤으로 학생수 1~20을 저장하고 , 각학생별 필요한 페이지수의 합을 출력한다.
					 예) 7 ==> {3 + 1 + 5 + 4 + 1} + {8 + 2}
					 예) 12 ==> {3 + 1 + 5 + 4 + 1} + {8 + 2 + 4 + 6 + 1} + {2 + 3}
				*/

			int darr[][] = {
							{3,1,5,4,1},
							{1,6,4,2,8},
							{2,3,5,5,2},
							{6,1,7,1,2},
					};
			
			Random rd = new Random();
			int num = rd.nextInt(20)+1;
			System.out.println(num);
			//int num = 6;
			cnt = 0;
			int sum = 0;
			
			loop:
			for (int i = 0; i < darr.length; i++) {
				
				if(i%2==0) {
					
					for (int k = 0; k < darr[i].length; k++) {
					if(cnt == num) {
						break loop;
						
					}else {
					sum += darr[i][k];
					cnt++;
				}
			
				}
					
					}else {
						
						for (int k = darr[i].length-1 ; k >=0 ; k--) {
						
							if(cnt == num) {
								break loop;
								
							}else {
							sum += darr[i][k];
							cnt++;
						}
						
					}
				
				}
				
			}
			
			System.out.println(sum);		
		
			/*
			    [문제]
					 랜덤으로 숫자 5개를 저장한다. (1~9사이의 숫자)
					 랜덤숫자가 홀수이면 arr배열의 앞에서부터 저장 (단, 모든홀수값은 뒤로 밀어낸다.)
					 랜덤숫자가 짝수이면 arr배열의 뒤에서부터 저장(단, 모든 짝수값은 앞으로 밀어낸다.)
					 아래 추가 설명을 참고한다. 
					 [예시]
						3 ==> arr = {3,0,0,0,0}; // 홀수는 맨앞에 3저장
					 	1 ==> arr = {1,3,0,0,0}; // 전의 값(3)을 뒤로 밀어내고 홀수는 맨앞에 1저장
					  	2 ==> arr = {1,3,0,0,2}; // 짝수는 맨뒤에 2저장
					  	6 ==> arr = {1,3,0,2,6}; // 전의 값(2)를 앞으로 밀어내고 짝수는 맨뒤에 6저장
					  	7 ==> arr = {7,1,3,2,6}; // 전의 값(1, 3)을 뒤로 밀어내고 맨앞에 7저장 
					 */
			int inputs[] = {2,4,6,8,9};
			input = inputs;
			arr= new int[5];	
			int zac = 0;
			int hol = arr.length-1;
			//int arr[] =new int[5];
			
			for (int i = 0; i < input.length; i++) {
				
				if(input[i] %2 == 1) {
					for (int k = zac; k > 0; k--) {
						arr[k] = arr[k-1];
					}
					zac++;
					arr[0] = input[i];
					
				}else {
					
					for (int j = hol; j < arr.length ; j++) {
						arr[j-1] = arr[j];
						
					}
					
					hol--;
					arr[arr.length-1] = input[i];
				}
				
			}
			
			
			System.out.println(Arrays.toString(arr));
				
			
		System.out.println();
		System.out.println("===문제7===");		//9:20 - 9:42
		
		int arr3[] = {1,5,4,5,3,2,2,3,5,4,5,1};
		int arr4[] = {1,5,4,5,3,2,3,5,4,5,1};
		 size = 0;
		int size2 = 0;
		 cnt = 0;
		int cnt2 = 0;
		 idx = arr3.length-1;
		int idx2 = arr4.length-1;
		//위 배열들이 각각 팰린드롬인지 아닌지 출력하시요.
		
		//팰린드롬이란? 
		
		// 앞에서부터 읽을 때와
		// 뒤에서부터 읽을 때 똑같은 숫자가 나오면 팰린드롬이다
		// 예) 2112
		// 예) 12321
		
		if(arr3.length % 2 == 0) {
			 size = arr3.length/2;
		}else {
			 size = arr3.length/2 -1;
		}
		
		if(arr4.length % 2 == 0) {
			 size2 = arr4.length/2;
		}else {
			 size2 = arr4.length/2 ;
		}
		
		
		for (int i = 0; i < size; i++) {
			
			for (int k = 0; k < 1; k++) {
				if(arr3[i] == arr3[idx]) {
					cnt ++;
					idx--;
				}
				
			}
				
		}
			for (int i = 0; i < size2; i++) {
			
			for (int j = 0; j < 1; j++) {
				if(arr4[i] == arr4[idx2]) {
					cnt2 ++;
					idx2--;
				}
				
			}			
		}
		
		
		System.out.println(Arrays.toString(arr3)+"는 팰린드롬이");
		System.out.println(cnt == size ?"맞습니다" :"아닙니다.");
		
		System.out.println(Arrays.toString(arr4)+"는 팰린드롬이");
		System.out.println(cnt2 == size2 ?"맞습니다" :"아닙니다.");
		
		
		
		
		
			
			
					}
					
					
}		
			
			
			
			

		

	

	
