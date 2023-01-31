package 문자열ex;

import java.util.Arrays;
import java.util.Scanner;

public class 장바구니삭제추가 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] idList = {"qwer", "javaking", "abcd"};
		String[] pwList = {"1111",     "2222", "3333"};
		
		int MAX_SIZE = 100;
		String[][] cartList = new String[MAX_SIZE][2];
		
		String[] items = {"사과", "바나나", "딸기"};
		
		int log = -1;
		int count = 0;
		int tcnt = 0;
		while(true) {
			
			if(log == -1) {
			System.out.println("[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[0]종     료");
			}else {
				
				for (int i = 0; i < tcnt; i++) {
					if (cartList[i][0].equals(idList[log])) {
						System.out.println(Arrays.toString(cartList[i]));
					}
				}
				
				System.out.printf("로그인 정보 [%s] 님",idList[log]);
				System.out.println("[MEGA MART]");
				System.out.println("[1]로그아웃");
				System.out.println("[2]쇼     핑");
				System.out.println("[3]장바구니");
				System.out.println("[4]삭     제");
				System.out.println("[0]종     료");
			}
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			if (sel <0 || sel >4) {
				System.err.println("메뉴선택에러");
				continue;
			}
			if(sel == 0 ) {
				System.out.println("프로그램 종료");
				break;
			}
			if(sel == 1 && log == -1) {
				System.out.println("로그인 아이디를 입력하세요");
				String id = sc.next();
				for (int i = 0; i < idList.length; i++) {
					if (id.equals(idList[i])) {
						log = i;
					}
				}
				if(log == -1) {System.err.println("아이디를 잘못 입력하였습니다.");continue;}
				System.out.println("로그인 패스워드를 입력하세요");
				String pw = sc.next();
				if(pw.equals(pwList[log])) {
					System.out.println("로그인 완료");
				}else {
					System.err.println("패스워드 에러.");
					log = -1;
				}
				
				
				
			}
			else if(sel == 1 && log != -1) {
				log = -1;
			}
			else if(sel == 2 && log != -1) {
				while (true) {
					System.out.println("쇼핑할 품목을 선택해주세요 ^^ :");
					System.out.println("(1)사과 (2)바나나 (3)딸기(0)종료");
					sel = sc.nextInt();
					if (sel>3 || sel < 0) {
						continue;
					}
					if (sel == 0) {
						break;
					}
					cartList[tcnt][0] = idList[log];
					cartList[tcnt][1] = items[sel-1];
					System.out.printf("%s를 1개 넣었습니다 ~~ \n" , items[sel-1]);
					
					tcnt++;
				}
				
				
			}
			else if(sel == 3 && log != -1) {
				count = 0;
				int icnt [] = new int [items.length];
				for (int i = 0; i < tcnt; i++) {
					if (cartList[i][0].equals(idList[log])) {
						for (int j = 0; j < icnt.length; j++) {
							if (cartList[i][1].equals(items[j])) {
								icnt[j]++;
							}
							
						}
						count++;
					}
					
					
				}
				
				if (count == 0) {
					System.err.println("장바구니가 비었습니다 :D");
					continue;
				}
				
				System.out.printf("%s 님 장바구니 [ %d ] 개\n" , idList[log],count);
				for (int i = 0; i < icnt.length; i++) {
					if (icnt[i] !=0) {
						System.out.printf("[%s][%d개]",items[i],icnt[i]);
					}
					System.out.println();
				}
				
			}else if (sel == 4 && log != -1) {
				if (tcnt == 0) {
					System.err.println("삭제할 품목이 존재하지 않습니다 :(");
					continue;
				}
				System.out.println("[1]품목삭제 [2]전체삭제");
				sel = sc.nextInt();
				count = 0;
				
				if (sel == 2) {
					for (int i = 0; i < tcnt; i++) {
						if (cartList[i][0].equals(idList[log])) {
							cartList[i] = cartList[i+1];
							count++;
						}
					}
				}else if (sel == 1) {
					System.out.println("삭제할 상품을 입력하세요.");
					String item = sc.next();
					int idx = 0,k=0;
					
					for (int i = 0; i < tcnt; i++) {
						if (cartList[i][1].equals(item) &&cartList[i][0].equals(idList[log]) ) {
							count++;
						}
						
					}
					if (count == 0) {
						System.err.println("없는 상품이거나 구매하지 않은 상품입니다... :D");
						continue;
					}
					System.out.printf("[%s / %d]몇개 삭제하시겠나요:?",item,count);
					sel = sc.nextInt();
					if (sel > count) {
						System.err.println("그렇게는 삭제할수 없습니다...:o");
						continue;
					}
					
				for (int i = 0; i < sel; i++) {
					idx = 0;
					for (int j = 0; j < cartList.length; j++) {
						if (cartList[i][1].equals(item) &&cartList[i][0].equals(idList[log])) {
							k=j;
							break;
						}
					}
					for (int j2 = 0; j2 < items.length; j2++) {
						if (k != j2) {
							cartList[idx]=cartList[j2]; 
							idx++;
						}
					}
				}	
				
					
				}
				tcnt -=count;
				
				
			}
			else {
				System.err.println("잘못된 접근에러.");
			}
			}

	}

}
