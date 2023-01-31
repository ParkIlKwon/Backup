package 문자열;

import java.util.Scanner;

public class 문자열_12 {

	public static void main(String[] args) {
		/*
		 * # 문자열 속 숫자검사
		 * 예) adklajsiod
		 * 	     문자만 있다.
		 * 예) 123123
		 *    숫자만 있다.
		 * 예) dasd12312asd
		 *    문자와 숫자가 섞여있다.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String text = sc.next();
		boolean flag = false;
		
		char [] cha = null;
		
		cha = new char [text.length()];
		for (int i = 0; i < cha.length; i++) {
			cha[i] = text.charAt(i);
			if ((int)cha[i]>=48&&(int)cha[i]<=57) {
			flag=true;	
			}
		}
		
		System.out.println(flag == true ? "문자와 숫자가 섞여있다":"문자만있다.");
		
		
		
		

	}

}
