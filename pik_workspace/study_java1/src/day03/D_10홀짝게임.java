package day03;

import java.util.Random;
import java.util.Scanner;

public class D_10Ȧ¦���� {
	public static void main(String[] args) {
		/*
		 * [����] 1. 1~10 ������ ���� �� �������� �� ���� ���ڸ� �����Ѵ�. 2. ���� ���ڰ� Ȧ������ ¦������ ���ߴ� �����̴�.
		 */
		int a, b,in;
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		a = rd.nextInt(10) + 1;
		System.out.printf("���¼�: %d\n", a);
		System.out.print("Ȧ¦�Է�:");
		in = sc.nextInt();
		sc.close();
		
		a=a%2;
		b=in%2;
		
		boolean win = a == b, err = in <= 0||in>2 ;
		if (err) {
			System.out.println("����");
			return;	//������ø�ᵵ ������ �̰� �� �����Ѱ� ���Ƽ� ����߽��ϴ�.
		}
		if (win) {
			System.out.println("�����.");
		}
		if (!win) {
			System.out.println("Ʋ�ȴ�.");
		}

	}

}
