package day09;

import java.util.Arrays;
import java.util.Scanner;

public class G_07�����̵�2�ܰ� {
	public static void main(String[] args) {

		/*
		 * # �����̵�[2�ܰ�] 1. ����2�� ĳ�����̴�. 2. ����1�� �Է��ϸ�, ĳ���Ͱ� �������� ����2�� �Է��ϸ�, ĳ���Ͱ� ����������
		 * �̵��Ѵ�. 3. ��, �¿� ���� �������� ��, ����ó���� �ؾ��Ѵ�. 4. ���� 1�� ���̴�. ���� ������ �̵��� �� ����. 5. ��,
		 * ����3�� �Է��ϸ�, ���� ������ �� �ִ�.
		 */

		Scanner scan = new Scanner(System.in);

		int[] game = { 0, 0, 1, 0, 2, 0, 0, 1, 0 };
		int size = game.length;
		int move;
		int idx1 = 0, idx2 = 0; // �� , �÷��̾�
	
		while (true) {
			
			for(int i = 0 ; i < size ; i ++ ) {
				if(game[i] == 1) {
					System.out.print("[]");
				}else if (game[i] == 2) {
					System.out.print("��");
				}else {
					System.out.print("��");
				}
			}
			

			move = scan.nextInt();
			
			if(move>2 || move < 1) {
				System.err.println("���� �Է¿���");
				continue;
			}
						
			for (int i = 0; i < game.length; i++) {
				 							//�÷��̾� �ε����� ã��
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


















