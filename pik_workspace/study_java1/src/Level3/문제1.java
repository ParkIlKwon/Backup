package Level3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ����1 {

	public static void main(String[] args) {
		/*
		[����] 
	 		array1�迭 �� array2�迭�� ���ڸ��� ���� temp1������
	 		temp1 = {10 + 5 , 20 + 8, 30 + 54, 40 + 32, 50 + 1};		
		[����] 
	 		array1�迭 �� array2�迭�� ���ڸ��� ���� temp2������
	 		temp2 = {10 - 5 , 20 - 8, 30 - 54, 40 - 32, 50 - 1};
	*/
		System.out.println("===����1===");			//5��
		
	    	int array1[] = {10,20,30,40,50};
			int array2[] = {5,8,54,32,1};
			int size = array1.length;
			int temp1[] = new int[5];
			int temp2[] = new int[5];
			
			for(int i =0; i < size ; i++) {
				temp1[i] = array1[i] + array2[i];
				
			}
			System.out.println(Arrays.toString(temp1));
			
			for(int i =0; i < size ; i++) {
				temp2[i] = array1[i] - array2[i];
				
			}
			System.out.println(Arrays.toString(temp2));
			
			System.out.println();
			System.out.println("===����2===");			//4��
			
			/*
			[����]
				array[] = {10, 43, 25, 76, 3, 100, 56};	      
				�ε��� 2���� �Է¹ް� �����ε������� ū�ε��������� ������ ���� ����Ѵ�.
			[����] 
		  		index1 �� index2 ���� ��ũ���� 
		       	�����ε������� ū�ε��������� ���� ����Ѵ�.
		    [��] index1 = 1;  index2 = 3;
				43 + 25 + 76
		  
		  	[��] index1 = 4;  index2 = 1;
		 		43 + 25 + 76 + 3 
		 */

				int array[] = {10, 43, 25, 76, 3, 100, 56};			
				int index1 =0;
				int index2 =0;
				Scanner sc = new Scanner(System.in);
				
				for(int i = 1 ; i<2; i++) {
				
				System.out.println("ù��° �ε����� �Է��ϼ���");
				index1 =sc.nextInt();
				System.out.println("�ι�° �ε����� �Է��ϼ���");
				index2 = sc.nextInt();
				
				if(index1==index2 || index1<0 || index2 >array.length) {
					System.out.println("���� �߸��Է��Ͽ����ϴ�.");
					i--;
				}
				}
				
				if(index2 < index1) {
					int temp = index1 ; 
					index1 = index2;
					index2 = temp;
				}
				int sum = 0;
				
				for(int i = index1 ; i <= index2 ; i++ ) {
					sum += array[i];
					
					
				}
				System.out.println(sum);
				
				System.out.println();
				System.out.println("===����3===");	//3��
				
				/*
				[����]
					array �迭�� -100~100������ �������� Ȧ���� 5�� �����Ѵ�. 
					���� ������������ �ε����� ���� ����Ѵ�. 
			*/
			array= null;	
			 array = new int[5];
			
			 Random rd = new Random();
			
			
			for(int i = 0 ; i < 5 ; i++) {
				int num = rd.nextInt(201)-100;
				if(num%2 != 0) {
					array[i] = num;
				}else {
					i--;
				}
				
			}
			
			int idx = 0;
			int min = 0 ;
			min = array[0];
			for(int i = 0 ; i < array.length ; i++) {
				if(min > array[i]) {
				
					idx = i;
					min = array[i];
				
				}
				
			}
			
			System.out.println(Arrays.toString(array));
			System.out.println(min + "���°?  " + idx);
			
			System.out.println();
			System.out.println("===����4==="); //6��
			
			/*
			[����] ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� c �� ����
			[����] ��ġ�� �ڿ��� ���� �����Ѵ�. 
			[��]   c = { 0, 0, 17, 51, 49 }
		 */

		int arr[] = { 10, 49, 51, 36, 17 };	
		int c[] = { 0,0,0,0,0 };
		size = arr.length;
		idx= size-1;
		for(int i = 0 ; i <size ; i++) {
		
			if(arr[i]%2 == 1) {
						c[idx] = arr[i];
						idx--;
			}
			
		}
		
		System.out.println(Arrays.toString(c));
		
		System.out.println();
		System.out.println("===����5===");	//16��
		
		/*
		�Ʒ��迭���� ������ ������ ���� ����������� �Ǻ��Ͻÿ�.	
		��������̸� true , �ٸ�����̸� false ���
		[����]
			154451 �� �������� ������ ���� ��������̴�.
			154751 �� �������� ������ ���� �ٸ�����̴�.
	 */
	int arr1[] = {1,5,4,4,5,1};	
	int arr2[] = {1,5,4,7,5,1};	
	int cnt = arr1.length/2;
	int check = 0;
	size = arr1.length-1;
	idx = 0;
	for(int i = 0 ; i < cnt; i++) {
		if(arr1[i]==arr1[size]) {
			check ++;
			
		}
		for(int k = 0 ; k < 2 ; k++) {
			System.out.print(arr1[idx+k]);
		}
		idx+=2;
		size--;
	}
	
	System.out.println(cnt == check ?"�� �������� ������ ���ΰ��� ����̴�." :"�� �������� ������ ���δٸ� ����̴�.");
		
	 cnt = arr1.length/2;
	 check = 0;
	size = arr1.length-1;
	idx = 0;
	for(int i = 0 ; i < cnt; i++) {
		if(arr2[i]==arr2[size]) {
			check ++;
			
		}
		for(int k = 0 ; k < 2 ; k++) {
			System.out.print(arr2[idx+k]);
		}
		idx+=2;
		size--;
	}
	
	System.out.println(cnt == check ?"�� �������� ������ ���ΰ��� ����̴�." :"�� �������� ������ ���δٸ� ����̴�.");		
			
	System.out.println();
	System.out.println("===����6===");	// 10:39 - 10:44
	
	/*
	�ε����� �Է¹ް� �ش� �ε����� ����  0���� ����

	�߰����� : �ش� �� �翷�� ���鵵 8�� ���� 
	��, 0, 4 �ε����ϰ��� �翷�� �Ѱ��� 8�� ���� 

	(��) 1 ==> {8,0,8,9,9}
	(��) 4 ==> {9,9,9,8,0}

	*/
	 int arr3[] = {9,9,9,9,9};
	 
	 System.out.println("0���� ������ �ε����� �Է��ϼ���: " );
	 idx = sc.nextInt();
	
	if(idx == 0) {
		arr3[idx] = 0;
		arr3[idx+1] = 8;
	}else if(idx == arr3.length-1) {
		arr3[idx] = 0;
		arr3[idx-1] = 8;
	}else {
		arr3[idx-1] = 8;
		arr3[idx] = 0;
		arr3[idx+1] = 8;
	}
	System.out.println(Arrays.toString(arr3));
	
	System.out.println();
	System.out.println("===����7===");	//10:45 - 11-05
	
	/*
	������ ����ä��� 
	ö���� ���������� �Ƹ�����Ʈ�� �ϰ��ִ�. 
	���� ��簡 �ߵǼ� ����� ���� �ǸŵǾ���.
	��������忡 ������ ���� ä�������ֵ��� ����� ä������.
	
	����� �������� ��ĭ�� �ִ� 5���� �����Ҽ�������,
	���� 6�� �ۿ� ���� �տ������� ���������� ä���ִ´�. 
	��� ��ä������ ����������� ����� ����غ���.
	
	[��] 
		{3,5,2,1,2}
		
		1���� 3�̹Ƿ� 2���� �߰��� ==> -2
		2���� 5�̹Ƿ� 0���� �߰��� ==> -0
		3���� 2�̹Ƿ� 3���� �߰��� ==> -3
		4���� 1�̹Ƿ� 4���� �߰��ؾߵ����� ��� 1���ۿ���� -1	
		�������� {5,5,5,2,2} ���ȴ�. 
*/

	int [] showcase = {3,5,2,1,2};
		
	int stock = 6;
	

		for(int i = 0 ; i < showcase.length ; i++) {
			for(int k = 0 ; ;k++) {
				if(stock < 1) {
					break;}
				if(showcase[i] >=5) {
					break;
				}
				if(showcase[i] <6) {
					showcase[i]+=1;
					stock --;
					
				}
				
			}
			
		}

     System.out.println(Arrays.toString(showcase));

		System.out.println();
		System.out.println("===����8==="); // 11:07 - 11:16

		/*
		 * [����] ö���� ���н����� ���Ҵ�. ö���� �Ǽ��� ���� ��ĭ�� �з� ������. ö���� ������� ��ŷ�ߴ���� �����ΰ�? ���������� ������
		 * �ٸ���. ��) ����= {1,4,3,3,2}; ����ǥ = {20,30,15,15,20};
		 * 
		 * ö���� ������ �����(mistake) {0,1,3,2,2) ���������ϰ�;��� �����(fixed) {1,3,2,2,0};
		 * 
		 * [����] ù��° �ѹ����� �������̰� , �ش������� 20���̹Ƿ� 20��
		 */

		int[] answer = { 1, 4, 3, 3, 2 }; // ����
		int[] scores = { 20, 30, 15, 15, 20 };
		int[] mistaked = { 0, 1, 3, 2, 2 };
		int fixed[] = new int[5];
		 idx = 0;
		 size = mistaked.length;

		for (int i = 0; i < size; i++) {
			if (mistaked[i] != 0) {
				fixed[idx] = mistaked[i];
				idx++;
			}

		}

		 sum = 0;
		 
		for (int i = 0; i < size; i++) {
			if (answer[i] == fixed[i]) {
				sum += scores[i];
			}

		}

		System.out.println(sum + " ��");

		System.out.println();
		System.out.println("===����9==="); // 11:18 - 11:43

		/*
		 * [�����] ö���� ����� 3�� 3�Ͽ� ������. ö���� ����� 100�� ����Ͽ� ������Ƽ�� �ҷ����Ѵ�. ������ 100�ϵڴ� ��������ΰ�? ��
		 * ������ ��������ʴ´�.
		 */

		int monthList[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int day = 3;
		int month = 3;
		int dayCnt = 0;

		for (int i = 2; i < monthList.length; i++) {
			int m = monthList[i];
			for (int k = day; k <= m; k++) {
				day++;
				dayCnt++;
				if (dayCnt >= 100) {
					System.out.print(month + "��");
					System.out.println(day + "��");

					break;
				}

			}

			if (dayCnt >= 100) {

				break;
			}

			month++;
			day = 1;

		}

		System.out.println();
		System.out.println("===����10===");

		/*
		 * [���ʿ�����] �������� ����(1,2)�� �����ϰ� ���ڰ� 1�̸� �������� �б� ���ڰ� 2�̸� ���������� �б� ��) 1) left ==>
		 * arr = {2,3,4,5,0,0,0,0,0}; ��) 2) right ==> arr = {0,0,0,0,0,2,3,4,5};
		 */
		 int arr5[] = { 0, 2, 0, 3, 4, 0, 0, 5, 0 };
		 int select = 2;

		

		// select = rd.nextInt(2)+1;

		if (select == 1) {
			idx = 0;
			for (int i = 0; i < arr5.length; i++) {
				if (arr5[i] != 0) {
					arr5[idx] = arr5[i];
					arr5[i] = 0;
					idx++;
				}

			}

		} else {
			idx = arr5.length - 1;
			for (int i = arr5.length - 1; i > 0; i--) {
				if (arr5[i] != 0) {
					arr5[idx] = arr5[i];
					arr5[i] = 0;
					idx--;
				}

			}

		}
		System.out.println(Arrays.toString(arr5));

	}

}
