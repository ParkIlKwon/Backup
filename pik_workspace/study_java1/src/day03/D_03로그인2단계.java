package day03;

import java.util.Scanner;

public class D_03로그인2단계 {
	public static void main(String[] args) {
		/*
		 * [문제] 중첩 조건문 로그인을 중첩 if문으로 다시 표현하시오.
		 * 
		 * 1. id를 입력받아 joinId와 일치할 경우에만 pw를 입력할 수 있다. 2. id를 틀린 경우, "ID를 확인해주세요." 라는
		 * 메세지를 출력한다. 3. pw가 틀린 경우, "PW를 확인해주세요." 라는 메세지를 출력한다. 4. id와 pw가 모두 일치하는 경우,
		 * "로그인 성공입니다."라는 메세지를 출력한다.
		 */

		Scanner sc = new Scanner(System.in);
		int dbId = 1111;
		int dbPw = 1234;
		int id, pw;
		boolean success = false;
	
		System.out.println("-기본설정아이디-\n1111\t1234");
		System.out.print("아이디를 입력해주시오 ");
		id = sc.nextInt();
		
		if (id != dbId) {
			System.out.println("아이디를 확인해주세요");
			
		}
		if (id == dbId) {
			System.out.print("비밀번호를 입력해주시오 ");
			pw = sc.nextInt();
			if (pw == dbPw) {
				System.out.println("로그인 성공입니다.");
				success = true;
			}
			if (pw != dbPw) {
				System.out.println("비밀번호를 확인해주세요.");

			}
		
	}
		if(!success) {
			System.err.println("로그인 실패");
		}
}
}
