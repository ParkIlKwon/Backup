package day02;

import java.util.Scanner;

public class D_03_4�ǹ�� {

	public static void main(String[] args) {
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�.");
		score = sc.nextInt();
		boolean check = score % 4 == 0;
		if (check) {
			System.out.println("4�� ����Դϴ� ");
		}
		if (!check) {    //else
			System.out.println("4�� ����� �ƴմϴ� ");
		}

	}

}
