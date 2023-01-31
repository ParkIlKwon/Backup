package day02;

import java.util.Scanner;

public class D_06더가까운숫자 {

	public static void main(String[] args) {
		int a=98,b=100,c=102;
		
		if (b-a<c-b) {
			System.out.println("A가 더 가깝다");
		}
		if (b-a>c-b) {
			System.out.println("B가 더 가깝다");
		}
		if(b-a == c-b) {
			System.out.println("똑같다");
		}
		
	}

}
