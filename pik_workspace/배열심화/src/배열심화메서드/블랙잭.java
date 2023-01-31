package 배열심화메서드;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


class blackJack{
		int total = 52;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int card[] = new int [total];
		int arr[] = new int [total];
		int dealer[] = new int [2];
		int user[] = new int [2];
		int idx;
	
	void run() {
		int tuser[] = new int[2];
		int tdealer[] = new int[2];	//딜러카드 모양 볼때 사용하는것 
		 // 0 ~ 12 ,13 ~ 25, 
		String fig[] = {"◆","♥","♠","♣"};
		String fig2[] = {"A","2","3","4","5","6","7","8","9","10","K","Q","J"};
		int index = 0;
		
		
		for (int i = 0; i < fig.length; i++) {
			for (int k = 0; k < fig2.length; k++) {
				card[index] = k+1; index ++;
			}
		}
			 System.out.println(Arrays.toString(card));
		for (int i = 0; i < dealer.length; i++) {
			pickCard();
			tdealer[i] = idx;
			dealer[i] = card[idx];
			pickCard();
			tuser[i] = idx;
			user[i] = card[idx];
		}
		
		
		while (true) {
			System.out.println(Arrays.toString(tdealer));
			System.out.println(Arrays.toString(tuser));
			
			System.out.println(Arrays.toString(dealer));
			System.out.println(Arrays.toString(user));
			System.out.println(Arrays.toString(arr));
			System.out.println("======================================");
			System.out.println("현재 유저가 가지고 있는 카드 : ");
			System.out.println(fig[tuser[0]/13]+" "+fig2[(tuser[0])%13]);
			System.out.println(fig[tuser[1]/13]+" "+fig2[(tuser[1])%13]);
			
			System.out.println("진행하시겠습니까 ? 1.yes 2.no");
			int sel = sc.nextInt();
			
			if (sel == 2) {
				break;
			}else if (sel == 1) {
				System.out.println("몇번덱을 바꾸시겠습니까? 1 or 2");
				sel = sc.nextInt()-1;
				pickCard();
				user[sel] = card[idx];
				tuser[sel] = idx;
				
				if (dealer[0] + dealer[1] <= 16) {
					pickCard();
					if (dealer[0] > dealer[1]) {
						dealer[1] = card[idx];
					}else {
						dealer[0] = card[idx];
					}
				}
				
				
			}

		}
		
		iswin(dealer, user);
		
	}
	
	//카드 뽑기 - 카드 중복체크 set
	void pickCard(){
		while (true) {
			int idx = rd.nextInt(total);
			if (chk(idx) == false) {
				continue;
			}
			arr[idx] = -1;
			this.idx = idx;
			break;
		} 
	}
	
	boolean chk(int idx) {
		if (arr[idx] == -1) {
			return false;
		}
		return true;
	}
	
	
	//승패
	void iswin(int arr1[] , int arr2[]) {
		int dealer=0; int user = 0;
		for (int i = 0; i < arr2.length; i++) {
			dealer += arr1[i];
			user += arr2[i];
		}
		System.out.println(dealer + " " + user);
		if ((dealer > 21 && user <=21) || 
				(dealer <= 21 && user <=21 && (user - dealer > 0))) {
			massage(1);
		}else if ((dealer <= 21 && user > 21) || 
				(dealer <= 21 && user <= 21 && user - dealer < 0)) {
			massage(2);
		}else {
			massage(3);
		}
		
		
	}
	
	
	void massage(int num) {
		if (num == 1) {
			System.out.println("유저가 이겼습니다 :D");
		}else if (num == 2) {
			System.out.println("딜러가 이겼습니다 :(");
		}else {
			System.out.println("비겼습니다 :/");
		}
	}
	
	
	
	
	
}
		
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
		
		


public class 블랙잭 {

	public static void main(String[] args) {
		
		blackJack bj = new blackJack();
		bj.run();
		
		
		
		
	}

}
