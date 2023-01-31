package day05;

public class D_02무한반복문종류 {
	public static void main(String[] args) {
	    int i = 1;
			boolean run = true;
			while(run) {
				
				System.out.print(i +" ");
				if(i== 10) {
					run = false; // 다음 반복문 턴 종료 
				}
				
				i++;
			}
			System.out.println();
			System.out.println("반복문 종료 i = " + i);
			
			System.out.println();
			
			i = 1;
			while(true) {
				
				System.out.print(i +" ");
				if(i== 10) {
					break; // 즉시 종료 
				}
				i++;
			}
			System.out.println();
			System.out.println("반복문 종료 i = " + i);
		

	}

}
