package 메서드클배;

import java.util.Arrays;
import java.util.Scanner;



class ThreadInterrupt_1 extends Thread{
		
	
			int darr[][] = new int [10][1];
			int idx = 0;
	
			void map(){
				darr[idx][0] = 0;
				idx++;
				darr[idx][0] = 2;
				
				
				for (int i = 0; i < darr.length; i++) {
					System.out.println(Arrays.toString(darr[i]));
				}
			}
	
	
			@Override
			public void run() {
				int i = 10;
				
				while (!isInterrupted()){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("인터럽");
						darr[9][0] = 3;
						break;
					}
					
					map();
					
					
				}
			}
		}
		
public class 메서드인터럽트 {

	public static void main(String[] args) {
	
				Scanner sc = new Scanner(System.in);
				
				ThreadInterrupt_1 th1 = new ThreadInterrupt_1();
				while (true) {
					th1.start();
					
					int input = sc.nextInt();
					
					System.out.println("입력하신 값은 "+input+"입니다.");
					th1.interrupt();
					

				}
				
		        
		        
	}

}
