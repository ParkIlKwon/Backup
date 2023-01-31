package Level3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �迭3 {
	public static void main(String[] args) {
		
		/*
		[����]
		������ ������ �Ϸ��� �Ѵ�. 
		������ �����̶� ���ڵ鸸 ȭ�鿡 ������ �����ڸ� ���ߴ°����̴�.
		���� ��� 3+3=6 �̶�� ȭ�鿡 �Ʒ��Ͱ��� ����̵ǰ�, ����ڴ� �����ڸ� ���ߴ°����̴�.
		-----------------------------
		3 ? 3 = 6 
		[1] + [2] - [3] *
		-----------------------------
		
		�Ʒ� �迭�� 6�����̰� a�� ���� ���� b�� ���� ���� op�� �����ڸ� ���Ѵ�. 
		������ �����, ���ᰳ���� ����Ͻÿ�.	
	*/
	System.out.println();
	System.out.println("===����1===");	//�˼��մϴ� �ð�üũ ���߽��ϴ� . �뷫 15��.
		
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
			System.out.println("���� �߸��Է��ϼ̽��ϴ�.");
			i--;
			continue;
		}
		
		if(op2 == sel) {
			System.out.println("�����Դϴ�.");
			cnt++;
		}else {
			System.out.println("�����Դϴ� �̤�");
		}
		
		System.out.println();
		
	}
	System.out.println("���� ���� �� :" + cnt);
	
	System.out.println();
	System.out.println("===����2===");	// 3:51 - 3:56
	
	/*
	[����]	  
	1. ���� ���ڰ� �����ִ� ī�� 2�徿 5��Ʈ���ִ�. (��10��)
	2. front �� ī�带 ����� ���¸� ���Ѵ�. ������������ʴ´�. 
	3. ���� front �� �����Ѵ�. 
	4. front �� �ִ� ī�� 2���� �����Ѵ�. (���콺�������Ƿ� �ε����� ����)
	5. ������ī�� 2���� ������ ������  back �� �����ؼ� ����� ǥ���Ѵ�. 
	   back�� ��� ���� �� ä������ ������ ����ȴ�. 
	6. ȭ�鿡�� �һ� back �迭�� ����Ѵ�.     
	 [����] ���� �ε��� �����Ҽ�����. 	   
	 ��)
	 [1] �ʱ�ȭ 
	   front = {"a", "a", "b", "b", "c", "c", "d", "d", "e" , "e" };
	   back  = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-" };
	
	 [2] ���� 
	   front = {"a", "e", "c", "b", "d", "c", "b", "d", "a", "e"};
	
	 [3] �ε��� �Է� 	   
	   1) �ε��� 2�� ==>  0 , 8  ==>front �迭�� �ε��� 0, �� 8 �� ����  a , a �� 
	              ���� ���� �����̹Ƿ� back �� ����
	   	back  =  {"a", "-", "-", "-", "-", "-", "-", "-", "a", "-"};
	   	
	   2) �ε��� 2�� ==>  1 , 2  ==>front �迭�� �ε��� 1, �� 2�� ���� e , c �� 
	              ���� �ٸ������̹Ƿ� �ƹ��Ͼ���
	   	back  =  {"a", "-", "-", "-", "-", "-", "-", "-", "a", "-"};
*/
		Random ran = new Random();	
		String[] front = {"a", "a", "b", "b", "c", "c", "d", "d", "e" , "e"};
		String[] back = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};
		System.out.println(" [1] �ʱ�ȭ ");
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
		
		System.out.println(" [2] ���� ");
		System.out.println(Arrays.toString(front));
		
		System.out.println(" [3] �ε��� �Է� ");
		
		for (int i = 0; i < back.length /2 ; i++) {
			System.out.print("ù��° �ε����� �Է��Ͽ��ּ���: ");
			int sel1 = sc.nextInt();
			System.out.print("�ι�° �ε����� �Է��Ͽ��ּ���: ");
			int sel2 = sc.nextInt();
			
			if(sel1 == sel2) {
				System.out.println("�Է¿���");
				i--;
			}
			
			if(back[sel1] != "-") {
				System.out.println("�̹� ���� �ڸ��Դϴ�.");
			}
			
			if(front[sel1] == front[sel2]) {
				back[sel1] = front [sel1];
						back[sel2] = front [sel2];
				
			}else {
				System.out.println("Ʋ������ �ƹ��ϵ� �Ͼ�� �ʽ��ϴ�.");
				i--;
			}
			
			System.out.println(Arrays.toString(back));
			
			
		}
		System.out.println("-���� �ݺ��� �迭 ����-");
		System.out.println();
		System.out.println("===����1===");		// 3:57 - 4:05
			
		/*
		 * �Ʒ��迭�� �������� (1~9����) �� 10�� �����Ѵ�. 
		 * ���������� ¦���� �������� ���������� ������ ����.
		 * �װ����� ���������� ����䰳���� ����Ѵ�.
		 * 
		 * [����]
		 * 		1,6,4,3,2,4,8,6,1,2
		 * 		
		 * [����] 
		 * 		6,4 ������ 2ĭ�̹Ƿ� 2
		 * 		2,4,8,6 ������ 4ĭ�̹Ƿ� 4
		 * 		������ 2�� �Ѱ��̹Ƿ� 1
		 * 		����䰳���� 4
		 * [����] 
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
			
			System.out.println(max + "��");
			arr = null;
			
			System.out.println();
			System.out.println("===����2===");	// 4:07 - 4:15

			/*
	        �������� (1~9) ������ ����  8���� ����Ѵ�. 
	        �� �Ʒ��� ������ �����Ѵ�. 
	        
	        ���� ��� ���ڰ� 4 5 6 1 2 3 4 5 �̶�� �Ѵٸ�
	        �Ʒ��� ���� ����Ѵ�. 
	        
	        [���]
	           4 5 6
	           5 6 1
	           6 1 2
	           1 2 3
	           2 3 4
	           3 4 5 
	    	
			 */
			arr = new int [8];
	
			//int [] arr2 = {4,5,6,1,2,3,4,5};			// ���� ���� 
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
			
			System.out.println("===����3===");	// 4: 17 - 4: 32
			
			/*
			  [����] a �迭 ���� �����߿��� b�迭�� ���� ������ 
				    a �� b �� ���� ��ġ�°��� b�迭�� �ε����� c������
				   	
			   [��] 
			   		b�� �������� �ε����� �����ϹǷ� 0�� 0,2�̴�.
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
				
				System.out.println("===����4===");	//4:34 - 4 : 46
				
				/*
				// ������ �ݺ������θ� Ǯ�� 

				 [���� �Ҽ� ã��]
					  1. ���ڸ� �� �� �Է¹޴´�.
					 2. �Է¹��� ���ں��� ū ù ��° �Ҽ��� ����Ѵ�.
					  
					 ��) Enter Number ? 1000
					    1000���� ū ù���� �Ҽ��� 1009
					  ��) Enter Number ? 500
					    500���� ū ù��° �Ҽ��� 503

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
						System.out.println(num+"���� ū ù��° �Ҽ��� ");
						System.out.println(i);
						break;
					}
					
				}
				
				System.out.println();
				
				System.out.println("===����5===");	//4 : 47 - 5:02
				
				/*
				[����]

					[�ζ�] 
					1~45������ ������ 6 ���� lotto1 �� �����ҷ��� �Ѵ�.
					[����] �ߺ��Ǵ¼��ڴ� ������Ѵ�. 
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
				System.out.println("===����6===");	// 5:02 - 5:08
				
				/*
				�Ʒ��迭�� �������� 1~10 �����Ǽ���  3���� �����Ѵ�.
				[����]
					��, 3���� ������ ���� �ݵ�� 20�̿����ϸ�, �Ȱ��� ���ڴ� ������Ѵ�. 
					��ġ�� �������. 
					[��] 1,10,9
					[��] 9,10,1
				
			 */

			int hap[] = new int[3];
			total = 0 ;
			
			for (int i = 0; ; i++) {
				for(int k = 0 ; k < hap.length ; k++) {
					
				hap[k] = ran.nextInt(10)+1;	
				total += hap[k];	
					
				}
				if(total == 20) {
					System.out.println("20 �Դϴ�.");
					System.out.println(Arrays.toString(hap));
					break;
				}
				
				total = 0;
			}
			
			System.out.println();
			System.out.println("===����7===");	//5:08 - 5:27
			
			/*
			   [����] arr1 �迭 ���� �����߿��� b�迭�� ���� ������ 
				      b�� arr1�� ���� ��ġ�°���  0���� ����	
				[����] ��ġ�� ���� ������ ������ ���� 0���� ���� 	
				 ��) arr1[] = {0,0,30,40,0};
				 ��) b[] = {0,3,0,0,0,50};	
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
			 							arr1[j]=0 ;  // �̰� �ƴѰͰ����ϴ�. :( 
			 						}
			 				}
			 				
			 			}
			 		}
			 		
			 		
			 		
			 	}
			 	System.out.println(Arrays.toString(arr1));
			 	System.out.println(Arrays.toString(b2));
			 	
				System.out.println();
				System.out.println("===����8===");
			 	
			 	/*
				[����]
					arr3 �� arr4 ������ ������ ��� ������ �˻��Ͻÿ�.
					���� ������ true, Ʋ�� ���� �ϳ��� ������ false�� ����Ͻÿ�.
					��, ��ġ�� �޶� �������. 
					�ߺ��Ȱ��� �������ְ� �ϳ��� �� ��Ī�̵ȴ�.
			  => �� ���� �迭�� {1,2,3,4,5} / {2,3,1,5,4} �̷��� �Ѱ��� ��Ī�Ѵٴ� �Ҹ� 

			    arr3 �� 1�� 2�� 2�� 2�� 3�� 2�� 
			    arr4 �� 1�� 2�� 2�� 2�� 3�� 2��
			    �ϱ� true 

				[����]
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
				System.out.println("===����9==="); //4��
					/*
					 1) seatList �� ��ȭ�� 7�ڸ��� ��Ÿ����. 
					 2) seatList �� ������ ��ȭ�� ������ ȸ����ȣ�� ��Ÿ����. 
					 3) find�� ������ �˻��ϰ����ϴ� ȸ����ȣ���̴�.
					 4) find �� ���� ��ȭ������ ã�� �ڸ��� ���������. ��, ���¹�ȣ�� "x" ���
					 	- ��) [1] find : 1004 �� �����Ƿ� "x" ��� 
					   - ��) [2] find : 1003 �� 0 , 1
					   - ��) [3] find : 1001 �� 6 
					   - ��) [4] find : 1005 �� �����Ƿ� "x" ���  
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
					System.out.println("===����10==="); //5��
					
					/*
					  1) seatList �� ��ȭ�� 7�ڸ��� ��Ÿ����. 
					  2) seatList �� ������ ��ȭ�� ������ ȸ����ȣ�� ��Ÿ����. 
					  3) numList �� ȸ����ȣ�̴�.
					  4) countList �� ��ȸ������ ���Ÿ� �󸶳� �ߴ��� ������ ǥ���Ѵ�.
					  5) seatList �� �˻��ؼ� �� ȸ������ ������ ���� countList�������Ѵ�.
					  
					  	��) int countList[] = {1,1,2,0};
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
					System.out.println("===����11==="); //14��
					
					/* [����]  ���� ī��Ʈ ����  
					 *  ����� 31 �� ��µǾ���Ѵ� 
					 * ���� ��¥�� �� ��¥�� �־��� ��, �� ��¥�� ��ĥ��ŭ ������ �ִ���(D-day)�� 
					 * ���Ϸ� �մϴ�. �̸� ���� ������ ����
					 * 3�ܰ�� ������ ���α׷� ������ �ۼ��߽��ϴ�. (��, ������ ������� �ʽ��ϴ�.)
					 * 
					 * 1�ܰ�. ���� ��¥�� 1�� 1�Ϸκ��� ��ĥ��ŭ ������ �ִ��� ���մϴ�.
			       2�ܰ�. �� ��¥�� 1�� 1�Ϸκ��� ��ĥ��ŭ ������ �ִ��� ���մϴ�. 
			       3�ܰ�. (2�ܰ迡�� ���� ��¥) - (1�ܰ迡�� ���� ��¥)�� ���մϴ�.
				
					 * ���� ��¥�� ��, ���� ��Ÿ���� startMonth, startDay, �� ��¥�� ��, ���� ��Ÿ���� endMonth, endDay��
					 * �Ű������� �־��� ��,
					 * 
					 * �߸��� ��¥�� �־����� ���� �����ϴ�. �� ��¥�� �׻� ���� ��¥���� �ڿ� �ִ� ���� �־����ϴ�. �� ��¥�� 
					 * ���� �ط� �Ѿ�� ����
					 * �־����� �ʽ��ϴ�. ��, startMonth <= endMonth�� �׻� �����մϴ�. 
					 * startMonth = endMonth���
					 * startDay <= endDay�� �׻� �����մϴ�. �� ���� ��¥ ����
						1������ ������� [31, 28, 31, 30, 31, 30,
					 * 31, 31, 30, 31, 30, 31] �̸�, ������ ������� �ʽ��ϴ�.

					 * | startMonth | startDay | endMonth | endDay | ���|
					 * |-------------|-----------|-----------|-----|------ |
			       |  1          | 2         | 2         | 2   | 31    |
					 *
					 * 
					 * ##### ���� ���� ���� ��¥�� 1�� 2���̰�, �� ��¥�� 2�� 2���Դϴ�.
					 * 
					 * 1�� 2���� 1�� 1�Ϸκ��� 1�ϸ�ŭ ���� ���Դϴ�. 2�� 2���� 1�� 1�Ϸκ��� 32�ϸ�ŭ ���� ���Դϴ�. 32 - 1 = 31�Դϴ�.
					 * ���� 1�� 2�ϰ� 2�� 2���� 31�ϸ�ŭ ������ �ֽ��ϴ�.
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
					System.out.print("�������ִ� ��¥��  : ");
					System.out.println(endDay - startDay);
					
					System.out.println();
					System.out.println("===����12==="); //14��
					
					   /*
						  *  �Ʒ� �� �����������϶� ���� ��ü���� ���(��, ������ ��������ʴ´�)
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
							
							System.out.println(rentalPeriod < cnt ?"��ü�Ǿ����ϴ�" :"��ü�� �����Դϴ�.");
							System.out.println(rentalPeriod - cnt);
							
		

	}

}
