package Level2;

import java.util.Arrays;
import java.util.Iterator;

public class ���� {
	
	public static void main(String[] args) {
		
		
		System.out.println();
		System.out.println("==����8==");
		
		/* 
		�� mine�迭�� ���� 0�� �ڸ��� ���ڸ� �����ҷ����Ѵ�.
		�����Ҽ��ڴ� �ֺ� 8������ �˻��� 9�� ������ ���������.
				
		��) �Ʒ��� ���� ���  
			   {2,9,2},
			   {9,4,9},
			   {1,3,9}

*/			// 3�ð� . 
		
		int [][]mine =	{
						{0,9,0},
						{9,0,9},
						{0,0,9}
		                                            };
		
		int x[] = {-1,0,1,-1,1,-1,0,1};
		int y[]= {-1,-1,-1,0,0,1,1,1};
		int k = 0;
		int tx = 0 ; 
		int ty = 0;
		int cnt = 0;
		
		for (int i = 0; i < mine.length; i++) {
		
				for ( k = 0; k < mine[i].length; k++) {
					
					int mod = -1;
					
					if (mine[i][k] == 0) {
						mod=1;
						cnt = 5;
					}
					
					
					if(mod == 1) {
						cnt = 0;
					
					for (int m = 0; m < x.length; m++) {
							 tx = k+x[m];
							 ty =i+ y[m];
							 
					if(tx > -1 && ty > -1 && tx < mine.length && ty < mine.length  ){	
						if(mine[ty][tx] == 9) {
							System.out.println(i + " " +k);
							System.out.println( " ="+tx + " " + ty);
							 cnt++;
							 
						}
					}
						
					}	
						
						mine[i][k] = cnt;
			}
			
		}
				
		}
		
		for (int i = 0; i < mine.length; i++) {
			System.out.println(Arrays.toString(mine[i]));
			
		}
		
		
		

	}

}
