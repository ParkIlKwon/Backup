package day02;

import java.util.Scanner;

public class D_01���ǹ� {
	public static void main(String[] args) {
		//����ڿ��� �� 1���� �Է� ¦���� ¦�� ��� Ȧ���� Ȧ��
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� �� �� ! ");
		a=sc.nextInt();
		if(a%2==0) {
			System.out.println("¦��");
		}
		if(a%2!=0) {
			System.out.println("Ȧ��");
		}
		
	}

}
