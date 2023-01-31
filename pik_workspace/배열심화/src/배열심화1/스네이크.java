package 배열심화1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 스네이크 {

	public static void main(String[] args) {
		/*
		 * [스네이크게임]
		 * 1. 10x10 배열을 0으로 채운다.
		 * 2. 스네이크는 1234로 표시한다.
		 * 3. 머리 상하좌우로 이동이 가능하며, 꼬리가 따라온다.
		 * 4. 자기몸하고 부딪히면, 사망한다.
		 * 5. 랜덤으로 아이템을 생성해
		 *    아이템을 먹으면 꼬리 1개가 자란다.
		 * 6. 꼬리는 최대 8개까지 증가할 수 있다.
		 * 7. 벽(맵바깥)에 부딪혀도 죽게 했습니다 .
		 * 8. 하트를 다 먹으면 이기게 했습니다.
		 */
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int map[][]= new int [10][10]; 
		int sizeY = map.length;
		int sizeX = map[0].length;
		int hcnt = 0;
		int tx = 0; 
		int ty = 0;
		int cnt = 4;                             // 뱀의 크기
		String str[] = {"[   ]","[ S ]","[ ■ ]","[ ♥ ]"};
		
		int snake [][] = null;
		boolean life = true;
		map[1][0] = 1;
		for (int i = 1; i < cnt; i++) {
			map[0][i-1] = i+1;
		}
		
		for (int i = 0; i < 8; i++) {
			tx = rd.nextInt(map.length);
			ty = rd.nextInt(map[0].length);
			
			if(map[tx][ty] != 0 ) {
				i--;
			}else {
				map[tx][ty] = -1;
				hcnt ++;
			}
		}
		
		map[4][4] = -1;				
	
		
		while (true) {
			boolean heart = false;	//하트를 먹었는지 판단 ?
			int body = 2;			//뱀의 목부터 꼬리까지 이동시켜줄 변수
			snake = new int [cnt][2];		//뱀의 크기만큼 뱀의 몸좌표 저장
			int idx = 1;						//idx 1로 초기화 1~몸통까지 좌표찾을때 씀.
			int Count = cnt ;
		
			while (true) {
				if (Count == 0) {
					break;
				}
				
				loop:
				for (int i = 0; i < map.length; i++) {
					for (int k = 0; k < map[i].length; k++) {
						if (map[i][k] == idx) {
							snake[idx -1][0] = i ;
							snake[idx -1][1] = k ;
							idx++;
							Count--;
							break loop;
						}
					}
				}
			}
			
			

			for (int i = 0; i < map.length; i++) {

				for (int k = 0; k < map[i].length; k++) {

					System.out.printf("%2d",map[i][k]);

					if(map[i][k] == 1) {
						System.out.printf("%2s",str[1]);
						ty = i ;
						tx = k;
					}
					else if(map[i][k] == 0) {
						System.out.printf("%2s",str[0]);
					}else if(map[i][k] == -1) {
						System.out.printf("%2s",str[3]);
					}else {
						System.out.printf("%2s",str[2]);
					}

				}
				System.out.println();
			}
			if(hcnt < 0) {
				break;
			}
			
			System.out.println("[1]left [2]right [3]up [4]down");
			
			int sel = sc.nextInt();
			
			if(sel < 0 || sel > 4 ) {
				System.out.println("잘못입력하였습니다.");
				continue;
			}
			map[ty][tx] = 0;
			
			if (sel ==1) {
				tx--;
				}
			else if (sel ==2) {
				tx++;
			}else if (sel ==3) {
				ty--;
			}else if (sel ==4) {
				ty++;
			}
			
			if(ty>sizeY-1||tx>sizeX-1||ty<0||tx < 0) {
				life = false;
				break;
			}
			
			if ( map[ty][tx] != 0) {
				if ( map[ty][tx] != -1) {
					life = false;
					break;
					
				}
			}
			
			if(map[ty][tx] ==-1 ) {
				hcnt--;
				heart = true;
			}
			
			
//			for (int i = 0; i < snake.length; i++) {
//				System.out.println(Arrays.toString(snake[i]));
//				
//			}						//뱀의 좌표값 잘 뜨는지 확인용
			
			
			map[ty][tx] = 1;
			for (int k =  0; k <snake.length ; k++) {
					ty=snake[k][0];
					tx=snake[k][1];
					map[ty][tx] = body;
					
				body ++;
			}
			
			if(heart == true && cnt <8) {
				cnt++;
			}else {
				map[ty][tx] = 0;			//하트를 먹지 않았을때는 맨뒤를 자름
			}
			
			
		}
		

		System.out.println(life == true ? "이겼습니다.":" 죽었습니다");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}

	}

