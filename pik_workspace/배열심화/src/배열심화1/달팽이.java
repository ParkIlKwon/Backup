package 배열심화1;

import java.util.Arrays;



public class 달팽이 { 

	public static void main(String[] args) {
		/*
		 * [달팽이]
		 * 아래와같이 출력하시오.
		 * 
		 * 
		 * 1	  	 2	3	 4	5	             바깥쪽 1cycle 후에 2cycle 씩 감소.
		 * 16 	17	18	19	6		      idx 줘서 계산.
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
		//줄어듦 ?                           (size 4일때)  4  3   3  2  2  1  1
		//                                                                  +   +  -  -  + +  -  - 
		int idx = -1;
		int idy = 0;
		int dir = 1;                               //4 방향 따로 계산 ?
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
				dir = -(dir); 		//반전을 시켜줘야 하는데 흠


			}

		}
		for (int i = 0; i < temp.length; i++) {

			System.out.println(Arrays.toString(temp[i]));
		}



		

	}

}
