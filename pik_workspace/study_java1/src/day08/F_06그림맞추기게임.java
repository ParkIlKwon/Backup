package day08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class F_06�׸����߱���� {

	public static void main(String[] args) {
		/*
		 * # ���� ����
		 * 1. ���� ������ ��ġ�� 2�� �Է��� ������ ���ߴ� �����̴�.
	     2. 1 1 2 2 3 3 4 4 5 5 �� ���ڵ��� 1000�� ���´� (���� )
	     3. ����ڰ� �ε��� ��ȣ 2���� �Է��ؼ� �� ���� ���Ѵ� 
	     4. �� �ε��� ���� ������ ��, ������ ���߸� back�� �ش� ���ڸ� ������,
		 *    back�� ��� ���� ä������ ������ ����ȴ�.
		 * ��)
		 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
		 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		 * �Է�1 : 0
		 * �Է�2 : 4
		 * 
		 * front = [1, 3, 2, 5, 1, 4, 3, 2, 4, 5]
		 * back  = [1, 0, 0, 0, 1, 0, 0, 0, 0, 0]
		 */

			Random rd = new Random() ; 
			Scanner sc = new Scanner(System.in);
			int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
			int[] back = new int[10];
			int[] numb = new int[10];
			int ran1,ran2,num=0;;
			for(int i = 0 ; i <10 ; i++) {
				numb[i] = i+1;
			}
			
			for(int i = 0 ; i < 1000 ; i ++) {
			ran1 = rd.nextInt(front.length);
			ran2 = rd.nextInt(front.length);
			num = front[ran1];
			front[ran1] = front[ran2];
			front[ran2] = num;
				
			}
			
			int t=0;
			int cnt = 0 ;
			System.out.println();
			System.out.println(Arrays.toString(numb));
			System.out.println(Arrays.toString(front));
			
			for(int i = 0 ; i < back.length ; i++) {
				if(back[i]==0) {
					System.out.print("[]");
				}else {
					System.out.printf("[%d]",back[i]);
				}
				}
		
			
			while(t!=back.length) {
						
			System.out.println();
			System.out.println("[�ε��� 1 �Է�] ");
			int x = sc.nextInt(); x--;
			System.out.println("[�ε��� 2 �Է�] ");
			int y = sc.nextInt(); y--;
			
			if(x==y) {
				System.err.println("���� �ε����Դϴ�");
				continue;
			}
			if(back[x]!=0||back[y]!=0) {
				System.err.println("�̹� ���� �� �Դϴ�");
				continue;
			}
			System.out.println();
		
				for(int i = 0 ; i < back.length ; i++) {
					if(back[i]==0) {
						System.out.print("[]");
					}else {
						System.out.printf("[%d]",back[i]);
					}
					}
				
		
			
			if(front[x]==front[y]) {
				
				back[x] = front[x];
				back[y] = front[y];
				t+=2;
			}
			}
			
			System.out.printf("�� %d�� �õ� ���� ����",cnt);
			
			}
		
	}























