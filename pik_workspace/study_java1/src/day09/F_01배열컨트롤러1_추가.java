package day09;

import java.util.Scanner;

public class F_01배열컨트롤러1_추가 {

	public static void main(String[] args) {
		
		//문제1) 추가 를 선택하고 값을 입력하면 10 , 20 뒤에 저장한다.
		// 최대 5개까지 저장
		Scanner scan = new Scanner(System.in);
		
				       
				int[] arr = {10, 20, 30,  40, 50};
				int cnt = 5; // 실제들어있는 값의 갯수 
				
				boolean run = true;
				while(run) {

					for(int i=0; i<arr.length; i++) {
						System.out.print(arr[i] + " ");
					}
					System.out.println();			
					
					System.out.println("[1]추가");
					System.out.println("[2]삭제(인덱스)");

					System.out.println("[0]종료");
					System.out.print("메뉴 선택 : ");
					int sel = scan.nextInt();
					
					if(sel == 1) {
						
						if(cnt == 5) {
							System.err.println("[ 더 추가 불가능]");
							continue;
						}
								
						System.out.print("추가할 값>> ");
						int data = scan.nextInt();
						arr[cnt] =data;
						cnt++;
						
					}else if(sel == 2) {
						
						if(cnt == 0) {
							System.err.println("[배열에 값이 없습니다]");
							continue;
						}
						
						System.out.print("삭제 인덱스 >> ");
						int idx = scan.nextInt();
						if(idx < 0 || idx >= cnt) {
							System.err.println("[ 인덱스 오류 ]");
							continue;
						}
						
						// arr[idx] =0;
						int index =0;
						for(int i =0; i < arr.length; i++) {
		                   System.out.printf("index = %d , i = %d \n" , index , i);
							if(idx != i) {	
							   arr[index] = arr[i];
							   index++;
						   }
						}
						cnt--; // 5 -> 4
						arr[cnt] =0; // arr[4] =0;
						
						
					}else if(sel == 3) {
						// 삭제 값으로 
						System.out.println("");
				
					}else if(sel == 0) {
						System.out.println("종료");
					}else {
						System.out.println("입력오류 ");
					}
					
				}

}
}
