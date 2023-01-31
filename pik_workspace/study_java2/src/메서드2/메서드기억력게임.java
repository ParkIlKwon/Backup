package 메서드2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class MemoryGame{
	
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	int num1; int num2; int chk ;
	
	int cnt = 0;		// 정답을 맞춘 횟수
	void run() {
		
		// 셔플(카드 섞기)
		shuffle();
		System.out.println(Arrays.toString(front));
		while(true) {
			// 카드 출력
			printCard();
			
			// 종료하기
			if(cnt == 5) {
				System.out.println("게임 종료");
				break;
			}			
			while (true) {
				//카드 선택하기
				choiceCard();
				//카드 맞았는지.
				check();
				if (chk == -1 ) {
					System.err.println("다시선택하여주세요.");
					continue;
				}break;
				
			}
			
		}
	}
	
	void shuffle(){
		for (int i = 0; i < 100; i++) {
			int temp = front[0];
			int idx = ran.nextInt(front.length);
			front[0] = front[idx];
			front[idx] = temp;
		}
		
	}
	void check(){
		chk = 0;
		if (back[num1] != 0  || back[num2] != 0) {
			chk = -1;
		}else if (front[num1] == front[num2]) {
			cnt++; back[num1] =front[num1];  back[num2] = front[num2];
		}
		
	}
	
	void printCard(){
		System.out.println(Arrays.toString(back));
	}
	
	void choiceCard(){
		while (true) {
			System.out.println("카드를 선택해주시오 [1]");
			num1 = sc.nextInt();
			System.out.println("카드를 선택해주시오 [2]");
			num2 = sc.nextInt();
			if (num1 < 0 || num2 < 0 || num2 > back.length-1 ||  num1 > back.length-1 ) {
				System.err.println("인덱스 선택 에러.");
				continue;
			}
			break;
		}
	}
	
	
	
}


public class 메서드기억력게임 {

	public static void main(String[] args) {
		MemoryGame mg = new MemoryGame();
		mg.run();

	}

}
