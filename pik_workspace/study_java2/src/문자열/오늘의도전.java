package 문자열;

import java.util.Arrays;
import java.util.Random;

public class 오늘의도전 {

	public static void main(String[] args) {
		/*
		 * # 당첨복권 1셋트
		 * 1. 3이 연속으로 3번 등장하면 당첨복권이다.
		 * 2. 랜덤으로 5개의 복권을 생성하되,
		 *    당첨복권은 한 개만 생성되도록 설정한다.

	    // 3030333 => 당첨 
	    // 0303030 => 꽝 
		 */

		int[][] lottoSet = new int[5][7];
		Random rd = new Random();
		
		boolean flag = false;
		
		for (int i = 0; i < lottoSet.length; i++) {
			int cnt = 0;
			System.out.println(flag);
			for (int k = 0; k < lottoSet[i].length; k++) {
				
				if (flag ==  false) {
					int ran = rd.nextInt(2);
					if(ran != 0) {
						lottoSet[i][k] = 3;
					}else {
						lottoSet[i][k] = 0;
					}
					
				}else {
					if(k%2==1) {
						lottoSet[i][k] = 3;
					}
				}
				
			}
			
			for (int k = 0; k < lottoSet[i].length; k++) {
			if(lottoSet[i][k]==3) {
				cnt++;
				if(cnt >=3 )flag=true;
			}else {
				cnt = 0;
			}
				
				
			}
		}
		
		for (int i = 0; i < lottoSet.length; i++) {
			System.out.println(Arrays.toString(lottoSet[i]));
		}
		
		
		
		

	}

}
