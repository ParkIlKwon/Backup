package day02;

import java.util.Scanner;

public class C_08로그인문제 {
	public static void main(String[] args) {
		/*
		 * 2:58 [문제] 철수는 로그인을 하려고 한다. 아이디와 비밀번호를 입력받는다. 아이디와 비밀번호 둘 중 하나만 틀려도 로그인은 실패한다.
		 * joinId와 joinPw는 철수가 이미 가입한 아이디와 비밀번호이다.
		 */
		int id, pw;
		int joinId, joinPw;
		Scanner sc = new Scanner(System.in);
		System.out.println("만들 아이디");
		joinId = sc.nextInt();
		System.out.println("만들 비번");
		joinPw = sc.nextInt();
		System.out.print("아이디:  ");
		id = sc.nextInt();
		System.out.print("비번:  ");
		pw = sc.nextInt();

		System.out.println(joinId == id && joinPw == pw);
		
		

	}

}
	//종료 3:05