package �迭��ȭ1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ������ũ {

	public static void main(String[] args) {
		/*
		 * [������ũ����]
		 * 1. 10x10 �迭�� 0���� ä���.
		 * 2. ������ũ�� 1234�� ǥ���Ѵ�.
		 * 3. �Ӹ� �����¿�� �̵��� �����ϸ�, ������ ����´�.
		 * 4. �ڱ���ϰ� �ε�����, ����Ѵ�.
		 * 5. �������� �������� ������
		 *    �������� ������ ���� 1���� �ڶ���.
		 * 6. ������ �ִ� 8������ ������ �� �ִ�.
		 * 7. ��(�ʹٱ�)�� �ε����� �װ� �߽��ϴ� .
		 * 8. ��Ʈ�� �� ������ �̱�� �߽��ϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int map[][]= new int [10][10]; 
		int sizeY = map.length;
		int sizeX = map[0].length;
		int hcnt = 0;
		int tx = 0; 
		int ty = 0;
		int cnt = 4;                             // ���� ũ��
		String str[] = {"[   ]","[ S ]","[ �� ]","[ �� ]"};
		
		int snake [][] = null;
		boolean life = true;
		map[1][0] = 1;
		for (int i = 1; i < cnt; i++) {
			map[0][i-1] = i+1;
		}
		
		for (int i = 0; i < 8; i++) {
			tx = rd.nextInt(map.length);
			ty = rd.nextInt(map[0].length);
			
			if(map[tx][ty] != 0 ) {
				i--;
			}else {
				map[tx][ty] = -1;
				hcnt ++;
			}
		}
		
		map[4][4] = -1;				
	
		
		while (true) {
			boolean heart = false;	//��Ʈ�� �Ծ����� �Ǵ� ?
			int body = 2;			//���� ����� �������� �̵������� ����
			snake = new int [cnt][2];		//���� ũ�⸸ŭ ���� ����ǥ ����
			int idx = 1;						//idx 1�� �ʱ�ȭ 1~������� ��ǥã���� ��.
			int Count = cnt ;
		
			while (true) {
				if (Count == 0) {
					break;
				}
				
				loop:
				for (int i = 0; i < map.length; i++) {
					for (int k = 0; k < map[i].length; k++) {
						if (map[i][k] == idx) {
							snake[idx -1][0] = i ;
							snake[idx -1][1] = k ;
							idx++;
							Count--;
							break loop;
						}
					}
				}
			}
			
			

			for (int i = 0; i < map.length; i++) {

				for (int k = 0; k < map[i].length; k++) {

					System.out.printf("%2d",map[i][k]);

					if(map[i][k] == 1) {
						System.out.printf("%2s",str[1]);
						ty = i ;
						tx = k;
					}
					else if(map[i][k] == 0) {
						System.out.printf("%2s",str[0]);
					}else if(map[i][k] == -1) {
						System.out.printf("%2s",str[3]);
					}else {
						System.out.printf("%2s",str[2]);
					}

				}
				System.out.println();
			}
			if(hcnt < 0) {
				break;
			}
			
			System.out.println("[1]left [2]right [3]up [4]down");
			
			int sel = sc.nextInt();
			
			if(sel < 0 || sel > 4 ) {
				System.out.println("�߸��Է��Ͽ����ϴ�.");
				continue;
			}
			map[ty][tx] = 0;
			
			if (sel ==1) {
				tx--;
				}
			else if (sel ==2) {
				tx++;
			}else if (sel ==3) {
				ty--;
			}else if (sel ==4) {
				ty++;
			}
			
			if(ty>sizeY-1||tx>sizeX-1||ty<0||tx < 0) {
				life = false;
				break;
			}
			
			if ( map[ty][tx] != 0) {
				if ( map[ty][tx] != -1) {
					life = false;
					break;
					
				}
			}
			
			if(map[ty][tx] ==-1 ) {
				hcnt--;
				heart = true;
			}
			
			
//			for (int i = 0; i < snake.length; i++) {
//				System.out.println(Arrays.toString(snake[i]));
//				
//			}						//���� ��ǥ�� �� �ߴ��� Ȯ�ο�
			
			
			map[ty][tx] = 1;
			for (int k =  0; k <snake.length ; k++) {
					ty=snake[k][0];
					tx=snake[k][1];
					map[ty][tx] = body;
					
				body ++;
			}
			
			if(heart == true && cnt <8) {
				cnt++;
			}else {
				map[ty][tx] = 0;			//��Ʈ�� ���� �ʾ������� �ǵڸ� �ڸ�
			}
			
			
		}
		

		System.out.println(life == true ? "�̰���ϴ�.":" �׾����ϴ�");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}

	}

