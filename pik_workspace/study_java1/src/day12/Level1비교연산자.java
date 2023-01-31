package day12;

public class Level1비교연산자 {
	public static void main(String[] args) {
		
//		[문제]
//				모두 true가 출력 되도록 값을 변경하시오.
//				단, 변수의 값은  0을 사용하지마시오.
//		
//		
			System.out.println("문제 1 ");
			int a = -1;
			int b = -1;
			System.out.println(a == b);
			a = -2;
			System.out.println(a != b);
			a = 10;
			System.out.println(a > b);
			a = -2;
			System.out.println(a < b);
			a = 10;
			System.out.println(a >= b);
			a = -1;
			System.out.println(a <= b);
			
			
			//1분
			
			System.out.println("문제 2 ");
			a = 2;
			b = -4;
			System.out.println(a + 4 < 4 - b);		//1
			double c = 7;
			double d = 1.1;
			System.out.println(c - 4.5 >= d * 0.2 - 0.3);	//2
			int e = -1;
			System.out.println(e * 2 - 3 < e - 3);	//3
			int f = 20;
			System.out.println(7 * 2 - f <= -5);	//4
			int g = 3;
			boolean h = (2 * g - 1 > 4);	//5
			System.out.println(h);
			int i = 4;
			boolean j = (8 - 2 * i < i + 2);	//6
			System.out.println(j);
			int k = -10;
			System.out.println(k + 1 <= -2 * 2 - 5);	//7
			int l = -4;
			System.out.println(4 + (5 + 3 * l) <= -2 * (l - 2));	//8
			
			//5분
			
			System.out.println("문제 3 ");
			
		     a = 17;
			System.out.println(7 * 2 - a == 3 * -2 - -3);			//	    = -3
			 b = 6;
			System.out.println(b * 5 - 25 == 5);				//	
			c = 6;
			System.out.println(3 * c + 2 == 20);		
			d = 4;
			System.out.println(5 * d == 2 * 10);
			
			//6분
			
			System.out.println("문제 4 ");
			
		    a = -2;		
			System.out.println(5 * a - 2 == 3 * (4 * a + 4));		
			b = -5;		
			System.out.println(-4 * b + 4 == -2 * (b - 7));
			c = 12;		
			System.out.println(-c -2 == -2 * (1 * c - 5));
			
			//10분 ...
			
			System.out.println("문제 5 ");
		    a = 9;
			b = -3;		
			
			System.out.println(-4 + a + 3 == 8);
			System.out.println((a + b) / 2 == 3 );
			
			//5분 
			
			/*
			[문제]
				철수는 체력테스트를 한다.
				종목은 윗몸일으키기이고, 1분에 35개를 하면 통과이다.
				철수는 3분 20초에 123개를 한다.
				다음 문장을 부등식으로 나타내시오.
			[설명]
				철수는 체력테스트를 통과할수있다.
			[정답]
				true
		*/
			System.out.println("문제 6 ");
			double 분당 = 123 / 3.2;
			int 기준 = 35;
			
			System.out.println(기준 <= 분당);
			
			//4분
			
		
		

	}

}
