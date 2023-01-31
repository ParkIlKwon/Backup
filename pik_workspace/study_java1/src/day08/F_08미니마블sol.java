package day08;

import java.util.Scanner;

public class F_08미니마블sol {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
				int size = 8;
				int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
				int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
				int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
				
				int turn = 1;
				
				int p1cnt =0;
				int p2cnt =0;
				
				int idx1 = 0;	
				int idx2 = 0;
			
				p1[idx1] = 1;	
				p2[idx2] = 2;
				
				while(true) {
					
					for(int i =0; i < size;i++) {
						System.out.print(game[i] +" ");
					}
					System.out.println();
					for(int i =0; i < size;i++) {
						System.out.print(p1[i] +" ");
					}
					System.out.printf("[%d바퀴]\n",p1cnt);
					for(int i =0; i < size;i++) {
						System.out.print(p2[i] +" ");
					}
					System.out.printf("[%d바퀴]\n",p2cnt);
					
					if(p1cnt == 3) {
						System.out.println("[p1승리!]");
						break;
					}
					if(p2cnt == 3) {
						System.out.println("[p2승리!]");
						break;
					}
					
					System.out.printf("[p%d] 입력(1-3):",turn);
					int move = sc.nextInt();
					if(move < 1 || move > 3) {
						System.err.println("입력 오류");
						continue;
					}
					
					if(turn == 1) {
						// p1
						p1[idx1] = 0;
						idx1+=move; // idx1 = idx1 + move;
						if(idx1 >= size) {
							p1cnt++;
						}
						idx1 %= size; // 0 - 7 
						p1[idx1] = 1;
					}else {
						//p2
						p2[idx2] = 0;
						idx2+=move;
						if(idx2 >= size) {
							p2cnt++;
						}
						idx2 %= size;// 0 - 7 
						p2[idx2] = 2;
					}
					
					if(idx1 == idx2) {
						if(turn == 1) {
							System.out.println("[p1이 p2를 잡았다!]");
							p2[idx2] = 0;
							idx2 =0;
							p2[idx2] = 2;
						}else {
							System.out.println("[p2이 p1를 잡았다!]");
							p1[idx1] = 0;
							idx1 =0;
							p1[idx1] = 1;
						}
					}
					
					turn = turn == 1? 2: 1;
				}

	}

}
