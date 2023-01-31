package 배열심화1;

import java.util.Arrays;
import java.util.Scanner;

public class 여행 { 

	public static void main(String[] args) {
		/*
		 * 철수는 여행을떠났다. 8은 철수이고 7은 벽이고 0은 이동가능한곳이다. dir 은 철수가 바라보는 방향이고 0~3까지 북동남서 의 방향을
		 * 표현한다. input의 데이터는 1은 한칸전진이고 2는 좌회전(90도) 3은 우회전(90도)이다. 회전은 방향만 바뀌고 움직이는건 없다.
		 * input을 전부 입력받고 해당내용을 전부 출력하시요.
		 * 
		 * input 의 값이 1이면 앞으로 이동하는데 방향에 따라서 이동하는곳이 바뀐다.
		 * 
		 * 
		 * input 의 값이 2 나 3이면 이동하지않고 dir 이 바뀐다.
		 * 
		
              input 의 값이 1이면 앞으로 이동하는데 방향에 따라서 이동하는곳이 바뀐다.
            

             input 의 값이 2 나 3이면 이동하지않고 dir 이 바뀐다.

             input ==> 1 이므로 이동한다. dir 이0 이므로 북으로 한칸간다.
               		{0,0,0,0,0,0,0},	
				{0,7,7,7,7,0,0},	
				{0,7,0,8,7,0,0},	
				{0,7,0,0,7,0,0},	
				{0,0,0,0,7,0,0},	
				{0,0,0,0,7,7,0},	
				{0,0,0,0,0,0,0}


             input ==> 1 이므로 이동한다. 근데 벽에 부딪히므로 이동할수없다. 
              {0,0,0,0,0,0,0},	
				{0,7,7,7,7,0,0},	
				{0,7,0,8,7,0,0},	
				{0,7,0,0,7,0,0},	
				{0,0,0,0,7,0,0},	
				{0,0,0,0,7,7,0},	
				{0,0,0,0,0,0,0}
 
               input ==> 2 이므로 방향만 바뀐다 dir = 0 이였는데 dir = 3 으로 바뀐다.
              {0,0,0,0,0,0,0},	
				{0,7,7,7,7,0,0},	
				{0,7,0,8,7,0,0},	
				{0,7,0,0,7,0,0},	
				{0,0,0,0,7,0,0},	
				{0,0,0,0,7,7,0},	
				{0,0,0,0,0,0,0}
           
               input ==> 1 이므로 이동한다. dir 이 3이므로 서쪽으로 이동한다. 
              {0,0,0,0,0,0,0},	
				{0,7,7,7,7,0,0},	
				{0,7,8,0,7,0,0},	
				{0,7,0,0,7,0,0},	
				{0,0,0,0,7,0,0},	
				{0,0,0,0,7,7,0},	
				{0,0,0,0,0,0,0}
		
		
		 */

		// 0 북 1 동 2남 3 서
		int map[][] = 
		        	{ 
				{ 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 7, 7, 7, 7, 0, 0 }, 
				{ 0, 7, 0, 0, 7, 0, 0 },
		            { 0, 7, 0, 8, 7, 0, 0 }, 
		            {0, 0, 0, 0, 7, 0, 0 }, 
		            { 0, 0, 0, 0, 7, 7, 0 },
		            { 0, 0, 0, 0, 0, 0, 0 } 
		                				   };
		int dir = 0;
		int setDir[][] = { 
						{ 3, 0, 1 }, 
				            { 0, 1, 2 }, 
			                 	{ 1, 2, 3 }, 
			                	{ 2, 3, 0 } 
			                 			};
		
		int input[] = { 1, 1, 2, 1, 1, 2, 1, 1, 3, 1, 1 };
		char cos[] = {'북','동','남','서'};
		int space = 0;
		int idx = 0;
		int tidx = 0;
		int tidy = 0;
		int x=0;
		int y=0;
		Scanner sc = new Scanner(System.in);

		while (idx < input.length) {

			for (int i = 0; i < map.length; i++) {
				System.out.print("{");
				for (int k = 0; k < map.length; k++) {

					if (map[i][k] == 8) {
						System.out.print("읏 ");
						tidx = k;
						tidy = i;
					}else {
						System.out.print(map[i][k] + " ");
					}

				}
				System.out.print("}");
				System.out.println();
			}

			System.out.print("진행하실려면 1 나가실려면 2");
			space = sc.nextInt();
			
			if (space == 2) {
				break;
			}
			// dir 이 0 이면 북으로 이동하고 dir 이 1이면 동쪽으로 이동하고, dir 이 2면 남쪽으로 이동하고,
			// dir 이 3이면 서쪽으로이동한다.

			if (input[idx] == 1) {
				x=tidx;
				y=tidy;
				if(dir == 0) {
					tidy--;
					
				}else if (dir == 1) {
					tidx++;
					
				}else if (dir ==2) {
					tidy++;
					
				}else {
					tidx--;
					
				}
				
				System.out.println(cos[dir] + "쪽으로 이동...");
				idx++;
				
				if(map[tidy][tidx] == 7) {
					System.out.println("으악 벽에 막혔다. 못 간다.");
					continue;
				}
				
		        	map[y][x] = 0;
		        	map[tidy][tidx] = 8;
		        	
			}
			

			else {

				for (int i = 0; i < setDir.length; i++) {

					if (setDir[i][1] == dir) {
						if (input[idx] == 2) {
							dir = setDir[i][0];
							break;
						} else {
							dir = setDir[i][2];
							break;
						}

					}

				}
				idx++;
			}

			System.out.println("[현재몸방향]"+dir);

			

		}

		
		
		
		

				
		
		
		
		
		
	}
	}


