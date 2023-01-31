package 프로젝트1;

import java.util.Arrays;
import java.util.Scanner;

	class play{
		String figure [] = {"o","@","옷","홋","","[]"};
		String yoot[] = {"도","개","걸","윷","모"};
		}

	class yootgame{
		
		int dir1 = 1; int dir2 = 1; int s = 0;
		String game[][] = new String[7][7]; int size = s = game.length-1; 
		
		int p1[] = new int[2]; // dir , pos 옷	
		int p2[] = new int[2]; // dir , pos 홋
		
		int dir [][][] = { 
							{{6,5,4,2,1,0,0,0,0,0,0,1,2,4,5,6,6,6,6,6,6},{6,6,6,6,6,6,5,4,2,1,0,0,0,0,0,0,1,2,4,5,6}},
							{{0,1,2,3,4,5,6,6,6,6,6,6},{6,5,4,3,2,1,0,1,2,4,5,6}},
							{{3,4,5,6},{3,4,5,6}},
							{{0,1,2,3,4,5,6},{0,1,2,3,4,5,6}}
																													};
		int tdir=0;
		int tpos=0;
							
		void CatchDir(int tdir , int tpos ,int turn) {
			tdir -- ;
			if (game[dir[tdir][0][tpos]][dir[tdir][1][tpos]] == "옷" ||
					game[dir[tdir][0][tpos]][dir[tdir][1][tpos]] == "홋") {
				CatchAction(turn);
			}
		}

		void CatchAction(int turn) {
			if (turn == 1 ) {
				p2[0] = 1; p2[1] = 0;
			}else {
				p1[0] = 1; p1[1] = 0;
			}
		}
		
		void printMap(play p) {
			for (int i = 0; i < game.length; i++) {	//판출력
				for (int k = 0; k < game[i].length; k++) {
					for (int j = 0; j < p.figure.length; j++) {
						if (game[i][k].equals(p.figure[j]) ) {
							System.out.printf("%-3s",p.figure[j]);
						}
					}
				}
				System.out.println("\n");
			}
		}
		
		void mapsetting() {
			int setmap[] = {2,3,4,1,3,5,0,1,2,4,5,6,1,3,5,2,3,4};
			int idx = 0;
			//맵 세팅
			for (int i = 1; i < game.length-1; i++) {
				for (int j = 0; j < 3; j++) {
					game[i][setmap[idx]]="";
					if(i == 3 ) {game[i][setmap[idx+3]] = "";			
					if(j == 2) {idx +=3;} }
					idx++;
				}
			}
			
			game[size][size] = game[0][size] = game[size][0] = game[0][0] = "@";
			game[3][3] = "[]";
			game[size][size/2] = game[0][size/2] = "";	
			
		}
		void ChangeDir() {
			if (tdir == 1 ) {
				if (dir[tdir-1][0][tpos] == 0 && dir[tdir-1][1][tpos] ==6) {
					tdir = 2; tpos = 0;
				}
				if (dir[tdir-1][0][tpos] == 0 && dir[tdir-1][1][tpos] ==0) {
					tdir = 4; tpos = 0;
				}
			}
			
			if (tdir == 2 && dir[tdir-1][0][tpos] == 3 && dir[tdir-1][1][tpos] == 3) {
					tdir = 3; tpos = 0;
			}
			
		}
		
		boolean endgame(int num,int tpos) {
			if((tdir == 1 && dir[0][0].length-1 < num + tpos)  || (tdir == 3 && dir[2][0].length-1 < num + tpos)
				||	(tdir == 2 && dir[1][0].length-1 < num + tpos) | (tdir == 4 && dir[3][0].length-1 < num + tpos) ) {
				return true;
				}return false;
		}
		
		void run(){
			
			p1[0] = p2[0] = 1;
			
			int turn = 1;
		
			Scanner sc = new Scanner(System.in);
			play p = new play();
			boolean over = false;
			for (int i = 0; i < game.length; i++) {
				for (int k = 0; k < game[i].length; k++) {
					game[i][k] = "o";
				}
			}
			
			mapsetting();
			String tgame[][] = new String[7][7];	//게임판 (이동전 위치에 문자값세팅할때 사용) 
			for (int i = 0; i < tgame.length; i++) {
				for (int j = 0; j < tgame.length; j++) {
					tgame[i][j] = game[i][j];
				}
			}
				
			while (true) {			//윷놀이 부분 
			int temp [] = new int [2];
			printMap(p);
				
			System.out.printf("[ %d ] 턴입니다.",turn);
			System.out.print("몇칸 이동하실래요 ?");
			
			tdir = turn == 1 ? p1[0] : p2[0];
			tpos = turn == 1 ? p1[1] : p2[1];
			int num = sc.nextInt();
			System.out.println(num == -1?"[ 백도 ]가 나왔습니다."   : "[ " + p.yoot[num-1] + " ] 가 나왔습니다. ");
			
				if (endgame(num, tpos)) break;
					
				if (num < 0 && tpos == 0) {
					game[dir[tdir-1][0][tpos]][dir[tdir-1][1][tpos]] = tgame[dir[tdir-1][0][tpos]][dir[tdir-1][1][tpos]];
					if (tdir == 1) {
						tpos = dir[0][0].length-2;
					}else if (tdir == 2) {
						tdir = 1;
						tpos = 4;
					}else if (tdir == 3) {
						tdir = 1;
						tpos = 9;
					}else if (tdir == 4) {
						tdir = 2;
						tpos = 2;
					}
					
						CatchDir(tdir,tpos,turn);
				}	
				else {
				
				game[dir[tdir-1][0][tpos]][dir[tdir-1][1][tpos]] = tgame[dir[tdir-1][0][tpos]][dir[tdir-1][1][tpos]];
				tpos += num;
				CatchDir(tdir,tpos,turn);
				
				ChangeDir();
				
				}
				game[dir[tdir-1][0][tpos]][dir[tdir-1][1][tpos]] = turn == 1 ? "옷" : "홋";
				if (turn == 1) {
					p1[0] = tdir; p1[1] = tpos; 
				}else {
					p2[0] = tdir; p2[1] = tpos;
				}
				
				if (num > 3) {
					System.out.println("한턴더 ~~");
					continue;
				}
				
				turn = turn == 1 ? 2 : 1 ;
			
		}
			System.out.println(turn == 1 ? "p1이 이겼습니다." : "p2가 이겼습니다. ");
		}
	}

public class 윷놀이 {
	
	public static void main(String[] args) {
		
		yootgame gm = new yootgame();
		gm.run();
		// 2인용 
				
	}
}