package 메서드클배;

import java.util.Arrays;
import java.util.Random;

	class Lotto {
		int[] data = new int[8];  // 00303033 꽝 00300333 당첨
		boolean win = false;
		void print() {
			for (int i = 0; i < 8; i++) {
				System.out.print(data[i]);
			}
			System.out.println();
		}
	}
	
	class LottoDAO{
		Lotto[] set;
		int winner ;
		void init() {
			Random rd = new Random();
			set = new Lotto[5];
			for (int i = 0; i < set.length; i++) {
				set[i] = new Lotto();
			}
			winner = rd.nextInt(set.length);
		}
		
		// 로또 5개 생성 하되 딱 1개만 로또 당첨 
		void Creat(int idx) {
			Random rd = new Random();
			set[idx] = new Lotto();
			for (int i = 0; i < set[0].data.length; i++) {
			boolean ranbl = rd.nextBoolean();
			set[idx].data[i] = ranbl == true ? 0 : 3 ; 
			}		
		}
		
		void setlotto(){
			for (int i = 0; i < set.length; i++) {
				 Creat(i);
				 chklotto(i);
				 if (set[i].win && winner != i) {
					 i--;
				 }
				 if(winner == i && !set[i].win) {
					 i--;
				 }
			}
			
		}
		void chklotto(int idx) {
			int cnt = 0;
			for (int i = 0; i < set[idx].data.length; i++) {
				if (set[idx].data[i] == 3) {
					cnt ++;
					if (cnt >= 3) {
						set[idx].win = true;
					}
				}else {
					cnt = 0;
				}
			}
		}
		
		void printlotto() {
			for (Lotto lotto : set) {
				System.out.println(Arrays.toString(lotto.data));
				System.out.println(lotto.win);
			}
			
		}
		
		void run(){
			init();
			setlotto();
			printlotto();
			
			
			
		}
		
		
		
	}
	
			

		
		
public class 클래스배열로또 {
	public static void main(String[] args) {
		
		LottoDAO lo = new LottoDAO();
		lo.run();
		
		
	}

}
