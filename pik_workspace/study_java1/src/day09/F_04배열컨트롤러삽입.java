package day09;

import java.util.Arrays;
import java.util.Scanner;

public class F_04�迭��Ʈ�ѷ����� {

	public static void main(String[] args) {
		   int[] arr = { 10, 20, 30, 0, 0 };
			int cnt = 3;
			Scanner scan = new Scanner(System.in);
	   	boolean run = true;
			while (run) {

				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();

				System.out.println("[4]����");
				System.out.println("[5]����");
				System.out.print("�޴� ���� : ");
				int sel = scan.nextInt();

		     if (sel == 4) {
		    	 	if(cnt >= 5) {
		    	 			System.err.println("5�� �̻� �� ���� �Ұ���");
		    	 			continue;
		    	 	}
		    	 	if(cnt < 1) {
		    	 			System.err.println("�ε����� 0���϶� �Ұ���");
		    	 			continue;
		    	 	}

					System.out.print("���� �ε��� �Է� : ");
					int index = scan.nextInt();
					if(index < 0 || index >= arr.length) {
						System.err.println("�ε��� �� ����");
						continue;
					}else if(arr[index] == 0) {
						System.err.println("0�� �ε����� ���� �Ұ���");
						continue;
					}
					
					System.out.print("���� �� �Է� : ");
					int data = scan.nextInt();
					
					for(int i = arr.length-1;i>=index;i--) {
						arr[i] = arr[i-1];
					}
					arr[index] = data;
					cnt ++;
					
					
				} else if (sel == 5) {
					break;
				} else {
			
				}

			}
		
		
		
	}

}
