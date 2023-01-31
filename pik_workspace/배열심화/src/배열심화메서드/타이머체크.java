package 배열심화메서드;

import java.util.Scanner;

public class 타이머체크 {

	public static void main(String[] args) {

		 System.out.println("타이머 시작");

			 
			//gap
			
			
		 Scanner sc = new Scanner(System.in);
		 long beforeTime = System.currentTimeMillis();
			
			while (true) {
				int settime = 10;
				
				int num = sc.nextInt();
				
				long afterTime = System.currentTimeMillis(); 

				double secDiffTime = (afterTime - beforeTime) / 1000.0;
				System.out.println(secDiffTime);
				if (secDiffTime > settime) {
					break;
				}
			}
			
		
		
		
	}

}
