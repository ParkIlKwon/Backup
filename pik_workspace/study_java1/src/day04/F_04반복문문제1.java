package day04;

public class F_04반복문문제1 {
	public static void main(String[] args) {
		/*
		[문제] 아래 조건을 충족하는 식을 작성하시오.
			조건1) 1~10까지 반복문을 실행한다.
			조건2) 숫자가 짝수일 때 "짝수"를 출력한다.
			조건3) 숫자가 홀수일 때 "홀수"를 출력한다.
	 */
		int i=1;
		
		while (i<=10) {
			System.out.print(i);
			if(i%2==0) {
				System.out.print("짝");
			}else {
				System.out.print("홀");
			}
			i++;
			System.out.println("수");
		}
	}

}





