package day03;
import java.util.Random;
import java.util.Scanner;


public class D_12����������� {
	public static void main(String[] args) {
		/*
		[����]
			1. 159 ~ 300 ������ ���� ���ڸ� �����Ѵ�.
			2. ���� ������ ��� ���ڸ� ���� �Է��Ͽ� ���ߴ� �����̴�.
				��) 249	=> 4
	 */
		int com,in;
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		com=rd.nextInt(142)+159;
		System.out.println("������: "+com);
		System.out.println("��� ���� �Է��Ͽ��ֽÿ�");
		in=sc.nextInt();
		boolean err=in<0||in>9;
		if(err) {
			System.out.println("���� �߸��Է��Ͽ����ϴ�.");
			return;
		}
		com=(com%100)/10;
		if(com==in) {
			System.out.println("������ϴ� !! ");
		}
		if(com!=in) {
			System.out.println("Ʋ�Ƚ��ϴ�!! ");
		}
		//System.out.println(com==in?"������ϴ�.":"Ʋ�Ƚ��ϴ�.");
		
	}

}
