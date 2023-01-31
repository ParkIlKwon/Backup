package 메서드클배;

import java.util.Random;
import java.util.Scanner;

class Player {
		String name;
		Card c1;
		Card c2;
		int score;
		
		boolean win;  
	}
	
	class Card {
		String shape;
		int num;
		int score;
	}
		
	class Blackjack{
		
		boolean [] arr;
		Card cdeck[];
		Player user = new Player();
		Player dealer = new Player();
		
		void init(){
			final int total = 52;
			arr = new boolean[total];
			cdeck = new Card[total]; 
			String shape[] = {"◇", "♡", "♣", "♠"};
			int len = total / 4;
			
			for (int i = 0; i < shape.length; i++) {
				for (int k = 0; k < len; k++) {
					cdeck[k+(i*len)] = new Card();
					cdeck[k+(i*len)].shape = shape[i];
					cdeck[k+(i*len)].num = k+1;
				}
			}
			user.name = "user";
			dealer.name = "dealer";
		}
		
		void run(){
			Scanner sc = new Scanner(System.in);
			init();
			earlySetting();
			while (true) {
				printdeck();
				printmenu();
				int sel = sc.nextInt();
				
				if (sel == 2) {
					if (user.win) {
						System.out.println("유저가 이겼습니다.");
					}else {
						System.out.println("딜러가 이겼습니다.");
					}
					break;
				}else if (sel == 1) {
					nextTurn();
				}
			}
		}
		
		void printmenu(){
			System.out.println("[1] 진행 [2] 종료");
		}
		
		
		int pickCard() {	//중복없는 카드 인덱스위치 불러옴.
			Random rd = new Random();
			int idx = 0;
			while (true) {
				idx = rd.nextInt(arr.length);
				if(arr[idx])continue;
				arr[idx] = true;
				break;
			}
			return idx;
		}
		
		void nextTurn(){
			Scanner sc = new Scanner(System.in);
			System.out.println("[1] 1번덱 변경 [2] 2번덱 변경");
			int sel = sc.nextInt();
			if (dealer.c1.num+dealer.c2.num < 17) {
				if (dealer.c1.num >= dealer.c2.num) {
					dealer.c2 = cdeck[pickCard()];
				}else {
					dealer.c1 = cdeck[pickCard()];
				}
			}
			
			if(sel == 1) {
				user.c1 = cdeck[pickCard()];
				return;
			}
			user.c2 = cdeck[pickCard()];
		}
		
		void earlySetting() {
			user.c1 = cdeck[pickCard()];
			user.c2 = cdeck[pickCard()];
			dealer.c1 = cdeck[pickCard()];
			dealer.c2 = cdeck[pickCard()];
		}
		
		void printdeck() {
			
			String num[] = {"A","2","3","4","5","6","7","8","9","10",
					"J","Q","k"};
			int Score[] = new int [2];
			System.out.println("=========================================");
			System.out.printf("%-6s [ %s : %s ] === ",user.name,user.c1.shape,num[user.c1.num-1]);
			System.out.printf("[ %s : %s ]\n",user.c2.shape,num[user.c2.num-1]);
			System.out.printf("%-6s [ %s : %s ] === ",dealer.name,dealer.c1.shape,num[dealer.c1.num-1]);
			System.out.printf("[ %s : %s ]\n",dealer.c2.shape,num[dealer.c2.num-1]);
			System.out.println("=========================================");
			scoreCalc(Score);
			System.out.printf("유저점수[ %d ] || 딜러점수[ %d ]\n",Score[0],Score[1]);
			iswin(Score);
			if (user.win) {
				System.out.println("현재 유저가 이기고 있습니다.");
			}else {
				System.out.println("현재 딜러가 이기고 있습니다.");
			}
		}
		
		void scoreCalc(int []Score) {
			Score[0] = user.c1.num + user.c2.num;
			Score[1] = dealer.c1.num + dealer.c2.num;
		}
		
		void iswin(int []Score) {
			
			if (!scoreover(Score[0]) && scoreover(Score[1])) {
				user.win = true; dealer.win = false ;
				return;
			}else if (scoreover(Score[0]) && !scoreover(Score[1])){
				user.win = false ; dealer.win = true ; 
				return;
			}else 
			
			if (Score[0] == Score[1]) {
				int max1 =  max(user.c1.num, user.c2.num);
				int max2 =  max(dealer.c1.num, dealer.c2.num);
				if (max1 > max2) {
					user.win = true; dealer.win = false ;
				} else {
					user.win = false ; dealer.win = true ; 
				}
				return;
			}
			
			if (Score[0] > Score[1]) {
				user.win = true ; dealer.win = false ; 
			}else {
				user.win = false ; dealer.win = true ; 
			}
		}
		
		boolean scoreover(int score) {
			if (score > 21) {
				return true;
			}return false;
		}
		
		int max(int x , int y) {
			if (x > y) {
				return x ;
			}else {
				return y ;
			}
		}
		
		
	}



public class 블랙잭 {

	public static void main(String[] args) {
		
		Blackjack bj = new Blackjack();
		bj.run();
		
		
		
	}

}
