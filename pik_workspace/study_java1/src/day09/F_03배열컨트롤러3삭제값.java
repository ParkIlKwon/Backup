package day09;

import java.util.Arrays;
import java.util.Scanner;

public class F_03�迭��Ʈ�ѷ�3������ {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		
		int cnt = 5;

		boolean run = true;
		Scanner scan = new Scanner(System.in);
		
		while (run) {

			
			
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			System.out.println("[3]����(��)");
			System.out.println("[5]����");
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

		 if (sel == 3) {
			 if(cnt == 0) {
					System.err.println("[�迭�� ���� �����ϴ�]");
					continue;
				}
			 int a = -1;
				System.out.print("���� �ε���(��) �Է� : ");
				int delIdx = scan.nextInt();
				
				
				for(int i = 0 ; i < cnt  ; i++) {
					if(delIdx == arr[i]) {
						a = i;
						break;
					}
				}
		
				if(a == -1) {
					System.out.println("���� �߸��Է��Ͽ����ϴ�.");
					continue;
				}
				
				int index = 0;
				
				for(int i = 0 ; i < arr.length ; i++) {
				if(a != i) {
					arr[index] = arr[i];
					index ++;
				}
					
				}
				cnt --;
				arr[cnt] = 0;
				
			} 
			 else if (sel == 5) {
				break;
			} else {
	
			}
	}

	}
}

