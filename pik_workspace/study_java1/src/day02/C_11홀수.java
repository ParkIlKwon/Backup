package day02;

import java.util.Scanner;

public class C_11Ȧ�� {

	public static void main(String[] args) {
		/*
		 * 3:52 [����] ���� 2���� �Է¹޴´�. �� ������ ���� Ȧ������ ���θ� �Ǵ��� true �Ǵ� false�� ǥ���Ͻÿ�.
		 */
		int a, b, total = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� �Է��ϼ���: ");
		a = sc.nextInt();
		System.out.print("�ι�° ���� �Է��ϼ���: ");
		b = sc.nextInt();
		total = a + b;
		boolean chk = total % 2 != 0;
		System.out.println(chk + "�Դϴ�");
		//3:55
	}

}
