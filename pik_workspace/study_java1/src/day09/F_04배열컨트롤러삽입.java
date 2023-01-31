package day09;

import java.util.Arrays;
import java.util.Scanner;

public class F_04배열컨트롤러삽입 {

	public static void main(String[] args) {
		   int[] arr = { 10, 20, 30, 0, 0 };
			int cnt = 3;
			Scanner scan = new Scanner(System.in);
	   	boolean run = true;
			while (run) {

				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();

				System.out.println("[4]삽입");
				System.out.println("[5]종료");
				System.out.print("메뉴 선택 : ");
				int sel = scan.nextInt();

		     if (sel == 4) {
		    	 	if(cnt >= 5) {
		    	 			System.err.println("5개 이상 값 삽입 불가능");
		    	 			continue;
		    	 	}
		    	 	if(cnt < 1) {
		    	 			System.err.println("인덱스가 0개일때 불가능");
		    	 			continue;
		    	 	}

					System.out.print("삽입 인덱스 입력 : ");
					int index = scan.nextInt();
					if(index < 0 || index >= arr.length) {
						System.err.println("인덱스 값 에러");
						continue;
					}else if(arr[index] == 0) {
						System.err.println("0인 인덱스에 삽입 불가능");
						continue;
					}
					
					System.out.print("삽입 값 입력 : ");
					int data = scan.nextInt();
					
					for(int i = arr.length-1;i>=index;i--) {
						arr[i] = arr[i-1];
					}
					arr[index] = data;
					cnt ++;
					
					
				} else if (sel == 5) {
					break;
				} else {
			
				}

			}
		
		
		
	}

}
