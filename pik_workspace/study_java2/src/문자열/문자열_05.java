package 문자열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 문자열_05 {

	public static void main(String[] args) {
		/*
		 * # 타자연습 게임[1단계]
		 * 1. 문제를 섞는다.(shuffle)
		 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
		 * 예)
		 * 문제 : mysql
		 * 입력 : mydb
		 * 문제 : mysql
		 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
		 * 문제 : jsp
		 */

		String[] words = {"java", "mysql", "jsp", "spring"};
		Random rd = new Random();
		Scanner sc =new Scanner(System.in);
		int index1,index2;
		
		for (int i = 0; i < 20; i++) {
			index1 = rd.nextInt(words.length);
			index2 = rd.nextInt(words.length);		
			if(index1 == index2)continue;
			String temp = words[index1];
			words[index1] = words[index2];
			words[index2] = temp;
			
		}
		
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
			String input = sc.next();
			
			if (words[i].equals(input)) {
			}else {
				System.out.println("아닙니다.");
				i--;
			}
			
		}
		
		System.out.println("이겻습니다.");
		
		
		
		
		
		
	}

}
