package �迭��ȭ1;

import java.util.Arrays;



public class ������ { 

	public static void main(String[] args) {
		/*
		 * [������]
		 * �Ʒ��Ͱ��� ����Ͻÿ�.
		 * 
		 * 
		 * 1	  	 2	3	 4	5	             �ٱ��� 1cycle �Ŀ� 2cycle �� ����.
		 * 16 	17	18	19	6		      idx �༭ ���.
		 * 15  	24	25	20	7	             [0,0]
		 * 14  	23	22	21	8	 			[1,1]
		 * 13	12	11	10	9					 	[2,2]
		 * 
		 * 
		 * 1 2 3
		 * 8 9 4
		 * 7 6 5
		 * 
		 * 
		 */
		//dir ? v							   v       v        v
		//�پ�� ?                           (size 4�϶�)  4  3   3  2  2  1  1
		//                                                                  +   +  -  -  + +  -  - 
		int idx = -1;
		int idy = 0;
		int dir = 1;                               //4 ���� ���� ��� ?
		int size = 4;         
		int [][] temp = new int [size][size];
		int lth = size;
		int x=0, y=0;
		int cnt = 1;

		for (int i = 0; i <size; i++) {

			for (int k = 0; k < 1; k++) {       

				for (x = 0; x < lth; x++) {
					idx += dir;
					temp[idy][idx] = cnt;

					cnt++;
				}
				lth --;

				for ( y = 0; y < lth; y++) {
					idy+=dir;
					temp[idy][idx] = cnt;

					cnt++;
				}                         
				System.out.println(idy);
				dir = -(dir); 		//������ ������� �ϴµ� ��


			}

		}
		for (int i = 0; i < temp.length; i++) {

			System.out.println(Arrays.toString(temp[i]));
		}



		

	}

}
