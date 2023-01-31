package Level3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		/*
		[문제] 
	 		array1배열 과 array2배열의 각자리별 합을 temp1에저장
	 		temp1 = {10 + 5 , 20 + 8, 30 + 54, 40 + 32, 50 + 1};		
		[문제] 
	 		array1배열 과 array2배열의 각자리별 차를 temp2에저장
	 		temp2 = {10 - 5 , 20 - 8, 30 - 54, 40 - 32, 50 - 1};
	*/
		System.out.println("===문제1===");			//5분
		
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
			System.out.println("===문제2===");			//4분
			
			/*
			[문제]
				array[] = {10, 43, 25, 76, 3, 100, 56};	      
				인덱스 2개를 입력받고 작은인덱스에서 큰인덱스까지의 값들의 합을 출력한다.
			[조건] 
		  		index1 이 index2 보다 더크더라도 
		       	작은인덱스부터 큰인덱스까지의 합을 출력한다.
		    [예] index1 = 1;  index2 = 3;
				43 + 25 + 76
		  
		  	[예] index1 = 4;  index2 = 1;
		 		43 + 25 + 76 + 3 
		 */

				int array[] = {10, 43, 25, 76, 3, 100, 56};			
				int index1 =0;
				int index2 =0;
				Scanner sc = new Scanner(System.in);
				
				for(int i = 1 ; i<2; i++) {
				
				System.out.println("첫번째 인덱스를 입력하세요");
				index1 =sc.nextInt();
				System.out.println("두번째 인덱스를 입력하세요");
				index2 = sc.nextInt();
				
				if(index1==index2 || index1<0 || index2 >array.length) {
					System.out.println("값을 잘못입력하였습니다.");
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
				System.out.println("===문제3===");	//3분
				
				/*
				[문제]
					array 배열에 -100~100사이의 랜덤값중 홀수만 5개 저장한다. 
					그중 가장작은값의 인덱스와 값을 출력한다. 
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
			System.out.println(min + "몇번째?  " + idx);
			
			System.out.println();
			System.out.println("===문제4==="); //6분
			
			/*
			[문제] 다음 리스트를 이용해서 a 의 값중 홀수만 c 에 저장
			[조건] 위치는 뒤에서 부터 저장한다. 
			[예]   c = { 0, 0, 17, 51, 49 }
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
		System.out.println("===문제5===");	//16분
		
		/*
		아래배열들을 반으로 나누고 서로 같은모양인지 판별하시오.	
		같은모양이면 true , 다른모양이면 false 출력
		[예시]
			154451 은 절반으로 나누면 서로 같은모양이다.
			154751 은 절반으로 나누면 서로 다른모양이다.
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
	
	System.out.println(cnt == check ?"은 절반으로 나누면 서로같은 모양이다." :"은 절반으로 나누면 서로다른 모양이다.");
		
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
	
	System.out.println(cnt == check ?"은 절반으로 나누면 서로같은 모양이다." :"은 절반으로 나누면 서로다른 모양이다.");		
			
	System.out.println();
	System.out.println("===문제6===");	// 10:39 - 10:44
	
	/*
	인덱스를 입력받고 해당 인덱스의 값을  0으로 변경

	추가조건 : 해당 값 양옆의 값들도 8로 변경 
	단, 0, 4 인덱스일경우는 양옆중 한개만 8로 변경 

	(예) 1 ==> {8,0,8,9,9}
	(예) 4 ==> {9,9,9,8,0}

	*/
	 int arr3[] = {9,9,9,9,9};
	 
	 System.out.println("0으로 변경할 인덱스를 입력하세요: " );
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
	System.out.println("===문제7===");	//10:45 - 11-05
	
	/*
	편의점 물건채우기 
	철수는 편의점에서 아르바이트를 하고있다. 
	오늘 장사가 잘되서 라면이 많이 판매되었다.
	라면진열장에 라면들이 전부 채워질수있도록 라면을 채워보자.
	
	라면은 진열장은 한칸에 최대 5개씩 진열할수있으며,
	재고는 6개 밖에 없고 앞에서부터 순차적으로 채워넣는다. 
	재고를 다채웠을때 라면진열장의 모습을 출력해보자.
	
	[예] 
		{3,5,2,1,2}
		
		1번은 3이므로 2개를 추가해 ==> -2
		2번은 5이므로 0개를 추가해 ==> -0
		3번은 2이므로 3개를 추가해 ==> -3
		4번은 1이므로 4개를 추가해야되지만 재고가 1개밖에없어서 -1	
		최종으론 {5,5,5,2,2} 가된다. 
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
		System.out.println("===문제8==="); // 11:07 - 11:16

		/*
		 * [문제] 철수는 수학시험을 보았다. 철수는 실수로 답을 한칸씩 밀려 적었다. 철수가 원래대로 마킹했더라면 몇점인가? 각문제별로 점수는
		 * 다르다. 예) 정답= {1,4,3,3,2}; 점수표 = {20,30,15,15,20};
		 * 
		 * 철수가 제출한 답안지(mistake) {0,1,3,2,2) 원래제출하고싶었던 답안지(fixed) {1,3,2,2,0};
		 * 
		 * [정답] 첫번째 한문제만 정답이이고 , 해당점수는 20점이므로 20점
		 */

		int[] answer = { 1, 4, 3, 3, 2 }; // 정답
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

		System.out.println(sum + " 점");

		System.out.println();
		System.out.println("===문제9==="); // 11:18 - 11:43

		/*
		 * [기념일] 철수와 영희는 3월 3일에 만났다. 철수는 영희와 100일 기념일에 축하파티를 할려고한다. 만난지 100일뒤는 몇월몇일인가? 단
		 * 윤년은 계산하지않는다.
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
					System.out.print(month + "월");
					System.out.println(day + "일");

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
		System.out.println("===문제10===");

		/*
		 * [왼쪽오른쪽] 랜덤으로 숫자(1,2)를 저장하고 숫자가 1이면 왼쪽으로 밀기 숫자가 2이면 오른쪽으로 밀기 예) 1) left ==>
		 * arr = {2,3,4,5,0,0,0,0,0}; 예) 2) right ==> arr = {0,0,0,0,0,2,3,4,5};
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
