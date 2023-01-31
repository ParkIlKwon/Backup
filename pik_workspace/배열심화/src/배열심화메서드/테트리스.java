package 배열심화메서드;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Block {
	int[][] fixel;
}

class BlockDAO {
	Block[] blockList;
	int[][] map;
	int y;
	int x;
	boolean blockNew;
	Block b;
	int maxLgh;
	int turnCheck;

	void init() {
		map = new int[20][10];
		blockList = new Block[7];
		makeBlock();
		x = 4;
		blockNew = true;
	}

	void makeBlock() {
		int[][] block1 = { { 0, 2, 0 }, { 2, 2, 2 } };
		
		int[][] block2 = { { 2, 2, 0 }, { 0, 2, 2 } };
		
		int[][] block3 = { { 2 }, { 2 }, { 2 }, { 2 } };
		
		int[][] block4 = { { 0, 2 }, { 0, 2 }, { 2, 2 } };
		
		int[][] block5 = { { 2, 0 }, { 2, 0 }, { 2, 2 } };
		
		int[][] block6 = { { 2, 2 }, { 2, 2 } };
		
		int[][] block7 = { { 0, 2, 2 }, { 2, 2, 0 } };
		
		for (int i = 0; i < blockList.length; i++) {
			blockList[i] = new Block();
		}
		blockList[0].fixel = block1;
		blockList[1].fixel = block2;
		blockList[2].fixel = block3;
		blockList[3].fixel = block4;
		blockList[4].fixel = block5;
		blockList[5].fixel = block6;
		blockList[6].fixel = block7;

	}

	void run() {
		init();
		Scanner sc = new Scanner(System.in);

		while (true) {

			if (blockNew) {
				b = rdBlock();
			}
			showMap(b);
			
			

			int sel = selMove();
			if (sel == 1 || sel == 2) {
				move(b, sel);
			} else if (sel == 3) {
				down(b);
			} else if (sel == 4) {
				turn(b);

			} else {
				System.err.println("[ 입력오류 ]");
				continue;
			}
		}

	}

	void move(Block b, int sel) {
		int Lgh = b.fixel[0].length;
		maxLgh = Lgh - 1 + x;

		if ((sel == 1 && x - 1 < 0) || (sel == 2 && maxLgh + 1 >= map[0].length)) {
			System.err.println("[ 범위 초과 ]");
			return;
		}
		reset();

		sel = sel == 1 ? -1 : 1;
		x += sel;

		apply(0, 2);
	}

	void turn(Block b) {
		int[][] temp = new int[b.fixel[0].length][b.fixel.length];
		reset();
		int idx = b.fixel[0].length - 1;
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				temp[idx - i][j] = b.fixel[j][i];
			}
		}
		for (int i = 0; i < b.fixel.length; i++) {
			System.out.println(Arrays.toString(b.fixel[i]));
		}
		b.fixel = temp;
		for (int i = 0; i < b.fixel.length; i++) {
			System.out.println(Arrays.toString(b.fixel[i]));
		}
		temp = null;

		idx = b.fixel[0].length;

		if (x > map[0].length - idx) {
			x = map[0].length - idx;
		}
	}

	void down(Block b) {
		
	}

	void reset() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 2) {
					map[i][j] = 0;
				}
			}
		}
	}

	void apply(int idx, int apply) {
		for (int i = 0; i < b.fixel.length; i++) {
			for (int j = 0; j < b.fixel[i].length; j++) {
				if (b.fixel[i][j] == 2) {
					map[idx + y + i][x + j] = apply;
				}
			}
		}
	}

	int selMove() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------------------");
		System.out.println("[1.left][2.right][3.down][4.turn]");
		int sel = sc.nextInt();
		return sel;
	}

	Block rdBlock() {
		Random rd = new Random();
		int rdIdx = rd.nextInt(blockList.length);
		blockNew = false;
		Block b = blockList[rdIdx];

		return b;
	}

	void showMap(Block b) {

		apply(0, 2);

		for (int[] map : map) {
			for (int m : map) {
				if (m == 0) {
					System.out.print("[□]");
				} else if (m == 1) {
					System.out.print("[■]");
				} else {
					System.out.print("[▦]");
				}
			}
			System.out.println();
		}
	}
}

public class 테트리스 {
	public static void main(String[] args) {
		BlockDAO b = new BlockDAO();
		b.run();
	}
}