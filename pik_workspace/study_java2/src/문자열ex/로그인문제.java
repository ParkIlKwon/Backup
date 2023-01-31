package 문자열ex;

import java.util.Arrays;
import java.util.Scanner;

public class 로그인문제 {

	public static void main(String[] args) {

		/*
		[문제]
			아이디와 비밀번호를 입력받고 로그인을 처리한다.
			단, 아이디와 비밀번호는
			(1) 대문자로 입력하던
			(2) 소문자로 입력하던
			(3) 대소문자를 섞어서 입력하던 전부 동일하게 인식되어야 한다.
	 */
			Scanner sc = new Scanner(System.in);
			
			int cnt = 0;
			
			while (true) {
				System.out.println("아이디를 입력하세요");
				String dbId = "q1w2e3r4";
				String myId = sc.next();
				for (int i = 0; i < dbId.length(); i++) {
					
					String temp = dbId.charAt(i)+"";
					String temp2 = myId.charAt(i)+"";
					
					if((int)temp2.charAt(0)>64 &&(int)temp2.charAt(0)<91 ) {
						int idx = (int)temp2.charAt(0);
						idx += 32;
						temp2 = (char)idx + "";
					}
					
					if(temp.charAt(0) == temp2.charAt(0)) {
						cnt++;
					}
					
				}
				
				if(cnt == dbId.length()) {
					break;
				}
				
				
			}
			
			while (true) {
				cnt = 0;
				System.out.println("비밀번호를 입력하세요");
				String dbPw = "r4e3w2q1";
				String myPw=sc.next();
				
				for (int i = 0; i < dbPw.length(); i++) {
					
					String temp = dbPw.charAt(i)+"";
					String temp2 = myPw.charAt(i)+"";
					
					if((int)temp2.charAt(0)>64 &&(int)temp2.charAt(0)<91 ) {
						int idx = (int)temp2.charAt(0);
						idx += 32;
						temp2 = (char)idx + "";
					}
					
					if(temp.charAt(0) == temp2.charAt(0)) {
						cnt++;
					}
					
				}
				
				if(cnt == dbPw.length()) {
					break;
				}
				
				
			}
			
			
			
		
		
	}

}
