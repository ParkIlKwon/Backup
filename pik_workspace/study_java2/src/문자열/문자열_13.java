package 문자열;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열_13 {

	public static void main(String[] args) {

		/*
		 * # 단어 검색
		 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
		 * 2. 단어가 존재하면 true
		 *    단어가 없으면 false를 출력한다.
		 */
		boolean flag = false;
		Scanner scan = new Scanner(System.in);
		
		String text = "Life is too short.";
		System.out.println(text);
		text = text.substring(0,text.length()-1);
		String [] arr =  text.split(" ");
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();
		
		for (int i = 0; i < arr.length; i++) {
				
				if (word.equalsIgnoreCase(arr[i])) {
					flag=true;
					break;
				}
				
		}
		
		
		System.out.println(flag);
		
		
		
	}

}
