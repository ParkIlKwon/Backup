package day04;

public class F_06반복문배수1 {
	public static void main(String[] args) {
		/*
		 * [문제] 
		 * 	7의 배수중  150보다 작은수중 가장큰수 출력하시오. 
		 *  (어떤 수의 배수는 그 수에 정수를 곱한 수이다.) 
		 *  답 : 147
		 */
		int i=1,min=i;
		while (i<150) {
			if(i%7==0) {
				min=i;
				if (min>i) {
					min=i;
				}
			}
			i++;
		}
		System.out.println(min);
	}

}
