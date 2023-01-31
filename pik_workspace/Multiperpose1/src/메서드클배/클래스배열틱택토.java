package 메서드클배;
import java.util.Arrays;
import java.util.Scanner;
		
		class Tic{
			int [] line = new int[3];
			int cnt;
			void printLine() {
				for(int i = 0; i < 3; i++) {
					if(line[i] == 0) {
						System.out.print("[ ]");
					}else if(line[i] == 1) {
						System.out.print("[o]");
					}else if(line[i] == 2) {
						System.out.print("[x]");
					}
				}
				System.out.println();
			}
			
		}

		class game{
			Tic t = new Tic();
			Tic map[] = new Tic [t.line.length];
			void run(){
				int turn = 1;
				for (int i = 0; i < map.length; i++) {
					map[i] = new Tic();
				}
				while (true) {
					
					printmassage("--->",turn);
					int idx1 = getindex("y");
					int idx2 = getindex("x");
					
					if (map[idx1].line[idx2] != 0) {
						printmassage("이미 선택된 좌표",4);
						continue;
					}
					
					map[idx1].line[idx2] = turn == 1 ? 1 : 2;
					
					for (int i = 0; i < map.length; i++) {
						map[i].printLine();
					}
			
					
					int tmap[][] = new int[3][3];
					
					for (int i = 0; i < tmap.length; i++) {
						tmap[i] = map[i].line;
					}
					
					if(chkWidth(tmap) || chkcross(tmap) 
							|| chkvertical(tmap)) break;
					
					turn = turn == 1 ? 2 : 1;
				}
				System.out.println(turn == 1 ?"플레이어1 [o] 승리" : "플레이어2 [x] 승리");
			}
			
			int getindex(String str) {
				while (true) {
					Scanner sc = new Scanner(System.in);
					System.out.println(str+" 좌표입력");
					int idx = sc.nextInt();
					if(!indexchk(idx)) {
						printmassage("좌표를",4);
						continue;
					}
					
					return idx;
					}
				} 
			
			boolean chkWidth(int [][]tmap) {		//가로
				for (int i = 0; i < tmap.length; i++) {
					if (tmap[i][0] == tmap[i][1] &&
							tmap[i][1] == tmap[i][2] && tmap[i][1] != 0) {
						return true;
					}
				}
				return false;
			}
			boolean chkvertical(int [][]tmap) {		//세로
				for (int i = 0; i < tmap.length; i++) {
					if (tmap[0][i] == tmap[1][i] &&
							tmap[1][i] == tmap[2][i] && tmap[1][i] != 0) {
						return true;
					}
				}
				return false;
			}
			
			boolean chkcross(int [][]tmap) {		//대각
				if (tmap[0][0] == tmap[1][1] &&
						tmap[2][2] == tmap[1][1] && tmap[1][1] != 0) {
					return true;
				}else if  (tmap[0][2] == tmap[1][1] &&
						tmap[2][0] == tmap[1][1] && tmap[1][1] != 0) {
					return true;
				}
				
				return false;
			}
			
			
			boolean indexchk(int idx) {
				if (idx >= 0 && idx < 3 ) {
					return true;
				}return false;
			}
			
			void printmassage(String str,int cos){
				if (cos < 3) {
					System.out.println("이번턴은 "+ str + cos + "턴 입니다.");
				}else {
					System.err.println(str+"잘못입력하셨습니다.");
				}
			}
		}
		
		
		
public class 클래스배열틱택토 {

	public static void main(String[] args) {
		
		game gm = new game();
		gm.run();
		
		
		
		
		
	}

}
