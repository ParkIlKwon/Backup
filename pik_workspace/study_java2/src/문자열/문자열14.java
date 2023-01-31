package 문자열;

import java.util.Arrays;
import java.util.Scanner;


public class 문자열14 {

	public static void main(String[] args) {
		/*
		 * # 단어 교체하기(replace)
		 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
		 * 2. 교체해주는 기능을 구현한다.
		 * 예)
		 * 		Life is too short.
		 * 		변경하고 싶은 단어입력 : Life
		 * 		바꿀 단어입력 : Time
		 * 
		 * 		Time is too short. // 해당 문자 출력 
		 *     // Life 이미 Time 으로 바꿨기때문에 다시 life 입력하면 못찾아야함 
		 */

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		text = text.substring(0,text.length()-1);
		
		String arr[] = text.split(" ");
		String word="";
		
		int i = 0;
		
		
		while (true) {
			boolean flag = true;
			System.out.println(Arrays.toString(arr));
			while (flag) {
				System.out.print("변경하고 싶은 단어를 입력하세요 : ");
				System.out.println("끝내고 싶으면 끝");
				word = scan.nextLine();
				
				if (word.charAt(0) == '끝') {
					return;
				}
				
				for (i = 0; i < arr.length; i++) {
					if (word.equalsIgnoreCase(arr[i])) {
						flag = false;
						break;
					}
				}
				if (flag==true) {
					System.out.println("단어를 찾지못했습니다.");
					
				}
			}
			
			System.out.println("바꿀단어: "+arr[i]);
			String word2 = scan.nextLine();
			if (arr[i].equalsIgnoreCase(word2)) {
				System.err.println("같은 단어로 바꿀수 없습니다...");
				continue;
			}
			
			arr[i] = word2;
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
