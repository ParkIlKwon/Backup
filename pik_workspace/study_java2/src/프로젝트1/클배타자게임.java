package 프로젝트1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Word {
		String word;
		int ranPos;
		
		void setRandomWordPos(String sample , int rIdx) {			
			word = sample;
			ranPos = rIdx;
		}
		
		void printWord() {
			for (int i = 0; i < word.length(); i++) {
				if (i == ranPos) {
					System.out.print("*");
				} else {
					System.out.print(word.charAt(i));
				}
			}
			System.out.println();
		}
	}
	
	class WordDAO{
		Random rd = new Random();
		String[] wordSampleList = { "java", "jsp", "python", "android", "spring" };
		boolean[] checkList = new boolean[wordSampleList.length]; //  이미선택한단어 체크용 
		int count = wordSampleList.length; // 단어 개수(게임종료용카운트)
	
	// 셔플 말고 checkList 배열 사용해서 랜덤 word 값 가져오기 
		
		void run(){
			Scanner sc = new Scanner(System.in);
		while (count > 0 ) {
			int idx = rd.nextInt(checkList.length);
			if ( checkList[idx]  ) continue;
				
			Word word = new Word();
			String str = wordSampleList[idx];
			int ran = rd.nextInt(str.length());
			word.setRandomWordPos(str,ran); 
			
			while (true) {
				word.printWord();
				System.out.println("입력하세요.");
				String sel = sc.next();
				if(sel.equals(str)) {checkList[idx] = true; break;}
				System.err.println("틀렸습니다. :(");

			}
			count--;
			}
		}
	}
		
		


public class 클배타자게임 {

	public static void main(String[] args) {
		
	    System.out.println("타이머 시작");

			long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기 : 밀리세컨드 단위 1초 ==  1000
		
			
			WordDAO word = new WordDAO();
			word.run();
			long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
			double secDiffTime = (afterTime - beforeTime) / 1000.0; //두 시간에 차 계산
			System.out.println("타이머 끝 : " + secDiffTime);
			
			
			
			
			
		
		

	}

}
