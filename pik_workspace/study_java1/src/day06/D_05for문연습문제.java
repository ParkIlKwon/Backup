package day06;

public class D_05for���������� {
	public static void main(String[] args) {
		/*
		 * [����1] 1~10���� �ݺ��� 5~9 ��� 
		 * [����1] 5, 6, 7, 8, 9
		 * 
		 * [����2] 10~1���� �ݺ��� 6~3 �Ųٷ� ��� 
		 * [����2] 6, 5, 4, 3
		 * 
		 * [����3] 1~10���� �ݺ��� ¦���� ��� 
		 * [����3] 2, 4, 6, 8, 10
		 */
		System.out.println("====����1====");
		for(int i = 10; i >0 ; i--) {
			if(i<=6&&i>=3) {System.out.print(i);}
		}
		System.out.println();
		System.out.println("====����2====");
		for(int i = 0; i <=10 ; i++) {
			if(i>=5&&i<=9) {System.out.print(i);}
			}
		System.out.println();
		System.out.println("====����3====");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d %s\n", i, i % 2 == 0 ? "¦��" : "Ȧ��");
		}
		}
		
		
	}


