package 문자열;

import java.util.Scanner;

public class 기본이론10 {

	public static void main(String[] args) {

		// next() nextLine() 차이 
				// next() => " " space 통해서 입력 버퍼에서 짤라옴
				// nextLine() => "\n" enter 이전에 입력값 모두를 버퍼에서 짤라옴 
				
				Scanner sc = new Scanner(System.in);

				System.out.println("이름 입력 > ");
				String myName = sc.nextLine();
				System.out.println("나이 입력 > ");
				int age = sc.nextInt();
				
				System.out.printf(" 이름 : %s 나이: %d \n" , myName, age);
			
				// 단독으로 쓰게되면 입력버퍼 초기화 => 기존에 남아있는 값들을 다 꺼내서 
				// 입력버퍼에서 제거해줌 
				
				sc.nextLine(); // 기존에 있는 입력 버퍼들이 사라진다
				
				
		
	}

}
