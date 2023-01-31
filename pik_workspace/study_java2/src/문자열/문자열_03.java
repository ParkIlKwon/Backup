package 문자열;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String answer = "코끼리";
		char [] arr1 = new char[3];
		char [] arr2 = new char[3];
		int cnt = 0;
		
		System.out.println("코끼리 입력>> ");
		String input = sc.next();
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=answer.charAt(i);
			arr2[i]=input.charAt(i);
		}
		
		for (int i = 0; i < arr2.length; i++) {
			if(arr1[i] == arr2[i]) {
				cnt ++;
				
			}
		}
		
		System.out.println(cnt==answer.length()?"맞습니다":"틀립니다.");
		
		
		
		
	}

}
