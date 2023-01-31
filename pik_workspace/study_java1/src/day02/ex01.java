package day02;

import java.util.Scanner;

class Car{
	
}
public class ex01 {
	public static void main(String[] args) {
		int ch;
		Scanner sc = new Scanner(System.in) ;
		int i=sc.nextInt();
		int[] score = new int[i];
		
		for(i=0;i<score.length;i++) {
			score[i]=sc.nextInt();
		}
		for(i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
		
		
	}

}
