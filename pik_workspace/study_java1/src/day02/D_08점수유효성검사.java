package day02;

import java.util.Scanner;

public class D_08������ȿ���˻� {
	public static void main(String[] args) {

/*
	[����] ���� ��ȿ�� �˻�
		1. ���� 2���� �Է¹޾� ����� ���Ѵ�.
		2. ����� 60�� �̻��̸� �հ�, 60�� �̸��̸� ���հ��̴�.
		3. ����1)
		   �Է¹��� ������ �����̰ų� 100���� �ʰ��ϸ�,
		   ���� �޼����� ����Ѵ�.
		   ��) ������ �� �� �Է��߽��ϴ�.
		4. ����2)
		   ����� 60�� �̻��̶� �� �����̶� 50�� �̸��̸�,
		   ���հ��� ����Ѵ�.
 */
		int a,b,total=0;
		double avg=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("ù��° ������ �Է��Ͻÿ�:");
		a=sc.nextInt();
		System.out.print("�ι�° ������ �Է��Ͻÿ�:");
		b=sc.nextInt();
		sc.close();
		boolean arr = a<0||b<0||a>100||b>100;
		if(arr) {
			System.out.println("������ �߸��Է��Ͽ����ϴ�.");
			return;
		}
		total = a+b;
		avg=total/2;
		
		boolean check=avg>=60&&a>50&&b>5; 
		
		if(check) {
			System.out.println("�հ��Դϴ�.");
		}
		if(!check) {
			System.out.println("���հ��Դϴ�.");
		}
		
	}

}
