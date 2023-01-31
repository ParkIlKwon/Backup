package 클래스;

import java.util.Arrays;
import java.util.Random;

public class OMR {
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 홍길동 학생답안	
	int cnt ;						// 정답 맞춘 개수
	int score ;						// 성적
	
	public static void main(String[] args) {
		
		/*
		[문제]
			1. 배열 answer는 시험문제의 정답지이다.
			2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
			3. answer와 hgd 값을 비교해 정오표를 출력한다.
			4. 한 문제당 20점이다.
			
			answer = {1, 3, 4, 2, 5}
			hgd    = {1, 1, 4, 4, 3}
			성적    = 40점		 
		*/
				Random rd = new Random();
				OMR card = new OMR();
				
				for (int i = 0; i < card.hgd.length; i++) {
					card.hgd[i] = rd.nextInt(5)+1;
					if (card.hgd[i] == card.answer[i]) {
						System.out.println(i+1 + "번문제 맞췄습니다.");
						card.cnt++;
						card.score+=20;
					}
				}
				
				System.out.println("맞춘문제수:"+card.cnt);
				System.out.println("총 점수:"+card.score);
				
		

	}

}
