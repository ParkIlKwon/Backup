package 좌석예매자바mvc1;

import java.util.Scanner;

public class 타이머 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		long beforeTime = System.currentTimeMillis(); 
		int sel = sc.nextInt();
		beforeTime += sel;
		
		long afterTime = System.currentTimeMillis();
		double secDiffTime = (afterTime - beforeTime) / 1000.0;
		
		System.out.println(secDiffTime);
		
		
	}

}
