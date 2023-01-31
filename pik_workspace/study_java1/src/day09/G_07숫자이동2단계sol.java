package day09;

import java.util.Arrays;
import java.util.Scanner;

public class G_07숫자이동2단계sol {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
			int wall = 1;
			int player =2;
			int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 1};
			int size = game.length;
			int idx = 0;
			for(int i =0; i < size; i++) {
				if(game[i] == player) {
					idx = i;			//플레이어위치를 불러옴
					break;
				}
			}
			
			
			while(true) {
				boolean run = true;
				// 출력
				for(int i =0; i < size; i++) {
					if(game[i] == 0) {
						System.out.print("__");
					}else if(game[i]==player) {
						System.out.print("옷");
					}else {
						System.out.print("[]");
					}
				}
				System.out.println();
							
				System.out.println("1.왼쪽 2.오른쪽 0.종료");
				int move = scan.nextInt();
				if(move < 0 || move > 2) {
					System.err.println("입력오류 ");
					continue;
				}
				if(move == 0) {
					System.out.println("[ 게임 종료 ]");
					break;
				}
				
				int tIdx = move == 1? idx-1 : idx+1;
			
				
				
				if(tIdx < 0) {
					tIdx = size-1;
				}
				if(tIdx >= size) {
					tIdx =0;
				}
			
				if(game[tIdx] == wall) {
					System.out.println("3.격파 4. 되돌아기");
					move = scan.nextInt();
				
					if(move == 3) {
						game[tIdx] =0;
					}else if(move == 4) {
						continue;
					}else {
						System.err.println("입력오류");
						continue;
					}
					
				}
				
				game[idx] =0;
				idx = tIdx;  
				game[idx] = player;
				
			}


	}

}
