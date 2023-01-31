package day01;


public class b_01변수 {
	public static void main(String[] args) {
		int age=30,Age=40;
		double dNum=3.14;// 변수의 선언과 초기값 설정 ! 
		char c1='a';
		char c2='가';
		char c3='1';	//''는 한글자
		boolean result = true;
		result = false;
		
		String str="java";
		String str2="박연미";
		
		System.out.println(age=40);//재할당.
		System.out.println("dNum="+dNum);
		System.out.printf("c1 = %c , c2 = %c , c3 = %c",c1,c2,c3);
		System.out.println(str + " " + str+str2);
		
		System.out.println(1>2); 
		System.out.println(result);
		
		

	}

}
