package day08;

import java.util.Arrays;
import java.util.Scanner;

public class F_08�̴ϸ��� {

	public static void main(String[] args) {
		/*
		 * # �̴ϸ���
		 * 1. �÷��̾�� p1�� p2 2���̴�.
		 * 2. �����ư��� 1~3 ������ ���ڸ� �Է��� �̵��Ѵ�.
		 * 3. �̵��ϴٰ� ���� �÷��̾�� ���� ��ġ�� ���̰� �Ǹ�,
		 *    ��� �÷��̾�� ������ �Ǿ� �������� �ǵ��ư���.
		 * 4. ���� 3������ ���� �̱��.
		 *    
		 *  [p2]1~3 �Է� : 1
		 *  1 2 3 4 5 6 7 8 
		 *  0 1 0 0 0 0 0 0 
		 *  0 0 0 2 0 0 0 0 
		 *  
		 *  [p1]1~3 �Է� : 3
		 *  [p1]�� p2�� ��Ҵ�!
		 *  1 2 3 4 5 6 7 8 
		 *  0 0 0 0 1 0 0 0 
		 *  2 0 0 0 0 0 0 0 
		 */

	    Scanner sc = new Scanner(System.in);
			
			int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
			int[] p1   = {1, 0, 0, 0, 0, 0, 0, 0};
			int[] p2   = {2, 0, 0, 0, 0, 0, 0, 0};
			int p1cnt=0;
			int p2cnt=0;
			int Catch=0;
			int turn = 1;
			
			int idx1 = 0 , idx2 = 0;
			
				
			while(p1cnt != 2 && p2cnt != 2) {
					
				System.out.println(Arrays.toString(game));
				System.out.println(Arrays.toString(p1));
				System.out.println(Arrays.toString(p2));
								
				if(turn==1) {
				idx1 = sc.nextInt();
				
				for(int i = 0 ; i < game.length ; i++) {
					
					if(p1[i]!=0) {
						Catch = i;
						if(i+idx1>=game.length) {
							
							p1[i]=0;
							p1[(0+idx1)-1] = 1;
							p1cnt ++;
						}else {
							p1[i+idx1] = 1;
							p1[i]=0;
							
							break;
						}
						
					}
					
				}
				
				turn = 2;
				
								}else {
					idx2 = sc.nextInt();
					
					for(int i = 0 ; i < game.length ; i++) {
						
						if(p2[i]!=0) {
							p2[i]=0;
							if(Catch == i) {
								System.out.println("ĳġ");
								p1[i] = 0;
								p1[0] = 1;
							}
						if(i+idx2>=game.length) {
							
							p2[(0+idx2)-1] = 2;
							p2cnt ++;
						}else {
							p2[i+idx2] = 2;
							
							break;
						}
						}
											
						}	
																				
				turn = 1;
				
				}
		
				
								
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
