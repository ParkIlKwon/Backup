package Level3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class �迭4 {

	public static void main(String[] args) {

		/*
		 * [����]
		     �� �迭�� �ϳ��� ��ġ�� �����������������Ͻÿ�.	
			 ��) 1,2,3,5,7,8,9,10,12,15,19,20
		 */
		
			System.out.println();
			System.out.println("===����1===");	// 9 : 31 - 10:05
		
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
			System.out.println("===����2===");	
			
			/*
			   [����]	//10:15 - 11:03
				 input �� �迭���� ������   array�迭�� ����� ��ġ�ϰ�,
				  �׼����� ��ġ�ϸ�  true , �ƴϸ� false ��� 	
				  
				��) input1�� ������  6,1,8  �̰� array ��  
					index 5~7(6,1,8) �� ���� ������ ��ġ�Ѵ�.
				���)  true	
					  	
				��) input2�� ������ array �迭�� �ִ°���� ��ġ������, 
				   input2 ������ 6,3 �̰�, array �� ���� 3,6 ���� ������ �ٸ���.
				���) false
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
			System.out.println("===����3===");	//11:04 - 12:02
			
			/*
			  [����]	
		    input = {8,4,2,2,4,4,8};	
			  
				 [1] input �� �����͸� ���������� a�� �����Ѵ�.
				 [2] �����ҷ��� ���� �׾��� ���� ���ΰ����� ��ģ��. (��� ��ø����)
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
				System.out.println("===����4===");	

				/*
				 * 
				 * 	System.out.println();
					System.out.println("===����4===");	// 12:06 - 12:25
				    [����]	
						 * arr �迭�� vlaue�� ���� �����ҿ����̴� 
						 * ��ġ�� index �� ��ġ�� �����Ѵ�. 
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
		System.out.println("===����5===");	
		
		/*  [����]	
	 	�Ʒ� �迭���� ȥ���ִ� ���ڸ� �������� ���������鸸 ����غ���.
			 
	  	(��)
			{1,2,3,2,1}  ==>  {1,2,2,1}    // 3�� ȥ������\
			{1 2 3 2 1}
			
		    {1,3,4,4,2}  ==>  {4,4}        // 1,2,3 ȥ������
		    {1,1,1,1,1}  ==>  {1,1,1,1,1}  // ����
	 
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
			
		
		System.out.println("�� ȥ������.");
		}else {
			System.out.println("����");
		}
				System.out.println();
				System.out.println("===����9===");		//2�ð� .
				
				/*
			    array[][] = {3,2},{5,6},{2,1},{4,3}
				 �� �����ʹ� ������ �������̴�.
				 ���������� ��Ģ�� 2���� ¦�� �̷��.
				  1) ���� ���� ==> ������ 
				  2) ���� ���� ==> �����̴�.
				 ��) {3,2} ==> 33
				 ��) {5,6} ==> 555555
				 ��) {2,1} ==> 2
				 ��) {4,3} ==> 444
					 ���� �����ʹ� 335555552444 �ΰ��̴�. 
				 ����) �������ͻ����ŭ �迭�� ����� ������ ���� ������ ��� 
				 ��) temp = {3,3,5,5,5,5,5,5,2,4,4,4}
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
				System.out.println("===����8===");	//1�ð� .
				
				/*
				 * [�����������ֱ�]
				  
				  	�Ʒ� 2�����迭�� 3�г�1���� �л����� ǥ���Ѵ�.
				   	���� 4 ���� 5�� �� �л����� 20���̰�,
				   	������ ������ ���л��� �������������� �ʿ��� ������ ���̴�. 
				   	�л����� �ʿ��� ���������� �ٸ���. 	
				   	�������� �����ٷ��� �Ѵ�. �ε�����ġ (0,0) ���� �����ٷ����ϴµ�	
					
				   	�����ֱ� ���ϰ��ϱ����ؼ� ������׷� �����ٷ��� �Ѵ�. 		
					ù��°���� �տ��� ���� �ڷ� �̵��Ѵ�. 3,1,5,4,1 
					�ι�°���� �ڿ��� ���� ������ �̵��Ѵ�. 8,2,4,6,1
					�ٽ� ����°���� �տ������� �ڷ��̵��Ѵ�. 2,3,5,5,2 
					�ٽ� �׹�°���� �ڿ������� ������ �̵��Ѵ�. 2,1,7,1,6 
					  
					�������� �л��� 1~20�� �����ϰ� , ���л��� �ʿ��� ���������� ���� ����Ѵ�.
					 ��) 7 ==> {3 + 1 + 5 + 4 + 1} + {8 + 2}
					 ��) 12 ==> {3 + 1 + 5 + 4 + 1} + {8 + 2 + 4 + 6 + 1} + {2 + 3}
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
			    [����]
					 �������� ���� 5���� �����Ѵ�. (1~9������ ����)
					 �������ڰ� Ȧ���̸� arr�迭�� �տ������� ���� (��, ���Ȧ������ �ڷ� �о��.)
					 �������ڰ� ¦���̸� arr�迭�� �ڿ������� ����(��, ��� ¦������ ������ �о��.)
					 �Ʒ� �߰� ������ �����Ѵ�. 
					 [����]
						3 ==> arr = {3,0,0,0,0}; // Ȧ���� �Ǿտ� 3����
					 	1 ==> arr = {1,3,0,0,0}; // ���� ��(3)�� �ڷ� �о�� Ȧ���� �Ǿտ� 1����
					  	2 ==> arr = {1,3,0,0,2}; // ¦���� �ǵڿ� 2����
					  	6 ==> arr = {1,3,0,2,6}; // ���� ��(2)�� ������ �о�� ¦���� �ǵڿ� 6����
					  	7 ==> arr = {7,1,3,2,6}; // ���� ��(1, 3)�� �ڷ� �о�� �Ǿտ� 7���� 
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
		System.out.println("===����7===");		//9:20 - 9:42
		
		int arr3[] = {1,5,4,5,3,2,2,3,5,4,5,1};
		int arr4[] = {1,5,4,5,3,2,3,5,4,5,1};
		 size = 0;
		int size2 = 0;
		 cnt = 0;
		int cnt2 = 0;
		 idx = arr3.length-1;
		int idx2 = arr4.length-1;
		//�� �迭���� ���� �Ӹ�������� �ƴ��� ����Ͻÿ�.
		
		//�Ӹ�����̶�? 
		
		// �տ������� ���� ����
		// �ڿ������� ���� �� �Ȱ��� ���ڰ� ������ �Ӹ�����̴�
		// ��) 2112
		// ��) 12321
		
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
		
		
		System.out.println(Arrays.toString(arr3)+"�� �Ӹ������");
		System.out.println(cnt == size ?"�½��ϴ�" :"�ƴմϴ�.");
		
		System.out.println(Arrays.toString(arr4)+"�� �Ӹ������");
		System.out.println(cnt2 == size2 ?"�½��ϴ�" :"�ƴմϴ�.");
		
		
		
		
		
			
			
					}
					
					
}		
			
			
			
			

		

	

	
