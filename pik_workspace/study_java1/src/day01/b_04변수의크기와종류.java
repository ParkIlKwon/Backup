package day01;

public class b_04변수의크기와종류 {

	public static void main(String[] args) {
		
	
		double a,b=3.14;
		a=(int)b;
		System.out.println((int)a);
		System.out.println((int)b);
		
		char c1 = 'a';
		System.out.println((int)c1);
		c1='A';
		System.out.println((int)c1);
		c1='가';
		System.out.println(c1);
		System.out.println(c1+10);
		
		
	}

}
