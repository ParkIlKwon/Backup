package day06;


public class D_04for문 {
	public static void main(String[] args) {
		//for(부터 ; 까지 ; 증감)
		
		String str = "abcdefg hi hello";
		String[] result = str.split(" ");
		
		for(String s : result)
			System.out.println(s + ", ");
		
		for(int i =1 ; i<=10 ; i++) {
			if(i%5==0) {
				System.out.println(i+">>5의 배수");
			}
		}
		
		

	}

}
