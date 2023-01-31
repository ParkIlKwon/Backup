package day07;

import java.util.Arrays;

public class F_04사각형출력 {
	public static void main(String[] args) {
		/*
		 * [문제] b 배열을 아래와같이 사각형모양으로출력한다. [힌트] 3칸마다 줄을 바꿔준다.
		 * 
		 * 1 2 3 4 5 6 7 8 9
		 * 
		 */
		int b[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int idx = 1;
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
			if (idx % 3 == 0) {
				System.out.println();
			}
			idx++;
		}
		
	}

}
