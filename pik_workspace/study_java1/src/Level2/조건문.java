package Level2;

import java.util.Random;
import java.util.Scanner;

public class 조건문 {
	public static void main(String[] args) {
		/*
		[문제]
		[회원등급]
			볼펜하나의 가격은 1200원이다. 	
			볼펜은 20개이상구매시 볼펜하나당 100원을 할인해주고있다. 
				
			또한, 회원등급에 따라 할인을 추가제공한다.
			
			회원등급이 A 이면 15% 할인제공,
			회원등급이 B 이면 10% 할인제공,
			기본회원등급은 C이고 할인을 제공하지않는다.
			
			철수가 구입해야하는볼펜개수는 (10~50) 사이로 랜덤으로 저장하고,
			철수의 등급은 (0~2) 사이로 랜덤으로 표현해서 
			철수가 지불해야하는 금액을 출력하시오.		
			소수점 2 자리까지 표현하시오.
	*/
		System.out.println("===문제1===");
		int pen = 1200;
		double total = 0 ;
		
		Random rd = new Random() ; 
		int penCnt = rd.nextInt(41)+10;
		int 등급 = rd.nextInt(3);
		
		System.out.println("구입 펜수: " + penCnt);
		
		total = penCnt * pen ;
		
		if(penCnt >= 20) {
		total -= penCnt*100;
		}
		
		if(등급 == 2) {
			total -= total*0.15;
			System.out.println(total);
		}else if (등급 == 1) {
			total -= total*0.1;
			System.out.println(total);
		}
		System.out.printf("%.2f",total);
		//9분
		
		System.out.println();
		System.out.println("===문제2===");
		
		/*	
		[문제]
			철수는  유아용 학습프로그램을 개발하고있다.
			내용은 숫자 두개를 보여주고 둘중에 6보다 작은 수를 찾는 프로그램이다.
			철수는 1~5 사이의 숫자 한개와 6~10 사이의 숫자 한개를 랜덤으로 저장하고,
			사용자에게 보여주면 된다. 
			추가 조건은 다음과 같다.
		[조건]
			반드시 숫자는 1~5 한개와 6~10 한개여야한다.
			숫자 위치는 랜덤이어야 한다. 작은수가 앞에 올수도있고, 큰수가 앞에 올수도있다.
		[예시1]
			[문] 다음중 6보다 작은수를 고르시오.
			[보기]  [1] 7, [2] 3
			
		[예시2]
			[문] 다음중 6보다 작은수를 고르시오.
			[보기]  [1] 1, [2] 9
			
	*/
		
		
		int num1 = rd.nextInt(5)+1;
		int num2 = rd.nextInt(5)+6;
		
		System.out.println(num1+"  " + num2);
		
		int ran = rd.nextInt(2);
		System.out.println(ran);
		System.out.println("다음중 6보다 작은 수를 고르시오.");
		if(ran == 1) {
			System.out.printf("[보기]   [1] %d, [2] %d",num1,num2);
		}else {
			System.out.printf("[보기]   [1] %d, [2] %d",num2,num1);
		}
		
		Scanner sc = new Scanner(System.in);
		int sel = sc.nextInt();
		boolean check = (ran == 1 && sel == 1)||(ran == 0 && sel ==2); 
		System.out.println(check ? "맞았습니다. ":"틀렸습니다. ");
		
		
		//11분
		
		/*	
		[문제]
		[가위바위보 하나빼기]
		 양손 가위바위보 
	   com에 랜덤으로 오른손(0-2) / 왼손(0-2) 값 정하기
	   단 가위 가위 이런식으로 같으면 안됨 

	   me 입력으로 오른손(0-2) / 왼손(0-2) 값 정하기
	   그리고 오른손 낼지 왼손 낼지 입력으로 결정
	   [1.오른손 2.왼손]

	   그리고 결과값 출력 : 비겼다 이겼다 졌다 
	*/
		System.out.println("===문제3===");
		int comL = rd.nextInt(3);
		
		int comR = rd.nextInt(3);
		
		if(comR == comL) {
			if(comR > 0) {
				comR-=1;
			}else {
				comR+=1;
			}
		}
		
		int com = rd.nextInt(2);
		if(com == 1) {
			com = comR;
		}else {
			com = comL;
		}
		
		//0 1 2 가위 바위 보
		System.out.println(com);
		int me = 0;
		
		System.out.println("왼손: ");
		int meL = sc.nextInt();
		System.out.println("오른손: ");
		int meR = sc.nextInt();
		System.out.println("어느손 낼까 [1] 왼손  [2]오른손");
		sel = sc.nextInt();
		if(sel == 1) {
			 me = meL;
		}
		else {
			me = meR;
		}
		
		boolean draw = me == com ,
						win = (me == 0 && com == 2) || (me == 1 && com == 0)|| (me == 2 && com == 1) ; 
		
		if(draw) {
			System.out.println("비겼다");
		}else if (win) {
			System.out.println("이겼다");
		}else {
			System.out.println("졌다");
		}
	
		//21분
		
		

	}

}
