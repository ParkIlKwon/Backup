package day05;

import java.util.Random;
import java.util.Scanner;

public class D_03업다운 {
	public static void main(String[] args) {

		/*
		 * # Up & Down 게임[2단계] 1. com 은 랜덤으로 1~100사이를 저장한다. 2. me 는 1~100사이를 입력한다. 3.
		 * com 과 me 를 비교해서 com 크면 "크다" , com 이작으면 "작다" 힌트제공 4. 정답을 맞추면 게임은 종료된다. 5. 한번에
		 * 맞추면 100점 1번씩 틀릴때마다 20점 감점된다 6. 5번 틀리면 게임오버 / 맞추면 최종 점수 출력
		 */
		int com, me, score = 100;
		boolean run = true;
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		com = rd.nextInt(100) + 1;
		System.out.println("나온수: " + com);
		int i = 1;
		while (run) {
			System.out.println("시도횟수:" + i);
			System.out.print("답 입력:  ");
			me = sc.nextInt();
			if (me < 0 || me > 100) {
				System.out.println("1~100사이값만 입력하시오.");
				continue;
			}
			if (com > me) {
				System.out.println("더 크게");
				score -= 20; i++;
			} else if (me > com) {
				System.out.println("더 작게");
				score -= 20; i++;
			} else {
				System.out.println("정답");
				run = false;
			}
			if(score<20) {System.out.println("게임오버");break;}
		}
		if(score!=0) {
			System.out.println("총 시도횟수:"+i);
			System.out.println("총 점수: " + score);
		}
		

	}

}
