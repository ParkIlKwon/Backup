package day02;

import java.util.Scanner;

public class D_08점수유효성검사 {
	public static void main(String[] args) {

/*
	[문제] 점수 유효성 검사
		1. 점수 2개를 입력받아 평균을 구한다.
		2. 평균이 60점 이상이면 합격, 60점 미만이면 불합격이다.
		3. 조건1)
		   입력받은 정수가 음수이거나 100점을 초과하면,
		   오류 메세지를 출력한다.
		   예) 점수를 잘 못 입력했습니다.
		4. 조건2)
		   평균이 60점 이상이라도 한 과목이라도 50점 미만이면,
		   불합격을 출력한다.
 */
		int a,b,total=0;
		double avg=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("첫번째 점수를 입력하시오:");
		a=sc.nextInt();
		System.out.print("두번째 점수를 입력하시오:");
		b=sc.nextInt();
		sc.close();
		boolean arr = a<0||b<0||a>100||b>100;
		if(arr) {
			System.out.println("점수를 잘못입력하였습니다.");
			return;
		}
		total = a+b;
		avg=total/2;
		
		boolean check=avg>=60&&a>50&&b>5; 
		
		if(check) {
			System.out.println("합격입니다.");
		}
		if(!check) {
			System.out.println("불합격입니다.");
		}
		
	}

}
