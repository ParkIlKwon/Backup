package todayC;

import java.util.Arrays;

public class 연속빈칸찾기 {

	public static void main(String[] args) {
		/*
		[문제]
			arr배열은 숫자1과 0으로 구성되어있다.
			숫자1은 이미 채워진 자리이고, 0은 비어있는 자리이다.
			input변수 값의 의미는 1부터 시작하는 위치를 의미함과 동시에
			연속으로 1으로 채울 칸 수를 의미한다.
			예를들어 input의 값이 3인 경우, 3번째라는 의미로
			인덱스의 값 2부터 3칸이 비어있는지(0) 확인한 후,
			비어있으면 전부 1로 변경해야 한다.
		[정답]
			input = 3 :: 인덱스 2부터 연속으로 3칸 비어있으므로(0)
			input = {0, 1, 1, 1, 1, 1, 0, 0}
			
			input = 4 :: 인덱스 3부터 연속으로 4칸 비어있지 않으므로 변경X
			input = {0, 1, 0, 0, 0, 1, 0, 0}
			
			input = 1 :: 인덱스 0번째에 1칸 비어있으므로(0)
			input = {1, 1, 0, 0, 0, 1, 0, 0}
			
			//  배열 하나 더 생성해서 둘다 1이 겹치면 false로 .
	 */

			
			int[] arr = {0, 1, 0, 0, 0, 1, 0, 0};
			int input = 4;
			int k = 0;
			boolean loop = true;
			
			for (int i = 0; i < arr.length-input; i++) {
				int cnt = 0;
				int temp[] = new int [arr.length];
				
				for ( k = 0; k < input; k++) {
					temp[k+i] = 1;
					
					
				}
				for (int j = 0; j < input; j++) {	//비교
					if (temp[j+i] != arr[j+i]) {
						cnt ++;
						if (cnt == input) {
							for (int j2 = 0; j2 < input; j2++) {
								arr[j2+i] = 1;
							}
							loop = false;
							break;
						}
					}
				}if(loop == false) break;
			}
			System.out.println(Arrays.toString(arr));
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
