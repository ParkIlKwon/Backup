package �迭��ȭ�޼���;

import java.util.Scanner;

public class Ÿ�̸�üũ {

	public static void main(String[] args) {

		 System.out.println("Ÿ�̸� ����");

			 
			//gap
			
			
		 Scanner sc = new Scanner(System.in);
		 long beforeTime = System.currentTimeMillis();
			
			while (true) {
				int settime = 10;
				
				int num = sc.nextInt();
				
				long afterTime = System.currentTimeMillis(); 

				double secDiffTime = (afterTime - beforeTime) / 1000.0;
				System.out.println(secDiffTime);
				if (secDiffTime > settime) {
					break;
				}
			}
			
		
		
		
	}

}
