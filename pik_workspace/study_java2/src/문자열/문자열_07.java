package 문자열;

import java.util.Arrays;

public class 문자열_07 {

	public static void main(String[] args) {

		// 문자열 함수를 사용해서 풀어볼것
		
				String str = "11/100/89";
				// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
				// 정답 1) 200
				String sarr[] = str.split("/");
				int[] arr = new int[3];
				int sum = 0;
				for (int i = 0; i < arr.length; i++) {
						arr[i] = Integer.parseInt(sarr[i]);
						sum+=arr[i];
				}
				
				System.out.printf("총점: %d ",sum);
				
				
				// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
				// 정답 2) 11/100/89
				int[] scores = {11, 100, 89};
				String text = "";
				
				System.out.println();
				for (int i = 0; i < scores.length; i++) {
			
					if(i == scores.length-1) {
						text += scores[i];
					}else {
						text += scores[i] + "/";
					}
					
				}
				
				System.out.println(text);
				
				
				
				
				
				
				
				
				
				
				
				
		
		
		
		
		
		
	}

}
