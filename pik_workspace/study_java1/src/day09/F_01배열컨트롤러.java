package day09;

import java.util.Arrays;

public class F_01�迭��Ʈ�ѷ� {

	public static void main(String[] args) {
		
		//��������	(�����ϰ� ���� ����)
		int num1 = 10 ;
		int num2 = num1;
		num2+=1;
		System.out.println(num2);
		
		//��������
		
		int[] arr = {10,20,30,40,50};
		int[] copyArr = arr;			//���� �ּҰ� �޸𸮹� ��� , ����
		
		copyArr[2] = 300;
		
		System.out.println(arr[2]);
		System.out.println((copyArr[2]));
		

	}

}
