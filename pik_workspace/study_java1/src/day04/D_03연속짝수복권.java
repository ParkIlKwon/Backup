package day04;

import java.util.Random;

public class D_03����¦������ {

	public static void main(String[] args) {
		/*
		[�н���ǥ]
			������ Ȱ���ؼ� ���ǹ��� �н��Ѵ�.
		[����]
		[����¦������]
			100~900 ������ �������ڸ� ����Ѵ�. 
			���ڸ��� ���ڸ� ���� ���ڸ��� �и��Ѵ�.		
		[��Ģ]
			[1] ���ڸ���� ¦���̸� "1��"�� ����Ѵ�.
			[2] ���ڸ��� ¦���̰�, ¦���μ��ڰ� �����̸� "2��"�� ����Ѵ�. 
			[3] �׿ܴ� "��"�� ����Ѵ�. 
			[4] ��, 0�� ¦���̴�.
		[����]
			462 : 4,6,2 ���ڸ� ��� ¦���̹Ƿ� "1��"
			245 : 2,4,5 ���ڸ��� ¦���̰� 2,4�����̹Ƿ� "2��"
			456 : 4,5,6 ���ڸ��� ¦�������� ������ �ƴϹǷ� "��"
			782 : 7,8,2 ���ڸ��� ¦���̰� 8,2�����̹Ƿ� "2��" 	
	*/
		int luck;
		Random rd = new Random();
		luck = rd.nextInt(801)+100;
		int hun,ten,one;
		hun = (luck/100)%2; ten = (luck%100/10)%2; one =  (luck%100%10)%2;
		boolean triple = hun ==0 && ten == 0 && one == 0 ,
						Double = hun ==0 && ten ==0, Double2 = ten ==0 && one==0;
		if (triple) {
			System.out.println("1���Դϴ�.");
		}else if (Double) {
			System.out.println("2���Դϴ�.");
		}else if (Double2) {
			System.out.println("2���Դϴ�.");
		}else {
			System.out.println("��");
		}
		
		
		
		
		
		
		
	}

}
