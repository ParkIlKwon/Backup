package day09;

import java.util.Arrays;
import java.util.Scanner;

public class G_05�迭���� {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int input[] = new int[5];
		int b[] = new int[5];
		Scanner sc = new Scanner(System.in);
		// ���ڸ� 5�� �Է¹ް� arr �迭�ȿ� �Է��Ѱ��� ����������
		// b�迭�ȿ� �ش� ���� �ε����� ���ʴ�� �����ҷ��� �Ѵ�.
		// ����) ���࿡ �Է��� ���ڰ� arr �� ������ �ε��� ��� -1 ����

		// ��) 10, 20, 10, 1, 50
		// b ={0,1,0,-1,4}

		// ��) 30, 40, 1, 10, 2

		// b = {2,3,-1,0,-1}

		for (int i = 0; i < arr.length; i++) {
			input[i] = sc.nextInt();
		}

		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			for(int k = 0 ; k < arr.length ; k++) {
			
				if (arr[k] == input[i]) {
					b[idx] = input[i];
					
				} else {
					b[idx] = -1;
					
				}
			}
			idx++;
			}
			
			
			
		System.out.println(Arrays.toString(b));

	}

}








