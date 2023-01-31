package day09;

import java.util.Arrays;
import java.util.Scanner;

public class F_02회원가입 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] ids = {1001, 1002, 1002, 1004, 5555};
		int[] pws  = {1111, 2222, 3333, 4444, 5555};
	
		int id,pass;		//	아이디 패스워드 입력시 쓰일 변수
		int cnt = 5;		//배열에 저장된 인덱스 수
		boolean run = true;
		while(run) {
			System.out.println("저장되어있는 아이디와 비밀번호 정보");
			System.out.println(Arrays.toString(ids));
			System.out.println(Arrays.toString(pws));
			
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			System.out.println("3.시스템 종료");
			System.out.println("4.중복 탈퇴");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			if(sel<1||sel>4) {
				System.err.println("메뉴선택오류");
				continue;
			}
			
			if(sel == 1) {
				if(cnt >= 5) {
					System.err.println("인덱스 용량초과 !!! ");		//배열에 5개가 담겨져 있을시 용량초과.
					continue;
				}
				int log = -1;	//아이디 중복시 sel1 조건문 탈출시 쓰일 변수
				System.out.print("가입 할 아이디를 입력하시오.");
				id = scan.nextInt();
				for(int i = 0 ; i < ids.length ; i++) {
					if(id == ids[i]) {
						System.err.println("아이디가 중복됩니다. 다시 입력하여 주세요.");
						log = 1;		break;				
					}
					
				}
				if(log != -1) {continue;}
				
				System.out.println("가입 할 비밀번호를 입력하시오.");
				pass = scan.nextInt();
				
					System.out.println("아이디 & 비밀번호 입력 가입완료");
				ids[cnt] = id;
				pws[cnt] = pass;
				cnt ++;
				
			}
			else if(sel == 2) {
				int val=-1;		// 삭제할 아이디 입력할때 인덱스 위치 찾을때 쓰일 변수
				if(cnt == 0) {
					System.err.println("삭제할 아이디가 없습니다.");
					continue;
				}
				System.out.println("삭제할 아이디를 입력해주세요 !");
				id = scan.nextInt();
				
				for(int i = 0 ; i < cnt ; i++) {
				if(id == ids[i])	{
					val = i ;
				}
				}
				if(val == -1) {			//아이디를 못 찾았을시 초기val 값에의해 걸러짐.
					System.err.println("삭제할 아이디를 잘못입력하였습니다.");
					continue;
				}
				int index = 0;
				ids[val] = 0;
				pws[val] = 0;			//각 해당되는 아이디와 비밀번호 삭제
				
				for(int i = 0 ; i<cnt ; i++) {	//삭제후 각각 인덱스 왼쪽으로 땡기는 작업
				
				if(val != i) {
					ids[index] = ids[i]; 
					pws[index] = pws[i];	
					
					index ++;		
					
				}
				
				}
			
			cnt --;	
			ids[cnt] = 0;
			pws[cnt] = 0;
			}
			else if(sel == 3) {
				
				break;
			}
			
		}
	}

}











