package day05;

import java.util.Scanner;

public class D_05�ִ밪���ϱ� {
	public static void main(String[] args) {
		/*
		 * # �ִ밪 ���ϱ�[2�ܰ�]
		 * 1. 3ȸ �ݺ��� �ϸ鼭 ������ �Է¹޴´�.
		 * 2. �Է¹��� 3���� ���� �� ���� ū ���� ����Ѵ�.
		 */
		int min=0,num,i=0;
		Scanner sc = new Scanner(System.in);
		
		while(i<3) {
		num = sc.nextInt();
		if(i==0)min=num;
		if(min>num) {
			min=num;
		}
			i++;
		}
		System.out.println(min);
	}
}
