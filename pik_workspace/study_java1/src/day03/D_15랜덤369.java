package day03;

import java.util.Random;
import java.util.Scanner;

public class D_15����369 {
	public static void main(String[] args) {
		/*
		[����]
			1. 1~50 ������ ���� ���ڸ� �����Ѵ�.
			2. ���� ���� �߿��� 3�̳� 6�̳� 9�� ������ 2����, ¦¦�� ����Ѵ�.
			3. ���� ���� �߿��� 3�̳� 6�̳� 9�� ������ 1����, ¦�� ����Ѵ�.
			4. ���� ���� �߿��� 3�̳� 6�̳� 9�� ������ 0�̸�, �ش� ���ڸ� ����Ѵ�.
				��)
					33		=>		¦¦
					16		=>		¦
					7		=>		7
	 */
		int a;
		Random rd = new Random();
		a=rd.nextInt(50)+1;
		int total=a,count=0;
		boolean check ;
		System.out.println(a);
		if(a/10==3) {
			System.out.println("¦");
		}
		if(a%10%3==0&&a%10!=0) {
			System.out.println("¦");
		}
		
		
		

}
}