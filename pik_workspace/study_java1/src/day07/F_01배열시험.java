package day07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class F_01�迭���� {
	public static void main(String[] args) {
		/*
		[����¡ ����ũ]
		[�̻��� ������ ���ڱ�Ģ]
			���� 1~5 ���̸� a �������ϸ� , num �� 1 ������ ���
			���� 6~10 ���̸� a �������ϸ� , num �� 2 ������ ���
			���� 11~15 ���̸� a�� �����ϸ�, num �� 3 ������ ���
			���� 16~20 ���̸� a �� �����ϸ�, num �� 4 ������ ���
			....
			....
			���� 96~100 ���̸� a �� �����ϸ� , num �� 20�� ������ ��� 
		
	 */
		int a = 0,num=0;
		Random rd = new Random();
		a = rd.nextInt(100)+1;
		if(a>=1||a<=5) {
		num = 1;	
		}else if (a>=6||a<=10) {
		num=2;
		}
			
		System.out.println(num);
		
		/*
		[����] 
			[1] 48�� ����� �����ڸ��� 2~6������ ���� ����Ͻÿ�.
			[2] �� ������ ����� ������ ����Ͻÿ�.
		[����]
			2 3 4 6 12 16 24 
			�Ǽ��� ���� : 7��
	 */
		
		int num2,one=0,cnt=0,c;
		
		for(int i = 1;i<=48;i++) {
			if(48%i==0) {
			one = i ;
				if(one%10>=2&&one%10<=6) {
					System.out.print(one+" ");
					cnt ++;
				}
			}
		
			
		}
		System.out.println("����� ����: " + cnt);
		/*
		[����] 
			128�� 3��° ��� ���� 6��° ����� ��ü���� ����Ͻÿ�.
		[����]
			3��° ��� ���� 6��° ����� ��ü�� : 60
	 */
		int cnt2=0,total=0;
		for(int i = 1 ; i <= 128 ; i++) {
			if(128%i==0) {
				cnt2++;
				if(cnt2>=3&&cnt2<=6) {
					total += i;
				}
			}
		}
		System.out.println("3��° ������� 6��° ����� ��ü�� : "+total);
		
		/*
		[�Ｎ����]
			�������� 1�Ǵ� 7 �� 10������Ѵ�. 
			7�� �������� 3���̻��̸� "��÷" �ƴϸ� "��" ����Ͻÿ�.
		[����]
			7 7 1 1 1 7 1 : ��
			1 7 7 7 1 1 7 : ��÷
	*/
		int [] luck = new int[10];
		int rand = 0 ;
		int cnt10 = 0;
		for(int i = 0 ; i < luck.length ; i++) {
			rand = rd.nextInt(2)+1;
		if(rand==1) {
		luck[i] =  1;
		}else {luck[i] = 7;
			
		}
		}
		
		for(int i = 0 ; i < luck.length-1 ; i++) {
		if(luck[i]==luck[i+1]&&luck[i]==7) {
		cnt10++;
		}
		}
		if(cnt10>=2) {System.out.println("��÷");}
		else {
			System.out.println("��");
		}
		/*
		���� �ΰ� �Է¹ް� �迭���� �׻����� ���� ���  	
		��) �Է� : 10, 43  	
		���� ) 10�� 43 �ΰ��� �Է¹����� �׻����� ���� 20�� 30�̴�. 
		���) 20,30
	*/ 
			Scanner sc = new Scanner(System.in);
			int arr[] = {10,20,30,40,50};
			int arr2[] = new int[5];
			int x,y,idx=0;
			System.out.println("���� �ΰ� �Է��Ͻÿ�.");
			x=sc.nextInt();
			y=sc.nextInt();
			
			for(int i = 0 ; i < arr.length ; i++) {
				if(y>x) {
					if (arr[i]>x&&arr[i]<y) {
					arr2[idx] = arr[i];
							idx++;
					}
				}else {
					if (arr[i]<x&&arr[i]>y) {
						arr2[idx] = arr[i];
						idx++;
				}
			}
		
	}

			System.out.println(Arrays.toString(arr2));

}
}
