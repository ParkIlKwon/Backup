package 멤버pakage;

import java.util.Scanner;

public class MemberController {

	Scanner sc;
	MemberDAO memberDAO;
	
	void init() {
		sc = new Scanner(System.in);
		memberDAO = new MemberDAO();
		memberDAO.init(100);
	}
	
	void run() {
		while(true) {
			System.out.println("[1]추가 [2]삭제 [3]수정 [4]출력  [0]종료");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				memberDAO.join();
			}else if(sel == 2) {
				memberDAO.delete();
			}else if(sel == 3) {
				memberDAO.update();
			}else if(sel == 4) {
				memberDAO.printAll();
			}else if(sel == 0) {
				System.out.println("[종료]");
				break;
			}
		}
	}

}