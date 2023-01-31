package MineSweeper;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
	
	class Map { // ������ ��ǥ �ϳ��ϳ��� ���� �����ϰ� �������� ��� �׷��� ��������.
		boolean mine;
		boolean flag;
		boolean chk;
		int cnt;
	}
	
	//Ÿ�̸� Ŭ����
	class Timer{
		long beforeTime = System.currentTimeMillis(); 
		long settime(int size){
			return beforeTime + (size * 10000 );
		}
	}
	
	//���̺� �ε� Ŭ����
	class Saveload{
		
		// 39s
		//       0         1         2         3         4      
		// 0 {0,0,0,1},{0,1,0,1},{0,1,0,1},{0,1,0,1},{0,1,0,1},
		// 1 {0,0,0,1},{0,1,0,1},{0,1,0,1},{1,0,0,1},{0,1,0,1},
		// 2 {0,0,0,1},{0,1,0,3},{0,1,0,2},{0,1,0,1},{0,1,0,1},
		// 3 {0,1,0,1},{0,0,0,1},{0,1,0,1},{0,1,0,1},{0,1,0,1},
		// 4 {0,0,0,1},{0,1,0,1},{0,1,0,0},{0,1,0,1},{0,1,0,1},
		
		// 	39s\n
		//  0001/1010/1110/0101/0111\n
		//  0001/1010/1110/0101/0111\n
		//  0001/1010/1110/0101/0111\n
		//	0001/1010/1110/0101/0111\n
		
		void saveGame(int size, long time){
			int arr[][][] = new int [size][size][4];
			
			for (int i = 0; i < arr.length; i++) {
				for (int k = 0; k < arr[i].length; k++) {
				arr[i][k][0] = mineDAO.game[i][k].mine == true ? 1 : 0;
				arr[i][k][1] = mineDAO.game[i][k].flag == true ? 1 : 0;
				arr[i][k][2] = mineDAO.game[i][k].chk == true ? 1 : 0;
				arr[i][k][3] = mineDAO.game[i][k].cnt;	
					
				}
			}
			
			String fileName = "src/MineSweeper/mine.txt";
			FileWriter fw = null;
			try {
				 fw = new FileWriter(fileName);
				 fw.write(time+"\n");
					for (int i = 0; i < arr.length; i++) {
						for (int k = 0; k < arr[i].length; k++) {
							for (int j = 0; j < arr[i][j].length; j++) {
								fw.write(arr[i][k][j]+"");
							}
							fw.write("/");
						}
						fw.write("\n");
					}
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("����" + fileName +" ���� �Ϸ�");
			}
		}
		
		long time;
		void loadGame() {
			String fileName = "src\\MineSweeper\\mine.txt";
			FileReader fr = null;
			String data="";
			
			try {
				fr = new FileReader(fileName);
				int read =0;
				
				while(read != -1) {
					
						read = fr.read();
						data+= (char)read;
				}
				
			} catch (FileNotFoundException e) { // ������ �������� ������ �����߻� 
				System.out.println("������ �������� �ʽ��ϴ�");
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				if(fr!= null) {
					try {
						fr.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			
			String arr [] = data.split("\n");
			int size = arr.length -2;
			int tarr[][][] = new int [size][size][4];
			
			time = Integer.parseInt(arr[0]);
			String darr[][] = new String[size][];
			
			
			for (int i = 1; i < arr.length-1; i++) {
				for (int k = 0; k < darr.length; k++) {
					darr[i-1] = arr[i].split("/");
				}
			}
			
			for (int i = 0; i < darr.length; i++) {
				for (int k = 0; k < darr[i].length; k++) {
					for (int j = 0; j < darr[i][k].length(); j++) {
						tarr[i][k][j] = darr[i][k].charAt(j) - '0' ;
					}
				}
			}
			
			mapping(tarr,size);
			
		}
		
		private void mapping(int arr[][][],int size) {
			 mineDAO.game = new Map[size][size];
			
			for (int i = 0; i < arr.length; i++) {
				for (int k = 0; k < arr[i].length; k++) {
					 mineDAO.game[i][k] = new Map();
					 mineDAO.game[i][k].mine = arr[i][k][0] == 1 ? true : false;
					 mineDAO.game[i][k].flag = arr[i][k][1] == 1 ? true : false;
					 mineDAO.game[i][k].chk = arr[i][k][2] == 1 ? true : false;
					 mineDAO.game[i][k].cnt = arr[i][k][3] ;
				}
			}
		}
		
		long caltime(int size) {
			long afterTime = System.currentTimeMillis();
			loadGame();
			long calctime = afterTime + time ;
			return calctime;
		}
	}
	
	class controller { // �޴� ��� Ű���� �Է� �޾ƿ�.
		mineDAO DAO;
		Timer time;
		Saveload sl;
		long timelimit;
	
		void init() {
			DAO = new mineDAO();
			DAO.init();
			time = new Timer();
			sl = new Saveload();
			timelimit = time.settime(mineDAO.game.length);
		}
		
		
		void run() {
		
			while (true) {
				long afterTime = System.currentTimeMillis();
				System.out.println("�����ð�: "+ (timelimit - afterTime)/1000);
				for (int i = 0; i < DAO.clone.length; i++) {
					System.out.println(Arrays.toString(DAO.clone[i]));
				} // �׽�Ʈ�� ���
				
				System.out.println("---------------------------------");
				DAO.printmap();
	
				if (DAO.log == 1 ) { // �̰�����
					break;
				}else if (timelimit - afterTime <= 0) {
					System.err.println("�ð��ʰ�");
					break;
				}
				
				System.out.println("---------------------------------");
				
				System.out.println("[1]��߸�� [2]ã���� [3]���� [4]���� ���� [5]���� �ε�");
				int sel = DAO.getNumber(1, 5, "�޴� " , "�޴���ȣ");
				
				if (sel == 5) {
					Saveload sl = new Saveload();
					timelimit  = sl.caltime(mineDAO.game.length);
					DAO.loadGame();
					System.out.println("�ҷ�����Ϸ�.");
				}else if (sel == 4) {
					afterTime = System.currentTimeMillis();
					DAO.saveGame(timelimit - afterTime);
				}else if (sel == 3) {
					init();
				}else {
					int y = DAO.getNumber(0, mineDAO.game.length-1, "Y ��ǥ","Y��ǥ");
					int x = DAO.getNumber(0, mineDAO.game.length-1, "X ��ǥ","X��ǥ");
					DAO.playing2(y, x, sel);
					
					if (DAO.log == 2) { // ���ڹ���
						break;
					}
				}
			}
		}
	}
	
	class mineDAO {
		//                      v      v     v     v
		private int y[] = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
		private int x[] = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
	
		static Map game[][];
		int clone[][];
		int counter;
		int unlock;
		int log;
		int ty , tx;
		Saveload sl ;
		
		void saveGame(long time) {
			sl.saveGame(game.length,time);
		}
		
		void loadGame(){
			sl.loadGame();
			
			setClone();
		}
		
		// �ʱ�ȭ
		void init() {
			int size = earlyset();
			sl = new Saveload();
			
			game = new Map[size][size];
			for (int i = 0; i < game.length; i++) {
				for (int k = 0; k < game[i].length; k++) {
					game[i][k] = new Map();
				}
			}
			clone = new int[size][size];
			insertmine(size);
			//
		}
	
		// ����ã�� ���Ӻ�
		void playing2(int y, int x, int sel) {
	
			if (!chk(y, x)) {
				err("(�̹� ���õ� ��ǥ) ��ǥ");
				return;
			} else if (game[y][x].mine && sel != 1) {
				System.out.println("���ڹ�ҽ��ϴ�.");
				for (int i = 0; i < game.length; i++) {
					for (int k = 0; k < game[i].length; k++) {
						if (game[i][k].mine)
							game[i][k].chk = true;
					}
				}
				log = 2;
				printmap();
				return;
			}
			if (sel == 2) {
				game[y][x].chk = true;
				clone[y][x] = 2;
				if (game[y][x].cnt != 0) {
					return;
				}
				if (wayexplore(y, x)) {
					search();
				}
			} else {
				game[y][x].flag = game[y][x].flag ? false : true;
			}
		}
	
		// �����Է�(����� �Է� ���� ������)
		int getNumber(int n, int m, String msg , String err) {
			while (true) {
				int num = 0;
				System.out.println(msg + "�� �Է��ϼ���.");
				Scanner sc = new Scanner(System.in);
				try {
					num = sc.nextInt();
					if (num < n || num > m) {
						throw new Exception();
					}
				}catch (InputMismatchException e) {
					System.err.println("���ڰ��� �Էµɼ� �����ϴ�.");
					continue;
				}catch (Exception e) {
					err(err);
					continue;
				} 
				return num;
			}
		}
		
		private void countUnlock() {
			unlock = 0;
			for (int i = 0; i < game.length; i++) {
				for (int k = 0; k < game[i].length; k++) {
					if(game[i][k].mine && game[i][k].flag) {
						unlock++;
					}
				}
			}
		}
		
		// �����
		void printmap() {
			
			countUnlock();
			
			for (int i = 0; i < game.length; i++) {
				
				for (int k = 0; k < game[i].length; k++) {
	
					if (game[i][k].chk && game[i][k].mine) {
						System.out.printf(" %-1s ","��");
					} else if (game[i][k].flag) {
						if (unlock == counter && game[i][k].mine) {
							System.out.printf(" %-1s ","�ҡ�");
						}else {
							System.out.printf(" %-1s ","��");
						}
					} else if (!game[i][k].chk) {
						System.out.printf(" %-1s ","��");
					} else if (game[i][k].cnt != 0) {
						System.out.printf(" %-1d ", game[i][k].cnt);
					} else if (game[i][k].chk) {
						System.out.printf(" %-1s ","��");
					}
				}
				System.out.println();
			}
			if (unlock == counter) {
				System.out.println("�̰���ϴ� ");
				log = 1;
				return;
			}
		}
		
		// ����Ž��
		private void search() {
			while (true) {
				boolean chk = false;
				for (int i = 0; i < clone.length; i++) {
					for (int k = 0; k < clone[i].length; k++) {
						if (clone[i][k] == 2 && wayexplore(i, k)) {
								chk = true;
						}
					}
				}
				if (!chk) {
					break;
				}
			}
			for (int i = 0; i < game.length; i++) {
				for (int k = 0; k < game[i].length; k++) {
					if (clone[i][k] == 2) {
						game[i][k].chk = true;
						for (int j = 0; j < x.length; j++) {
							int ty = i + this.y[j];
							int tx = k + this.x[j];
							if (chkindex(ty,tx)) {
								continue;
							} else if (!game[ty][tx].mine && game[ty][tx].cnt != 0) {
								game[ty][tx].chk = true;
							}
						}
					}
				}
			}
		}
	
		// �ֺ�Ž�� (4����)
		private boolean wayexplore(int y, int x) {
	
			for (int i = 1; i < this.y.length; i += 2) {
				int ty = y + this.y[i];
				int tx = x + this.x[i];
				if (chkindex(ty,tx)) {
					continue;
				} else if (clone[ty][tx] == 0) {
					clone[ty][tx] = 2;
					return true;
				}
			}
			return false;
		}
	
		// �ֺ�Ž�� (8����)
		private int cnt(int y, int x) {
			int total = 0;
			for (int i = 0; i < this.y.length; i += 1) {
				int ty = y + this.y[i];
				int tx = x + this.x[i];
				if (chkindex(ty,tx)) {
					continue;
				} else if (game[ty][tx].mine) {
					total++;
				}
			}
			return total;
		}
		
		//��ȿ�� �ε������� üũ
		private boolean chkindex(int ty , int tx) {
			if (ty < 0 || tx < 0 || ty > game.length - 1
					|| tx > game.length - 1) {
				return true;
			}
			return false;
		}
		
		// ������ ��ġ���� üũ
		boolean chk(int y, int x) {
			if (game[y][x].chk) {
				return false;
			}
			return true;
		}
	
		// �ʱ⼼���Է�
		private int earlyset() {
			Scanner sc = new Scanner(System.in);
			int arr[] = {5, 8, 10};
			System.out.println("���̵��� �����ϼ��� [1]easy [2]hard [3]extreme ");
			System.out.println("��         ũ��:  5 x 5   8 x 8    10 x 10 ");
			return arr[getNumber(1, 3, "(1 ~ 3)���̵��� ","���̵���ȣ") - 1];
		}
	
		// ���ڸż�
		private void insertmine(int size) {
			Random rd = new Random();
			for (int i = 0; i < size - 2; i++) {
				int y = rd.nextInt(size);
				int x = rd.nextInt(size);
				if (game[y][x].mine) {
					i--;
				} else {
					game[y][x].mine = true;
					counter++;
				}
			}
			// �� ���� ��ó�� ���ڰ��� ��� �����Ŵ
			for (int i = 0; i < game.length; i++) {
				for (int k = 0; k < game[i].length; k++) {
					game[i][k].cnt = cnt(i, k);
				}
			}
			// ���� 2�����迭 ���� (üũ ���� �վ��� �뵵�� ����)
			setClone();
		}
	
		// ���� 2�����迭 ���� (üũ ���� �վ��� �뵵�� ����)
		private void setClone(){
			int size = game.length;
			clone = new int [size][size];
			for (int i = 0; i < clone.length; i++) {
				for (int k = 0; k < clone[i].length; k++) {
					if (game[i][k].cnt != 0 || game[i][k].mine) {
						clone[i][k] = 1;
					}
				}
			}
		}
		
		// �����޼��� ���.
		private void err(String str) {
			System.err.println(str + "�� �߸��Է��ϼ̽��ϴ�.");
		}
	}
	
	public class MinesweeperTemp {
		public static void main(String[] args) {
	
			controller ctrl = new controller();
			ctrl.init();
			ctrl.run();
	
		}
	}