package day07;

import java.util.Arrays;

public class F_04�簢����� {
	public static void main(String[] args) {
		/*
		 * [����] b �迭�� �Ʒ��Ͱ��� �簢�������������Ѵ�. [��Ʈ] 3ĭ���� ���� �ٲ��ش�.
		 * 
		 * 1 2 3 4 5 6 7 8 9
		 * 
		 */
		int b[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int idx = 1;
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
			if (idx % 3 == 0) {
				System.out.println();
			}
			idx++;
		}
		
	}

}
