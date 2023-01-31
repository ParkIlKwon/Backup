package 클래스;
import java.util.Arrays;
import java.util.Scanner;

/*
 * # 영화관 좌석예매 : 클래스 + 변수
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */
		
		class Movie{
			String name = "MEGA MOVIE";
			int[] seat = new int[7];
			int money = 0;
		}

public class 클래스02_좌석예매 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Movie m = new Movie();
		
		while(true) {
			
			System.out.println("["+m.name+"]");
			System.out.println("[1]좌석예매");
			System.out.println("[2]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				boolean chk = false;
				System.out.println("좌석예매 현황");
				System.out.println(Arrays.toString(m.seat));
				System.out.println("예매할 좌석번호를 입력하시오 왼쪽부터 1.");
				int nsel = sc.nextInt()-1;
				if (nsel < 0 || nsel > 6) {
					System.err.println("입력오류");
					continue;
				}
					if (m.seat[nsel] == 1) {
						System.out.println("이미 예약된 좌석 . ");chk = true;
					}
					
				if (chk) {
					continue;
				}else {
					m.seat[nsel] ++;
				}
				
				m.money+=12000;
			}
			if(sel == 2) {	
				System.out.println("매출액:"+m.money);
			break;}
			
			}
		}

		

	}
