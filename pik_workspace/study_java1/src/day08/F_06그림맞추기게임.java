package day08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class F_06그림맞추기게임 {

	public static void main(String[] args) {
		/*
		 * # 기억력 게임
		 * 1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다.
	     2. 1 1 2 2 3 3 4 4 5 5 이 숫자들을 1000번 섞는다 (셔플 )
	     3. 사용자가 인덱스 번호 2개를 입력해서 그 값을 비교한다 
	     4. 두 인덱스 값이 맞으면 즉, 정답을 맞추면 back에 해당 숫자를 저장해,
		 *    back에 모든 수가 채워지면 게임은 종료된다.
		 * 예)
		 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
		 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		 * 입력1 : 0
		 * 입력2 : 4
		 * 
		 * front = [1, 3, 2, 5, 1, 4, 3, 2, 4, 5]
		 * back  = [1, 0, 0, 0, 1, 0, 0, 0, 0, 0]
		 */

			Random rd = new Random() ; 
			Scanner sc = new Scanner(System.in);
			int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
			int[] back = new int[10];
			int[] numb = new int[10];
			int ran1,ran2,num=0;;
			for(int i = 0 ; i <10 ; i++) {
				numb[i] = i+1;
			}
			
			for(int i = 0 ; i < 1000 ; i ++) {
			ran1 = rd.nextInt(front.length);
			ran2 = rd.nextInt(front.length);
			num = front[ran1];
			front[ran1] = front[ran2];
			front[ran2] = num;
				
			}
			
			int t=0;
			int cnt = 0 ;
			System.out.println();
			System.out.println(Arrays.toString(numb));
			System.out.println(Arrays.toString(front));
			
			for(int i = 0 ; i < back.length ; i++) {
				if(back[i]==0) {
					System.out.print("[]");
				}else {
					System.out.printf("[%d]",back[i]);
				}
				}
		
			
			while(t!=back.length) {
						
			System.out.println();
			System.out.println("[인덱스 1 입력] ");
			int x = sc.nextInt(); x--;
			System.out.println("[인덱스 2 입력] ");
			int y = sc.nextInt(); y--;
			
			if(x==y) {
				System.err.println("같은 인덱스입니다");
				continue;
			}
			if(back[x]!=0||back[y]!=0) {
				System.err.println("이미 맞춘 수 입니다");
				continue;
			}
			System.out.println();
		
				for(int i = 0 ; i < back.length ; i++) {
					if(back[i]==0) {
						System.out.print("[]");
					}else {
						System.out.printf("[%d]",back[i]);
					}
					}
				
		
			
			if(front[x]==front[y]) {
				
				back[x] = front[x];
				back[y] = front[y];
				t+=2;
			}
			}
			
			System.out.printf("총 %d번 시도 끝에 성공",cnt);
			
			}
		
	}























