package day09;

import java.util.Scanner;

public class F_01�迭��Ʈ�ѷ�1_�߰� {

	public static void main(String[] args) {
		
		//����1) �߰� �� �����ϰ� ���� �Է��ϸ� 10 , 20 �ڿ� �����Ѵ�.
		// �ִ� 5������ ����
		Scanner scan = new Scanner(System.in);
		
				       
				int[] arr = {10, 20, 30,  40, 50};
				int cnt = 5; // ��������ִ� ���� ���� 
				
				boolean run = true;
				while(run) {

					for(int i=0; i<arr.length; i++) {
						System.out.print(arr[i] + " ");
					}
					System.out.println();			
					
					System.out.println("[1]�߰�");
					System.out.println("[2]����(�ε���)");

					System.out.println("[0]����");
					System.out.print("�޴� ���� : ");
					int sel = scan.nextInt();
					
					if(sel == 1) {
						
						if(cnt == 5) {
							System.err.println("[ �� �߰� �Ұ���]");
							continue;
						}
								
						System.out.print("�߰��� ��>> ");
						int data = scan.nextInt();
						arr[cnt] =data;
						cnt++;
						
					}else if(sel == 2) {
						
						if(cnt == 0) {
							System.err.println("[�迭�� ���� �����ϴ�]");
							continue;
						}
						
						System.out.print("���� �ε��� >> ");
						int idx = scan.nextInt();
						if(idx < 0 || idx >= cnt) {
							System.err.println("[ �ε��� ���� ]");
							continue;
						}
						
						// arr[idx] =0;
						int index =0;
						for(int i =0; i < arr.length; i++) {
		                   System.out.printf("index = %d , i = %d \n" , index , i);
							if(idx != i) {	
							   arr[index] = arr[i];
							   index++;
						   }
						}
						cnt--; // 5 -> 4
						arr[cnt] =0; // arr[4] =0;
						
						
					}else if(sel == 3) {
						// ���� ������ 
						System.out.println("");
				
					}else if(sel == 0) {
						System.out.println("����");
					}else {
						System.out.println("�Է¿��� ");
					}
					
				}

}
}
