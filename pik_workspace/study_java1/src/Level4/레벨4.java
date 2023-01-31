package Level4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class 레벨4 {

	public static void main(String[] args) {

		/*
	 	[ 문제 ]	10: 01 - 10:07
	 		아래배열은 철수와 민수의 가위바위보 데이터이다. 
	 		왼쪽이 철수의 데이터이고 오른쪽이 민수의 데이터이다
	 		
	 		가위(0) , 바위(1) , 보(2)
 			
 			민수와 철수는 계단 50번째 에서 게임을 시작했으며, 아래의 규칙을따른다.
 			[규칙]
 				이기면 계단 5증가
 				비기면 계단 1증가
 				지면 계단 3감소 
 			
 			철수는 게임이 종료후 몇번째 계단에 있을까?
	 */
		System.out.println("==문제1==");
		
				int arr[][] = {
								{1,0},
								{1,2},
								{2,0},
								{0,0},
								{1,1},
								{2,1},
						};
				
				
				int chul = 50 ;
				int min = 50 ;

				for (int i = 0; i < arr.length; i++) {
					
						
						if(arr[i][0] == arr[i][1]) {
							System.out.println("비겼습니다.");
							chul+=1;
							min+=1;
						}else if ((arr[i][0]==0 && arr[i][1]==2)||(arr[i][0]==1 && arr[i][1]==0)||
								(arr[i][0]==2 && arr[i][1]==1)) {
							
							System.out.println("철수가 이겼습니다.");
							chul += 5;
							min -= 3;
							
						}else {
							System.out.println("민수가 이겼습니다.");
							
							min += 5;
							chul -= 3;
							
							
						}
						
						
					}

				System.out.printf("철수의 최종 계단: %d\n" , chul);
		
				System.out.println();
				System.out.println("==문제2=="); //10:07 - 10:16
				
				/*
				[ 문제 ]
				
				현재 택시는 5 , 5 위치에 있다.
				배열의 왼쪽세로줄은 속도를 뜻한다.
				배열의 오른쪽세로줄은 방향 뜻하고 (0, 1, 2, 3) 은 (북, 동, 남, 서) 를 뜻한다. 
				
				속도 와 방향은 택시가 매번이동한 내용을 기록한것이다. 
				
				예) 속도는 4 이고 방향은 0 이니 북쪽을 뜻한다. 
				    y가 4증가해  x : 5 , y : 9 가된다.
				
				*/
				
				int tarr[][] = {
						{4,0},
						{2,1},
						{1,3},
						{5,2},
						{4,2},
						{2,1}
				};
				
				arr= tarr; 
				
				int x1 = 5;
				int y1 = 5;
				
				for (int i = 0; i < arr.length; i++) {
					if(arr[i][1]==0) {
						y1+= arr[i][0];
					}else if(arr[i][1]==1) {
						x1+= arr[i][0];
					}else if(arr[i][1]==2) {
						y1-= arr[i][0];
					}else {
						x1-= arr[i][0];
					}
				
					
				}
				
				System.out.printf("택시 최종위치[x,y]: %d,%d\n",x1,y1);
				
				System.out.println();
				System.out.println("==문제3=="); //10:17-(쉬는시간.) - 10: 43
				
				/*
				[문제]
			 	연산자 게임을 하려고 한다. 
			 	연산자 게임이란 숫자들만 화면에 나오고 연산자를 맞추는게임이다.
			 	예를 들어 3+3=6 이라면 화면에 아래와같이 출력이되고, 사용자는 연산자를 맞추는게임이다.
			 	-----------------------------
			 	3 ? 3 = 6 
			 	[1] + [2] - [3] *
			 	-----------------------------
				
				아래 배열은 5문제이고 
					첫번째 세로줄은 앞의 숫자의 데이터이고 ,
					두번째 세로줄은 뒤의 숫자의 데이터이고 , 
					세번재 세로줄은 연산자의 데이터이다.  
				게임을 만들고, 맞춘개수를 출력하시오.
				
				예) 첫번째 값은 5이고 두번째 값은 9 이고 연산자는 0 이면  		
					5 ? 9 = 14 이고, 정답은 1 이다.
					[1] + [2] - [3] * 	 	
			*/
				Scanner sc =new Scanner(System.in);
				
			int qarr[][] = {
							{5,9,0},
							{3,7,1},
							{8,4,2},
							{9,2,2},
							{4,6,1},
					};
			
			 arr = qarr;
			 int cnt = 0;
			 
			
			for (int i = 0; i < arr.length; i++) {
				int total = 0;
				for (int k = 0; k < arr[i].length-1; k++) {
					
					System.out.print(arr[i][k]);
					if(k == 0) {
						System.out.print("?");
					}else if (k==1) {
						System.out.print("=");
						
					}
		
				}
				
				if(arr[i][2] == 0) {
					System.out.println(total = arr[i][0] + arr[i][1]);
				}else 	if(arr[i][2] == 1) {
					System.out.println(total = arr[i][0] - arr[i][1]);
				}else {
					System.out.println(total = arr[i][0] * arr[i][1]);
				}
				
				
				System.out.print("\n[1] + [2] - [3] * ");
				int sel = sc.nextInt();
				sel--;
				System.out.println();
				if(sel == arr[i][2]) {
					System.out.println("맞췄습니다.");
					cnt++;
				}else {
					System.out.println("틀렸습니다.");
				}
				
			}
			
				System.out.println("맞춘횟수: " + cnt);
				
				System.out.println();
				System.out.println("==문제4=="); //10:45 - 11:34
				
				/*
				[ 문제 ]
				[조건1] array 에 b 의 값이 있으면 c 에 인덱스 두개씩  차례대로 저장한다. 
				[조건2] 값이 없는 배열값표현은 -1 로 저장한다. 	
				[정답]
				 10 , 90 , 50 이 있고 인덱스는 각각 [0,0] [2,2] [1,1] 이므로 
				 c = {0,0,2,2,1,1,-1,-1,-1,-1}
				*/
				int array[][] = {
								{10,20,30},
								{40,50,60},
								{70,80,90},
						};
				
				int b [] = {10,2,54,90,50};
				int c [] = new int [b.length*2];
				int idx1 =0 , idx2 =0;
				int idx = 0;
				
						
				for (int i = 0; i < b.length; i++) {
					int mod = -1;
					
					loop:
					for (int k = 0; k < array.length; k++) {
						for (int j = 0; j < array[k].length; j++) {
							
							if(array[k][j] == b[i] && mod ==-1) {
								idx1 = k;
								idx2 = j;
								mod = 1;
								break loop;
							}
							
							
					}
					}
					
					if(mod == 1) {
						
						c[idx] = idx1 ; 
						c[idx+1] = idx2;
						idx+=2;
					}else {
						for (int k = idx; k < c.length; k++) {
							c[k] = -1;
						}
						
					}
					
					
				}	
						
						System.out.println(Arrays.toString(c));
						
				System.out.println();
				System.out.println("==문제5=="); //11:34 - 12: 12 
				
				/*
				  [ 문제 ]
					[조건1] a 에 b 의 값이 있으면 c 에 a의 인덱스를 두개씩  차례대로 저장 
					[조건2] 값이 없는 배열값표현은 -1 로 저장 		
					
				[정답]
				  10 , 90 , 50 이 있고 인덱스는 각각 [0,0] [2,2] [1,1] 이므로 
					c = {
					{0,0},
					{2,2},
					{1,1},
					{-1,-1},
					{-1,-1}
				}
				*/
				idx = 0;
				int a[][] = {
								{10,20,30},
								{40,50,60},
								{70,80,90},
						};
						int b1 [] = {10,2,54,90,50};
						int c1[][] = new int[5][2]; //2차원배열에 저장
						
						for (int i = 0; i < b1.length; i++) {
							int mod = -1;
							 idx1 = -1;
							 idx2 = -1;
							
							
							for (int k = 0; k < array.length; k++) {
								for (int j = 0; j < array[k].length; j++) {
									
									if(array[k][j] == b1[i] && mod ==-1) {
										idx1 = k;
										idx2 = j;
										mod = 1;
										break ;
									}
									
									
							}
							}
							
						if(idx1 != -1) {
							c1[idx][0] = idx1;
							c1[idx][1] = idx2;
							idx ++;
						}else {
							for(int k = idx; k < c1.length ;k++ ) {
								for (int j = 0; j < c1[i].length; j++) {
									
									c1[k][j] = -1;
								}
								
							}
							
						}
							
								
							}
							
						for (int i = 0; i < c1.length; i++) {
				
								System.out.println(Arrays.toString(c1[i]));
							
						}
							
						System.out.println();
						System.out.println("==문제6==");  //3:40 - 3:45
						
						/*		
						data 리스트의 세로값들의 합을 sumList 에저장		
						예) data[0] ==> 3,1,4,2 ==> sumList = {10,0,0,0,0};
						*/

						int data[][] = {
										{0,0,0,0,0},
										{0,0,0,0,3},
										{0,2,0,0,3},
										{3,1,3,0,1},
										{1,4,2,0,2},
										{4,1,4,0,4},
										{2,1,4,3,3},
								};		
					int[] sumList = {0,0,0,0,0};
						
					for (int i = 0; i < data.length; i++) {
						
						for (int k = 0; k < sumList.length; k++) {

							sumList[k] += data[i][k];
							
							
						}
					}
								
					System.out.println(Arrays.toString(sumList));
					
					System.out.println();
					System.out.println("==문제7==");  //3:46 - 3:50
					
					//위 같은 배열이 있다 배열의 값들을 한칸씩 위로 올리고 맨아래칸은 0으로 채운다.
					/*
						예)		
							{ 2, 5, 1, 3, 5 }, 
							{ 1, 2, 1, 3, 9 } ,
							{ 0, 0, 0, 0, 0 },		
					 */
					int taarr[][] = {

									{ 3, 1, 2, 5, 6 },
									{ 2, 5, 1, 3, 5 }, 
									{ 1, 2, 1, 3, 9 } 
							};
					
					 arr = taarr;
					
					for (int i = 0; i < arr.length-1; i++) {
						
						for (int k = 0; k < arr[i].length; k++) {
							arr[i][k] = arr[i+1][k];
							arr[i+1][k] = 0;
							
							
						}
						
						
					}
					
					for (int i = 0; i < arr.length; i++) {
						System.out.println(Arrays.toString(arr[i]));
						
					}
					
					System.out.println();
					System.out.println("==문제8=="); // 3시간 . 
					
					/* 
					위 mine배열의 숫자 0의 자리에 숫자를 저장할려고한다.
					저장할숫자는 주변 8방향을 검사후 9의 개수를 저장후출력.
							
					예) 아래와 같이 출력  
						   {2,9,2},
						   {9,4,9},
						   {1,3,9}

			*/			
					
					int [][]mine =	{
									{0,9,0},
									{9,0,9},
									{0,0,9}
					                                        };
					
					int x[] = {-1,0,1,-1,1,-1,0,1};
					int y[]= {-1,-1,-1,0,0,1,1,1};
					int k = 0;
					int tx = 0 ; 
					int ty = 0;
					 cnt = 0;
					
					for (int i = 0; i < mine.length; i++) {
					
							for ( k = 0; k < mine[i].length; k++) {
								
								int mod = -1;
								
								if (mine[i][k] == 0) {
									mod=1;
								}
								
								
								if(mod == 1) {
									cnt = 0;
								
								for (int m = 0; m < x.length; m++) {
										 tx = k+x[m];
										 ty =i+ y[m];
										 
								if(tx > -1 && ty > -1 && tx < mine.length && ty < mine.length  ){	
									if(mine[ty][tx] == 9) {
										System.out.println(i + " " +k);
										System.out.println( " ="+tx + " " + ty);
										 cnt++;
										 
									}
								}
									
								}	
									
									mine[i][k] = cnt;
						}
						
					}
							
					}
					
					for (int i = 0; i < mine.length; i++) {
						System.out.println(Arrays.toString(mine[i]));
						
					}
					
				
					
					System.out.println();
					System.out.println("==문제10=="); //4:01 - 4:31
					
					
					/*
					 위 데이터는 압축전 데이터이다.
					 연속으로 이뤄진 데이터를 모아 압축할려고한다.
					 예) 33    ==> {3,2}
					 예) 55555 ==> {5,5}
					 예) 3     ==> {3,1};
					 예) 444   ==> {4,3};
					  0번은 압축할값 , 1번은 연속된개수 
					 문제) 위 압축전데이터를 분석후 2차원으로 저장하시요.
				*/
			    int before[] = {3,3,5,5,5,5,5,3,4,4,4};		
					int after[][] = new int[4][2];
						 idx = 0;
						  cnt = 0;
					
					for (int i = 0; i < before.length-1; i++) {
						 int num = before[i];
						cnt ++;
						
						after[idx][0] = before[i];
						after[idx][1] = cnt;
							if(num != before[i+1]) {
								idx++;
								cnt = 0;
							}
						
					}
					
					if(after[idx][0] == before[before.length-1]) {
						after[idx][1] +=1;
					}
					
					
					for (int i = 0; i < after.length; i++) {
						System.out.println(Arrays.toString(after[i]));
						
					}
					
					
					System.out.println();
					System.out.println("==문제9=="); //4: 35 - 5:19
					
					/*
					 * 위 데이터는 인형뽑기 기계의 데이터 이다. (7 x 5) 사이즈
					 * [인형번호] 
					 * [1 : 호랑이] [2 : 곰] [3 : 사자] [4 : 기린]
					 * -------------------------------------------------
					 * [1] 숫자 0 은 비어있는것을뜻한다.
					 * [2] 숫자 0 이 아닌곳은 인형이 있는것을 뜻하고 숫자는 인형번호이다.
					 * [3] input의 데이터는 오늘 손님들이 인형을 선택한 인덱스번호이다.
					 * [4] 세로단위로 한라인이고, 인덱스번호는 가로로 선택이 된다. (예 0~4번까지 가능)
					 * [5] 인형은 각라인별 아래서 부터뽑힌다. 매아래가 뽑히므로 전부 한칸씩 내려온다.
					 * 예) input ==> 1 ==> 2,1,4,1,1 라인이고 맨아래 1 이 뽑히면 2,1,4,1 이된다.
					 * [6] 만약에 전부 값이 0인 라인을 선택하게되면, "꽝" 출력 
					 * [7] 오늘 판매된 인형 이름을 출력하시요. 
					 * 예) 
					 *    1 ==> [1:호랑이]
					 *    0 ==> [2:곰]
					 *    0 ==> [4:기린]
					 *    3 ==> [3:사자]
					 *    3 ==> [0:꽝]
					 *    4 ==> [3:사자]
					 *    4 ==> [4:기린]
					 
					 */
					
					int 호랑이=0;
					int 곰 = 0 ;
					int 사자 = 0;
					int 기린 = 0;
					
				int machine[][] = {
								{0,0,0,0,0},
								{0,0,0,0,3},
								{0,2,0,0,3},
								{3,1,3,0,1},
								{1,4,2,0,2},
								{4,1,4,0,4},
								{2,1,4,3,3},
						};
						int input[] = {1,0,0,3,3,4,4};
						int seroIdx = machine.length-1;
						int sizeG = machine[0].length;
						idx = 0;
						
						
			for (int i = 0; i < input.length; i++) {
				
				idx = input[i];
				for ( k = 0; k < sizeG; k++) {
					
					if(k ==idx) {
						
						if(machine[seroIdx][k] == 1) {
							System.out.println("호랑이 뽑았다.");
							호랑이++;
							
						}else if(machine[seroIdx][k] == 2) {
							System.out.println("곰 뽑았다.");
							곰 ++;
							
						}else if(machine[seroIdx][k] == 3) {
							System.out.println("사자 뽑았다.");
							사자 ++;
							
						}else if(machine[seroIdx][k] == 4) {
							System.out.println("기린 뽑았다.");
							기린++;
							
						}else {
							System.out.println("꽝");
						}
						
					}
					
				}
		
				for ( k = machine.length-1; k > 0; k--) {
					for (int k2 = 0; k2 < machine[i].length; k2++) {
						
						if(k2 == idx) {
							machine[k][k2] = machine[k-1][k2];
						}
						
						
						
					}
				}
				
				
				
				
				
			}			
						
			for (int i = 0; i < machine.length; i++) {
				System.out.println(Arrays.toString(machine[i]));
				
			}
						
			System.out.println("호랑이:" + 호랑이);		
			System.out.println("곰:" + 곰);	
			System.out.println("사자:" + 사자);	
			System.out.println("기린:" + 기린);	
					
					
						
								
								
								
						
						}		
			
			}


