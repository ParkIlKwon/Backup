package day09;

import java.util.Arrays;
import java.util.Scanner;

public class G_07숫자이동2단계 {
	public static void main(String[] args) {

		/*
		 * # 숫자이동[2단계] 1. 숫자2는 캐릭터이다. 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로 숫자2를 입력하면, 캐릭터가 오른쪽으로
		 * 이동한다. 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다. 4. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다. 5. 단,
		 * 숫자3을 입력하면, 벽을 격파할 수 있다.
		 */

		Scanner scan = new Scanner(System.in);

		int[] game = { 0, 0, 1, 0, 2, 0, 0, 1, 0 };
		int size = game.length;
		int move;
		int idx1 = 0, idx2 = 0; // 벽 , 플레이어
	
		while (true) {
			
			for(int i = 0 ; i < size ; i ++ ) {
				if(game[i] == 1) {
					System.out.print("[]");
				}else if (game[i] == 2) {
					System.out.print("읏");
				}else {
					System.out.print("ㅡ");
				}
			}
			

			move = scan.nextInt();
			
			if(move>2 || move < 1) {
				System.err.println("무브 입력오류");
				continue;
			}
						
			for (int i = 0; i < game.length; i++) {
				 							//플레이어 인덱스를 찾음
			if (game[i] == 2) {
					idx2 = i;
				}
			}
			
			game[idx2] = 0;
			int pos = move == 1 ? idx2-1 : idx2+1 ;
			
			if(pos>size-1) {
				pos = 0;
			}else  if(pos < 0){
				pos = size-1;
			}
			
			
			game[pos] = 2;
			

		}

	}

}


















