package day03;

import java.util.Scanner;

public class D_08�ýÿ�� {
	public static void main(String[] args) {
		/*
		[����]
			�ý� �⺻����� 10,000���̴�.
			�⺻ ������� 10km���� �̵��� �� �ִ�.
			10km�̻� �̵� �� �߰������ �߻��Ѵ�.
			�߰������ 3km�� �̵��� ������ 2,300���� ����� �߰��ȴ�.
			�̵��Ÿ��� �Է¹ް� ����� ����Ͻÿ�.
			
			��)
				8km			=>		10,000��
				11km		=> 		12,300��
				16km		=>		14,600��
	 */
	    int fee = 10000;
			int extra = 0;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("�̵��Ÿ� : ");
			int km = sc.nextInt();
			
			if( km <= 0 ) {
				System.out.println("�Է� ���� : 0���� ū ���� �� �Է� ");
			}
		
			if(km > 10) {
				int extraKm = km - 10;
				extra = extraKm/3;
				if( extraKm %3 != 0 ) {
					extra = extra +1 ;
				}
				fee = fee + extra*2300;
			}
			
			System.out.println("��� : " + fee);

	}
}
