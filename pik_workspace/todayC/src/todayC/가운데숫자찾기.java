package todayC;

import java.util.Scanner;

public class 가운데숫자찾기 {

	public static void main(String[] args) {
		//12:21 - 12:40
		//문제1) 1~백만 사이의 숫자를 입력받고 가운데 숫자 출력 
        //(단 ! 짝수자리의 수는 짝수자리라고 출력)
		// 예)  123 ==> 2
		// 예)  1234 ==> 짝수의 자리이다
		// 예)  1 ==> 1
		// 예)  1234567 ==> 4
		
		Scanner sc = new Scanner(System.in);
		int input = 0;
		while (true) {
			System.out.println("1~100만사이의숫자를 입력하시오.");
			input = sc.nextInt();
			
			if (input>1&&input<1000000) {
				break;
			}
		}
		
		String str = input+"";
		char[] cha = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			cha[i] = str.charAt(i);
		}
		
		if(cha.length%2 ==0) {
			System.out.println("짝수의 자리이다.");
		}else {
			System.out.println(cha[cha.length/2]);
			
		}
		
		
		
		

	}

}
