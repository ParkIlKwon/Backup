package 예외처리;

import java.util.Scanner;

public class 연습장 {

	public static void main(String[] args) {
		
		while (true) {
			Scanner sc = new Scanner(System.in); //반복문 안으로 들어와야함 .
			try {
				int num = sc.nextInt();
				
			} catch (Exception e) {
				System.err.println("숫자가 아닌값");
				continue;
			}break;

		}
		
		
	}

}
