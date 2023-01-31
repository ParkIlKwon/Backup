package day06;

public class D_05for문연습문제 {
	public static void main(String[] args) {
		/*
		 * [문제1] 1~10까지 반복해 5~9 출력 
		 * [정답1] 5, 6, 7, 8, 9
		 * 
		 * [문제2] 10~1까지 반복해 6~3 거꾸로 출력 
		 * [정답2] 6, 5, 4, 3
		 * 
		 * [문제3] 1~10까지 반복해 짝수만 출력 
		 * [정답3] 2, 4, 6, 8, 10
		 */
		System.out.println("====문제1====");
		for(int i = 10; i >0 ; i--) {
			if(i<=6&&i>=3) {System.out.print(i);}
		}
		System.out.println();
		System.out.println("====문제2====");
		for(int i = 0; i <=10 ; i++) {
			if(i>=5&&i<=9) {System.out.print(i);}
			}
		System.out.println();
		System.out.println("====문제3====");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d %s\n", i, i % 2 == 0 ? "짝수" : "홀수");
		}
		}
		
		
	}


