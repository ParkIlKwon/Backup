package day06;

import java.util.Iterator;
import java.util.Scanner;

public class F_13�迭���빮�� {

	public static void main(String[] args) {
		int a[] = { 10, 49, 51, 36, 17 };
		// ���� 1) ���� ����Ʈ�� ���� �Է��ϸ�   ��ȣ ��� 
		// ��) 51 ==> 2
		// ��) 10 ==> 0
		int idx;
		Scanner sc = new Scanner(System.in);
		idx = sc.nextInt();
		for(int i = 0 ; i < a.length ; i++) {
		if(idx == a[i]) {
			System.out.println(i);
			break;
		}
		
		}

		// ���� 2) ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� b �� ����(��ġ�� ��������ġ�� ����)
		// ��) b = [0, 49, 51, 0, 17]
		int b[] = { 0,0,0,0,0 };
		
		for(int i = 0 ; i < a.length ; i++) {
			if(a[i]%2!=0) {
				b[i]=a[i];
			}
			}
		for(int i = 0 ; i < a.length ; i++) {
				System.out.print(b[i]+" ");
			
			}
		System.out.println();

		// ���� 3) ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� c �� ����(��ġ�� �տ��� ����  ����)
	    // 2�������� ���� �ٸ�
		// ��) c = [49, 51, 17, 0, 0]
		int c[] = { 0,0,0,0,0 };
		int index=0;
		for(int i = 0 ; i < a.length ; i++) {
			
			if(a[i]%2!=0) {
				c[index] = a[i];
				index ++;
				
				}
				
			}
		System.out.println("===");
		for(int i = 0 ; i < c.length ; i++) {
			System.out.print(c[i]+" ");
			
			}
		System.out.println();
		//-------------------------------------------------
		int arr[] = {1001, 20, 1002, 45, 1003, 54};
		int select;
		// �й��� ������ �ѽ��̴�. ==>  1001:20 , 1002:45 , 1003:54
		
		// ����4) �й��� �Է��ϸ� ���� ��� 
		// ��) 1001==>20 , 1003 ==> 54
		System.out.println("[�й��Է�] ");
		select = sc.nextInt();
		int check=-1;
		for(int i = 0 ; i < arr.length ; i+=2) {
			if(arr[i]==select) {
				check = i;
				break;
			}
		}
		if(check == -1) {
		System.err.println("===�߸��� �Է�===");
		}else {
			System.out.println(arr[check+1]);
		}
		
		// ����5) ������ �Է��ϸ� �й� ��� 
		// ��) 20 ==> 1001 , 45 ==> 1002
		System.out.println("[�����Է�] ");
		select = sc.nextInt();
		for(int i = 1 ; i < arr.length ; i+=2) {
			if(arr[i]==select) {
			 check = i;
				break;
			}
		}
		
		if(check == -1) {
			System.err.println("===�߸��� �Է�===");
			}else {
				System.out.println(arr[check-1]);
			}
		

	}

}
