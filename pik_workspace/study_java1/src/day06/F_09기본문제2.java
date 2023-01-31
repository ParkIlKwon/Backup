package day06;

public class F_09기본문제2 {
	public static void main(String[] args) {
		int[] arr = new int[5]; // 10 20 30 40 50
		int sum = 0, cnt = 0;
		// 문제1) 4의 배수만 출력
		// 정답1) 20 40

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10 * i + 10;
			if (arr[i] % 4 == 0) {
				System.out.println(arr[i]);
				sum += arr[i];
				cnt++;
			}
		}

		// 문제2) 4의 배수의 합 출력
		// 정답2) 60
		System.out.println("[ 합 ] " + sum);
		// 문제3) 4의 배수의 개수 출력
		// 정답3) 2
		
		System.out.println("[4의 배수 개수] "+cnt);
	}

}
