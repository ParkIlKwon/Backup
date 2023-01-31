package day03;

public class D_04도화지 {
	public static void main(String[] args) {
		int student = 25;
		int papers = student * 2;
		int paperSet = papers/10;
		int price = 0;
		
		// 10단위로 나눠어떨어지지 않을 때 
		if(papers%10 > 0 ) {
			paperSet = paperSet + 1;
		}
		price = paperSet* 1200;
		
		System.out.println("가격 : " +price +"원");
	
	}

}
