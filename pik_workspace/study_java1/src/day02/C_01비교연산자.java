package day02;

public class C_01비교연산자 {
	public static void main(String[] args) {
		/*
		 *  비교 연산자 는 booelan 값을 결과값 나온다 
		 *  
		 * => 비교 연산자의 결과는 참(true) 또는 거짓(false)이다.
		 * 
		 * 1. 크니? 초과				>
		 * 2. 작니? 미만				<
		 * 3. 크거나 같니? 이상			>=
		 * 4. 작거나 같니?	 이하		<=
		 * 
		 * 5. 같니?			        == 비교	// = 대입연산자 
		 * 6. 다르니?				    != 
		 */		
		
        System.out.println(10 == 10);
        System.out.println(10 != 3);
        System.out.println(10 > 3);
        System.out.println(10 < 11);
        System.out.println(10 >= 3);
        System.out.println(10 <= 10);
		    
        
        System.out.println("-----------------------");
        
        int a = 10;
        int b = 3;
        
        System.out.println(a == b+7);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b+8);
        System.out.println(a >= b);
        System.out.println(a <= b+9);
        
        
        

	}

}
