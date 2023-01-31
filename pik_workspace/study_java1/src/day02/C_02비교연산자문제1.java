package day02;

public class C_02비교연산자문제1 {
	public static void main(String[] args) {
		// 문제) 아래 연산의 결과가 모두 true가 출력되도록 변수의 값을 변경하시오.	      
				int a = 3;
				int b = 1;
				int c = 1;
				System.out.println(a + b - 3  == c);
				
				a = 1;
				b = 1;
				c = -1;		
				System.out.println(a * -b  == c);
				
				a = 1;
				b = 1;
				c = -2;		
				System.out.println(a + -b * 3 == c);
						
				a = 1;
				b = 1;
				c = 0;		
				System.out.println(a % b  == c);
				
				a = 1;
				b = 2;
				c = 2;		
				System.out.println(a % b + 3  == c * 2);
						
        
     
     				

	}

}
