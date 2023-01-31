package 배열심화1;

import java.util.Arrays;
import java.util.Scanner;



public class 숫자이동되감기 {

	public static void main(String[] args) {
		/*
		 * [숫자이동되감기]
		    	     
			[1) left 2)right 3)up 4)down 5)되감기]
			 
			0 이 플레이어이다 .
			번호를 입력받고 해당위치로 이동 ==> 
			이동할때 값을 서로 교환한다. 

			 예) 1 ==>  left
		       {1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,0,15}		

		  
		    예) 1 ==>  left
		        {1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,0,14,15}		

			한칸한칸이동할때마다 yx 에 배열에 이동한경로를 저장했다가,
			5번입력시 ==> 왔던길로 되돌아가기 한다. 
		
		 */
				Scanner sc =new Scanner(System.in);
				int game[][] = {
								 {1,2,3,4},
								 {5,6,7,8},
								 {9,10,11,12},
								 {13,14,15,0}
								                         };
				
				int tidy = 0;
				int tidx = 0;
				int index_y = 0;
				int index_x = 0; //?? 어딘가에 쓰려고 만들었는데 까먹음.
				
				int idx = 0;
				int sel = 0;
				int temp = 0;
				
				int yx [][] = new int[10000][2];
				
				while (true) {
					
					for (int i = 0; i < game.length; i++) {
						
						System.out.println(Arrays.toString(game[i]));
						for (int k = 0; k < game[i].length; k++) {
							if(game[i][k] == 0) {
								tidy = i;
								tidx = k;
							
							}
							
						}
						
					}
					
					
					yx[idx][0] = tidy;
					yx[idx][1] = tidx;
					
					while (true) {
						System.out.println( "1)left 2)right 3)up 4)down 5)되감기]0)종료");
						sel = sc.nextInt();
						if(sel >= 0 && sel < 6) {
							break;
						}
						
						System.out.println("잘못입력하셨습니다.");
						
					}
					
					if(sel == 0) {
						System.out.println("끝내기.");
						break;
					}
					
					
					if (sel==1) {
						tidx --;
						if(tidx < 0) {
							tidx = game.length-1;
						}
						
					}else if (sel == 2) {
						tidx++;
						if(tidx > game.length-1) {
							tidx = 0;
						}
						
					}else if (sel == 3) {
						tidy--;
						if(tidy < 0) {
							tidy = game.length-1;
						}
						
						
					}else if (sel == 4) {
						tidy++;
						if(tidy > game.length-1) {
							tidy = 0;
						}
						
					}
					else if(sel == 5 && idx > 0){
						
						temp = game[yx[idx-1][0]][yx[idx-1][1]];
						game[yx[idx-1][0]][yx[idx-1][1]] = 0;
						game[tidy][tidx] = temp;
						idx--;
					}else {
						System.out.println("되감기 불가합니다.");
					}
					
					
					
					if(sel != 5) {
					
					temp = game[tidy][tidx];
					game[tidy][tidx] = 0;
					game[yx[idx][0]][yx[idx][1]] = temp;
					
					idx ++;
					}

					
					
					
				}
				
				
				
				

	}

}
