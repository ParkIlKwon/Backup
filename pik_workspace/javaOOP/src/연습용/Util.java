package 연습용;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {

	static Scanner sc = new Scanner(System.in);
	
	static String getString(String msg){
		System.out.print(msg + " 입력 > " );
		String str = "";
		try {
			str = sc.next();
			
		} catch (InputMismatchException e) {
		System.out.println("잘못된 입력");
			
		} catch (Exception e) {
		
			
		}
		
		return str;
		
		
	}
	
	
	
}
