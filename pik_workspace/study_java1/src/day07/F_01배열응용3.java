package day07;

import java.util.Arrays;

public class F_01�迭����3 {
	public static void main(String[] args) {

		// ����2) �Ʒ��� ������ �̴�. ���迡 �հ��ѻ���� ��ȣ�� win �� ���� (60���̻��հ�)
		int num[] = { 1001, 1002, 1003 };
		int score[] = { 50, 83, 78 };
		int win[] = { 0,0,0 };
		int idx=0;
		// ��) win[]= {1002, 1003, 0};
		
		for(int i = 0 ; i < num.length ; i++) {
			if(score[i] >=60) {
				win[idx] = num[i];
				idx++;
			}
			
		}
		for(int i = 0 ; i < win.length ; i++) {
			System.out.print(win[i]+" ");	
		}
		System.out.println("\n ���� 3 ");

		// ���� 1) �Ʒ� �迭 a �� b �� ���ؼ� ���� ���� ¦�� �϶��� c�� ���� 

				//           0   1   2   3  4
				          // new int[5] ; a[0] = 10, a[1]=20 ,, 
				int a[] = { 10, 20, 30, 40, 50 }; // a.length => �迭�� ����, ���� == >5 
				int b[] = { 13, 54, 17, 42, 1 };
				int c[] = new int[5];
				int cidx =0; // a+b ���� ¦���϶��� �ε��� ���� 
				
		                   // 0  1
				// ��) c[] = {74,82,0,0,0}
				
				for(int i = 0; i < a.length; i++ ) {
					int hap = a[i] + b[i];
					if( hap %2 == 0 ) {
						c[cidx] = hap;
						cidx++;
					}
				}
				for(int i = 0; i < c.length; i++ ) {
					System.out.print(c[i]+" ");
				}

				
				// ����3) �Ʒ��� ������ �̴� ���迡 �հ��� ����� ��ȣ�� win2 �� ���� (60���̻� �հ�)
				int wIdx =0; 
				for(int i =0; i < num.length ; i++) {
					if(score[i]>= 60) {
						win[wIdx] = num[i];
						wIdx++;
					}
				}
				System.out.println();
				
				System.out.println(Arrays.toString(win));
										// 0     1     2    3    4     5
				int data[] = { 1001, 80 , 1002, 23, 1003 , 78 };
				int win2[] = { 0,0,0 };
				// ��) win2[] = {1001, 1003, 0};
				
				wIdx = 0;    // 1  3  5  
				for(int i = 1; i < data.length; i+=2 ) {
					if(data[i] >= 60) {
						win2[wIdx] = data[i-1];
						wIdx++;
					}
				}
				
				System.out.println(Arrays.toString(win2));
	
	}

}
