package 클래스;
import java.util.Arrays;
import java.util.Scanner;

class Tictactoe{
	
	String[][] game = new String[3][3];
	
	int turn = 1;
	int win = 0;		
}

public class 클래스05_틱택토 {

	public static void main(String[] args) {
		boolean over = false;
			Scanner sc = new Scanner(System.in);
			Tictactoe e = new Tictactoe();
			
			for (int i = 0; i < e.game.length; i++) {
				for (int j = 0; j < e.game[i].length; j++) {
					e.game[i][j] = "[ ]";
				}
			}
			
			for (int i = 0; i < e.game.length; i++) {
				System.out.println(Arrays.toString(e.game[i]));
			}
			
			while (true) {
			
				int cnt = 0;
				System.out.printf(e.turn == 1 ? "[1]" : "[2]");
				System.out.println(" 턴 ");
				
				System.out.println("[y]좌표입력");
				int y = sc.nextInt();
				System.out.println("[x]좌표입력");
				int x = sc.nextInt();
				
				if (y < 0 || x < 0 || y > e.game.length-1 || x > e.game.length-1) {
					System.err.println("입력오류 : ?");
					continue;
				}
				
				if (e.game[y][x].equals("[ ]")) {
				}else {
					System.err.println("이미 선택된 위치 :/");
					continue;
				}
				
			e.game[y][x] = e.turn == 1 ?"[o]" :"[x]" ;
				String chk = e.turn == 1 ?"[o]" :"[x]";
				
				for (int i = 0; i < e.game.length; i++) {
					cnt = 0;
					for (int k = 0; k < e.game.length; k++) {
						if (e.game[i][k].equals(chk)) {													//가로 승리 조건
							cnt ++;
							if (cnt == e.game.length) {
								over = true;
							}
						}
					}									cnt = 0;
					for (int k = 0; k < e.game.length; k++) {
						if (e.game[k][i].equals(chk)) {											//세로 승리 조건
							cnt ++;
							if (cnt == e.game.length) {
								over = true;
							}
						}
					}
				}						cnt = 0;
				for (int i = 0; i < e.game.length; i++) {
					if (e.game[i][i].equals(chk)) {									//대각 승리 조건
						cnt++;
						if (cnt == e.game.length) {
								over = true;
							}
					}
				}				cnt = 0;
				for (int i = 0; i < e.game.length; i++) {
						if (e.game[i][2-i].equals(chk)) {
							cnt++;
							if (cnt == e.game.length) {									//반대각승리조건									
								over = true;
							}
						}
																																				
				}
				
				//[0 2] [1 1] [2 0]
				
				for (int i = 0; i < e.game.length; i++) {
					System.out.println(Arrays.toString(e.game[i]));
				}
				
				if (over) {
					System.out.println(e.turn == 1 ? "플레이어 1 승리" : "플레이어 2 승리");
					break;
				}
				
				
				e.turn = e.turn == 1 ? 2:1;
			}
			
			
			
			
		}
}