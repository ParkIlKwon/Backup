
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;


	public class ������������{



	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 14; // ��ü �Խñ� ��
		int pageSize = 4; // �� �������� ������ �Խñ� ��
		int curPageNum = 1; // ���� ������ ��ȣ
		int pageCount = 0; // ��ü ������ ����
		int startRow = 0; // ���� �������� �Խñ� ���� ��ȣ
		int endRow = 0; // ���� �������� �Խñ� ������ ��ȣ
		
  while(true){
	  
				
				pageCount = 14/ pageSize +1;
				
			
				
				if (curPageNum == 0 ) {
					System.err.println("�������� �ѱ�� �����ϴ�.");
					curPageNum = 1;
					continue;
				}
				
				if (curPageNum > pageCount ) {
					System.err.println("�������� �ѱ�� �����ϴ�.");
					curPageNum = pageCount;
					continue;
				}
				
				
				startRow =1 + pageSize*(curPageNum-1); 
				endRow = curPageNum * pageSize;
				if (endRow > count) {
					endRow -= endRow - count;
				}
				
				System.out.printf("������( %d  /  %d )\n",curPageNum,pageCount);
				
				for (int i = 0; i < (endRow - startRow) +1; i++) {
					System.out.printf("(%d)\n",startRow+i);
				}
				
			   	System.out.println("[���� 1]"); // ������ �̵�
				System.out.println("[���� 2]");
				System.out.println("���� >> ");
				
				
				int choice = sc.nextInt();
				
				curPageNum += choice == 1 ? -1 : +1 ;
				
				
				
				
}
		
	
				

			}

				
				
	}	
		
		
		


