package day10;

import java.util.Arrays;

public class G_04�ִ밪�����ϱ� {
	public static void main(String[] args) {
		/*
		 * # �����ϱ�
		 * 1. �ε��� 0���� �������� �˻��Ѵ�.
		 * 2. ���� ū ���� ã�� ��ȯ�Ѵ�.
		 * 3. �ε��� 1�����Ѵ�.
		 * 4. [1~3]�� ������ �ݺ��Ѵ�.
		 * ��)
		 * 10, 50, 30, 40, 80, 7
		 * 80, 50, 30, 40, 10, 7
		 * 80, 50, 30, 40, 10, 7
		 * 80, 50, 40, 30, 10, 7
		 */

	int[] score = {10, 50, 30, 40, 80, 7};
	int size = score.length;
	
	for(int i = 0 ; i < score.length ; i++) {
		for(int k = i ; k < score.length ; k++) {
			if(score[i] < score[k]) {
				int temp = score[k];
				score[k] = score[i];
				score[i] = temp;
		
			}
			
		}
	}
	
	
		System.out.println(Arrays.toString(score));
		
		
	}

}
