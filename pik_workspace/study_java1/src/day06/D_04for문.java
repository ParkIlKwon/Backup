package day06;


public class D_04for�� {
	public static void main(String[] args) {
		//for(���� ; ���� ; ����)
		
		String str = "abcdefg hi hello";
		String[] result = str.split(" ");
		
		for(String s : result)
			System.out.println(s + ", ");
		
		for(int i =1 ; i<=10 ; i++) {
			if(i%5==0) {
				System.out.println(i+">>5�� ���");
			}
		}
		
		

	}

}
