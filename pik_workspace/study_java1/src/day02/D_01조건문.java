package day02;

import java.util.Scanner;

public class D_01조건문 {
	public static void main(String[] args) {
		//사용자에게 값 1개를 입력 짝수면 짝수 출력 홀수면 홀수
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값 입 력 ! ");
		a=sc.nextInt();
		if(a%2==0) {
			System.out.println("짝수");
		}
		if(a%2!=0) {
			System.out.println("홀수");
		}
		
	}

}
