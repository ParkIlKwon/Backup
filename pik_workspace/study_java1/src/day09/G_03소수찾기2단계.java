package day09;

import java.util.Scanner;

public class G_03�Ҽ�ã��2�ܰ� {
	public static void main(String[] args) {
		/*
		 * # �Ҽ�ã��[2�ܰ�]
		 * ���� �� ���� �Է¹޾�, 2���� �ش� ���ڱ����� ��� �Ҽ� ���
		 * ��)
		 * �Է� : 20
		 * 2, 3, 5, 7, 11, 13, 17, 19
		 */
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		for(int i = 2 ; i < num ; i++) {
				for(int k = 1; k < num ; k++) {
					if(i%k==0) {
						cnt++;
					}
					
				}
				if(cnt ==2) {
					System.out.print(i+" ");
				}
				cnt = 0;
		}
		

	}

}
