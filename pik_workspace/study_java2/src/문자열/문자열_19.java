package 문자열;

import java.util.Scanner;

public class 문자열_19 {

	public static void main(String[] args) {

		/*
		[문제]
			아이디와 비밀번호를 입력받고 로그인을 처리한다.
			단, 아이디와 비밀번호는
			(1) 대문자로 입력하던
			(2) 소문자로 입력하던
			(3) 대소문자를 섞어서 입력하던 전부 동일하게 인식되어야 한다.
	 */
			boolean flag = false;
			Scanner scan = new Scanner(System.in);
			
			String dbId = "q1w2e3r4";
			String dbPw = "r4e3w2q1";
			
			String hint1 = "abcdefghijklmnopqrstuvwxyz";
			String hint2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			
			System.out.println(">>> 로그인 <<<");
			System.out.print("아이디를 입력하세요 : ");
			String myId = scan.next();
			int cnt = 0;
			
			for (int i = 0; i < myId.length(); i++) {
				String temp = dbId.charAt(i) + "";
				String temp2 = myId.charAt(i) + "";
				
				for (int k = 0; k < hint2.length(); k++) {
					if (temp2.charAt(0) ==hint2.charAt(k)) {
						temp2 = hint1.charAt(k) + "";
						break;
					}
				}
				
				if(temp.equals(temp2)) {
					cnt++;
				}
				
				
			}
			
			
			if(cnt == myId.length()) {
				System.out.print("비밀번호를 입력하세요 : ");
				String myPw = scan.next();
				
				cnt = 0;
				
				for (int i = 0; i < myPw.length(); i++) {
					String temp = dbPw.charAt(i) + "";
					String temp2 = myPw.charAt(i) + "";
					
					for (int k = 0; k < hint2.length(); k++) {
						if (temp2.charAt(0) ==hint2.charAt(k)) {
							temp2 = hint1.charAt(k) + "";
							break;
						}
					}
					
					if(temp.equals(temp2)) {
						cnt++;
					}
					
					
				}
				
				if(cnt == myPw.length()) {
					flag =true;
				}
				
				System.out.println(flag == true ? "로그인 완료": " 비밀번호가 다릅니다.");
				
			}else {
				
				System.out.println("아이디가 다릅니다.");
				
			}
			
			
		
		
		
	}

}
