package �迭��ȭ1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �渶���� { 

	public static void main(String[] args) {
		/*
		 [�渶 ����]
		 [1] 5 * 20 �� �迭�� �ִ�.
		 [2] �� ���� ���� �޸� Ʈ���� �ǹ��Ѵ�.
		 [3] �� �ϴ� �������� 1~4ĭ�� �Ÿ��� �̵��Ҽ��ִ�.
		 [4] ���� ���� �����ϸ� ������ ������. �������� ������ ����Ѵ�. 
		 [5] ��, ���� ���ÿ� �����ϸ� ����� ����. 
		 */
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int horse[][] = new int[5][20];
		int phase = 1;                                               //���. 
		int goal[] = new int [5];                                   //����üũ�뵵
		int size = horse[0].length;				//Ʈ������
		int k = 0;
		int cnt = 0;
		int first[] = {4,4,4,4,3};         //���� 1���� ����� 4ĭ�Ÿ��� �̵�
		int second[] = {4,4,4,4,2};       //���� 2���� ����� ���ǿ� 2ĭ �Ÿ��̵��ؼ� �Ϻη� 2���Ű��
		int idx =0;                                  						//�� �迭���� �� �ε��� 1�� ����
		int num2= 0;

		for (int i = 0; i < horse.length; i++) {
			horse[i][0] = 1;
		}

		System.out.println("�º������� ���� �Է��Ͻÿ�.[0~4]���� �Է�");
		int num = sc.nextInt();                                                  //�º������� �� 

		for (int i = 0; i < 2; i++) {
			num2 = rd.nextInt(5);       
			if(num2 == num) {  
				//1� �������� �޾ƿ�(2������ ������ �ߺ� X ó��)
				i --;
			}

		}

		System.out.println("�º����� ����ȣ"+num + " " + num2);											

		while (true) {
			boolean chk = false;

			for (int i = 0; i < horse.length; i++) {
				for ( k = 0; k < horse[i].length; k++) {
					if(horse[i][k] == 1 || horse[i][k] == 2) {
						System.out.print("[��]");
					}else {
						System.out.print("[  ]");
					}
				}
				System.out.println();
			}

			if(cnt >=5) {
				break;
			}


			System.out.println("[1]���� [2]����");
			int sel = sc.nextInt();

			if(sel == 2) {
				break;
			}else if (sel == 1) {


				for (int i = 0; i < horse.length; i++) {

					int ran = rd.nextInt(4)+1;
					for (k = 0; k < horse[i].length; k++) {
						if(horse[i][k] == 1 ) {

							horse[i][k] =0;

							if(num == i && idx < 5) {
								horse[i][k+second[idx]] = 1;
							}
							if(num2 == i && idx < 5) {
								horse[i][k+first[idx]] = 1;
							}
							break;
						}

					}
					if ((k+ran >= size-1 && horse[i][size-1] !=2 && idx > 4) || horse[i][size-1] ==1) {
						horse[i][size-1] = 2;
						goal[i] = -1;
						cnt ++;
					}else if(k+ran <= size-1 && num != i && num2 !=i){
						horse[i][k+ran] = 1;
					}

				}
				System.out.println(Arrays.toString(goal));

				for (int j = 0; j < goal.length; j++) {
					if(goal[j] == -1) {
						goal[j] = phase;
						chk = true;
					}

				}

				if (chk== true) {
					phase++;
				}

				idx++;
			}else {
				System.err.println("�߸��Է��Ͽ����ϴ�.");
			}


		}
		for (int i = 0; i < goal.length; i++) {
			System.out.print(goal[i]+"��");
			if (i == num) {
				System.out.print(">>>����ڰ� �� ��");
			}
			System.out.println();
		}


	}

}
