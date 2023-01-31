package 클래스;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Game1to50{
				final int SIZE = 25;	
				int[] front = new int[SIZE];
				int[] back  = new int[SIZE];	
			}


public class 클래스1to50 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		Game1to50 gm = new Game1to50();
		for (int i = 0; i < gm.SIZE; i++) {
			gm.front[i] = i+1 ; gm.back[i] = i+26;
		}
		for (int i = 0; i < 100; i++) {
			int ran = rd.nextInt(gm.SIZE);
			int temp = gm.front[0];
			gm.front[0] = gm.front[ran];
			gm.front[ran]=temp;
		}
		System.out.println("[인덱스번호] 수  입니다 .");
		for (int i = 0 ; i < gm.SIZE*2; i++) {
			for (int k = 0; k < gm.SIZE; k++) {
				System.out.printf("[%-2d]  %-2d ",k+1,gm.front[k]);
				if (k%5 == 4 ) {
					System.out.println();
				}
			}
			
			System.out.println();
			System.out.println("입력하시오: ");
			int sel = sc.nextInt()-1;
			if (sel <0 || sel > gm.SIZE) {
				System.err.println("입력오류 :<");
				i--;
				continue;
			}
			
			if ( gm.front[sel]  == i + 1) {
				gm.front[sel] = gm.back[i];
				gm.back[i] = 0;
			}
			else {
				System.err.println("틀렸습니다.");
				i--;
			}
			
		}
		
		
		
		

	}

}
