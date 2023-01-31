package day03;

import java.util.Random;

public class D_14랜덤주사위 {
	public static void main(String[] args) {
		int x,y;
		Random rd = new Random();
		x=rd.nextInt(6)+1;y=rd.nextInt(6)+1;
		System.out.printf("주사위(1): %d   주사위(2): %d\n",x,y);
		int com=x+y;
		if (x==y) {
			com=com*2;
		}
		System.out.println(com);
	}
}
