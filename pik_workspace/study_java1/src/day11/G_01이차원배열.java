package day11;

import java.util.Scanner;

public class G_01�������迭 {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];
		Scanner sc = new Scanner(System.in);
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// ���� 1) �ε��� 2���� �Է¹޾� �� ���
		// ��    1) �ε���1 �Է� : 1	�ε���2 �Է� : 2
		//		   �� ��� : 60 
		System.out.print("�ε��� 1 �Է� : ");
		int idx1 = sc.nextInt();
		System.out.print("�ε��� 2 �Է� : ");
		int idx2 = sc.nextInt();
		
		System.out.println(arr[idx1][idx2]);
		System.out.println("==================");
		
		// ���� 2) ���� �Է¹޾� �ε��� 2�� ���
		// ��    2) �� �Է� : 60
		//		   �ε���1 ��� : 1	�ε���2 ��� : 2
		
		System.out.println("�� �Է� : ");
		int data = sc.nextInt();
	
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				if(data==arr[i][j]) {
					System.out.println("�ε���1: "+i+"�ε���2: "+j);
				}
				
			}
			
		}
		
		
		
		// ���� 3) ���� ū ���� �ε��� 2�� ���
		// ���� 3) 2 2
		System.out.println("==================");
		int max = arr[0][0];
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				if(arr[i][j]>max) {
					idx1 = i;
					idx2 = j;
					
				}
			}
			
		}
		System.out.println(idx1 + "  "+ idx2);
		
		
		
		// ���� 4) �� 2���� �Է¹޾� �� ��ü
		System.out.print("�� 1 �Է� : ");
		idx1 = sc.nextInt();
		System.out.print("�� 2 �Է� : ");
		idx2 = sc.nextInt();
		int a=-1,b=-1,c=-1,d=-1;
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				if(idx1 == arr[i][j]){
					a=i;
					b=j;
				}
				if(idx2 == arr[i][j]){
					c = i ;
					d = j;
				}
				
			}
			
		}
		int temp = arr[a][b];
		arr[a][b] = arr[c][d];
		arr[c][d] = temp;
		
		

	}

}
