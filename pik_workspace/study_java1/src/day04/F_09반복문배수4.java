package day04;

public class F_09반복문배수4 {
	public static void main(String[] args) {
		/*
		 * [문제]
		 *  28의 배수 중에서 가장 큰 세자리 수를 출력하시오.
		 *  답 : 980 
		 */
		int i=950,min=0;
		while(i<1000) {
			if(i%28==0) {
				min=i;
			}
			i++;	//감소연산자 써도됨 . i --
		}
		System.out.println(min);
	}

}
