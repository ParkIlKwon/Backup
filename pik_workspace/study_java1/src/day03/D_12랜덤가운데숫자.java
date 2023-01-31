package day03;
import java.util.Random;
import java.util.Scanner;


public class D_12랜덤가운데숫자 {
	public static void main(String[] args) {
		/*
		[문제]
			1. 159 ~ 300 사이의 랜덤 숫자를 저장한다.
			2. 랜덤 숫자의 가운데 숫자를 직접 입력하여 맞추는 게임이다.
				예) 249	=> 4
	 */
		int com,in;
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		com=rd.nextInt(142)+159;
		System.out.println("랜덤값: "+com);
		System.out.println("가운데 값을 입력하여주시오");
		in=sc.nextInt();
		boolean err=in<0||in>9;
		if(err) {
			System.out.println("값을 잘못입력하였습니다.");
			return;
		}
		com=(com%100)/10;
		if(com==in) {
			System.out.println("맞췄습니다 !! ");
		}
		if(com!=in) {
			System.out.println("틀렸습니다!! ");
		}
		//System.out.println(com==in?"맞췄습니다.":"틀렸습니다.");
		
	}

}
