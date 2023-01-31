package 메서드2;

import java.util.Arrays;
import java.util.Scanner;

class NumberGame{
		// 심화는 격파까지 구현하시오 
		Scanner sc = new Scanner(System.in);
	
		int[] move = {3, 3, 0, 0, 8, 0, 0, 0, 0, 3};
		int pidx = 4;
		int pos ;
		void run() {
			while(true) {
				// 게임화면 출력
				printPlay();
				// 메뉴 출력
				showMenu();
				// 메뉴 선택
				System.out.print(": ");
				int choice = sc.nextInt();
				pos = pidx;
				move[pidx] = 0;
				// 좌로 이동
				if(choice == 1) { moveLeft(); }
				// 우로 이동
				else if(choice == 2) { moveRight(); }
				// 종료
				else if(choice == 3) {
					System.out.println("게임 종료");
					break;
				}
					check();
				
				move[pidx] = 8;
			}
		}
	
		void printPlay(){
			System.out.println(Arrays.toString(move));
		}
		void showMenu(){
			System.out.println("[1]왼쪽 [2]오른쪽");
		}
		void moveLeft(){
			pidx--; if (pidx < 0) {
				pidx = move.length-1;
			}
		}
		void moveRight(){
			pidx++; if (pidx > move.length-1) {
				pidx = 0;
		}
	}
		void check(){
			if (move[pidx] == 3) {
				System.out.println("1 누르면 격파 다른 수는 아무것도 안함. ");
				int sel = sc.nextInt();
				if (sel != 1 ) {
					pidx = pos;
				}
			}
		}
		
		
}

public class 메서드숫자이동 {

	public static void main(String[] args) {
		
		NumberGame g = new NumberGame();
		g.run();
		

	}

}
