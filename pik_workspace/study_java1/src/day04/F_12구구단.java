package day04;

import java.util.Random;
import java.util.Scanner;

public class F_12구구단 {
	public static void main(String[] args) {
		/*
		 * # 구구단 게임[3단계]
		 * 1. 구구단 게임을 5회 반복한다.
		 * 2. 정답을 맞추면 20점이다.
		 * 3. 게임 종료 후, 성적을 출력한다.
		 */
		int x,y,solution;
		int score=0,total=0,i=1;
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		while (i<=5) {
			i++;
			x=rd.nextInt(8)+2;y=rd.nextInt(9)+1;
			System.out.printf("구구단 문제: %d  X  %d  =  ?",x,y);
			solution = sc.nextInt();
			//System.out.print(solution == x*y?"정답입니다":"오답입니다.");
			//score += solution == x*y ? 20:0;
			
			if(x*y==solution) {	score+=20;
					System.out.println("정답입니다.");	}else {
						System.out.println("오답입니다.");
					}
		}
		
		System.out.println(score+"점 입니다.");
		sc.close();
		
	}

}
