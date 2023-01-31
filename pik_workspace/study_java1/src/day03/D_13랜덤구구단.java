package day03;

import java.util.Random;
import java.util.Scanner;

public class D_13랜덤구구단 {
	public static void main(String[] args) {
		/*
		[문제]
			1. 구구단 문제를 출제하기 위해 정수 2개를 랜덤하게 저장한다.
			2. 구구단 문제를 출력한다. 예) 3 x 7 = ?
			3. 문제에 해당하는 정답을 입력받는다.							
			// 2 - 9 단까지 
			// 2*1 - 2*9 1-9 까지 곱 
			4. 정답을 비교해 "정답" 또는 "오답"을 출력한다.
	 */
		int solution,ran1,ran2;
		Random rd = new Random();Scanner sc = new Scanner(System.in);
		ran1=rd.nextInt(8)+2;ran2=rd.nextInt(9)+1;
		System.out.printf("%d X %d  답입력: ",ran1,ran2);
		solution = sc.nextInt();
		sc.close();
		boolean err=solution<=0,compare=solution==ran1*ran2;
		if (err) {
			System.out.println("값을 잘못 입력하였습니다.");
			return;
		}
		System.out.println(compare?"정답입니다. ":"오답입니다. ");
	}

}
