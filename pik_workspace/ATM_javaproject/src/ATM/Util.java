package ATM;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {

	static private Scanner sc = new Scanner(System.in);

	public static Scanner getSc() {
		return sc;
	}

	public static void setSc(Scanner sc) {
		Util.sc = sc;
	}
	
	static String getString(String msg) {
		System.out.println(msg + "입력 >>");
		return sc.next();
	}
	
	
	static int getValue(String msg , int n , int m){
			int num = -1;
				System.out.println(msg + "입력 >>");
				sc = new Scanner(System.in);
				try {
					num = sc.nextInt();
					if (num < n || num > m) {
						throw new Exception();
					}
				} catch (InputMismatchException e) {
					System.err.println("문자열은 입력될 수 없습니다.");
					num = -1;
				} catch (Exception e) {
					System.err.println("입력범위 초과 에러 :(");
					num = -1;
			}
				sc.nextLine();
				return num;
	}
	
	static boolean chkString(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9' ) {
				count++;
			}
		}
		return count == str.length() ? false : true ; // 숫자만있음 : 섞여있음
		
	}
	
	
	
	
	
	
}
