package day09;

import java.util.Arrays;
import java.util.Scanner;

public class G_07�����̵�2�ܰ�sol {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
			int wall = 1;
			int player =2;
			int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 1};
			int size = game.length;
			int idx = 0;
			for(int i =0; i < size; i++) {
				if(game[i] == player) {
					idx = i;			//�÷��̾���ġ�� �ҷ���
					break;
				}
			}
			
			
			while(true) {
				boolean run = true;
				// ���
				for(int i =0; i < size; i++) {
					if(game[i] == 0) {
						System.out.print("__");
					}else if(game[i]==player) {
						System.out.print("��");
					}else {
						System.out.print("[]");
					}
				}
				System.out.println();
							
				System.out.println("1.���� 2.������ 0.����");
				int move = scan.nextInt();
				if(move < 0 || move > 2) {
					System.err.println("�Է¿��� ");
					continue;
				}
				if(move == 0) {
					System.out.println("[ ���� ���� ]");
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
					System.out.println("3.���� 4. �ǵ��Ʊ�");
					move = scan.nextInt();
				
					if(move == 3) {
						game[tIdx] =0;
					}else if(move == 4) {
						continue;
					}else {
						System.err.println("�Է¿���");
						continue;
					}
					
				}
				
				game[idx] =0;
				idx = tIdx;  
				game[idx] = player;
				
			}


	}

}
