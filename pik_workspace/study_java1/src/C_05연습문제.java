import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class C_05�������� {

	public static void main(String[] args) {
		
		 		  
		   /*
			  *  �Ʒ� �� �����������϶� ���� ��ü���� ���(��, ������ ��������ʴ´�)

		       ��ü�� �� ���� ���� ��� �Ѵ� : ��ü�� 1�� ���� ��� 
			 */
		
				int rentalPeriod = 70;
				int [] rentalDay = {2020 , 12, 29};
				int [] today = {2021, 3, 10};
				
				int monthList[] = {31, 28, 31, 30, 31, 31, 30,
						31 , 30 , 31 , 30 , 31};
				
				int year = 2020 ;
				int month = 1 ;
				int cnt = 0;
				int log = -1;
				
				for (int i = 0; i < monthList.length; i++) {
					
					for (int k = 1; k <= monthList[i]; k++) {
						
						if(rentalDay[1] == month && rentalDay[2] == k) {
							
							log =1;
							
						}
						if(today[0] == year && today[1] == month && today[2] == k) {
							
							log =2 ;
							break;
						}
						
						
						
						if(log ==1) {
							cnt++;
						}
						
						
					}
					if(log ==2) {
						break;
					}
					
					month++;
					
					if(i == monthList.length-1) {
						i = 0;
						month = 1;
						year++;
						
					}
					
					
				}
				
				
				System.out.println(rentalPeriod<cnt ? "��ü�ƽ��ϴ�.": " ��ü �ȵƽ��ϴ�.");
				System.out.println(cnt-rentalPeriod + "��");
			
			
			
			
				}
				

			}
			
		
		
		
		
		
	