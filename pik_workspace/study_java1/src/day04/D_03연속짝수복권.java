package day04;

import java.util.Random;

public class D_03연속짝수복권 {

	public static void main(String[] args) {
		/*
		[학습목표]
			랜덤을 활용해서 조건문을 학습한다.
		[문제]
		[연속짝수복권]
			100~900 사이의 랜덤숫자를 출력한다. 
			세자리의 숫자를 전부 한자리씩 분리한다.		
		[규칙]
			[1] 세자리모두 짝수이면 "1등"을 출력한다.
			[2] 두자리가 짝수이고, 짝수인숫자가 연속이면 "2등"을 출력한다. 
			[3] 그외는 "꽝"을 출력한다. 
			[4] 단, 0은 짝수이다.
		[예시]
			462 : 4,6,2 세자리 모두 짝수이므로 "1등"
			245 : 2,4,5 두자리가 짝수이고 2,4연속이므로 "2등"
			456 : 4,5,6 두자리가 짝수이지만 연속이 아니므로 "꽝"
			782 : 7,8,2 두자리가 짝수이고 8,2연속이므로 "2등" 	
	*/
		int luck;
		Random rd = new Random();
		luck = rd.nextInt(801)+100;
		int hun,ten,one;
		hun = (luck/100)%2; ten = (luck%100/10)%2; one =  (luck%100%10)%2;
		boolean triple = hun ==0 && ten == 0 && one == 0 ,
						Double = hun ==0 && ten ==0, Double2 = ten ==0 && one==0;
		if (triple) {
			System.out.println("1등입니다.");
		}else if (Double) {
			System.out.println("2등입니다.");
		}else if (Double2) {
			System.out.println("2등입니다.");
		}else {
			System.out.println("꽝");
		}
		
		
		
		
		
		
		
	}

}
