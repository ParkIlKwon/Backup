package day12;

public class Level1�񱳿����� {
	public static void main(String[] args) {
		
//		[����]
//				��� true�� ��� �ǵ��� ���� �����Ͻÿ�.
//				��, ������ ����  0�� ����������ÿ�.
//		
//		
			System.out.println("���� 1 ");
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
			
			
			//1��
			
			System.out.println("���� 2 ");
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
			
			//5��
			
			System.out.println("���� 3 ");
			
		     a = 17;
			System.out.println(7 * 2 - a == 3 * -2 - -3);			//	    = -3
			 b = 6;
			System.out.println(b * 5 - 25 == 5);				//	
			c = 6;
			System.out.println(3 * c + 2 == 20);		
			d = 4;
			System.out.println(5 * d == 2 * 10);
			
			//6��
			
			System.out.println("���� 4 ");
			
		    a = -2;		
			System.out.println(5 * a - 2 == 3 * (4 * a + 4));		
			b = -5;		
			System.out.println(-4 * b + 4 == -2 * (b - 7));
			c = 12;		
			System.out.println(-c -2 == -2 * (1 * c - 5));
			
			//10�� ...
			
			System.out.println("���� 5 ");
		    a = 9;
			b = -3;		
			
			System.out.println(-4 + a + 3 == 8);
			System.out.println((a + b) / 2 == 3 );
			
			//5�� 
			
			/*
			[����]
				ö���� ü���׽�Ʈ�� �Ѵ�.
				������ ��������Ű���̰�, 1�п� 35���� �ϸ� ����̴�.
				ö���� 3�� 20�ʿ� 123���� �Ѵ�.
				���� ������ �ε������ ��Ÿ���ÿ�.
			[����]
				ö���� ü���׽�Ʈ�� ����Ҽ��ִ�.
			[����]
				true
		*/
			System.out.println("���� 6 ");
			double �д� = 123 / 3.2;
			int ���� = 35;
			
			System.out.println(���� <= �д�);
			
			//4��
			
		
		

	}

}
