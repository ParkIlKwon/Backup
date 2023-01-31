package day02;

import java.util.Scanner;

public class D_02회원가입 {
	public static void main(String[] args) {
		/*
		 * [문제] 회원가입과 로그인 1. 먼저 아이디와 비밀번호를 입력해서 회원가입을 한다. 2. 이후 로그인을 위해 다시 아이디와 비밀번호를
		 * 입력받는다. 3. 가입된 정보와 로그인시 입력한 정보를 비교한다. 4. "로그인 성공" 또는 "로그인 실패"를 출력한다.
		 * 
		 */
		int id, pw, getId, getPw;
		Scanner sc = new Scanner(System.in);

		System.out.print("회원가입아이디");
		getId = sc.nextInt();
		System.out.print("회원가입패스워드");
		getPw = sc.nextInt();
		System.out.print("아이디");
		id = sc.nextInt();
		System.out.print("패스워드");
		pw = sc.nextInt();

		if (getId == id && getPw == pw) {
			System.out.println("로그인 성공");

		} else
			System.out.println("로그인 실패");

	}

}
