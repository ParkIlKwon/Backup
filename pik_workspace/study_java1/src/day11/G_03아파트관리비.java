package day11;

import java.util.Arrays;
import java.util.Scanner;

public class G_03����Ʈ������ {
	public static void main(String[] args) {
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};
	
		// ���� 1) ������ ������ �� ���
		// ���� 1) 4400, 7100, 5400
		
		for(int i = 0 ; i < pay.length ; i ++) {
			int sum = 0;
			for(int k = 0 ; k < pay[i].length ; k++) {
				sum += pay[i][k];
			}
			System.out.print(sum+"  ");
		}
		
		// ���� 2) ȣ�� �Է��ϸ� ������ ���
		// ��    2) �Է� : 202	������ ��� : 2000
		System.out.println("\n ���� 2) ȣ�� �Է��ϸ� ������ ���");
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�: ");
		int ho = sc.nextInt();
		int idx1 = -1;
		int idx2 = -1;
		
		for(int i = 0 ; i < apt.length ; i ++) {
			for(int k = 0 ; k < apt[i].length ; k++) {
				if(apt[i][k] == ho) {
				idx1 = i;
				idx2 = k;
				
				}
				
			}
		
		}
		if(idx1+idx2==-2) {
			System.out.println("���� ȣ���Դϴ�.");
		}else {
			System.out.println("������ ���: "+ pay[idx1][idx2]);
		}
		
				
		
		// ���� 3) ���� ���� ���� ��(201), ���� ���� ���� ��(303)
		System.out.println("���� 3) ������ ���� ���� ���� ��, ���� ���� �� ���");
		int max = pay[0][0];
		int min = pay[0][0];
		int index1=0,index2=0;
		int index3=0,index4=0;
		for(int i = 0 ; i < pay.length ; i ++) {
			for(int k = 0 ; k < pay[i].length ; k++) {
				if(max < pay[i][k]) {
					max = pay[i][k];
					index1 = i ;
					index2 = k;
					
				}else {
					index3 = i ;
					index4 = k;
				}
				
				
			}
		
		}
		System.out.println(apt[index1][index2]);
		System.out.println(apt[index3][index4]);
		
		
		// ���� 4) ȣ 2���� �Է��ϸ� ������ ��ü
		int index5=0,index6=0;
		System.out.println("ȣ1 �Է�");
		int input1 = sc.nextInt();
		System.out.println("ȣ2 �Է�");
		int input2 = sc.nextInt();
		
		for(int i = 0 ; i < apt.length ; i ++) {
			for(int k = 0 ; k < apt[i].length ; k++) {
				if(input1== apt[i][k]) {
					index1 = i;
					index2 = k;
					
					
				}else if(input2==apt[i][k]) {
					index3 = i;
					index4 = k;
				}
				
				
			}
		
		}
		
		int temp = pay[index1][index2]; 
		pay[index1][index2] = pay[index3][index4];
		pay[index3][index4] = temp;
		for(int i = 0 ; i < apt.length ; i ++) {
			
			for(int k = 0 ; k < apt[i].length ; k++) {
				System.out.print(pay[i][k]+" ");
				
			}
			System.out.println();
		
		}
		
		
	}

}





