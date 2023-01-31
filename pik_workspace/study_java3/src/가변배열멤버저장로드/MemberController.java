package 가변배열멤버저장로드;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MemberController {
	MemberDAO memberDAO;
	
	MemberController(){
		memberDAO = new MemberDAO();
	}
	int getValue(String msg , int start , int end) {
		   // 예외처리 적용해보세요 
		int val;
		while (true) {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println(msg +" >> ");
				 val = sc.nextInt();
				 if (val < start || val > end) {
					 throw new Exception("값 입력오류.");
				}
			} catch (InputMismatchException e) {
				System.err.println("문자열은 입력될수 없습니다.");
				continue;
			} catch (Exception e) {
				System.err.println(e.getMessage()); 
				continue;
			}
			return val;
		}
	 }
	
	void mainMenu() {
		while (true) {
			System.out.println("[1]추가");
			System.out.println("[2]삭제");
			System.out.println("[3]전체출력");
			System.out.println("[4]파일저장");
			System.out.println("[5]파일로드");
			System.out.println("[6]수정");
			System.out.println("[0]종료");
			
			int sel = getValue("메뉴입력 ", 0 ,6);
			
			if (sel == 0) {
				break;
			} else if (sel == 1) {
				memberDAO.join();
			} else if (sel == 2) {
				memberDAO.remove();
			} else if (sel == 3) {
				memberDAO.printMember();
			} else if (sel == 4) {
				memberDAO.loadData();
			} else if (sel == 5) {
				memberDAO.readData();
			} else if( sel == 6) {
				memberDAO.modify();
			}
		}
	}
	
}