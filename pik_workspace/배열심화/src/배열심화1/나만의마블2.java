package 배열심화1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 나만의마블2 {

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
		int [] mode = {1,1};    //각각 p1 p2 모드 (1 상단,2오른쪽,3하단,4왼쪽 트랙 돌때 필요
		//int [] track = new int [2]; // 각각 몇바퀴 돌았는지 배열처리해줌.		
		int [] track = {2,2}; //테스트용도
		marble[0][0] = 3;
		for (int i = 1; i < marble.length-1; i++) {
			for (int k = 1; k < marble[i].length-1; k++) {
				marble[i][k] = 7;
				
			}
		}
		
		while (true) {
			if(track[0] >=3 || track[1] >=3) {
				System.out.println(track[0] >=3 ? "p1승리" : "p2승리"); 
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
				break;
			}
			for (int i = 0; i < marble.length; i++) {
									
				for (int k = 0; k < marble[i].length; k++) {
					if(marble[i][k] == 7) {
					System.out.print(" ■ ");
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
					System.out.print(" □ ");
				}
				                                                                         
			}
				System.out.println();	
				
		}
			System.out.printf("-[%d]턴의 차례-",turn); 
			System.out.println("[1]dice [2]exit");
			int sel = scan.nextInt();
			mo = mode[turn-1]  ;                                     	      		//매턴마다 배열에서 mo변수로 꺼내줘야함 .
			if(sel >2 || sel <1) { 
				System.out.println("입력에러");
				continue;
			}
			
			if(sel == 2) {
				System.out.println("종료");
				break;
			}
			
			
			else if(sel == 1) {
				dice = rd.nextInt(3)+1;
				System.out.println("dice- " + dice );
				marble[tidy][tidx]-=turn;
			}
			
			if(mo == 1) {                             //모드를 배열처리를 하자 .
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
			//겹치는 4가지 경우를 따로 배열처리를 해서 줄일수도 있어보임. 
			 mode[turn-1] = mo  ;               
			marble[tidy][tidx]+=turn;
			for (int i = 0; i < marble.length; i++) {
				System.out.println(Arrays.toString(marble[i]));
			}
			
			turn = turn == 1 ? 2:1;

	}

	}

}
