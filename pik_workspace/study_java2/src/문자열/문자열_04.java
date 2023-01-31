package 문자열;

import java.util.Scanner;

public class 문자열_04 {

	public static void main(String[] args) {

		/*
		 * # 끝말잇기 게임을 만들어보세요.
		 * 
		 * 제시어 : 자전거
		 * 입력 : 거미
		 * 제시어 : 거미
		 * 입력 : 미술
		 * ...
		 
		 1. 한자리 단어 안되요 
		 2. 기러기 -> 기러기 하면안됨 
		 3. 끝을 입력 받으면 반복문 종료 
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		String start ="자전거";
		while(true) {
			
			System.out.println("제시어 : " + start );
			
			char sub = start.charAt(start.length()-1) ;
			String input = sc.next();
			char sub2 = input.charAt(0);
			
			if (input.equals("끝")) {
				System.out.println("끝냅니다.");
				break;
			}
		
			if(sub != sub2 || start.equals(input) || input.length()<2) {
				System.out.println("졌습니다.");
				break;
			}
			
			start = input;
			
		}
		
		
		
	}

}
