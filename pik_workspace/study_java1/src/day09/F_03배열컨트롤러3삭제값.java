package day09;

import java.util.Arrays;
import java.util.Scanner;

public class F_03배열컨트롤러3삭제값 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		
		int cnt = 5;

		boolean run = true;
		Scanner scan = new Scanner(System.in);
		
		while (run) {

			
			
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			System.out.println("[3]삭제(값)");
			System.out.println("[5]종료");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

		 if (sel == 3) {
			 if(cnt == 0) {
					System.err.println("[배열에 값이 없습니다]");
					continue;
				}
			 int a = -1;
				System.out.print("삭제 인덱스(값) 입력 : ");
				int delIdx = scan.nextInt();
				
				
				for(int i = 0 ; i < cnt  ; i++) {
					if(delIdx == arr[i]) {
						a = i;
						break;
					}
				}
		
				if(a == -1) {
					System.out.println("값을 잘못입력하였습니다.");
					continue;
				}
				
				int index = 0;
				
				for(int i = 0 ; i < arr.length ; i++) {
				if(a != i) {
					arr[index] = arr[i];
					index ++;
				}
					
				}
				cnt --;
				arr[cnt] = 0;
				
			} 
			 else if (sel == 5) {
				break;
			} else {
	
			}
	}

	}
}

