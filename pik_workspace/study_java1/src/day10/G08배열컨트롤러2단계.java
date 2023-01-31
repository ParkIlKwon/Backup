package day10;

import java.util.Arrays;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class G08배열컨트롤러2단계 {
	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
			
			int[] score = null;
			int count = 0;
			int idx=0;
			int data=0;
			int index = 0;
			
		while(true) {
				
				for(int i=0; i<count; i++) {
					System.out.print(score[i] + " ");
				}
				System.out.println();
				if(score != null) {
					System.out.println(Arrays.toString(score));
				}
				
				System.out.println("[벡터 컨트롤러]");
				System.out.println("[1]추가");
				System.out.println("[2]삭제(인덱스)");
				System.out.println("[3]삭제(값)");
				System.out.println("[4]삽입");
				System.out.println("[0]종료");
				
				System.out.print("메뉴 선택 : ");
				int sel = scan.nextInt();
				
				if(sel == 1) {
					System.out.println("값 추가 >>:");
					data = scan.nextInt();
					if(score == null) {
						score = new int [1];
						score[0] = data;
						
						continue;
					}
					
					int [] temp = new int [score.length+1];
					
					for(int i = 0 ; i < score.length ; i++) {
					temp[i] = score[i]; 		
					}
					
					temp[score.length] = data;
					score = temp;
					
					temp = null;
					
					
				}else if(sel == 0) {
					break;
				}
				else if(sel == 2) {
					index = 0;
					if(score == null) {
						
						System.err.println("더이상 삭제할 인덱스가 없습니다.");
						continue;
					}
					
				idx = scan.nextInt();
				
				for(int i = 0 ; i < score.length ; i++) {
					if(idx != i) {
						score[index]=score[i] ;
						index++;
					}
					
				}
				System.out.println(Arrays.toString(score));
				score[score.length-1] = 0;
				System.out.println(Arrays.toString(score));
				int [] temp = new int [score.length-1];
				for(int i = 0 ; i < score.length-1 ; i++) {
					temp[i] =score[i];
				}
				score = temp;
				temp = null;	
				}
				
				else if(sel == 3) {
					data = scan.nextInt();
					for(int i = 0 ; i < score.length ; i++) {
						if(score[i] == data) {
							idx=i;
						}
					}
					for(int i = 0 ; i< score.length ; i++) {
						if(idx != i) {
							score[index] = score[i];
							index ++;
						}
					}
					score[index] = 0;
					int [] temp = new int [score.length-1];
					for(int i = 0 ; i < score.length ; i++) {
						temp[i] = score[i];
					}
					score = temp;
					temp = null;
					
				}else if(sel == 4) {
					System.out.println("인덱스 입력: ");
					idx = scan.nextInt();
					System.out.println("값 입력: ");
					data = scan.nextInt();
					
					int [] temp = new int [score.length+1];
					for(int i = 0 ; i < score . length ; i++) {
						temp [i] = score [ i];
					}
					for(int i = temp.length-1 ; i > idx  ; i--) {
						if(idx != i) {
							temp[i] = temp[i-1]; 
							
						}
						
					}
					temp[idx] = data;
					
					score = temp;
					
					
				}
				
				
				
	}
		
		
		
	}
}
