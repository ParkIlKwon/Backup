package day04;

public class F_02반복문기본1 {
	public static void main(String[] args) {
		/*
	     [문제1] 1~10까지 반복해 5~9 출력
		 [정답1] 5, 6, 7, 8, 9

		 [문제2] 10~1까지 반복해 6~3 거꾸로 출력
		 [정답2] 6, 5, 4, 3

		 [문제3] 1~10까지 반복해 짝수만 출력
		 [정답3] 2, 4, 6, 8, 10

	*/
		System.out.println("문제1");
		int i=1;
		while (i <10) {
			if(i>4&&i<9)System.out.print(i+",");
			if(i==9)System.out.print(i);
			i++;
		}
		System.out.println();
		System.out.println("문제2");
		i=10;
		while (i>0) {
			if(i<=6&&i>=3&&i>3)System.out.print(i+",");
			if(i==3)System.out.print(i);
			i--;
		}
		System.out.println();
		System.out.println("문제3");
		i=1;
		while(i<=10) {
			if(i%2==0) {
				if(i<10)System.out.print(i+",");
				if(i==10)System.out.print(i);
			}
			i++;
		}
		
	}

}
