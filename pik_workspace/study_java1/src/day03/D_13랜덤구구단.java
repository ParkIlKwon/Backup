package day03;

import java.util.Random;
import java.util.Scanner;

public class D_13���������� {
	public static void main(String[] args) {
		/*
		[����]
			1. ������ ������ �����ϱ� ���� ���� 2���� �����ϰ� �����Ѵ�.
			2. ������ ������ ����Ѵ�. ��) 3 x 7 = ?
			3. ������ �ش��ϴ� ������ �Է¹޴´�.							
			// 2 - 9 �ܱ��� 
			// 2*1 - 2*9 1-9 ���� �� 
			4. ������ ���� "����" �Ǵ� "����"�� ����Ѵ�.
	 */
		int solution,ran1,ran2;
		Random rd = new Random();Scanner sc = new Scanner(System.in);
		ran1=rd.nextInt(8)+2;ran2=rd.nextInt(9)+1;
		System.out.printf("%d X %d  ���Է�: ",ran1,ran2);
		solution = sc.nextInt();
		sc.close();
		boolean err=solution<=0,compare=solution==ran1*ran2;
		if (err) {
			System.out.println("���� �߸� �Է��Ͽ����ϴ�.");
			return;
		}
		System.out.println(compare?"�����Դϴ�. ":"�����Դϴ�. ");
	}

}
