package 메서드;

class Ex002{
		
		void totalvoid(int[] arr) {
			int cnt = 0;
			int cntz = 0;
			int sum = 0;
			int sum4 = 0;
			
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
				if (arr[i] %4 ==0) {
					cnt++;
					sum4+=arr[i];
				}
				if (arr[i] %2 ==0) {
					cntz++;
				}
			}
			System.out.println(sum);
			System.out.println(sum4);
			System.out.println(cnt);
			System.out.println(cntz);
			
			
		}
		
		
		
	}

	public class 기본예제02 {
	
		public static void main(String[] args) {

				// main 에서는 메서드만 호출하시오 
				Ex002 ex = new Ex002();
				int[] arr = { 87, 100, 11, 72, 92 };
				
				// 문제 1) 전체 합 출력
				// 정답 1) 362
				ex.totalvoid(arr);

				// 문제 2) 4의 배수의 합 출력
				// 정답 2) 264
				

				// 문제 3) 4의 배수의 개수 출력
				// 정답 3) 3
			

				// 문제 4) 짝수의 개수 출력
				// 정답 4) 3
				
				
				
				
				
		
		
		
		
		
	}

}
