package todayC;

import java.util.Arrays;
import java.util.Scanner;

public class 미로찾기 {

	public static void main(String[] args) {
		   // 미로찾기 
	//  0 -> 빈칸
	// 1-> 벽
	// 2-> 캐릭터
	// 3 -> 도착지점  
	//  2가 3을 만날 때까지 게임 종료

	// 값을 변경해서 만약 2가 3을 만나지 못하면 => "탈출구 도착할 수 없습니다 " 하고 나오기 
		final int MAPSIZE = 5;
		  Scanner sc = new Scanner(System.in);
		  int map[][] = {
						{1,2,0,0,1},
						{1,1,0,1,1},
						{0,1,0,0,0},
						{0,0,0,1,1},
						{3,1,0,0,0}
				};
		 
		    
//		    int map[][] = {
//						{1,2,0,0,1},
//						{1,1,0,1,1},
//						{0,1,0,0,0},
//						{1,0,0,1,1},
//						{3,1,0,0,0}
//				};
		    int idy[] = {0,0,-1,1};
		    int idx[] = {-1,1,0,0};
		    int tx,ty ; tx = ty = 0;
			int mark[][] = new int[MAPSIZE][MAPSIZE];	// ?
			int y = 0; int x = 0;
			
			for (int i = 0; i < mark.length; i++) {
				for (int k = 0; k < mark[i].length; k++) {
					if (map[i][k] == 1) {mark[i][k] = 1;
					}else if (map[i][k] == 3) {mark[i][k] = 3;
					y = i; x = k;
					}
				}
			}
			boolean loop = true;
			while (loop) {
				boolean chk = false;
				for (int i = 0; i < mark.length; i++) {
					for (int k = 0; k < mark[i].length; k++) {
						if (mark[i][k] == 3) {
							for (int j = 0; j < idy.length; j++) {
								ty = i + idy[j] ; tx = k + idx[j] ; 
								if (ty >= 0 && tx >= 0 && ty < MAPSIZE && tx < MAPSIZE) {
									if (mark[ty][tx] != 1 && mark[ty][tx] != 3) {
										mark[ty][tx] = 3;						//맵체크
										chk = true;
									}
								}
							}
						}
					}	
				}	
				if (chk == false) {
					break;
				}
			}
			
			for (int i = 0; i < mark.length; i++) {
				for (int k = 0; k < mark[i].length; k++) {
					if (map[i][k] == 2) {
						y = i ; x = k;
					}
				}
			}
			boolean game = true; 
			game = mark[y][x] == 3 ? true : false; 
			
			if (game) {
				while (true) {
					for (int i = 0; i < map.length; i++) {
						System.out.println(Arrays.toString(map[i]));
						for (int k = 0; k < map[i].length; k++) {
							if (map[i][k] == 2) {
								ty = i ; tx = k;
							}
						}
					}
					
					System.out.println("[1]왼쪽 [2]오른쪽 [3]위 [4]아래");
					int sel = sc.nextInt()-1;
					map[ty][tx] = 0;
					ty += idy[sel] ; tx += idx[sel] ; 
					if (ty < 0 || tx < 0 || ty > MAPSIZE-1 || tx > MAPSIZE-1) {
						System.err.println("맵밖으론 이동할수 없습니다... :X");
						ty -= idy[sel] ; tx -= idx[sel] ; 
					}else if (map[ty][tx] == 3) {
						System.out.println("도착지점 도착 . :D ");
						break;
					}else if (map[ty][tx] != 0 ) {
						System.err.println("벽에 부딪혔습니다.. :U");
						ty -= idy[sel] ; tx -= idx[sel] ; 
					}
					map[ty][tx] = 2;
				}
				
			}else {
				System.err.println("도착지점을 찾을수 없습니다 :(");
			}
			
			

	}

}
