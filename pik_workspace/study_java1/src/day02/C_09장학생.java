package day02;

import java.util.Scanner;

public class C_09���л� {
	public static void main(String[] args) {
		/*
		 * ���� : 3:18 [����] ���������� 100���̰ų� ���������� 100���̸� ���л��̴�. ���������� ���������� �Է¹ް� ���л��̸� true��
		 * ����Ͻÿ�.
		 */
		int kor, math;
		Scanner sc = new Scanner(System.in);

		System.out.print("���������� �Է��ϼ���:  ");
		kor = sc.nextInt();
		System.out.print("���������� �Է��ϼ���:  ");
		math = sc.nextInt();

		boolean korCheck = kor >=0 && kor <=100;
		boolean mathCheck = math >=0 && math <=100;
		boolean check = korCheck&&mathCheck&&
				kor == 100 || math == 100;
		System.out.println(check);

		sc.close();

		// ���� 3:20

	}

}
