package 메서드클배;

import java.util.Random;

	class Playerex {
		String name;
		Cardex c1;
		Cardex c2;
		boolean win;  
	}
	
	class Cardex {
		String shape;
		int num;
	}
	
	class CardGame{
			Cardex deck[] = new Cardex[40];
			
			int arr[] = new int [deck.length];
				// 0 ~ 9  ... 10 ~ 19 
			String shapes[] = { "◇", "♡", "♣", "♠" };
			
			Playerex p1 = new Playerex();
			Playerex p2 = new Playerex();
			
			void init(){
				for (int i = 0; i < 4; i++) {
					for (int k = 0; k < 10; k++) {
						int idx = k+(i*10);
						deck[idx] = new Cardex();
						deck[idx].shape = shapes[i];
						deck[idx].num = k+1;
					}
				}
			}
			
			void run(){
				init();
				play();
				printCard();
				dicision();
				printwin();
			}
			
			void printwin() {
				if (p1.win) {
					System.out.println("\n p1가 이겼습니다.");
					return;
				}
				System.out.println("\n p2가 이겼습니다.");
				
			}

			void printCard() {
				System.out.printf("[ %s : %d ]",p1.c1.shape, p1.c1.num );
				System.out.printf(" / [ %s : %d ]\n",p1.c2.shape, p1.c2.num );
				System.out.printf("[ %s : %d ]",p2.c1.shape, p2.c1.num );
				System.out.printf(" / [ %s : %d ]",p2.c2.shape, p2.c2.num );
			}
			
			int pickCard(){
				Random rd = new Random();
				while (true) {
					int idx = rd.nextInt(arr.length);
					if (chk(idx) == false) {
						continue;
					}
					arr[idx] = -1;
					return idx;
				} 
			}
			
			boolean chk(int idx) {
				if (arr[idx] == -1) {
					return false;
				}
				return true;
			}
			
			void play(){
				  p1.c1 = deck[pickCard()];
				  p1.c2 = deck[pickCard()];
				  p2.c1 = deck[pickCard()];
				  p2.c2 = deck[pickCard()];
			}
			
			void dicision() {
				int score1 = p1.c1.num + p1.c2.num;
				int score2 = p2.c1.num + p2.c2.num;
				
				if (score1 == score2) {
					int max1 =  max(p1.c1.num, p1.c2.num);
					int max2 =  max(p2.c1.num, p2.c2.num);
					if (max1 > max2) {
						p1.win = true;
					} else {
						p2.win = true;
					}
					return;
				}
				
				if (score1 > score2) {
					p1.win = true;
				}else {
					p2.win = true;
				}
			}
			
			int max(int x , int y) {
				if (x > y) {
					return x ;
				}else {
					return y ;
				}
			}
	}


public class 카드뽑기 {

	public static void main(String[] args) {
		CardGame game = new CardGame();
		game.run();

	}

}
