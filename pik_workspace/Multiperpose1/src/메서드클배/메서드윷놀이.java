package 메서드클배;

import java.util.Scanner;

class figure{			//각각의 윳놀이 좌표에 대한 값.
		
	boolean p1;		//옷
	boolean p2;		//홋
	String str;
	
	boolean point1;	 // o 
	boolean point2;  // @
	boolean point3;  // []
		
	}
	
	class mapdata{     //윳놀이 판 데이터 클래스
		
		figure map[][] = new figure[7][7];
		
		int dir [][][] = { 
				{{6,5,4,2,1,0,0,0,0,0,0,1,2,4,5,6,6,6,6,6,6},{6,6,6,6,6,6,5,4,2,1,0,0,0,0,0,0,1,2,4,5,6}},
				{{0,1,2,3,4,5,6,6,6,6,6,6},{6,5,4,3,2,1,0,1,2,4,5,6}},
				{{3,4,5,6},{3,4,5,6}},
				{{0,1,2,3,4,5,6},{0,1,2,3,4,5,6}}};
		
		//맵 초기화
		void init(){
			int setVal[][] = {{0, 3, 6, 0}, {2, 3, 4, 0}, {1, 3, 5, 0},
					{0, 1, 2, 3, 4, 5, 6, 0}, {1, 3, 5, 0}, {2, 3, 4, 0},
					{0, 3, 6, 0}, {0},};
								
			int index = 0;
			for (int i = 0; i < map.length; i++) {
				int idx = 0;
				for (int k = 0; k < map[i].length; k++) {
					map[i][k] = new figure();
					if (k != setVal[index][idx]) {
					map[i][k].point1 = true;
					}else {
						idx ++;
					}
				} index++;
			}
			settingmap();
		}
		void settingmap() { // 맵초기세팅
			map[0][0].point2 = true; map[0][6].point2 = true; 
			map[6][0].point2 = true; map[6][6].point2 = true; 
			map[3][3].point3 = true;
		}
	}
	
	class yootDAO{
		
		mapdata data;
		int dir1,dir2,pos1,pos2 , tdir , tpos;
		
		//데이터 객체 생성 , 맵 초기세팅 메서드 실행.
		void init() {
			data = new mapdata();
			data.init();
		}
		
		void print(int turn) {
			boolean chk[] = {true};
			while (chk[0]) {
				for (int i = 0; i < data.map.length; i++) {
					for (int k = 0; k < data.map[i].length; k++) {
						if (data.map[i][k].p1) {
							System.out.printf("%-6s","옷");
						}else if(data.map[i][k].p2){
							System.out.printf("%-6s","홋");
						}else if (data.map[i][k].point1) {
							System.out.printf("%-6s","o");
						}else if (data.map[i][k].point2) {
							System.out.printf("%-6s","@");
						}else if (data.map[i][k].point3) {
							System.out.printf("%-6s","[ ]");
						}else{
							System.out.printf("%-6s","");
						}
					}
					System.out.println("\n");
				}
				
				System.out.println(turn == 1 ? "[옷]턴입니다 . " : "[홋]턴입니다 .");
				moveto(getinput(),turn,chk); 
			}
		}
		
		boolean endgame(int num,int tpos) {
			if((tdir == 1 && data.dir[0][0].length-1 < num + tpos)  || (tdir == 3 && data.dir[2][0].length-1 < num + tpos)
				||	(tdir == 2 && data.dir[1][0].length-1 < num + tpos) | (tdir == 4 && data.dir[3][0].length-1 < num + tpos) ) {
				return true;
				}return false;
		}
		
		void moveto(int num,int turn,boolean[] chk){
			int x,y;
			tdir = turn == 1 ? dir1 : dir2;
			tpos = turn == 1 ? pos1 : pos2;
			y = data.dir[tdir][0][tpos];
			x = data.dir[tdir][1][tpos];

			data.map[y][x].p1 = false;
			data.map[y][x].p2 = false;
			tpos += num;
			
			endgame(tdir, tpos);
			changedir(tdir,tpos,num);
			
			y = data.dir[tdir][0][tpos];
			x = data.dir[tdir][1][tpos];
			
			Catch(y , x , turn);
			
			if (turn == 1) {
				data.map[y][x].p1 = true;
				dir1 = tdir;
				pos1 = tpos;
			} else {
				data.map[y][x].p2 = true;
				dir2 = tdir;
				pos2 = tpos;
			}
			
			if(num < 4) {
				System.out.println("한턴더");
				chk[0] = false;
			}
		}
		
		void changedir(int tdir,int tpos,int num) {
			int arr [][] = {{0,19},{0,4},{0,9},{1,2}};
			
			if (num == -1 && tpos == -1) {
				this.tdir = arr[tdir][0];
				this.tpos = arr[tdir][1];
				
			}else if (tdir == 0 && tpos == 5) {
				this.tdir = 1;
				this.tpos = 0;
			}else if (tdir == 0 && tpos == 10) {
				this.tdir = 3;
				this.tpos = 0;
			}else if (tdir == 1 && tpos == 3) {
				this.tdir = 2;
				this.tpos = 0;
			}
		}
		
		
		void Catch(int y , int x , int turn) {
			if (data.map[y][x].p2 && turn == 1) {
				data.map[y][x].p2 = false;
				dir2 = pos2 =  0 ; 
			}else if (data.map[y][x].p1 && turn == 2) {
				data.map[y][x].p1 = false;
				dir1 = pos1 =  0 ;
			}
		}
		
		int getinput() {
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.println("몇칸 이동시키겠습니까?");
				int num = sc.nextInt();
				if (num == -1) {
					System.out.println("백도 ");
					return num;
				}else
				if (num < 6) {
					System.out.println(str(num));
					return num;
				}System.err.println("잘못입력하셨습니다.");
			}
		}
		
		String str(int idx) {
			String str[] = {"도","개","걸","윷","모"};
			return str[idx-1] + "가 나왔습니다.";
		}
		
		void run() {
			init();
			int turn = 1;
			while (true) {
				print(turn);
				turn = turn == 1 ? 2:1;
			}
		}
	}


public class 메서드윷놀이 {
	public static void main(String[] args) {

		yootDAO game = new yootDAO();
		game.run();
		
	}

}
