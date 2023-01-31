package day08;

import java.util.Scanner;

public class D_01베스킨라빈스31 {

	public static void main(String[] args) {
		/*
		 * # 베스킨라빈스31
		 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
		 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
		 * 3. br이 31을 넘으면 게임은 종료된다.
		 * 4. 승리자를 출력한다.
		 * 
		 * 예) 
		 * 1턴 : p1(2)	br(2)
		 * 2턴 : p2(1)	br(3)
		 * 3턴 : p1(3)	br(6)
		 * ...
		 */
				Scanner sc = new Scanner(System.in);
				int p1 = 0;
				int p2 = 0;
				
				int br = 0;
				int turn = 0;
				
				while(br < 31) {
					
					System.out.print("p1>> ");
					p1 = sc.nextInt();
					if(p1>3||p1<1) {
						System.out.println("값을 잘못입력하였습니다. [ 1 ~ 3 ]");
						continue;
					}
					turn = 1;
					br+=p1;
					System.out.println("누적된 수 :" + br);
					
					
					while(true) {
					System.out.print("p2>> ");
					p2 = sc.nextInt();
					if(p2>3||p2<1) {
						System.out.println("값을 잘못입력하였습니다. [ 1 ~ 3 ]");
						continue;
						}else break;
					}
					turn = 2;
					br+=p2;
					System.out.println("누적된 수 :" + br);
										
				}
				if(turn == 1) {
					System.out.println("p2승리");
					}else {
						System.out.println("p1승리");	
					}

	}

}
