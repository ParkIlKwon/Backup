package day08;

import java.util.Arrays;

public class F_03�̴Ϻ��� {

	
	public static void main(String[] args) {
		int cnt = 0;
		int arr[] = {
				3,0,0,
				3,3,0,
				3,3,3
		};
		
		//����1) ���࿡ ���ο� 3�� �������� 3�������� "����" ���
   	//����2) ���࿡ ���ο� 3�� �������� 3�������� "����" ���
	  //����3) ���࿡ �밢���� 3�� �������� 3�������� "����" ���
	for(int i = 0 ; i < arr.length ; i++) {
		if(i%3==0) {
			System.out.println();
		}
		if(arr[i] == 0) {
			System.out.print("��");
		}else {
			System.out.print("��");
		}
		
	}
		System.out.println();

	for (int i = 0; i < arr.length - 2; i++) {
		
		if (arr[i] == 3) {					//3���ν�
			
			if (arr[i] == arr[i + 1] && arr[i] == arr[i + 2]) {	//�� ������ ���κ��� ����
				
				System.out.println("���κ���");

			} 
				if (i < 3) {	//���κ���� ù��°�� 3�� �־�� �ϹǷ� �� ����
				if (arr[i] == arr[i + 3] && arr[i] == arr[i + 6]) {	
					
				System.out.println("���κ���");
					
			}
			if(i == 0)	{	//�밢����� �ε���0�� 2�� 3���־�� �ϹǷ� �� ����
				if (arr[i] == arr[i + 4] && arr[i] == arr[i + 8]) {
					
					System.out.println("�밢����");	
				}
			}
			if(i == 2) {
				if(arr[i] == arr [i+2] && arr[i] == arr [i+4] ) {
					
					System.out.println("�밢����");		
				}
			}
				
			}
			}

	}
		
	
	}

}
