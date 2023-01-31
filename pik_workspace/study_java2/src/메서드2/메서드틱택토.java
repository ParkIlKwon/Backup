package 메서드2;

import java.util.Arrays;
import java.util.Scanner;

class TicTacToe{
		
		Scanner sc = new Scanner(System.in);
		
		String[][] game = new String[3][3];
		
		int turn = 1;
		int cnt ;
		int win = 0;		// 1[turn1승리] 2[turn2승리]
	void run() {
		
			// game배열을 공백 문자열(" ")로 초기화
			setGame();
			
			while(true) {
				
				showGame(turn);
				
				// 게임 종료
				if(win == 1) {
					System.out.println("player1 승리");
					break;
				}else if(win == 2) {
					System.out.println("player2 승리");
					break;
				}
				
				choiceIdx();
				
				exitWidth();
				exitHeight();
				exitCross();
				turn = 	turn == 1 ? 2 : 1;
			}		
		}
	
	
		void exitWidth(){
			for (int i = 0; i < game.length; i++) {
				
				if (game[i][0].equals(game[i][1]) && game[i][0].equals(game[i][2])
						&& !game[i][1].equals("")) {
					win = turn == 1 ? 1 : 2 ;
				}
			}
		}
	
		void exitHeight(){
			for (int i = 0; i < game.length; i++) {
				if (game[0][i].equals(game[1][i]) && game[1][i].equals(game[2][i])
						&& !game[1][i].equals("")) {
					win = turn == 1 ? 1 : 2 ;
				}
			}
		}

		void exitCross(){
			if (game[1][1].equals(game[0][0]) && game[1][1].equals(game[2][2])
					&& !game[1][1].equals("")) {
				win = turn == 1 ? 1 : 2 ;
			}else if ((game[1][1].equals(game[0][2]) && game[1][1].equals(game[2][0])
					&& !game[1][1].equals(""))) {
				win = turn == 1 ? 1 : 2 ;
			}
			
			
		}
	
	
	
		void setGame(){
			for (int i = 0; i < game.length; i++) {
				for (int k = 0; k < game[i].length; k++) {
					game[i][k] = "";
				}
			}
			
			
		}
		
		void showGame(int turn){
			System.out.printf("====[ %d ] 턴====\n",turn);
			for (int i = 0; i < game.length; i++) {
				for (int k = 0; k < game[i].length; k++) {
					if (game[i][k].equals("o")) {
						System.out.printf("[%-2s]","o");
					}else if (game[i][k].equals("x")) {
						System.out.printf("[%-2s]","x");
					}else {
						System.out.printf("[    ]");
					}
				}System.out.println();
			}
		}
		
		void choiceIdx(){
			while (true) {
				int y =	input("Y 좌표  ");
				int x =	input("X 좌표  ");
				if (game[y][x].equals("")) {
					game[y][x] = turn == 1 ? "o" : "x";
					break;
				}
			}
		}
		
		int input(String str) {
			while (true) {
				System.out.println(str + "입력 ---> ");
				int idx = sc.nextInt();
				if (flag(idx)) {
					return idx;
				}
				System.err.println("입력에러");
			}
		}
		
		boolean flag(int num){
			if (num < 0 || num > game.length-1) {
				return false;
			}
			return true;
		}
	
	}


public class 메서드틱택토 {

	public static void main(String[] args) {

		 TicTacToe tic = new TicTacToe();
			tic.run();
		
		
		
	}

}
