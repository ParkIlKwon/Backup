package Level3;

import java.util.Arrays;
import java.util.Scanner;

public class 배열2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * [문제] 12:59 - 1:15 arr배열의 값들을 
		 * 순차적으로 절반은 temp1에 저장하고 나머지 절반은 temp1에 저장한 뒤의 숫자부터
		 * 순차적으로 temp2에 저장하시오. 단, arr의 배열의 길이가 홀수이면, temp1의 배열의 크기를 temp2 보다 개수가 한 개 만큼
		 * 더 크게 만들어서 식을 진행하시오. [정답] temp1 = {12, 232, 3123, 14, 25} temp2 = {46, 27, 18,
		 * 569}
		 */
		System.out.println();
		System.out.println("===문제1===");	

	int[] arr = {12, 232, 3123, 14, 25, 46, 27, 18,569};	
	int[] temp1 = null;
	int[] temp2 = null;
	
	int size  = arr.length/2;
	
	if(arr.length %2 == 1) {
		size= arr.length/2 + 1;
		
	}

	 temp1 = new int [size];
	
	if(size != arr.length/2) {
		size= arr.length/2;
	}
	temp2= new int [size];	
	
	for(int i = 0 ; i < temp1.length ; i++) {
		temp1[i] = arr[i];
	}
	
	int idx = temp1.length;
	for(int i = 0 ; i < temp2.length ; i++) {
		temp2[i] = arr[idx];
		idx++;
	}
		
		System.out.println(Arrays.toString(temp1));
		System.out.println(Arrays.toString(temp2));
		

		System.out.println();
		System.out.println("===문제2===");		// 1:18 - (점심시간) -  2:16
		
		/*
		[문제]
		아래배열 a 의 안에 있는 값을 하나 입력받는다.
		b배열안에 위에서 입력한 값을 제외하고 복사한다.
		[예] 30 ==> b[] = {10,20,40,50};
	 */

	int a[] = { 10, 20, 30, 40, 50 };
	int b[] = null;
	System.out.println(Arrays.toString(a));
	System.out.println("제거할 값을 입력하세요.");
	int input = sc.nextInt(); // 사용자가 입력 
	 idx = -1;
	 int chk = 0 ;
	
	b = new int [a.length-1];
	
	for(int i = 0 ; i < a.length ; i++) {
		if(input == a[i]) {
			idx = i;
			break;
		}
		
	}
	
	if(idx == -1) {
		System.err.println("값을 잘못입력하였습니다. ");
	}
	else{
		for(int i = 0 ; i < a.length ; i++) {
			if(idx != i) {
				b[chk] = a[i];
				chk++;
			}
			
			
		}
		System.out.println(Arrays.toString(b));
		
		
	}
	
	System.out.println();
	System.out.println("===문제3===");	//3:30 - 3:42
	
	/*
	[문제] 
	아래 배열 c는 번호와 값이 한쌍인 배열이다. 
	번호를 하나를 입력받고 c배열에 있는 번호이면, 
	그번호와  값만 제외하고 d배열에 복사한다.
	[예]  
		c[] = { 1001, 40, 1002, 65, 1003, 70 };
		입력 : 1002 
		c[] = {1001, 40, 1003, 70}; 
 */

	int c[] = { 1001, 40, 1002, 65, 1003, 70 };
	int d[] = null;
	
	idx = -1;
	chk= 0;

	
	while(true) {
		
		System.out.println("1001~ 1003까지만 입력하시오.");
		input = sc.nextInt();
		
	for(int i = 0 ; i < c.length ; i+=2) {
		if(input == c[i]) {
			idx = i;
		}
	}
	
	if(idx ==-1) {
	System.err.println("값을 잘못입력하였습니다. ");
	continue;
	}else {
		d = new int[c.length-2];
		
		for(int i = 0 ; i<c.length ;i+=2) {
			if(idx != i) {
				
				d[chk] = c[i];
				d[chk+1] = c[i+1];
				chk+=2;
				
			}
		}
		
		
	}
	
	
	
	System.out.println(Arrays.toString(d));
	break;
	
	}

		System.out.println();
		System.out.println("===문제4==="); // 3:43 - 4:20

		/*
		 * [문제] 인덱스 번호 , 점수를 입력받고 b배열에 삽입을 하시오. 
		 * [예] 1 , 1004 , 60 int b[] = { 1001, 40,
		 * 1004, 60, 1002, 65, 1003, 70};
		 */

		int c1[] = { 1001, 40, 1002, 65, 1003, 70 };
		int b1[] = null;
		 idx = 0;
		 chk = 0;

		b1 = new int[c1.length + 2];
		
		while(true) {
		System.out.println("인덱스  ");
		idx = sc.nextInt();
		
		if(idx >= c1.length/2 || idx < 0) {
			System.err.println("잘못된 인덱스를 입력하였습니다.");
			continue;
		}
		if(idx != 0) {
			idx++;
		}
		
		break;
		}
		System.out.println("번호 ");
		int num = sc.nextInt();
		System.out.println("점수 ");
		int score = sc.nextInt();
		
		
		
		for(int i = 0 ; i < c1.length+2 ; i++) {
			
			if(idx != i ) {
				b1[i] = c1[chk] ; 
				chk++;
				
			}else {
				b1[i] = num;
				b1[i+1] = score;
				
				i++;
			}
			
		}
		
		System.out.println(Arrays.toString(b1));
		b1 = null;
	System.out.println();
	System.out.println("===문제5==="); //4:  30 - 4: 49
		idx = 0;
	/*
	[문제] 값을 입력받고 삭제 
	[조건] 만약에 같은값이 여러개 있으면 가장첫번째의 값  한개만 삭제 후 
			b 에 순차적으로 저장 
			data =  {5,2,6,8,5,6}
	[예] 2 ==>  b [] = {5,6,8,5,6};
	[예] 6 ==>  b [] = {5,2,8,5,6};
*/
	
	int data[] = {5,2,6,8,5,6};
	b = new int [data.length-1];
	
	System.out.println(Arrays.toString(data));
	System.out.println("삭제할 값을 입력하시오");
	int sel = sc.nextInt();
	int log = -1 ;
	
	for(int i = 0 ; i < data.length ; i++) {
		if(sel == data[i]) {
			log = i;
			break;
		}
		
	}
	if(log == -1) {
		
	System.out.println("잘못된 값을 입력하였습니다.");
	
	}else {
		
		for(int i = 0 ; i < data.length ; i++) {
			if(log != i) {
				b[idx] = data[i];
				idx ++;
			}
			
		}
		
		
	}
	
	System.out.println(Arrays.toString(b));
		

		System.out.println();
		System.out.println("===문제6==="); // 4 : 50 - 5 : 00

		/*
		 * [문제] 값을 입력받고 삭제 [조건] 만약에 같은값이 여러개 있으면 가장 마지막의값 한개만 삭제 후 b 에 순차적으로 저장 [예] 5
		 * ==> b [] = {5,2,6,8,6}; [예] 6 ==> b [] = {5,2,6,8,5};
		 */
		int [] data1= { 5, 2, 6, 8, 5, 6 };
		b = null;
		b = new int[data.length - 1];
		 log = -1;
		idx = 0;
		System.out.println("삭제할 배열요소를 입력하시오:" + Arrays.toString(data));

		 sel = sc.nextInt();

		for (int i = data1.length - 1; i >= 0; i--) {
			if (sel == data1[i]) {
				log = i;
				break;
			}

		}

		if (log == -1) {
			System.out.println("값을 잘못입력하였습니다. ");
		} else {
			for (int i = 0; i < data1.length; i++) {
				if (log != i) {
					b[idx] = data1[i];
					idx++;
				}

			}

		}

		System.out.println(Arrays.toString(b));

		System.out.println();
		System.out.println("===문제7==="); // 5 : 02 - 5:10

		/*
		 * [문제] 삭제할 값을 입력받고 data배열에서 삭제후 b에 저장 int data[] = {5,2,6,8,5,6}; [조건] 만약에 같은값이
		 * 여러개 있으면 전부 삭제 후 b 에 순차적으로 저장 [예] 5 ==> b [] = {2,6,8,6}; [예] 6 ==> b [] =
		 * {5,2,8,5}; [예] 2 ==> b [] = {5,6,8,5,6};
		 */
		int data2[] = { 5, 2, 6, 8, 5, 6 };
		int b2[] = null;
		int cnt = 0;
		System.out.println("전부삭제할 배열요소를 입력하시오:" + Arrays.toString(data));
		sel = sc.nextInt();

		for (int i = 0; i < data2.length; i++) {
			if (sel == data2[i]) {
				cnt++;
			}
		}

		b2 = new int[data2.length - cnt];
		idx = 0;

		for (int i = 0; i < data2.length; i++) {
			if (sel != data2[i]) {
				b2[idx] = data2[i];
				idx++;
			}

		}

		System.out.println(Arrays.toString(b2));

		System.out.println();
		System.out.println("===문제8==="); // 5:11 - 잠시중단. - 5:40

		/*
		 * [문제] 1) seatList 는 현제 영화관 예매상황 이다. 2) seatIndex 는 예매 할려는 좌석 번호이고 3) userList
		 * 는 회원번호이다 4) seatIndex 와 user 를 가지고 예매후 전체 예매상황 출력 5) 좌석이 비어있으면 예매할수있다. 6) 좌석이
		 * 이미 예매 되어있으면 2가지조건중 한가지실행 7) [조건 1] 이미 예매되어있으나, 회원번호가 같으면 예매취소 0으로 변경 8) [조건
		 * 2) 이미 예매되어있고 , 회원번호가 다르면 "x" 출력 예) 1 , 1003 ==> 예매 되어있으나, 1003번이 예매했으므로 예매
		 * 취소된다 ==> seatList[] = {1003,0,0,0,1002,0,1001}; 예) 1 , 1002 ==> 위에서 예매취소했으므로
		 * 예매 가능 ==> seatList[] = {1003,1002,0,0,1002,0,1001}; 예) 4 , 1005 ==> 예매 되어있고,
		 * 회원번호도 다르다 ==> "x"
		 */

		int seatList[] = { 1003, 1003, 0, 0, 1002, 0, 1001 };
		int seatIndex[] = { 1, 1, 4 };
		int userList[] = { 1003, 1002, 1005 };

		for (int i = 0; i < seatIndex.length; i++) {

			for (int k = 0; k < seatList.length; k++) {
				if (seatIndex[i] == k) {

					if (seatList[k] == 0) {

						seatList[k] = userList[i];
						System.out.print("예매가 안 되어있으니 예매 회원정보: ");
						System.out.println(userList[i]);
						break;
					}

					if (userList[i] == seatList[k]) {
						System.out.println("예매되어 있으나 취소");
						seatList[k] = 0;
					} else {
						System.out.println("예매불가...x");

					}

				}

			}

		}

		System.out.print(Arrays.toString(seatList));

		System.out.println();
		System.out.println("===문제9==="); // 11:01 - 11:20

		String[] nameList = { "새우깡", "감자깡", "고래밥" };
		int[] priceList = { 1000, 2100, 3300 };
		int[] countList = { 3, 1, 1 };

		int[] input2 = { 1, 2, 2, 0, 0, 2, 1, 1 };

		int[] sell = { 0, 0, 0 };

		for (int i = 0; i < input2.length; i++) {
			for (int k = 0; k < priceList.length; k++) {
				if (input2[i] == k && countList[k] != 0) {
					countList[k]--;
					sell[k] += priceList[k];
					break;
				}

			}

		}
		int total = 0;

		System.out.println("실제 판매한 품목은");
		for (int i = 0; i < 3; i++) {
			System.out.print(nameList[i] + " " + sell[i] / priceList[i] + "개 ");
			total += priceList[i];

		}
		System.out.println("이다");
		System.out.println("총매출은 : " + total);

		System.out.println(Arrays.toString(sell));
		System.out.println(Arrays.toString(countList));

		System.out.println();
		System.out.println("===문제10==="); // 11:21 - 11:38

		/*
		 * [문제] 철수와 민수는 가위바위보를 6회 하였다. 가위(0) , 바위(1) , 보(2) 를 뜻한다. 아래 배열은 각각 가위바위보를 낸
		 * 기록을 저장한것이다.
		 * 
		 * 철수와 민수는 계단 50번째 부터 게임을 시작하였다. 철수와 민수는 게임을 모두 끝마치고 어디있을까? [규칙] 이기면 5칸 올라간다.
		 * 비기면 1칸 올라간다. 지면 3칸 내려간다.
		 */

		int clist[] = { 0, 1, 2, 2, 1, 0 };
		int mlist[] = { 2, 1, 1, 2, 0, 1 };
		int cheolsu = 50;
		int minsu = 50;
		int temp = 0;

		for (int i = 0; i < 6; i++) {

			if (clist[i] == 0 && mlist[i] == 2 || clist[i] == 1 && mlist[i] == 0 || clist[i] == 2 && mlist[i] == 1) {

				cheolsu += 5;
				minsu -= 3;

			} else if (clist[i] == mlist[i]) {

				cheolsu += 1;
				minsu += 1;

			} else {

				cheolsu -= 3;
				minsu += 5;

			}

		}

		System.out.println("철수 :  " + cheolsu + "  민수:  " + minsu);
		
		
		
		
		
		
		
		
		

	}

}
