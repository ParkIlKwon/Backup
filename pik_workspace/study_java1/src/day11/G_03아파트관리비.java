package day11;

import java.util.Arrays;
import java.util.Scanner;

public class G_03아파트관리비 {
	public static void main(String[] args) {
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};
	
		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400
		
		for(int i = 0 ; i < pay.length ; i ++) {
			int sum = 0;
			for(int k = 0 ; k < pay[i].length ; k++) {
				sum += pay[i][k];
			}
			System.out.print(sum+"  ");
		}
		
		// 문제 2) 호를 입력하면 관리비 출력
		// 예    2) 입력 : 202	관리비 출력 : 2000
		System.out.println("\n 문제 2) 호를 입력하면 관리비 출력");
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		int ho = sc.nextInt();
		int idx1 = -1;
		int idx2 = -1;
		
		for(int i = 0 ; i < apt.length ; i ++) {
			for(int k = 0 ; k < apt[i].length ; k++) {
				if(apt[i][k] == ho) {
				idx1 = i;
				idx2 = k;
				
				}
				
			}
		
		}
		if(idx1+idx2==-2) {
			System.out.println("없는 호수입니다.");
		}else {
			System.out.println("관리비 출력: "+ pay[idx1][idx2]);
		}
		
				
		
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		System.out.println("문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력");
		int max = pay[0][0];
		int min = pay[0][0];
		int index1=0,index2=0;
		int index3=0,index4=0;
		for(int i = 0 ; i < pay.length ; i ++) {
			for(int k = 0 ; k < pay[i].length ; k++) {
				if(max < pay[i][k]) {
					max = pay[i][k];
					index1 = i ;
					index2 = k;
					
				}else {
					index3 = i ;
					index4 = k;
				}
				
				
			}
		
		}
		System.out.println(apt[index1][index2]);
		System.out.println(apt[index3][index4]);
		
		
		// 문제 4) 호 2개를 입력하면 관리비 교체
		int index5=0,index6=0;
		System.out.println("호1 입력");
		int input1 = sc.nextInt();
		System.out.println("호2 입력");
		int input2 = sc.nextInt();
		
		for(int i = 0 ; i < apt.length ; i ++) {
			for(int k = 0 ; k < apt[i].length ; k++) {
				if(input1== apt[i][k]) {
					index1 = i;
					index2 = k;
					
					
				}else if(input2==apt[i][k]) {
					index3 = i;
					index4 = k;
				}
				
				
			}
		
		}
		
		int temp = pay[index1][index2]; 
		pay[index1][index2] = pay[index3][index4];
		pay[index3][index4] = temp;
		for(int i = 0 ; i < apt.length ; i ++) {
			
			for(int k = 0 ; k < apt[i].length ; k++) {
				System.out.print(pay[i][k]+" ");
				
			}
			System.out.println();
		
		}
		
		
	}

}





