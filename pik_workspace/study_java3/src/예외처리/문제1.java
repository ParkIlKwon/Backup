package 예외처리;

import java.util.InputMismatchException;
import java.util.Scanner;

class Ex001{
	int getValue(String msg ,int start, int end) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		// 숫자값 입력 : 숫자 아닌 값 에외처리 
		while (true) {
			try {
				System.out.printf("%s[%d-%d] 입력: ",msg, start,end );
				num = sc.nextInt();
				
				if (num > end || num < start) {
					throw new Exception("점수값은 0 - 100 사이값 입니다");
				}
				
			} catch (InputMismatchException e) {
				System.err.println("숫자값 아님.");
				e.printStackTrace();
				continue;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println();
				e.printStackTrace();
				continue;
			}break;
		}
		
		// start end 범위 벗어난 숫자값 에외처리 
		
		return num;
	}
}

public class 문제1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		Ex001 e1 = new Ex001();
		System.out.println("num =" + e1.getValue("숫자값 입력 ", 1, 100));
		
		
		
		
		
		
		
		
		
		
		
	}

}