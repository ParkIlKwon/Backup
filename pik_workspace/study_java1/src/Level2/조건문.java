package Level2;

import java.util.Random;
import java.util.Scanner;

public class ���ǹ� {
	public static void main(String[] args) {
		/*
		[����]
		[ȸ�����]
			�����ϳ��� ������ 1200���̴�. 	
			������ 20���̻󱸸Ž� �����ϳ��� 100���� �������ְ��ִ�. 
				
			����, ȸ����޿� ���� ������ �߰������Ѵ�.
			
			ȸ������� A �̸� 15% ��������,
			ȸ������� B �̸� 10% ��������,
			�⺻ȸ������� C�̰� ������ ���������ʴ´�.
			
			ö���� �����ؾ��ϴº��氳���� (10~50) ���̷� �������� �����ϰ�,
			ö���� ����� (0~2) ���̷� �������� ǥ���ؼ� 
			ö���� �����ؾ��ϴ� �ݾ��� ����Ͻÿ�.		
			�Ҽ��� 2 �ڸ����� ǥ���Ͻÿ�.
	*/
		System.out.println("===����1===");
		int pen = 1200;
		double total = 0 ;
		
		Random rd = new Random() ; 
		int penCnt = rd.nextInt(41)+10;
		int ��� = rd.nextInt(3);
		
		System.out.println("���� ���: " + penCnt);
		
		total = penCnt * pen ;
		
		if(penCnt >= 20) {
		total -= penCnt*100;
		}
		
		if(��� == 2) {
			total -= total*0.15;
			System.out.println(total);
		}else if (��� == 1) {
			total -= total*0.1;
			System.out.println(total);
		}
		System.out.printf("%.2f",total);
		//9��
		
		System.out.println();
		System.out.println("===����2===");
		
		/*	
		[����]
			ö����  ���ƿ� �н����α׷��� �����ϰ��ִ�.
			������ ���� �ΰ��� �����ְ� ���߿� 6���� ���� ���� ã�� ���α׷��̴�.
			ö���� 1~5 ������ ���� �Ѱ��� 6~10 ������ ���� �Ѱ��� �������� �����ϰ�,
			����ڿ��� �����ָ� �ȴ�. 
			�߰� ������ ������ ����.
		[����]
			�ݵ�� ���ڴ� 1~5 �Ѱ��� 6~10 �Ѱ������Ѵ�.
			���� ��ġ�� �����̾�� �Ѵ�. �������� �տ� �ü����ְ�, ū���� �տ� �ü����ִ�.
		[����1]
			[��] ������ 6���� �������� ���ÿ�.
			[����]  [1] 7, [2] 3
			
		[����2]
			[��] ������ 6���� �������� ���ÿ�.
			[����]  [1] 1, [2] 9
			
	*/
		
		
		int num1 = rd.nextInt(5)+1;
		int num2 = rd.nextInt(5)+6;
		
		System.out.println(num1+"  " + num2);
		
		int ran = rd.nextInt(2);
		System.out.println(ran);
		System.out.println("������ 6���� ���� ���� ���ÿ�.");
		if(ran == 1) {
			System.out.printf("[����]   [1] %d, [2] %d",num1,num2);
		}else {
			System.out.printf("[����]   [1] %d, [2] %d",num2,num1);
		}
		
		Scanner sc = new Scanner(System.in);
		int sel = sc.nextInt();
		boolean check = (ran == 1 && sel == 1)||(ran == 0 && sel ==2); 
		System.out.println(check ? "�¾ҽ��ϴ�. ":"Ʋ�Ƚ��ϴ�. ");
		
		
		//11��
		
		/*	
		[����]
		[���������� �ϳ�����]
		 ��� ���������� 
	   com�� �������� ������(0-2) / �޼�(0-2) �� ���ϱ�
	   �� ���� ���� �̷������� ������ �ȵ� 

	   me �Է����� ������(0-2) / �޼�(0-2) �� ���ϱ�
	   �׸��� ������ ���� �޼� ���� �Է����� ����
	   [1.������ 2.�޼�]

	   �׸��� ����� ��� : ���� �̰�� ���� 
	*/
		System.out.println("===����3===");
		int comL = rd.nextInt(3);
		
		int comR = rd.nextInt(3);
		
		if(comR == comL) {
			if(comR > 0) {
				comR-=1;
			}else {
				comR+=1;
			}
		}
		
		int com = rd.nextInt(2);
		if(com == 1) {
			com = comR;
		}else {
			com = comL;
		}
		
		//0 1 2 ���� ���� ��
		System.out.println(com);
		int me = 0;
		
		System.out.println("�޼�: ");
		int meL = sc.nextInt();
		System.out.println("������: ");
		int meR = sc.nextInt();
		System.out.println("����� ���� [1] �޼�  [2]������");
		sel = sc.nextInt();
		if(sel == 1) {
			 me = meL;
		}
		else {
			me = meR;
		}
		
		boolean draw = me == com ,
						win = (me == 0 && com == 2) || (me == 1 && com == 0)|| (me == 2 && com == 1) ; 
		
		if(draw) {
			System.out.println("����");
		}else if (win) {
			System.out.println("�̰��");
		}else {
			System.out.println("����");
		}
	
		//21��
		
		

	}

}
