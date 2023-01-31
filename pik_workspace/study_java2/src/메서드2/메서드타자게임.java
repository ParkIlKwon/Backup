package 메서드2;

import java.util.Random;
import java.util.Scanner;

class WordGame{
		Random ran = new Random();
		String [] wordList = {"java" , "spring" , "jsp" , "android" , "php"};
		boolean [] checkList;
		int count;
		int idx;
		
		void reset(){
			idx = ran.nextInt(wordList.length);
			count = wordList[idx].length();
		}
		String getWord() {
			return wordList[idx];
		}
		
		boolean checkWord(String str) {
			if (getWord().equals(str)) {
				return true;
			}
			return false;
		}
		String printGameEnd() {
			return "승리";
		}
		
	}
		
	
public class 메서드타자게임 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		WordGame wordGame= new WordGame();
	
		while(true) {
			System.out.println("타자연습게임");
			System.out.println("1)게임 2)종료");
			int sel = sc.nextInt();
			if(sel == 1) {
				wordGame.reset();
				while(true) {
					System.out.println(wordGame.count + ") 단어를 맞춰보세요.");
					System.out.println(wordGame.getWord());
					String word = sc.next();
					if(wordGame.checkWord(word)) {
						System.out.println(wordGame.printGameEnd());
						break;
					}System.err.println("틀렸습니다.");
				}
			}else if(sel == 2) {
				break;
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
