package day07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class F_01배열시험 {
	public static void main(String[] args) {
		/*
		[페이징 훼이크]
		[이상한 나라의 숫자규칙]
			숫자 1~5 사이를 a 에저장하면 , num 에 1 저장후 출력
			숫자 6~10 사이를 a 에저장하면 , num 에 2 저장후 출력
			숫자 11~15 사이를 a에 저장하면, num 에 3 저장후 출력
			숫자 16~20 사이를 a 에 저장하면, num 에 4 저장후 출력
			....
			....
			숫자 96~100 사이를 a 에 저장하면 , num 에 20을 저장후 출력 
		
	 */
		int a = 0,num=0;
		Random rd = new Random();
		a = rd.nextInt(100)+1;
		if(a>=1||a<=5) {
		num = 1;	
		}else if (a>=6||a<=10) {
		num=2;
		}
			
		System.out.println(num);
		
		/*
		[문제] 
			[1] 48의 약수중 일의자리가 2~6사이인 수를 출력하시오.
			[2] 위 조건의 약수의 개수도 출력하시오.
		[정답]
			2 3 4 6 12 16 24 
			악수의 개수 : 7개
	 */
		
		int num2,one=0,cnt=0,c;
		
		for(int i = 1;i<=48;i++) {
			if(48%i==0) {
			one = i ;
				if(one%10>=2&&one%10<=6) {
					System.out.print(one+" ");
					cnt ++;
				}
			}
		
			
		}
		System.out.println("약수의 개수: " + cnt);
		/*
		[문제] 
			128의 3번째 약수 부터 6번째 약수의 전체합을 출력하시오.
		[정답]
			3번째 약수 부터 6번째 약수의 전체합 : 60
	 */
		int cnt2=0,total=0;
		for(int i = 1 ; i <= 128 ; i++) {
			if(128%i==0) {
				cnt2++;
				if(cnt2>=3&&cnt2<=6) {
					total += i;
				}
			}
		}
		System.out.println("3번째 약수부터 6번째 약수의 전체합 : "+total);
		
		/*
		[즉석복권]
			랜덤으로 1또는 7 을 10번출력한다. 
			7이 연속으로 3번이상이면 "당첨" 아니면 "꽝" 출력하시오.
		[예시]
			7 7 1 1 1 7 1 : 꽝
			1 7 7 7 1 1 7 : 당첨
	*/
		int [] luck = new int[10];
		int rand = 0 ;
		int cnt10 = 0;
		for(int i = 0 ; i < luck.length ; i++) {
			rand = rd.nextInt(2)+1;
		if(rand==1) {
		luck[i] =  1;
		}else {luck[i] = 7;
			
		}
		}
		
		for(int i = 0 ; i < luck.length-1 ; i++) {
		if(luck[i]==luck[i+1]&&luck[i]==7) {
		cnt10++;
		}
		}
		if(cnt10>=2) {System.out.println("당첨");}
		else {
			System.out.println("꽝");
		}
		/*
		값을 두개 입력받고 배열에서 그사이의 값만 출력  	
		예) 입력 : 10, 43  	
		설명 ) 10과 43 두개를 입력받으면 그사이의 값은 20과 30이다. 
		결과) 20,30
	*/ 
			Scanner sc = new Scanner(System.in);
			int arr[] = {10,20,30,40,50};
			int arr2[] = new int[5];
			int x,y,idx=0;
			System.out.println("값을 두개 입력하시오.");
			x=sc.nextInt();
			y=sc.nextInt();
			
			for(int i = 0 ; i < arr.length ; i++) {
				if(y>x) {
					if (arr[i]>x&&arr[i]<y) {
					arr2[idx] = arr[i];
							idx++;
					}
				}else {
					if (arr[i]<x&&arr[i]>y) {
						arr2[idx] = arr[i];
						idx++;
				}
			}
		
	}

			System.out.println(Arrays.toString(arr2));

}
}
