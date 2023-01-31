import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class C_05연습문제 {

	public static void main(String[] args) {
		
		 		  
		   /*
			  *  아래 와 같은데이터일때 도서 연체여부 출력(단, 윤년은 계산하지않는다)

		       연체일 수 까지 같이 계산 한다 : 연체일 1일 까지 출력 
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
				
				
				System.out.println(rentalPeriod<cnt ? "연체됐습니다.": " 연체 안됐습니다.");
				System.out.println(cnt-rentalPeriod + "일");
			
			
			
			
				}
				

			}
			
		
		
		
		
		
	