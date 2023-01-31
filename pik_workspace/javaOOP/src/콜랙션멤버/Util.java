package 콜랙션멤버;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {
	static Scanner sc = new Scanner(System.in);

	static String getString() {
		String str = "";
		try {
			str = sc.next();
			int cnt = 0;
			
			for (int i = 0; i < str.length() ; i++) {
				if (str.charAt(i) >'0' && str.charAt(i) <= '9'  ) {
					cnt++;
				}
			}
			if (cnt == str.length()) {
				throw new Exception();
			}
		}catch (InputMismatchException e) {
			// TODO: handle exception
		}catch (Exception e) {
			System.err.println("숫자만 입력될 수 없습니다.");
			return "";
		}
		
		return str;
	}
	
	static int getVal(int n , int m) {
		int num = 0;
		try {
			num = sc.nextInt();
			
			if (num < n || num > m) {
				throw new Exception();
			}
		}catch (InputMismatchException e) {
			System.err.println("문자열이 입력될 수 없습니다.");
		}catch (Exception e) {
			System.err.println("입력 범위 초과 에러");
			return -1;
		}
		
		return num;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
