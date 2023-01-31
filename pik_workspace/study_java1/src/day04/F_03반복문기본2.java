package day04;

import java.util.Iterator;

public class F_03반복문기본2 {
	public static void main(String[] args) {
				
		int i =1,sum=0,cnt=0;
		 while (i<=10) {
			sum+=i;
			
			 i++;
		}
		i=1;
		while (i<=10) {
			if(i%2==0) {
				cnt++;
			}
			i++;
		}
		System.out.println(cnt);
		
		
	}

}
