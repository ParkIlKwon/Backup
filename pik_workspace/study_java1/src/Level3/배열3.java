package Level3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열3 {
	public static void main(String[] args) {
		
		/*
		[문제]
		연산자 게임을 하려고 한다. 
		연산자 게임이란 숫자들만 화면에 나오고 연산자를 맞추는게임이다.
		예를 들어 3+3=6 이라면 화면에 아래와같이 출력이되고, 사용자는 연산자를 맞추는게임이다.
		-----------------------------
		3 ? 3 = 6 
		[1] + [2] - [3] *
		-----------------------------
		
		아래 배열은 6문제이고 a는 앞의 숫자 b는 뒤의 숫자 op는 연산자를 뜻한다. 
		게임을 만들고, 맞춘개수를 출력하시오.	
	*/
	System.out.println();
	System.out.println("===문제1===");	//죄송합니다 시간체크 못했습니다 . 대략 15분.
		
	int a[] = {3,5,7,6,4,9};
	int b[] = {8,6,8,5,5,3};		
	String op[] = {"+","-","+","*","*","+"};
	int total = 0;
	int op2 = 0;
	int cnt = 0;
	Scanner sc = new Scanner(System.in);
	
	
	
	for(int i = 0 ; i < op.length ; i++) {
		System.out.print(a[i] + " ? " +b[i]);
		if(op[i] == "+") {
			total = a[i] + b[i];
			op2 = 1;
		}
		if(op[i] == "-") {
			total = a[i] - b[i];
			op2 = 2;
		}
		if(op[i] == "*") {
			total = a[i] * b[i];
			op2 = 3;
		}
		System.out.print(" = "+total);
		System.out.println("[1] + [2] - [3] *");
		
		int sel = sc.nextInt();
		
		boolean err  = sel < 1 || sel > 3 ;
		if(err) {
			System.out.println("값을 잘못입력하셨습니다.");
			i--;
			continue;
		}
		
		if(op2 == sel) {
			System.out.println("정답입니다.");
			cnt++;
		}else {
			System.out.println("오답입니다 ㅜㅜ");
		}
		
		System.out.println();
		
	}
	System.out.println("맞춘 문제 수 :" + cnt);
	
	System.out.println();
	System.out.println("===문제2===");	// 3:51 - 3:56
	
	/*
	[문제]	  
	1. 같은 글자가 적혀있는 카드 2장씩 5세트가있다. (총10장)
	2. front 는 카드를 엎어논 상태를 뜻한다. 직접출력하진않는다. 
	3. 먼저 front 를 셔플한다. 
	4. front 에 있는 카드 2개를 선택한다. (마우스가없으므로 인덱스로 선택)
	5. 선택한카드 2장의 내용이 같으면  back 에 복사해서 맞춘걸 표시한다. 
	   back에 모든 글자 가 채워지면 게임은 종료된다. 
	6. 화면에는 할상 back 배열만 출력한다.     
	 [조건] 같은 인덱스 선택할수없다. 	   
	 예)
	 [1] 초기화 
	   front = {"a", "a", "b", "b", "c", "c", "d", "d", "e" , "e" };
	   back  = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-" };
	
	 [2] 셔플 
	   front = {"a", "e", "c", "b", "d", "c", "b", "d", "a", "e"};
	
	 [3] 인덱스 입력 	   
	   1) 인덱스 2개 ==>  0 , 8  ==>front 배열의 인덱스 0, 과 8 의 값은  a , a 로 
	              서로 같은 내용이므로 back 에 복사
	   	back  =  {"a", "-", "-", "-", "-", "-", "-", "-", "a", "-"};
	   	
	   2) 인덱스 2개 ==>  1 , 2  ==>front 배열의 인덱스 1, 과 2의 값은 e , c 로 
	              서로 다른글자이므로 아무일없음
	   	back  =  {"a", "-", "-", "-", "-", "-", "-", "-", "a", "-"};
*/
		Random ran = new Random();	
		String[] front = {"a", "a", "b", "b", "c", "c", "d", "d", "e" , "e"};
		String[] back = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};
		System.out.println(" [1] 초기화 ");
		System.out.println(Arrays.toString(front));
		System.out.println(Arrays.toString(back));
		int count = front.length/2;
		int size = front.length;
		
		for(int i = 0 ; i < 500 ; i++) {
			int idx1 = ran.nextInt(size);
			int idx2 = ran.nextInt(size);
			String temp = front[idx1];
			
			front[idx1] = front[idx2];
			front[idx2] = temp;
			
			
		}
		
		System.out.println(" [2] 셔플 ");
		System.out.println(Arrays.toString(front));
		
		System.out.println(" [3] 인덱스 입력 ");
		
		for (int i = 0; i < back.length /2 ; i++) {
			System.out.print("첫번째 인덱스를 입력하여주세요: ");
			int sel1 = sc.nextInt();
			System.out.print("두번째 인덱스를 입력하여주세요: ");
			int sel2 = sc.nextInt();
			
			if(sel1 == sel2) {
				System.out.println("입력오류");
				i--;
			}
			
			if(back[sel1] != "-") {
				System.out.println("이미 맞춘 자리입니다.");
			}
			
			if(front[sel1] == front[sel2]) {
				back[sel1] = front [sel1];
						back[sel2] = front [sel2];
				
			}else {
				System.out.println("틀렸으니 아무일도 일어나지 않습니다.");
				i--;
			}
			
			System.out.println(Arrays.toString(back));
			
			
		}
		System.out.println("-이중 반복문 배열 문제-");
		System.out.println();
		System.out.println("===문제1===");		// 3:57 - 4:05
			
		/*
		 * 아래배열에 랜덤숫자 (1~9사이) 를 10개 저장한다. 
		 * 랜덤숫자중 짝수가 연속으로 나왔을때의 개수를 센다.
		 * 그개수중 연속적으로 가장긴개수를 출력한다.
		 * 
		 * [예시]
		 * 		1,6,4,3,2,4,8,6,1,2
		 * 		
		 * [개수] 
		 * 		6,4 구간이 2칸이므로 2
		 * 		2,4,8,6 구군이 4칸이므로 4
		 * 		마지막 2는 한개이므로 1
		 * 		가장긴개수는 4
		 * [정답] 
		 * 		4	
		 */

			int arr[] = new int [10];
			for(int i = 0 ; i < arr.length ; i++) {
				arr[i] = ran.nextInt(9)+1;
			}
			
			System.out.println(Arrays.toString(arr));
			
			
			 cnt = 0;
			 int max = 0;
			 
			for(int i = 0 ; i < arr.length ; i++) {
				
				if(arr[i] % 2 == 0) {
					cnt ++;
						if(max < cnt) {
							max = cnt;
						}
				}else {
					cnt = 0;
				}
				
			}
			
			System.out.println(max + "개");
			arr = null;
			
			System.out.println();
			System.out.println("===문제2===");	// 4:07 - 4:15

			/*
	        랜덤숫자 (1~9) 사이의 숫자  8개를 출력한다. 
	        단 아래의 조건을 참고한다. 
	        
	        예를 들어 숫자가 4 5 6 1 2 3 4 5 이라고 한다면
	        아래와 같이 출력한다. 
	        
	        [출력]
	           4 5 6
	           5 6 1
	           6 1 2
	           1 2 3
	           2 3 4
	           3 4 5 
	    	
			 */
			arr = new int [8];
	
			//int [] arr2 = {4,5,6,1,2,3,4,5};			// 문제 제시 
			int [] arr2 = new int [8];
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = ran.nextInt(9)+1;
				
			}
			
			System.out.println(Arrays.toString(arr2));
			
			for(int i = 0 ; i < arr2.length-2 ; i++) {
				
				for(int k = 0 ; k <3 ; k++) {
				
					System.out.print(arr2[k+i]);
					
				}
				System.out.println();
			}
			
			System.out.println();
			
			System.out.println("===문제3===");	// 4: 17 - 4: 32
			
			/*
			  [문제] a 배열 안의 값들중에서 b배열의 값이 있으면 
				    a 와 b 의 각각 겹치는값중 b배열의 인덱스를 c에저장
				   	
			   [예] 
			   		b를 기준으로 인덱스를 저장하므로 0과 0,2이다.
				 	c = {0,2};
				
			 */

				int a1[] = {10,20,30,40};	
				int b1[] = {10,5,20,9};
				int c[] = null;
				cnt = 0 ;
			
				
				for (int i = 0; i < a1.length; i++) {
					for(int k = 0 ; k < a1.length ; k++) {
						if(a1[k] == b1[i]) {
							cnt ++;
							c = new int [cnt];
							c[cnt - 1] = i;
						}
					}
					
				}
				
				System.out.println(Arrays.toString(c));
				
				System.out.println();
				
				System.out.println("===문제4===");	//4:34 - 4 : 46
				
				/*
				// 이차원 반복문으로만 풀기 

				 [다음 소수 찾기]
					  1. 숫자를 한 개 입력받는다.
					 2. 입력받은 숫자보다 큰 첫 번째 소수를 출력한다.
					  
					 예) Enter Number ? 1000
					    1000보다 큰 첫번재 소수는 1009
					  예) Enter Number ? 500
					    500보다 큰 첫번째 소수는 503

				*/ 
				
				int num = sc.nextInt();
				int log = -1;
				cnt = 0;
				
				for (int i = num; ; i++) {
					for (int j = 1; j <= i ; j++) {
						if(i % j == 0) {
							cnt ++;
						}
						if(cnt >2) {
							cnt = 0;
							break;
						}
						
					}
					if(cnt == 2) {
						System.out.println(num+"보다 큰 첫번째 소수는 ");
						System.out.println(i);
						break;
					}
					
				}
				
				System.out.println();
				
				System.out.println("===문제5===");	//4 : 47 - 5:02
				
				/*
				[문제]

					[로또] 
					1~45사이의 랜덤값 6 개를 lotto1 에 저장할려고 한다.
					[조건] 중복되는숫자는 없어야한다. 
				*/

				int lotto1[] = new int[6];				
				int lotto[] = new int[45];
				
				for(int i = 0 ; i < 45 ; i++) {
					lotto[i] = ran.nextInt(45)+1;
					
				}
				System.out.println(Arrays.toString(lotto));
				
				for(int i = 0 ; i < lotto1.length ; i++) {
					lotto1[i] = lotto[ran.nextInt(45)+1]; 
					for(int k = 0 ; k < i ; k++) {
						
						if (lotto1[i] == lotto1[k]) {
							i--;
						}
				
						
					}
				}
				
				System.out.println(Arrays.toString(lotto1));
				
				System.out.println();
				System.out.println("===문제6===");	// 5:02 - 5:08
				
				/*
				아래배열에 랜덤으로 1~10 사이의숫자  3개를 저장한다.
				[조건]
					단, 3개의 숫자의 합은 반드시 20이여야하며, 똑같은 숫자는 없어야한다. 
					위치는 상관없다. 
					[예] 1,10,9
					[예] 9,10,1
				
			 */

			int hap[] = new int[3];
			total = 0 ;
			
			for (int i = 0; ; i++) {
				for(int k = 0 ; k < hap.length ; k++) {
					
				hap[k] = ran.nextInt(10)+1;	
				total += hap[k];	
					
				}
				if(total == 20) {
					System.out.println("20 입니다.");
					System.out.println(Arrays.toString(hap));
					break;
				}
				
				total = 0;
			}
			
			System.out.println();
			System.out.println("===문제7===");	//5:08 - 5:27
			
			/*
			   [문제] arr1 배열 안의 값들중에서 b배열의 값이 있으면 
				      b와 arr1의 각각 겹치는값을  0으로 변경	
				[조건] 겹치는 값이 여러개 있으면 전부 0으로 변경 	
				 예) arr1[] = {0,0,30,40,0};
				 예) b[] = {0,3,0,0,0,50};	
			 */
			    int arr1[] = {10,20,30,40,20};
			 	int b2[] = {10,3,20,10,20,50};
			 		
			 	for(int i = 0 ; i < arr1.length ; i++) {
			 		int temp = arr1[i];
			 		for(int k = 0 ; k < b2.length ; k++) {
			 			
			 			if(temp == b2[k]) {
			 				b2[k] = 0;
			 				for(int j = 0 ; j < arr1.length ; j++) {
			 						if(arr1[j] == temp) {
			 							arr1[j]=0 ;  // 이거 아닌것같습니다. :( 
			 						}
			 				}
			 				
			 			}
			 		}
			 		
			 		
			 		
			 	}
			 	System.out.println(Arrays.toString(arr1));
			 	System.out.println(Arrays.toString(b2));
			 	
				System.out.println();
				System.out.println("===문제8===");
			 	
			 	/*
				[문제]
					arr3 과 arr4 각각의 값들이 모두 같은지 검사하시오.
					전부 같으면 true, 틀린 값이 하나라도 있으면 false를 출력하시오.
					단, 위치는 달라도 상관없다. 
					중복된값이 있을수있고 하나씩 만 매칭이된다.
			  => 저 말은 배열이 {1,2,3,4,5} / {2,3,1,5,4} 이렇게 한개씩 매칭한다는 소리 

			    arr3 에 1이 2개 2가 2개 3이 2개 
			    arr4 에 1이 2개 2가 2개 3이 2개
			    니깐 true 

				[정답]
					true
					  int[] arr1 = {1, 2, 3, 1, 2, 3};
						int[] arr2 = {3, 2, 1, 2, 3, 1};
	
			 */

			    int[] arr3 = {1,2,3,1,2,3};
					int[] arr4 = {3,2,1,3,2,1};
				cnt = 0 ;
			 	
			 	for(int i = 0 ; i  < arr3.length ; i++) {
			 		for (int j = 0; j < arr4.length; j++) {
						if(arr4[i] == arr3[j]) {
							arr4[i] = 0;
							cnt ++;
							break;
						}
			 			
					}
	
			 	}
			System.out.println(cnt);
				
				System.out.println(cnt == arr3.length ? "true":"false");
				
				System.out.println();
				System.out.println("===문제9==="); //4분
					/*
					 1) seatList 는 영화관 7자리를 나타낸다. 
					 2) seatList 의 값들은 영화관 예매한 회원번호를 나타낸다. 
					 3) find의 값들은 검색하고자하는 회원번호들이다.
					 4) find 의 값을 영화관에서 찾아 자리를 출력해주자. 단, 없는번호는 "x" 출력
					 	- 예) [1] find : 1004 는 없으므로 "x" 출력 
					   - 예) [2] find : 1003 는 0 , 1
					   - 예) [3] find : 1001 는 6 
					   - 예) [4] find : 1005 는 없으므로 "x" 출력  
					 */
					int seatList[] = {1003,1003,0,0,1002,0,1001};	
					int find[] = {1004,1003,1001,1005};
					
				
					for(int i = 0 ; i < find.length ; i++) {
						int m = -1;
						System.out.printf("[%d] find : " , i);
						
						for(int k = 0 ; k < seatList.length ; k++) {

							if (find[i] == seatList[k]) {
								System.out.print(k+" ");
								m= 1;
							}
							
						}
						System.out.print(m == -1 ?"x" : "");
						System.out.println();
					}
					
					System.out.println();
					System.out.println("===문제10==="); //5분
					
					/*
					  1) seatList 는 영화관 7자리를 나타낸다. 
					  2) seatList 의 값들은 영화관 예매한 회원번호를 나타낸다. 
					  3) numList 는 회원번호이다.
					  4) countList 는 각회원들이 예매를 얼마나 했는지 개수를 표현한다.
					  5) seatList 를 검사해서 각 회원들이 예매한 수를 countList에저장한다.
					  
					  	예) int countList[] = {1,1,2,0};
					 */

					int seatList2[] = {1003,1003,0,0,1002,0,1001};
							
					int numList[] = {1001,1002,1003,1004};
					int countList[] = {0,0,0,0};
					
					for(int i = 0 ; i < numList.length ; i++) {
						for (int j = 0; j < seatList2.length; j++) {

							if (seatList2[j] == numList[i]) {
								countList[i] ++;
							}
							
						}
					}
					System.out.println(Arrays.toString(countList));
					
					System.out.println();
					System.out.println("===문제11==="); //14분
					
					/* [문제]  디데이 카운트 문제  
					 *  결과가 31 이 출력되어야한다 
					 * 시작 날짜와 끝 날짜가 주어질 때, 두 날짜가 며칠만큼 떨어져 있는지(D-day)를 
					 * 구하려 합니다. 이를 위해 다음과 같이
					 * 3단계로 간단히 프로그램 구조를 작성했습니다. (단, 윤년은 고려하지 않습니다.)
					 * 
					 * 1단계. 시작 날짜가 1월 1일로부터 며칠만큼 떨어져 있는지 구합니다.
			       2단계. 끝 날짜가 1월 1일로부터 며칠만큼 떨어져 있는지 구합니다. 
			       3단계. (2단계에서 구한 날짜) - (1단계에서 구한 날짜)를 구합니다.
				
					 * 시작 날짜의 월, 일을 나타내는 startMonth, startDay, 끝 날짜의 월, 일을 나타내는 endMonth, endDay가
					 * 매개변수로 주어질 때,
					 * 
					 * 잘못된 날짜가 주어지는 경우는 없습니다. 끝 날짜는 항상 시작 날짜보다 뒤에 있는 날이 주어집니다. 끝 날짜가 
					 * 다음 해로 넘어가는 경우는
					 * 주어지지 않습니다. 즉, startMonth <= endMonth를 항상 만족합니다. 
					 * startMonth = endMonth라면
					 * startDay <= endDay를 항상 만족합니다. 각 달의 날짜 수는
						1월부터 순서대로 [31, 28, 31, 30, 31, 30,
					 * 31, 31, 30, 31, 30, 31] 이며, 윤년은 고려하지 않습니다.

					 * | startMonth | startDay | endMonth | endDay | 결과|
					 * |-------------|-----------|-----------|-----|------ |
			       |  1          | 2         | 2         | 2   | 31    |
					 *
					 * 
					 * ##### 예시 설명 시작 날짜는 1월 2일이고, 끝 날짜는 2월 2일입니다.
					 * 
					 * 1월 2일은 1월 1일로부터 1일만큼 지난 날입니다. 2월 2일은 1월 1일로부터 32일만큼 지난 날입니다. 32 - 1 = 31입니다.
					 * 따라서 1월 2일과 2월 2일은 31일만큼 떨어져 있습니다.
					 * 
					 */

					int startMonth = 1;
					int startDay = 2;
					int endMonth = 2;
					int endDay = 2;
					int Month = 1;
			         cnt=0;
					int [] month = {31, 28, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
					
					for (int i = 0; i < month.length; i++) {
						
						for (int k= 1; k <= month[i]; k++) {
							
							if(startDay == k && Month == startMonth) {
								startDay = cnt;
							}
							if(endDay == k && endMonth == Month) {
								endDay = cnt;
								break;
							}
							
							cnt++;
						}
						Month++;
						
					}
					System.out.print("떨어져있는 날짜수  : ");
					System.out.println(endDay - startDay);
					
					System.out.println();
					System.out.println("===문제12==="); //14분
					
					   /*
						  *  아래 와 같은데이터일때 도서 연체여부 출력(단, 윤년은 계산하지않는다)
						 */

							int rentalPeriod = 70;
							int [] rentalDay = {2020 , 12, 29};
							int [] today = {2021, 3, 10};
							int mod = -1;
							 cnt = 0;
							 Month = 1;
							int monthList[] = {31, 28, 31, 30, 31, 31, 30,
									31 , 30 , 31 , 30 , 31};
							int year = 2020;
					
					for(int i = 0 ; i < monthList.length ; i++) {
						for (int k = 1; k <= monthList[i]; k++) {
							if(rentalDay[1] == Month &&rentalDay[2] ==k ) {
								mod = 1;
								
							}
							if(year ==today[0]&&today[1]== Month && today[2]==k  ) {
								mod = 2;
								break;
							}
							
							if(mod == 1) {
								
								cnt ++;
							}
							
						}
						Month ++;
						if (i == monthList.length-1) {
								year ++;
							Month = 1;
							i=0;
					}
				
						if (mod == 2) {
							break;
						}
					}
							
							System.out.println(rentalPeriod < cnt ?"연체되었습니다" :"연체일 이전입니다.");
							System.out.println(rentalPeriod - cnt);
							
		

	}

}
