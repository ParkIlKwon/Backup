package �迭��ȭ1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �����Ǹ���2 {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner scan = new Scanner(System.in);
		
		int[][] marble = new int [5][5];
		
		int dice= 0;
		int tidx=0;
		int tidy = 0;
		int mo = 1;
		int size = marble.length-1;
		int turn = 1;
		int [] mode = {1,1};    //���� p1 p2 ��� (1 ���,2������,3�ϴ�,4���� Ʈ�� ���� �ʿ�
		//int [] track = new int [2]; // ���� ����� ���Ҵ��� �迭ó������.		
		int [] track = {2,2}; //�׽�Ʈ�뵵
		marble[0][0] = 3;
		for (int i = 1; i < marble.length-1; i++) {
			for (int k = 1; k < marble[i].length-1; k++) {
				marble[i][k] = 7;
				
			}
		}
		
		while (true) {
			if(track[0] >=3 || track[1] >=3) {
				System.out.println(track[0] >=3 ? "p1�¸�" : "p2�¸�"); 
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
				break;
			}
			for (int i = 0; i < marble.length; i++) {
									
				for (int k = 0; k < marble[i].length; k++) {
					if(marble[i][k] == 7) {
					System.out.print(" �� ");
					}else if (marble[i][k] == 1 ) {
					System.out.print(" # ");	
					if(turn == 1) {
					tidx = k;
					tidy= i;}
					}else if (marble[i][k] == 2 ) {
						System.out.print(" $ ");		
						if(turn == 2) {
							tidx = k;
							tidy= i;}
					} else if (marble[i][k] == 3) {
						System.out.print("#$");		
						tidx = k;
						tidy= i;
					}
					else {
					System.out.print(" �� ");
				}
				                                                                         
			}
				System.out.println();	
				
		}
			System.out.printf("-[%d]���� ����-",turn); 
			System.out.println("[1]dice [2]exit");
			int sel = scan.nextInt();
			mo = mode[turn-1]  ;                                     	      		//���ϸ��� �迭���� mo������ ��������� .
			if(sel >2 || sel <1) { 
				System.out.println("�Է¿���");
				continue;
			}
			
			if(sel == 2) {
				System.out.println("����");
				break;
			}
			
			
			else if(sel == 1) {
				dice = rd.nextInt(3)+1;
				System.out.println("dice- " + dice );
				marble[tidy][tidx]-=turn;
			}
			
			if(mo == 1) {                             //��带 �迭ó���� ���� .
				tidx += dice;
				if(tidx > size) {
					tidy += (tidx-size);
					tidx = size;
					mo=2;
				}
			}
				else if (mo ==2) {
					tidy += dice;
					if(tidy > size) {
						tidx -= (tidy-size);
						tidy = size;
						mo=3;
					}
					
				}	
				else if (mo ==3) {
					tidx -= dice;
					if(tidx <= 0) {
						tidy -= -(tidx);
						tidx = 0;
						mo=4;
					}
					
				}	
				
				else {
					tidy -= dice;
					if(tidy <= 0) {
						tidx += -(tidy);
						tidy = 0;
						mo=1;
						track[turn-1] ++;
					}
				}
			//��ġ�� 4���� ��츦 ���� �迭ó���� �ؼ� ���ϼ��� �־��. 
			 mode[turn-1] = mo  ;               
			marble[tidy][tidx]+=turn;
			for (int i = 0; i < marble.length; i++) {
				System.out.println(Arrays.toString(marble[i]));
			}
			
			turn = turn == 1 ? 2:1;

	}

	}

}
