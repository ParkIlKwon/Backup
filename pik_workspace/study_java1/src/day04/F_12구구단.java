package day04;

import java.util.Random;
import java.util.Scanner;

public class F_12������ {
	public static void main(String[] args) {
		/*
		 * # ������ ����[3�ܰ�]
		 * 1. ������ ������ 5ȸ �ݺ��Ѵ�.
		 * 2. ������ ���߸� 20���̴�.
		 * 3. ���� ���� ��, ������ ����Ѵ�.
		 */
		int x,y,solution;
		int score=0,total=0,i=1;
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		while (i<=5) {
			i++;
			x=rd.nextInt(8)+2;y=rd.nextInt(9)+1;
			System.out.printf("������ ����: %d  X  %d  =  ?",x,y);
			solution = sc.nextInt();
			//System.out.print(solution == x*y?"�����Դϴ�":"�����Դϴ�.");
			//score += solution == x*y ? 20:0;
			
			if(x*y==solution) {	score+=20;
					System.out.println("�����Դϴ�.");	}else {
						System.out.println("�����Դϴ�.");
					}
		}
		
		System.out.println(score+"�� �Դϴ�.");
		sc.close();
		
	}

}
