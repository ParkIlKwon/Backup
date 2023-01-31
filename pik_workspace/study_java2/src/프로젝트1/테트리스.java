package 프로젝트1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class 테트리스 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
				//   l     ㄴ    ㄱ       ㅁ
		int y[] = {0,1,1,0,1,0,0,0,1,0,0,1,0};
		int x []= {1,0,0,0,0,1,0,1,0,0,1,-1,1};
		int counter [][] =  {
							{0,3},		//  l
							{3,6},		//  ㄴ
							{6,9},		//  ㄱ
							{9,13}		//  ㅁ 
								 };
		int ran = 0;
		
		int map [][] = new int [10][10];
		int idx = 0,idy=0;
		int del[] = new int [map[0].length];
		
		boolean next = true;
		int bcnt =0;
		int dir = 0;
		
		for (int i = 0; i < 9; i++) {
			map[map.length-1][i] = 2;
			map[map.length-2][i] = 2;
		}
		
		boolean over = false ;
		while (true) {
			boolean crash = false;
			
			if (next) {
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
				for (int i = counter[ran-1][0]; i < counter[ran-1][1]; i++) {			//블록생성
					ty+=y[i];
					tx+=x[i];
					block[ty][tx] = 1;
					bcnt++;
				}
				
//			for (int i = 0; i < block.length; i++) {			//어떤 블록 생성되는지.
//				System.out.println(Arrays.toString(block[i]));
//			}
				
				
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
				
				next = false;
			} 
			if(over == true) break;
			int pos[][] = new int[bcnt][2];
			int index =0;
			for (int i = 0; i < map.length; i++) {
				//System.out.print(Arrays.toString(map[i]));
				for (int k = 0; k < map[i].length; k++) {
					if (map[i][k] == 1 ) {
						System.out.print(" ■");
						pos[index][0] = i;
						pos[index][1] = k;
						index++;
					}else if (map[i][k] == 2) {
						System.out.print(" ■");
					}
					else {
						System.out.print(" □ ");
					}
				}
				System.out.println();
			}
			
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
			
			if (sel == 1) {
				
				for (int i = 0; i < pos.length; i++) {
					pos[i][1] --;
					if (pos[i][1] < 0  ) {
						crash = true;
						break;
					}
						if ((map[pos[i][0]][pos[i][1]] == 2 )) {
							crash = true;
						}
				}
				
				
			}else if (sel==2) {
				
				for (int i = 0; i < pos.length; i++) {
					pos[i][1] ++;
					if (pos[i][1] > map[0].length-1) {
							crash = true;
							break;
					}
							if ((map[pos[i][0]][pos[i][1]] == 2 )) {
								crash = true;
							}
						}
				
			}else if (sel==3) {
				for (int i = 0; i < pos.length; i++) {
					pos[i][0] ++;
					
				}
				
			}else if (sel==4 && bcnt != 4) {
				
				if (ran == 2 || ran == 3) {
					if (dir == 1) {
						pos[0][1] ++ ;
						pos[1][0] ++;
						pos[2][1] -- ;
						dir = 2;
						
					}else if (dir == 2 ) {
						pos[0][0] ++ ;
						pos[1][0] --;
						pos[2][1] -- ;
						dir = 3;
						
					}else if (dir == 3) {
						pos[0][1] ++ ;
						pos[1][0] --;
						pos[2][1] -- ;
						dir=4;
					}else {
						pos[0][1] ++ ;
						pos[1][0] ++;
						pos[2][0] -- ;
						dir = 1;
					}
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
					for (int i = 0; i < pos.length; i++) {
						if (pos[i][1] > map[0].length-1 || pos[i][1] < 0) {
								crash = true;
								break;
						}
								if ((map[pos[i][0]][pos[i][1]] == 2 )) {
									crash = true;
								}
							}
				}
			}
			
			if (crash) {
				for (int i = 0; i < temp.length; i++) {
					pos[i] = temp[i];
				}
			}
			
//			for (int i = 0; i < pos.length; i++) {						//현재 블록 좌표
//				System.out.println(Arrays.toString(pos[i]));
//				
//			}
			
			if (pos[pos.length-1][0] > map.length-1 || 
					map[pos[0][0]][pos[0][1]] != 0
					|| map[pos[pos.length-1][0]][pos[pos.length-1][1]] != 0 ||
					map[pos[pos.length-2][0]][pos[pos.length-2][1]] != 0) {
				for (int i = 0; i < pos.length; i++) {
					pos[i][0] --;
				}
				next = true;
			}
			
			if (next) {
				for (int i = 0; i < pos.length; i++) {
					map[pos[i][0]][pos[i][1]]  = 2;
				}
//				for (int i = 0; i < map.length; i++) {
//					System.out.println(Arrays.toString(map[i]));
//				}
				
			}else {
				for (int i = 0; i < pos.length; i++) {
					map[pos[i][0]][pos[i][1]]  = 1;
				}
				
			}
			
			if (next) {
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
				
			}
		System.err.println("===게임오버===");

	}
		
		

	}

