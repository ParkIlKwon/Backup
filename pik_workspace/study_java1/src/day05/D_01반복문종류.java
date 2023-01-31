package day05;

import java.util.Scanner;

public class D_01반복문종류 {
	public static void main(String[] args) {
	    // 횟수가 있는 반복문 
			// 어디서부터 어디까지 몇번
			// 초기식   조건식  증감식 
			// 반복변수 i j k 
			
			int i = 1;
			while(i <=10) {
				
				i++;
			}
			
			// 횟수가 없는 반복문 // 1.들어가는 조건식 2. 나가는 조건식
			
			Scanner sc = new Scanner(System.in);
			
			boolean run = true;
	        int price = 10000;
	        
			while (run) {
				System.out.println("현금 입력 >> ");
				int money = sc.nextInt();
				
				if(money >= price ) { // 반복문 나가는 조건식 
					run = false;
				}else {
				    System.out.println("입력오류 ");
				}
			}
			
			System.out.println(" 반복문 종료 ");
			
			
			while(true) {
				System.out.println("현금 입력 >> ");
				int money = sc.nextInt();
				if(money >= price ) { // 반복문 나가는 조건식 
					break; // 반복문 즉시 종료
				}else {
				    System.out.println("입력오류 ");
				}
			}
			System.out.println(" 반복문 종료 ");
		
		

	}

}
