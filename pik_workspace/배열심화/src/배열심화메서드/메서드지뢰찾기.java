package �迭��ȭ�޼���;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


	class map{				//������ ��ǥ �ϳ��ϳ��� ���� �����ϰ� �������� ��� �׷��� ��������.
		boolean mine;
		boolean flag;
		boolean chk;
		int cnt;
	}
	
	class controller{ // �޴� ��� Ű���� �Է� �޾ƿ�.
		
		void init(){
			
		}
	}
	
	
	
	
	
	class clone{
		
		int clone[][];
		
		void init(){
			
		}
		
	}

	class mineDAO{
			//          v    v   v   v
		int y [] = {-1,-1,-1,0,0,0,1,1,1};
		int x [] = {-1,0,1,-1,0,1,-1,0,1};
		
		map game[][];
		int clone[][];
		int counter ;
		int unlock ;
		
		//�ʱ�ȭ
		void init(){
			int size = earlyset();
			game = new map[size][size];      
			for (int i = 0; i < game.length; i++) {
				for (int k = 0; k < game[i].length; k++) {
					game[i][k] = new map();
				}
			}
			clone = new int [size][size];
			insertmine(size);
			
			// 
		}
	
		//���� ã�� ����
		void run(){
			
			init();
	
			playing();
			if(unlock != counter)
			printmap();
		}
		
		//����ã�� ���Ӻ�
		void playing() {
			
			while (true) {
				
				for (int i = 0; i < clone.length; i++) {
					System.out.println(Arrays.toString(clone[i]));
				} // �׽�Ʈ�� ���
				
				printmap();
				if (unlock == counter) {
					System.out.println("�̰���ϴ� ");
					return;
				}
				System.out.println("[1]��߸�� [2]ã����");
				int sel = getNumber(0, 3);

				System.out.println("[ Y ] ��ǥ���� �Է��Ͻÿ� . ");
				int y = getNumber(-1, game.length);

				System.out.println("[ X ] ��ǥ���� �Է��Ͻÿ� . ");
				int x = getNumber(-1, game.length);
				if (!chk(y, x)) {
					err("(�̹� ���õ� ��ǥ) ��ǥ��");
					continue;
				} else if (game[y][x].mine && sel != 1) {
					System.out.println("���ڹ�ҽ��ϴ�.");
					for (int i = 0; i < game.length; i++) {
						for (int k = 0; k < game[i].length; k++) {
							if (game[i][k].mine)
								game[i][k].chk = true;
						}
					}
					return;
				}
				if (sel == 2) {
					game[y][x].chk = true;
					clone[y][x] = 2;
					if (wayexpore(y, x)) {
						search();
					}
				} else {
					game[y][x].flag = game[y][x].flag ? false : true;
				}
			}
		}
		
		//�����
		void printmap() {
			unlock = 0;
			for (int i = 0; i < game.length; i++) {
				for (int k = 0; k < game[i].length; k++) {
					
					if (game[i][k].chk && game[i][k].mine) {
						System.out.print(" [ �� ] ");
					}else	
					if (game[i][k].flag) {
						System.out.print(" [ �� ] ");
						if (game[i][k].mine) {
							unlock++;
						}
					}else
					if (!game[i][k].chk ) {
					System.out.print(" [ �� ] ");
					} 
					else if (game[i][k].cnt != 0) {
						System.out.printf(" [ %d ] ",game[i][k].cnt);
					}
					else if (game[i][k].chk) {
						System.out.print(" [ �� ] ");
					}
				}
				System.out.println();
			}
		}
		
		//����Ž��
		void search() {
			while (true) {
				boolean chk = false;
				for (int i = 0; i < clone.length; i++) {
					for (int k = 0; k < clone[i].length; k++) {
						if (clone[i][k] == 2 &&  wayexpore(i, k)) {
							i=0;k=0;
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
						for (int j = 0; j < x.length; j++) {
							int ty = i + this.y[j];
							int tx = k + this.x[j];
							if (ty < 0 || tx < 0 || ty > game.length-1 || tx > game.length-1) {
								continue;
							}else if(!game[ty][tx].mine ){
								game[ty][tx].chk = true;
							}
						}
					}
				}
			}
		}
		
		//�ֺ�Ž�� (4����)
		boolean wayexpore(int y , int x){
			 
			for (int i = 0; i < this.y.length; i++) {
				int ty = y + this.y[i];
				int tx = x + this.x[i];
				if (ty < 0 || tx < 0 || ty > game.length-1 || tx > game.length-1) {
					continue;
				}else if(clone[ty][tx]==0){
					clone[ty][tx] = 2;
					return true;
				}
			}
			return false;
		}
		
		//�ֺ�Ž�� (8����)
		int cnt(int y , int x){
			int total = 0;
			for (int i = 0; i < this.y.length; i+=1) {
				int ty = y + this.y[i];
				int tx = x + this.x[i];
				if (ty < 0 || tx < 0 || ty > game.length-1 || tx > game.length-1) {
					continue;
				}else if(game[ty][tx].mine){
					total++;
				}
			}
			return total;
		}
		
		//������ ��ġ���� üũ
		boolean chk(int y, int x) {
			if (game[y][x].chk ) {
				return false;
			}
			return true;
		}
		
		//�ʱ⼼���Է�
		int earlyset() {
			Scanner sc  = new Scanner(System.in);
			int arr[] = {5,8,10};
			System.out.println("���̵��� �����ϼ��� [1]easy [2]hard [3]extreme ");
			System.out.println("��         ũ��:  5 x 5   8 x 8    10 x 10 ");
			return arr[getNumber(0,4)-1]; 
			
		}
		
		//���ڸż�
		void insertmine(int size) {
				Random rd = new Random();
				for (int i = 0; i < size-2; i++) {
					int y = rd.nextInt(size);
					int x = rd.nextInt(size);
					if (game[y][x].mine) {
						i--;
					}else {
						game[y][x].mine = true;
						counter ++;
					}
				}
				//�� ���� ��ó�� ���ڰ��� ��� �����Ŵ
				for (int i = 0; i < game.length; i++) {
					for (int k = 0; k < game[i].length; k++) {
					game[i][k].cnt	 = cnt(i, k);
					}
				}
				//���� 2�����迭 ���� (üũ ���� �վ��� �뵵�� ����) 
				for (int i = 0; i < clone.length; i++) {
					for (int k = 0; k < clone[i].length; k++) {
						if (game[i][k].cnt != 0 || game[i][k].mine) {
							clone[i][k] = 1;
						}
					}
				}
			}
		
		//�����Է�(����� �Է� ���� ������)
		int getNumber(int n,int m) {
			Scanner sc  = new Scanner(System.in);
			while (true) {
				int num = sc.nextInt();
				if ( num > n && num < m) {
					return num;
				}
				err("��ȣ");
			}
		}
		
		//�����޼��� ���.
		void err(String str) {
			System.err.println(str +"�� �߸��Է��ϼ̽��ϴ�.");
		}
		
	}



public class �޼�������ã�� {
	public static void main(String[] args) {

		mineDAO mine = new mineDAO();
		mine.run();
		
		
	}

}