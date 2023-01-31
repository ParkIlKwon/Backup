package 콜랙션멤버;

public class ActionDelete implements Action {
	@Override
	public void excute() {
		MemberDAO dao = MemberDAO.getIntance();
		if (!dao.isExistinfo()) {
			System.err.println("저장된 회원정보가 없습니다.");
			return;
		}
		int numberofIndex = 1;
		for (Member m : dao.memberlist) {
			System.out.println(numberofIndex+" > " + m.getId());
			numberofIndex++;
		}
		System.out.println("[ 삭제 ] 아이디 입력:");
		String id = Util.getString();
		
		if(dao.checkId(id)) {
			dao.memberlist.remove(dao.getIndex(id));
			System.out.println("삭제 완료");
			return;
		}else {
			System.err.println("아이디 입력오류.");
		}
	}
}
