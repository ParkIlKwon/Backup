package Level4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ����4 {

	public static void main(String[] args) {

		/*
	 	[ ���� ]	10: 01 - 10:07
	 		�Ʒ��迭�� ö���� �μ��� ���������� �������̴�. 
	 		������ ö���� �������̰� �������� �μ��� �������̴�
	 		
	 		����(0) , ����(1) , ��(2)
 			
 			�μ��� ö���� ��� 50��° ���� ������ ����������, �Ʒ��� ��Ģ��������.
 			[��Ģ]
 				�̱�� ��� 5����
 				���� ��� 1����
 				���� ��� 3���� 
 			
 			ö���� ������ ������ ���° ��ܿ� ������?
	 */
		System.out.println("==����1==");
		
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
							System.out.println("�����ϴ�.");
							chul+=1;
							min+=1;
						}else if ((arr[i][0]==0 && arr[i][1]==2)||(arr[i][0]==1 && arr[i][1]==0)||
								(arr[i][0]==2 && arr[i][1]==1)) {
							
							System.out.println("ö���� �̰���ϴ�.");
							chul += 5;
							min -= 3;
							
						}else {
							System.out.println("�μ��� �̰���ϴ�.");
							
							min += 5;
							chul -= 3;
							
							
						}
						
						
					}

				System.out.printf("ö���� ���� ���: %d\n" , chul);
		
				System.out.println();
				System.out.println("==����2=="); //10:07 - 10:16
				
				/*
				[ ���� ]
				
				���� �ýô� 5 , 5 ��ġ�� �ִ�.
				�迭�� ���ʼ������� �ӵ��� ���Ѵ�.
				�迭�� �����ʼ������� ���� ���ϰ� (0, 1, 2, 3) �� (��, ��, ��, ��) �� ���Ѵ�. 
				
				�ӵ� �� ������ �ýð� �Ź��̵��� ������ ����Ѱ��̴�. 
				
				��) �ӵ��� 4 �̰� ������ 0 �̴� ������ ���Ѵ�. 
				    y�� 4������  x : 5 , y : 9 ���ȴ�.
				
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
				
				System.out.printf("�ý� ������ġ[x,y]: %d,%d\n",x1,y1);
				
				System.out.println();
				System.out.println("==����3=="); //10:17-(���½ð�.) - 10: 43
				
				/*
				[����]
			 	������ ������ �Ϸ��� �Ѵ�. 
			 	������ �����̶� ���ڵ鸸 ȭ�鿡 ������ �����ڸ� ���ߴ°����̴�.
			 	���� ��� 3+3=6 �̶�� ȭ�鿡 �Ʒ��Ͱ��� ����̵ǰ�, ����ڴ� �����ڸ� ���ߴ°����̴�.
			 	-----------------------------
			 	3 ? 3 = 6 
			 	[1] + [2] - [3] *
			 	-----------------------------
				
				�Ʒ� �迭�� 5�����̰� 
					ù��° �������� ���� ������ �������̰� ,
					�ι�° �������� ���� ������ �������̰� , 
					������ �������� �������� �������̴�.  
				������ �����, ���ᰳ���� ����Ͻÿ�.
				
				��) ù��° ���� 5�̰� �ι�° ���� 9 �̰� �����ڴ� 0 �̸�  		
					5 ? 9 = 14 �̰�, ������ 1 �̴�.
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
					System.out.println("������ϴ�.");
					cnt++;
				}else {
					System.out.println("Ʋ�Ƚ��ϴ�.");
				}
				
			}
			
				System.out.println("����Ƚ��: " + cnt);
				
				System.out.println();
				System.out.println("==����4=="); //10:45 - 11:34
				
				/*
				[ ���� ]
				[����1] array �� b �� ���� ������ c �� �ε��� �ΰ���  ���ʴ�� �����Ѵ�. 
				[����2] ���� ���� �迭��ǥ���� -1 �� �����Ѵ�. 	
				[����]
				 10 , 90 , 50 �� �ְ� �ε����� ���� [0,0] [2,2] [1,1] �̹Ƿ� 
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
				System.out.println("==����5=="); //11:34 - 12: 12 
				
				/*
				  [ ���� ]
					[����1] a �� b �� ���� ������ c �� a�� �ε����� �ΰ���  ���ʴ�� ���� 
					[����2] ���� ���� �迭��ǥ���� -1 �� ���� 		
					
				[����]
				  10 , 90 , 50 �� �ְ� �ε����� ���� [0,0] [2,2] [1,1] �̹Ƿ� 
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
						int c1[][] = new int[5][2]; //2�����迭�� ����
						
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
						System.out.println("==����6==");  //3:40 - 3:45
						
						/*		
						data ����Ʈ�� ���ΰ����� ���� sumList ������		
						��) data[0] ==> 3,1,4,2 ==> sumList = {10,0,0,0,0};
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
					System.out.println("==����7==");  //3:46 - 3:50
					
					//�� ���� �迭�� �ִ� �迭�� ������ ��ĭ�� ���� �ø��� �ǾƷ�ĭ�� 0���� ä���.
					/*
						��)		
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
					System.out.println("==����8=="); // 3�ð� . 
					
					/* 
					�� mine�迭�� ���� 0�� �ڸ��� ���ڸ� �����ҷ����Ѵ�.
					�����Ҽ��ڴ� �ֺ� 8������ �˻��� 9�� ������ ���������.
							
					��) �Ʒ��� ���� ���  
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
					System.out.println("==����10=="); //4:01 - 4:31
					
					
					/*
					 �� �����ʹ� ������ �������̴�.
					 �������� �̷��� �����͸� ��� �����ҷ����Ѵ�.
					 ��) 33    ==> {3,2}
					 ��) 55555 ==> {5,5}
					 ��) 3     ==> {3,1};
					 ��) 444   ==> {4,3};
					  0���� �����Ұ� , 1���� ���ӵȰ��� 
					 ����) �� �����������͸� �м��� 2�������� �����Ͻÿ�.
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
					System.out.println("==����9=="); //4: 35 - 5:19
					
					/*
					 * �� �����ʹ� �����̱� ����� ������ �̴�. (7 x 5) ������
					 * [������ȣ] 
					 * [1 : ȣ����] [2 : ��] [3 : ����] [4 : �⸰]
					 * -------------------------------------------------
					 * [1] ���� 0 �� ����ִ°������Ѵ�.
					 * [2] ���� 0 �� �ƴѰ��� ������ �ִ°��� ���ϰ� ���ڴ� ������ȣ�̴�.
					 * [3] input�� �����ʹ� ���� �մԵ��� ������ ������ �ε�����ȣ�̴�.
					 * [4] ���δ����� �Ѷ����̰�, �ε�����ȣ�� ���η� ������ �ȴ�. (�� 0~4������ ����)
					 * [5] ������ �����κ� �Ʒ��� ���ͻ�����. �žƷ��� �����Ƿ� ���� ��ĭ�� �����´�.
					 * ��) input ==> 1 ==> 2,1,4,1,1 �����̰� �ǾƷ� 1 �� ������ 2,1,4,1 �̵ȴ�.
					 * [6] ���࿡ ���� ���� 0�� ������ �����ϰԵǸ�, "��" ��� 
					 * [7] ���� �Ǹŵ� ���� �̸��� ����Ͻÿ�. 
					 * ��) 
					 *    1 ==> [1:ȣ����]
					 *    0 ==> [2:��]
					 *    0 ==> [4:�⸰]
					 *    3 ==> [3:����]
					 *    3 ==> [0:��]
					 *    4 ==> [3:����]
					 *    4 ==> [4:�⸰]
					 
					 */
					
					int ȣ����=0;
					int �� = 0 ;
					int ���� = 0;
					int �⸰ = 0;
					
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
							System.out.println("ȣ���� �̾Ҵ�.");
							ȣ����++;
							
						}else if(machine[seroIdx][k] == 2) {
							System.out.println("�� �̾Ҵ�.");
							�� ++;
							
						}else if(machine[seroIdx][k] == 3) {
							System.out.println("���� �̾Ҵ�.");
							���� ++;
							
						}else if(machine[seroIdx][k] == 4) {
							System.out.println("�⸰ �̾Ҵ�.");
							�⸰++;
							
						}else {
							System.out.println("��");
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
						
			System.out.println("ȣ����:" + ȣ����);		
			System.out.println("��:" + ��);	
			System.out.println("����:" + ����);	
			System.out.println("�⸰:" + �⸰);	
					
					
						
								
								
								
						
						}		
			
			}


