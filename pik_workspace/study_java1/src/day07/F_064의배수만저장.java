package day07;

import java.util.Arrays;

public class F_064�ǹ�������� {
	public static void main(String[] args) {

		/*
		 * # 4�� ����� ����
		 * - arr �迭���� 4�� ����� ��� temp �迭�� ����
		 * - ��! temp �� ���̸� 4�� �����ŭ�� �����Ѵ�. 
		 */

			int[] arr = {44, 11, 29, 24, 76},k;
			int cnt = 0,idx=0;
	
			for(int i = 0 ; i < arr.length ; i++) {
				if(arr[i]%4==0) {
					cnt++;
				}
			}
					
			int[] temp = new int[cnt];
			for(int i = 0 ; i < arr.length ; i++) {
				if(arr[i]%4==0) {
					temp[idx] = arr[i];
					idx++;
				}
			}
			
			System.out.println(Arrays.toString(temp));
		
		
	}

}
