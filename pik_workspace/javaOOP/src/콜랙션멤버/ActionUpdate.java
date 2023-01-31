package 콜랙션멤버;

public class ActionUpdate implements Action{

	@Override
	public void excute() {
		MemberDAO dao = MemberDAO.getIntance();
		
		if (!dao.isExistinfo()) {
			System.err.println("저장된 회원정보가 없습니다.");
			return;
		}
		System.out.println("저장된 회원 정보 :");
		int numberofIndex = 1;
		for (Member m : dao.memberlist) {
			System.out.println(numberofIndex +" - " +  m);
		}
		
		System.out.println("[ 수정 ] 번호 입력:");
		int number = Util.getVal(1, dao.memberlist.size()) -1;
		System.out.println("수정할 항목을 선택 1번 - id 만 2번 pw 만 : ");
		int sel = Util.getVal(1, 2);
		if (sel == -2) {
			return;
		}
		
		if (sel == 1) {
			System.out.println("수정아이디 입력 ==> ");
			String id = Util.getString();
			String pw = dao.memberlist.get(number).getPw();
			if (id.equals("")) {
				return;
			}
			if(dao.checkId(id)) {
				System.out.println("중복아이디");
				return;
			}
			dao.memberlist.set(number,new Member(id, pw));
			
		} else {
			System.out.println("수정패스워드 입력 ==> ");
			String pw = Util.sc.next();
			String id = dao.memberlist.get(number).getId();
			if (pw.equals(dao.memberlist.get(number).getPw())) {
				System.err.println("이전 패스워드랑 같습니다.");
				return;
			}
			dao.memberlist.set(number,new Member(id, pw));
		}
		
	
		
		
		
	}
}
