package 메서드;
	
	class Ex001{
		void odd(int a) {
			System.out.println(a%2 == 0 ? "짝수":"홀수");
			System.out.println("=============");
		}
		int sum(int a, int b) {
			int sum = a+b;
			return sum;
		}
		void fuction_A(int a) {
			System.out.println("=============");
			int num = a ;
			for (int i = 2; i < num; i++) {
				int cnt = 0;
				for (int k = 1; k <= i; k++) {
					if (i % k == 0) {
						cnt++;
					}
				}
				if (cnt == 2 ) {
					System.out.printf("->>%-2d ",i );
				}
			}
		}
	}

public class 기본예제01 {

	public static void main(String[] args) {

		Ex001 e = new Ex001();

		// 문제 1) a 가 홀수인지 짝수인지 출력 
		int a = 19;
		//e.printEvenOrOdd(a);
		e.odd(a);
		// 문제 2) x부터 y까지의 합을 출력하는 메서드
		int x = 1;
		int y = 10;
		System.out.println(e.sum(x, y));
		//e.sumBetweenValues(x, y);

		// 문제3) 숫자 1개를 인자로 사용해서 2부터 인자까지의  소수 전부 출력 
		int primeNumber = 20;
		e.fuction_A(primeNumber);
		
		
		// e.findPrimeNumbers(primeNumber);
		
	}

}