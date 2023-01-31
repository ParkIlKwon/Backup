package Level2;

import java.util.Random;
import java.util.Scanner;


public class 반복문2 {

	public static void main(String[] args) {
		/*
		 * 철수는 산전수전 끝에 50층 빌딩의 건물주가 되었다. 
		 * 철수는 빌딩의 엘리베이터에서 숫자4를 전부 제거 했다. 
		 * 만약에 실제로 4층을 간다면 숫자 5를 눌러야한다. 
		 * 철수의 빌딩은 지상1층에서 지상50층이고 , 실제 엘리베이터에 적혀있는 숫자를 1층부터 순서대로 출력하시오. 
		 * [예]
		 * 		1 2 3 5 6 7 8 9 10 11 12 13 15 .... 66
		 * 
		 */
		System.out.println("===문제1===");
		int cnt = 0;
		
		for(int i = 1 ; cnt <= 51 ; i++) {
		
			if(i%10 == 4) {
				
				cnt--;
				continue;
			}
		
			System.out.print(i+" ");
			cnt++;
			
		}
		//5분
		
		System.out.println();
		System.out.println("===문제2===");
		
		/*
		 * 	철수는 50층 빌딩의 소유주이다.
		 *  청소를 위해 청소직원 3명을 고용했다. 
		 *  청소는 한사람당 두개층씩 청소하기로 햇다. 
		 *  예를들어 직원1이 [1층 2층] 청소하면, 직원2는 [3층 4층] , 직원3은 [5층 6층]을 청소한다.
		 *  다시 직원1은 [7층 8층], 직원2는 [9층 10층], 직원3은 [11층 12층]을 청소한다. 
		 *  이런식으로 50층을 전부 청소한다. 
		 * 	전부 청소햇을때, 직원2의 청소한 층을 전부 출력하시오.
		 *  [정답]
		 *  	3,4,9,10,15,16.....
		 */
		int idx = 1;
		for(int i = 1 ; i <=50 ; i++) {
			i += 2;
			System.out.print(i+" ");
			System.out.print(i+1);
			System.out.print("        ");
			i += 3;
		}
		
		//5분
		
		System.out.println();
		System.out.println("===문제3===");
		
		/*
		철수는 요즘 주식에 관심을 보이기 시작했다. 
		주식의 상승곡선이 궁금하기 시작했다. 
		최근 관심있는 게임주식을 살펴보기로 했다.
		꾸준히 상승하는 기간중 가장 긴 기간을 출력해보자. 
	 	[1] 랜덤으로 1~8까지 숫자 10개를 순차적으로 출력한다. 
	  	[2] 랜덤숫자는 주가 수치를 뜻하고  숫자가크면 상승 낮으면 하락이다. 
	  	[예시] 아래와같이 랜덤숫자가 나왔다고하면
	  		4 8 3 2 6 7 4 5 6 1
	  		
	  		(1) 처음 4 - 8 은 상승이고 8 다음은 3 이기때문에 최대 상승기간은 1이다.
	  		(2) 다시 2 - 6 - 7 은 상승이고 7다음은 4이기 때문에 최대상승기간은 2이다. 
	  		(3) 4 - 5 - 6 은 상승이고  6 다음 1이기때문에 최대상승기간은 2이다. 
	  		(4) 같은 수치가 연속이면 상승으로 치지않는다.    
	  	[정답]
	  		2일
	 */
		Random rd = new Random();
		 cnt = 0;
		int a=0;
		int temp = 0;
		int max = 0;
		for(int i = 0 ; i < 10 ; i++) {
			
			temp = a;
			System.out.print(a = rd.nextInt(8)+1);
			
			if(temp < a &&temp!=0 && temp != a) {
				
				cnt++;
				
			}else {
				cnt = 0;
			}
	
			if(max < cnt) {
				max = cnt;
			}
			
			
			System.out.print("  ");
			
			
			}
			
		System.out.println(">>>>>>>>>"+ max);	
		
		System.out.println();
		System.out.println("===문제4===");
		
		
		/*
		 * 랜덤으로 count변수에  4~8사이의 숫자를 저장한다. 
		 * count 변수의 숫자는 문제만들기의 숫자개수이다. 
		 * count 변수의 숫자만큼 더하기 문제를 만들면된다. 
		 * 단, 더하기 문제를 만들때숫자느 1~9사이의 랜덤숫자이며, 전부 짝수여야한다. 
		 * [출력] 뒤의 내용과 똑같이 만들면된다. 단, 숫자는 랜덤이므로 변경될수있다. 
		 	
		 	[예시]
					랜덤으로 4~8사이의 숫자를 입력하세요.
					5
					[출력] 4 + 6 + 4 + 2 + 8 = 
		 */
		System.out.print("랜덤으로 4~8사이 숫자를 입력하세요.   ");
		int count = rd.nextInt(5)+4;
		System.out.println(count);
		for(int i = 0 ; i < count ; i++) {
			int num = rd.nextInt(9)+1;
			if(num %2 != 0 ) {
				i--;
				continue;
			}
			if(i == count-1)
			{System.out.print(num + " = ");
			break;}
			System.out.print(num+" + ");
			
			
		}
		
		//15분
		

		System.out.println();
		System.out.println("===문제5===");
		
		/*
		 * 랜덤으로 1~5 를 입력받고, 
		 * 랜덤숫자의 개수 만큼 숫자를 더하는 문제를 만들어 출력하시오..
		 * 단 더하기할 숫자들은 1~9사이의 랜덤숫자여야한다. 
		 * 아래 [출력] 뒤에 나오는 모양과 똑같은 모양으로 출력한다. 
		 * (단, 숫자는 랜덤이므로 숫자는 다르게 나올수있다,)
		 * 
		 * [예시1]
		 * 		랜덤숫자 1~5를 입력하시오.
		 * 		3
		 * 		[출력] 5 + 3 + 2 = 
		 * 
		 * [예시2]
		 * 		랜덤숫자 1~5를 입력하시오.
		 * 		5
		 * 		[출력] 6 + 5 + 2 + 7 + 8 = 
		 */
		
		System.out.println("랜덤숫자 1~5를 입력하시오.");
		int ran = rd.nextInt(5)+1;
		System.out.println("입력: "+ ran);
		
		for(int i = 0 ; i < ran ; i++) {
			int num = rd.nextInt(9)+1;
			
			if(i == ran-1)
			{System.out.print(num + " = ");
			break;}
			System.out.print(num+" + ");
			
			
		}
		
		//5분 
		

		System.out.println();
		System.out.println("===문제6===");
		
		/*
		철수는 무인도를 사들여 국왕이 되었다.
		철수는 평소 월요일을 싫어해서 주7일을 주6일로 바꾸고 월요일을 삭제했다.
		5월1일이 일요일일하고할때, 
		5월1일부터 5월31일까지 날짜와 요일을 전부 출력해보자.
		
		 
		 [예시]
		 	1 => 일
		 	2 => 화
		 	3 => 수
		 	4 => 목
		 	5 => 금
		 	6 => 토
		 	7 => 일
		 	8 => 화
		 	.......
	 */
		
		for(int i = 1 ; i <=31 ; i++) {
			System.out.print(i);
			if(i %6 == 1) {
				System.out.print("일");
			}else if(i %6 == 2) {
				System.out.print("화");
			}else if(i %6 == 3) {
				System.out.print("수");
			}else if(i %6 == 4) {
				System.out.print("목");
			}else if(i %6 == 5) {
				System.out.print("금");
			}else {
				System.out.print("토");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("===문제7===");
		
		/*
		 * 철수는 30개짜리 계단의 최상단에 서있다. 
		 * 제일아래까지 내려가려고 한다. 
		 * 철수가 내려갈때 왼쪽발로 밟은 계단을 출력하시오. 
		 * 아래조건들을 참고하시오.
		 * [조건]
		 * [1] 철수는 무조건 한계단씩 내려간다. 
		 * [2] 철수는 첫발은 왼쪽다리부터 계단을 내려간다. 
		 * [3] 출력을 다섯번할때 마다 반대편다리로 바꿔서 출력하시오.
		 * 
		 * [예시]
		 * 	29 27 25 23 21 
		 *  20 18 16 14 12 
		 *  11 9  7  5  3
		 *  2			 
		 */
		cnt = 0;
		int log = -1;
		for(int i =30 ; i >0 ; i-- ) {
			
			if(i%2!=0 && log == -1) {
				System.out.print(i+" ");
				cnt ++;
				if(cnt==5) {
					
					log =1;
					System.out.println();
					
					
				}
			}
			
			if(i%2==0 && log == 1) {
				System.out.print(i+" ");
				cnt --;
				if(cnt==0) {
					
					log =-1;
					System.out.println();
					
				}
				
			}
		}
		
		System.out.println();
		System.out.println("===문제8===");
		
		/* 
		[문제]
		[반복가위바위보]	 	
			철수와 민수는 계단에서 가위바위보를 한다. 	 	
			철수와 민수는 각각 0 ~ 2 의 랜덤값을 저장한다.
			0 : 가위 , 1 : 바위 , 2 : 보를 뜻한다.	 
			철수와 민수는 50번째 계단의 위치에서 시작을 한다.
			룰은 다음과 같다.	
			이기면 3칸올라가기, 비기면 2칸올라가기, 지면 1칸올라가기.	 	
			둘중 아무나 100이상 도착하거나 둘사이의 간격이 10이상이면 게임은 종료된다. 
			게임이 종료될때까지 두사람의 이동경로를 출력하시오.
	*/
		int chulCnt = 50;
		int minCnt = 50;
		
		while(true) {
			
		int chul = rd.nextInt(3);
		
		int min = rd.nextInt(3);
		
		System.out.println(chulCnt+" "+minCnt);
		
		boolean draw = chul == min , win = (chul == 0 &&min == 2)||(chul == 1 &&min == 0)||(chul == 2 &&min == 1);
		if(draw) {
			chulCnt ++;
			minCnt ++;
			
		}else if (win) {
			chulCnt+=3;
			minCnt--;
			
		}else {
			chulCnt--;
			minCnt +=3;
		}
		
		if(chulCnt>=100||minCnt>=100||Math.abs(chulCnt-minCnt)>=10) {
			break;
		}
			
		
		}
		
		/*
		[오징어게임]
			철수는 오징어게임에 참가하였다.
			첫번째 게임은 "무궁화꽃이 피었습니다" 이다.
			규칙은 아래와같다.	
		[규칙]	
			[1] 전체 거리는 0 ~ 25까지 거리가 있다.
			[2] 철수는 현재 0의 자리에 있다.
			[3] 철수는 매턴 1 ~ 4의 랜덤숫자를뽑는다. 숫자만큼 이동한다. 
			[4]	이동거리를 누적하며, 합이 25이상이되면 승리이며 종료한다.
			[5] 인형은 매턴 3 ~ 5의 랜덤숫자를뽑는다. 
			[6] 인형보다 큰 숫자가나오면 움직인것으로 간주되어 패배하며 종료한다.
			[7] 10턴안에 도착못하면 시간초과로 패배하며 종료한다.
			[8] 철수의 이동경로를 전부 출력하시오.
	 */
		System.out.println();
		System.out.println("===문제9===");
		
		int cntChul = 0;
		 log = -1;
		
		for(int i = 0 ; cntChul <= 25 ; i++) {
			
			int chul = rd.nextInt(4)+1;
			cntChul += chul;
			int doll = rd.nextInt(3)+3;
			System.out.println("철수: "+chul+"인형: "+doll);
			if(doll < chul ||i == 9) {
				log = 1;
				break;
				
			}
			System.out.println(cntChul);
			
		}
		
	if(log == -1) {
		System.out.println("승리하였습니다.");
	}else  {
		System.out.println("패배하였습니다.");
	}
		
		//10분
		
	
	System.out.println();
	System.out.println("===문제10===");
	
	
	/* 
	[철수의마블]
		철수는 마블게임을 하고있다. 	
		0~20까지의 지점이 있고 철수는 0의 위치에 있다. 
		20이 넘어가면 게임종료이다. 
		주사위는 1~6사이의 숫자가 나온다.	
		3의 배수의 자리는 함정이다.(3,6,9,12,15,18) 
		함정에서는 한번더 주사위를 던지고 4이상의 숫자가 나오면 함정탈출이되며 한칸 앞으로 전진한다.
		함정에 실패하면 뒤로 한칸 물러나게된다. 	
		철수가 게임을 끝날때까지 철수의 이동경로를 전부 출력하시오. 	
*/	
	
	cntChul  = 0;
	for(int i = 0 ; cntChul < 20 ; i++) {
		int dice = rd.nextInt(6)+1;
		System.out.println("주사위에서 나온수: "+ dice);
		cntChul+=dice;
		
		if(cntChul%3==0) {
			System.out.println("함정발동");
			dice = rd.nextInt(6)+1;
				if(dice >= 4) {
					System.out.println(" 탈출");
					cntChul ++;
					continue;
				}
				System.out.println("탈출실패");
				cntChul--;
		}
		
		System.out.println("현재 포지션 "+cntChul);
		
		if(cntChul > 20) {
			break;
		}
		
	}
	//9분
	
	/*
	[최대값 구하기]
		[1] 반복문안에서 계속해서 값을 입력받는다.
		[2] 입력받은숫자중 가장큰숫자를 출력한다.
		[3] -1000 을 입력하면 종료한다.
	[예시]
		입력 : 6,  출력 : 6
		입력 : 10, 출력 : 10
		입력 : 3,  출력 : 10
		입력 : 7,  출력 : 7
*/
	
	System.out.println();
	System.out.println("===문제11===");
	System.out.println("최대값구하기: ");
	Scanner sc =new Scanner(System.in);
	int input=0;
	 max = input;
	
	while(input != -1000) {
		input = sc.nextInt();
		
		if(max < input) {
			max = input;
			System.out.println(max);
		}
		
		
	}
	
	//5분
	System.out.println();
	System.out.println("===문제12===");
	
	/*
	[ATM로그인실패]
		[1] [1.로그인]  이후 새로운매뉴 출력 : [1.잔액확인] [2.로그아웃]
		[2] 로그인을 3번실패시 강제종료 시키시오. 		
*/
	
	 cnt = 0;
	int dbId = 1111;
	int id = 0;
	log = -1; 
	
	while(cnt!=3) {
		int sel = 0;
		if(log == -1) {
		System.out.println(" [1.로그인] ");
		System.out.println(" 아이디를 입력하여주세요. ");
		 id = sc.nextInt();
		
		}else {
		System.out.println("[1.잔액확인]  [2.로그아웃]");
		sel = sc.nextInt();
		}
		
		if(sel == 1) {
			System.out.println("잔액확인 : ");
			
		}else if(sel ==2){
			System.out.println("로그아웃 됐습니다.");
			log = -1;
			id = 0;
			continue;
		}
		
		if(id == dbId) {
			log =1;
			continue;
		}else {
			System.out.println("로그인실패");
			cnt++;
			
		}
		
	}
	
		//16분
		
		}
		
		
	}


