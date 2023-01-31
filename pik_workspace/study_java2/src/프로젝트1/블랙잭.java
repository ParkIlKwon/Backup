package 프로젝트1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 블랙잭 {

	public static void main(String[] args) {
		
		/* 블랙잭게임 
		자신이 받은 카드의 숫자 합이 21에 가까워야하고 그 숫자가 딜러 카드의 숫자 보다 높으면 이기는 게임이다.

		게임 규칙
		딜러와 게이머 단 2명 존재
		카드는 조커를 제외한 52장이다. (카드는 다이아, 하트, 스페이드, 클로버 무늬를 가진 A,2~10,K,Q,J으로 이루어져 있다.)
		2~13은 숫자 그대로 점수를 J,Q,K는 각 11, 12, 13점으로 A는 1로 계산한다.
		 (기존 규칙은 A는 1과 11 둘다 가능하지만 여기선 1로만 허용)
		딜러와 게이머는 순차적으로 카드를 하나씩 뽑아 각자 2개의 카드를 소지한다.
		게이머는 얼마든지 카드를 추가로 뽑을 수 있다.
		딜러는 2카드의 합계 점수가 16점 이하이면 반드시 1장을 추가로 뽑고, 17점 이상이면 추가 할 수 없다.
		양쪽 다 추가 뽑기 없이 카드를 오픈 하면 딜러와 게이머 중 소유한 카드의 합이 21에 가장 가까운 쪽이 승리한다.
		단 21을 초과하면 초과한 쪽이 진다.
		*/ 
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int ran = 0;
		int size = 52;
		int card [] = new int [size];
		int user [] = new int [2];
		int dealer [] = new int [2];
		String fig [] = {"◆","♥","♠","♣"};
		int ran1 = 0 , ran2 =0;
		
		int idx = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < card.length/4; j++) {
				card[idx +(i*13)] = idx+1; 
				idx++;
			}
			idx = 0;
		}
		
		for (int i = 0; i < user.length; i++) {
			ran1 = rd.nextInt(size);
			ran2 = rd.nextInt(size);
			if (card[ran1] == 0 || card[ran2] ==0) {
				i--;
				continue;
			}
			if (ran1 != ran2 ) {
				card[ran1] = card[ran2] = 0;
				user[i] = ran1;
				dealer[i] = ran2;
			}else {
				i--;
			}
			
			
		}
		
		
		while (true) {
			int cnt = 0;
			int sum = 0;
			for (int i = 0; i < card.length; i++) {
				if(card[i] == 0)cnt++;
			}
			if(cnt >=52)break;
			
			System.out.println("====현재 가진 카드 ====");
			for (int i : user) {
				System.out.print("[");
				
					System.out.print(fig[i/13]);
					System.out.print(i%13+1);
					
					System.out.print(" ]");
				
			}
			System.out.println();
			System.out.println("====현재 딜러 카드 ====");
			for (int i : dealer) {
				System.out.print("[");
				
					System.out.print(fig[i/13]);
					System.out.print(i%13+1);
					System.out.print(" ]");
				
			}
			
			
			System.out.println();
			
			System.out.println("\n[1]진행 [2]종료");
			int sel = sc.nextInt();
			
			if (sel == 1) {
				sum = (dealer[0]+1)%13+(dealer[1]+1)%13;
				System.out.println("바꿀카드를 고르세요 [1] 또는 [2]");
				sel = sc.nextInt();
				
				for (int i = 0; i < 1; i++) {
					ran = rd.nextInt(card.length);
					if (card[ran] == 0) {
						i--;
					}
				}
				
				user[sel - 1] = ran;
				card[ran] = 0;
				
				System.out.println("딜러카드합:"+sum);
				if (sum <= 16) {
					for (int i = 0; i < 1; i++) {
						ran = rd.nextInt(card.length);
						if (card[ran] == 0) {
							i--;
						}else {
							if (card[dealer[1]]>card[dealer[0]]) {
								dealer[0] = ran;
							}else {
								dealer[1] = ran;
							}
						}
					}
				}
				
				
				
			}else if (sel ==2) {
				break;
			}else {
				System.err.println("잘못입력하셨습니다.");
			}
			
			
		}
		
		int num=0;
		num = (dealer[0]+1)%13+(dealer[1]+1)%13 
				- (user[0]+1)%13+(user[1]+1)%13;
		
		if (num == 0) {
			System.out.println("비겼습니다.");
		}else if (num < 0) {
			System.out.println("플레이어가 이겼습니다.");
		}else {
			System.out.println("딜러가 이겼습니다.");
		}
			
		
		
		
		
		


		
	}

}
