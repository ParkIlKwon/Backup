package 메서드클배;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

	class Tetris{
		
		int ran = 0;
		int y[] = {0,1,1,0,1,0,0,0,1,0,0,1,0};
		int x []= {1,0,0,0,0,1,0,1,0,0,1,-1,1};
		int counter [][] = {
					{0,3},		//   l
					{3,6},		//  ㄴ
					{6,9},		//  ㄱ
					{9,13}	//  ㅁ 
							};
		int map [][] = new int [10][10];
		int idx = 0,idy=0;
		int pos[][] = null;
		final int [] movey = {0,0,0,1};
		final int [] movex = {0,-1,1,0};
		
		boolean next = true;
		int bcnt =0;
		int dir = 0;
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		boolean over = false ;
		
		void run() {
		
			int ran = 0;
			int idx = 0,idy=0;
			boolean next = true;
			
			int dir = 0;
			
			testsetting();
			
			while (true) {
				boolean crash = false;
				
				if (next) {
					makeblock();
					next = false;
				}
				
				if(over == true) break;
				printmap();
				
				System.out.println("[1]왼쪽 [2]오른쪽 [3]아래 [4]턴");
				int sel = sc.nextInt();
				
				int temp[][] = new int [pos.length][2];
				for (int i = 0; i < temp.length; i++) {
					for (int k = 0; k < temp[i].length; k++) {
						temp[i][k] = pos[i][k];
					}
				}
				
				for (int i = 0; i < pos.length; i++) {
					   map[pos[i][0]][pos[i][1]]  = 0;
					}
				
				if (sel < 4) {
					move(sel);
				}
				
				 if (sel==4 && bcnt != 4) {
					turnblock(pos);					//블록 턴
					turnblock2(pos);
				}
				 
				if (sel != 3) {
					crash = crash(pos);
				}else {
					crash = crash(pos);
					next = crash(pos);
				} 
				
				
				if (crash) {
					for (int i = 0; i < temp.length; i++) {
						pos[i] = temp[i];
					}
				}

				
				if (next) {
					for (int i = 0; i < pos.length; i++) {
						map[pos[i][0]][pos[i][1]]  = 2;
					}

					
				}else {
					for (int i = 0; i < pos.length; i++) {
						map[pos[i][0]][pos[i][1]]  = 1;
					}
					
				}
				
				if (next) {
					deleteblock(map);
					}
					
				}
			System.err.println("===게임오버===");
			
		}
		
		//테스트 세팅
		void testsetting() {
			for (int i = 0; i < 9; i++) {
				map[map.length-1][i] = 2;
				map[map.length-2][i] = 2;
			}												//테스트용
		}
		
		//블록생성
		void makeblock() {
			bcnt = 0;
			int block [][] = new int [3][3];
			ran = rd.nextInt(4)+1;
			if (ran == 3) {
				dir = 1;
			}else if (ran == 2) {
				dir = 3;
			}else {
				dir =1;
			}
			
			int tx = 0 , ty = 0;
			for (int i = counter[ran-1][0]; i < counter[ran-1][1]; i++) {//블록생성
				ty+=y[i];
				tx+=x[i];
				block[ty][tx] = 1;
				bcnt++;
			}
			//블록생성 , 게임오버 판단
			idy =0;
			block:
			for (int i = 0; i < block.length; i++) {
				idx = 4;
				if(ran ==3 && i == 1)idx =5;
				for (int k = 0; k < block[i].length; k++) {
					if (block[i][k] != 0) {
						if (map[idy][idx] == 2) {
							over=true;
							break block;
						}
						map[idy][idx] = 1;
						idx++;
					}
				}
				idy++;
			}
		}
		
		// 블록턴 개조
		void turnblock2(int [][] pos) {
			int temp[][][][] = new int [pos.length][pos.length][pos.length][];
			
			for (int i = 0; i < pos.length; i++) {
				for (int k = 0; k < pos[i].length; k++) {
					
				}
			}
			for (int i = 0; i < temp.length; i++) {
				System.out.println(Arrays.toString(temp[i]));
			}
		}
		
		
		
		//블록 턴
		void turnblock(int [][] pos){
				int t [][][]	 = {    
				
				{{1,0,1}, {1 , 1 , -1 }},					
				{{0,0,1}, {1 , -1 , -1}},
				{{1,0,1}, {1 , -1 , -1}},
				{{1,0,0}, {1 ,  1 , -1}}  };
						
			if (ran == 2 || ran == 3) {
				
				for (int i = 0; i < 3; i++) {
					pos[i][t[dir-1][0][i]] += t[dir-1][1][i] ;
				}
				
				dir += dir > 4 ? -3 : 1 ;
				
			}else if (ran == 1) {
				if (dir == 1) {
					pos[0][0] ++; pos[0][1] ++; 
					pos[2][0] --; pos[2][1] --; 
					dir = 2;
				}else {
					pos[0][0] --; pos[0][1] ++; 
					pos[2][0] ++; pos[2][1] --; 
					dir = 1;
				}
			
			}
			//return pos;
		}
		
		//블록충돌
		boolean crash(int[][] pos) {
			
			for (int i = 0; i < pos.length; i++) {
				if (pos[i][1] > map[0].length-1 || pos[i][1] < 0
						|| pos[i][0] < 0 || pos[i][0] > map[0].length-1) {
					return true;
				}
						if ((map[pos[i][0]][pos[i][1]] == 2 )) {
							return true;
						}
					}
			
			return false;
		}
		
		//블록삭제
		void deleteblock(int[][]arr) {
			int del[] = new int [map[0].length];
			
			for (int i = map.length-1;i >0; i--) {
				int cnt = 0;
				for (int k = 0; k < map[i].length; k++) {
					if (map[i][k] ==2) {
						cnt++;
					}
					if (cnt == map[i].length) {
						map[i] = del;
						for (int j = i; j > 0; j--) {
							for (int j2 = 0; j2 < map[0].length; j2++) {
								map[j][j2] = map[j-1][j2];
							}

							}
							
						}	
					}
					if (cnt == map[0].length) {
						i++; 
					}
				}
			
		}
		
		//맵출력
		void printmap() {
			pos = new int[bcnt][2];
			int index =0;
			
			for (int i = 0; i < map.length; i++) {
				for (int k = 0; k < map[i].length; k++) {
					if (map[i][k] == 1 ) {
						System.out.printf("%-2s","■");
						pos[index][0] = i;
						pos[index][1] = k;
						index++;
					}else if (map[i][k] == 2) {
						System.out.printf("%-2s","■");
					}
					else {
						System.out.printf("%-2s","□");
					}
				}
				System.out.println();
			}
			
		}
		
		//이동로직
		void move(int sel) {
			for (int i = 0; i < pos.length; i++) {
				pos[i][0] += movey[sel]; pos[i][1] += movex[sel] ;
			}
		}
		
	}
	

public class 메서드테트리스 {

	public static void main(String[] args) {

		Tetris t = new Tetris();
		t.run();
		
		
	}
}