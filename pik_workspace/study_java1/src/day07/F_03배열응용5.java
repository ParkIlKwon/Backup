package day07;

import java.util.Arrays;

public class F_03�迭����5 {
	public static void main(String[] args) {
		
		// ����1)  a�� ���� b�� ���� �����ư��鼭 c�� ����
		// ��) c = {10,40,20,50,30,60}
		int a[] = {10,20,30};
		int b[] = {40,50,60};
		int c[] = {0,0,0,0,0,0};
		int idx = 0 ;
		
		for(int i = 0 ; i < a.length ; i++) {
			c[idx]=a[i];
					c[idx+1] = b[i];
					        idx +=2;
		}
		for(int i = 0 ; i < c.length ; i++) {
			System.out.print(c[i]+" ");
			
		}
		
		System.out.println();
		
		// ���� 2) aa �迭�� ������ ������ ��ĭ�� ���� �ǵڿ� bb��  ���� ���� 
		int aa[] = { 10,20,30,40,50 };
		int bb = 90;
		// ��) aa = {20,30,40,50,90};
		
		for(int i = 0 ; i < aa.length-1 ; i++) {
			aa[i]=aa[i+1];
		
		}
		aa[aa.length-1] = bb;
		
		for(int i = 0 ; i < aa.length ; i++) {
			System.out.print(aa[i]+" ");
			
		}
		System.out.println();
		
		// ���� 3) cc �� �迭�� �ڷ� �ϳ��� �о�� �� �տ� dd�� ���� ���� 
		int cc[] = { 10,20,30,40,50 };
		int dd = 60;
		idx = 0;
		int num = 0;
		// ��) cc[] = {60,10,20,30,40};
		
		for(int i = cc.length-1 ; i >=0+1 ; i--) {
			cc[i ] = cc[i-1];
		}
		cc[0]=dd;
		
		System.out.println(Arrays.toString(cc));
		
		
		

	}

}
