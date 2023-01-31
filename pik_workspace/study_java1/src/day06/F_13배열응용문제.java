package day06;

import java.util.Iterator;
import java.util.Scanner;

public class F_13배열응용문제 {

	public static void main(String[] args) {
		int a[] = { 10, 49, 51, 36, 17 };
		// 문제 1) 다음 리스트를 값을 입력하면   번호 출력 
		// 예) 51 ==> 2
		// 예) 10 ==> 0
		int idx;
		Scanner sc = new Scanner(System.in);
		idx = sc.nextInt();
		for(int i = 0 ; i < a.length ; i++) {
		if(idx == a[i]) {
			System.out.println(i);
			break;
		}
		
		}

		// 문제 2) 다음 리스트를 이용해서 a 의 값중 홀수만 b 에 저장(위치는 동일한위치에 저장)
		// 예) b = [0, 49, 51, 0, 17]
		int b[] = { 0,0,0,0,0 };
		
		for(int i = 0 ; i < a.length ; i++) {
			if(a[i]%2!=0) {
				b[i]=a[i];
			}
			}
		for(int i = 0 ; i < a.length ; i++) {
				System.out.print(b[i]+" ");
			
			}
		System.out.println();

		// 문제 3) 다음 리스트를 이용해서 a 의 값중 홀수만 c 에 저장(위치는 앞에서 부터  저장)
	    // 2번문제와 조금 다름
		// 예) c = [49, 51, 17, 0, 0]
		int c[] = { 0,0,0,0,0 };
		int index=0;
		for(int i = 0 ; i < a.length ; i++) {
			
			if(a[i]%2!=0) {
				c[index] = a[i];
				index ++;
				
				}
				
			}
		System.out.println("===");
		for(int i = 0 ; i < c.length ; i++) {
			System.out.print(c[i]+" ");
			
			}
		System.out.println();
		//-------------------------------------------------
		int arr[] = {1001, 20, 1002, 45, 1003, 54};
		int select;
		// 학번과 점수가 한쌍이다. ==>  1001:20 , 1002:45 , 1003:54
		
		// 문제4) 학번을 입력하면 점수 출력 
		// 예) 1001==>20 , 1003 ==> 54
		System.out.println("[학번입력] ");
		select = sc.nextInt();
		int check=-1;
		for(int i = 0 ; i < arr.length ; i+=2) {
			if(arr[i]==select) {
				check = i;
				break;
			}
		}
		if(check == -1) {
		System.err.println("===잘못된 입력===");
		}else {
			System.out.println(arr[check+1]);
		}
		
		// 문제5) 점수를 입력하면 학번 출력 
		// 예) 20 ==> 1001 , 45 ==> 1002
		System.out.println("[점수입력] ");
		select = sc.nextInt();
		for(int i = 1 ; i < arr.length ; i+=2) {
			if(arr[i]==select) {
			 check = i;
				break;
			}
		}
		
		if(check == -1) {
			System.err.println("===잘못된 입력===");
			}else {
				System.out.println(arr[check-1]);
			}
		

	}

}
