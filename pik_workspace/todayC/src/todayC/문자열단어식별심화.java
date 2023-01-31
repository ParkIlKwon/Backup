package todayC;

import java.util.Scanner;

public class 문자열단어식별심화 {

	public static void main(String[] args) {
		/*1:59 - 2: 34
		 * [심화]
		 * 연속된 숫자값 3개이상 있으면 안됩니다 
		 * 같은 숫자가 3번이상 반복되도 안됩니다
		 * asdf1234sdff => false
		 * asdf4321sadf => false
		 * asdf1111asdf => false 
		 * 
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
		String text = sc.nextLine();
		text = text.replaceAll(" ", "");
		boolean chk= true;
		
		char cha [] = new char[text.length()];
		
		for (int i = 0; i < cha.length; i++) {
			cha[i] = text.charAt(i);
		}
		
		for(char ch:cha) {
			int cnt = 0;
			for (int i = 0; i < cha.length; i++) {
				if (cha[i] == ch ) {
					cnt++;
					if(cnt >=3) {
						chk = false;
					}
				}
			}
		}
		
		
		if (chk) {
			int counter = 0;
			for (char c : cha) {
				if((int)c>='0' && (int) c <='9') {
					counter++;
					
				}
			}
			
			if (counter <= 0) {
				System.out.println("문자만 있다.");
			}else if (counter == text.length()) {
				System.out.println("숫자만 있다.");
			}else {
				System.out.println("문자숫자섞여있다.");
			}
			
			
			
		}else {
			System.out.println("같은 숫자나 문자열이 3번이상 반복됩니다.");
		}
		
		

	}

}
