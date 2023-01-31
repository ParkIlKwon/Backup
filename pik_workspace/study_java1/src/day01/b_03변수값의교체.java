package day01;

public class b_03변수값의교체 {

	public static void main(String[] args) {
		int a = 5, b = 10, c = b;
		System.out.printf("a=%d,b=%d", a, b);

		b = a;
		b = c;

		System.out.printf("\na=%d,b=%d", a, b);

	}

}
