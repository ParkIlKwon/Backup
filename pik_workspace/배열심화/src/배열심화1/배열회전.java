package �迭��ȭ1;

import java.util.Arrays;
import java.util.Scanner;

public class �迭ȸ�� { 

	public static void main(String[] args) {
		/*
		 * ����)  �Ʒ� ��ɾ �Է¹��������� block�迭�� 90�� ȸ���غ�����.
		 * [1.left_turn] [2.right_turn]
		 * 
		 * ��) [1.left_turn] (�������� 90�� ȸ��)
		 * 
		 * 4 8 12 16
		 * 3 7 11 15
		 * 2 6 10 14
		 * 1 5 9  13
		 * 
		 * [0,0] = [0,3]     [0,1]  = [1, 3]
		    [1,0] = [0,2]     [1,1]  = [1,2 ]
		    [2,0] = [0,1]     [2,1]  = [1,1]
		    [3,0] = [0,0]     [3,1] =  [1,0]


		 * 13  9   5   1
		 * 14 10 6   2
		 * 15 11 7   3
		 * 1612  8   4				====������ ȸ��
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		
		int block[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16},
		};
		
		
		
			while (true) {
				int temp[][] = new int [4][4];
				int idx = block.length - 1;
				System.out.println(" [1.left_turn] [2.right_turn][3.exit]");
				int sel = sc.nextInt();
				
				if(sel == 3) {
					System.out.println("�����մϴ�.");
					break;
				}
				
				if(sel == 1) {
					for (int i = 0; i < temp.length; i++) {

						for (int k = 0; k < temp.length; k++) {
							
							temp[k][i] = block[i][idx-k];

						}

					}
					

				}else if (sel ==2) {
					System.out.println("���������� �̵�");
					idx = 0;
					for (int i = temp.length-1; i >= 0; i--) {
						
						for (int  k = temp.length-1; k >= 0; k--) {
							temp[k][idx] = block[i][k];
						}
						idx++;
					}
					
					
				}
				block = temp;
				
				for (int i = 0; i < block.length; i++) {
					System.out.println(Arrays.toString(block[i]));
					
				}
				
				
			}
		
	

	}

}
