package day04;

import java.util.Random;

public class D_02������ {
	public static void main(String[] args) {
		/*
		 * 
		 0 �� 
		 1 ȭ 
		 2 �� 
		 3 �� 
		 4 �� 
		 5 �� 
		 6 �� 
		[����]
		    2023�� 03��
			�̹��� 1���� �������̶�� �� ��
			�������� 1 ~ 31�� �����ϰ� �ش� ������ ����Ͻÿ�.
			
			��)
				3��  ==> �ݿ���
				
				16�� ==> ����� 
	 */
		Random rd = new Random();
		int day = rd.nextInt();
		int week = (day+1)%7; // ������
		
		if(week==0) {
			System.out.println("������");
		}else if (week==1) {
			System.out.println("ȭ����");
		}else if (week==2) {
			System.out.println("������");
		}else if (week==3) {
			System.out.println("�����");
		}else if (week==4) {
			System.out.println("�ݿ���");
		}else if (week==5) {
			System.out.println("�����");
		}else {
			System.out.println("�Ͽ���");
	}
}
}
