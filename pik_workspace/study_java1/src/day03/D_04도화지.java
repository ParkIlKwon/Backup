package day03;

public class D_04��ȭ�� {
	public static void main(String[] args) {
		int student = 25;
		int papers = student * 2;
		int paperSet = papers/10;
		int price = 0;
		
		// 10������ ����������� ���� �� 
		if(papers%10 > 0 ) {
			paperSet = paperSet + 1;
		}
		price = paperSet* 1200;
		
		System.out.println("���� : " +price +"��");
	
	}

}
