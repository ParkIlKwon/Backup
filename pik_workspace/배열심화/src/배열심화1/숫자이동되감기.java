package �迭��ȭ1;

import java.util.Arrays;
import java.util.Scanner;



public class �����̵��ǰ��� {

	public static void main(String[] args) {
		/*
		 * [�����̵��ǰ���]
		    	     
			[1) left 2)right 3)up 4)down 5)�ǰ���]
			 
			0 �� �÷��̾��̴� .
			��ȣ�� �Է¹ް� �ش���ġ�� �̵� ==> 
			�̵��Ҷ� ���� ���� ��ȯ�Ѵ�. 

			 ��) 1 ==>  left
		       {1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,0,15}		

		  
		    ��) 1 ==>  left
		        {1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,0,14,15}		

			��ĭ��ĭ�̵��Ҷ����� yx �� �迭�� �̵��Ѱ�θ� �����ߴٰ�,
			5���Է½� ==> �Դ���� �ǵ��ư��� �Ѵ�. 
		
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
				int index_x = 0; //?? ��򰡿� ������ ������µ� �����.
				
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
						System.out.println( "1)left 2)right 3)up 4)down 5)�ǰ���]0)����");
						sel = sc.nextInt();
						if(sel >= 0 && sel < 6) {
							break;
						}
						
						System.out.println("�߸��Է��ϼ̽��ϴ�.");
						
					}
					
					if(sel == 0) {
						System.out.println("������.");
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
						System.out.println("�ǰ��� �Ұ��մϴ�.");
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
