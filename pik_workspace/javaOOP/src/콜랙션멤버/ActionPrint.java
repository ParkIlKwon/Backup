package 콜랙션멤버;

public class ActionPrint implements Action{

	@Override
	public void excute() {
		MemberDAO dao = MemberDAO.getIntance();
		if (!dao.isExistinfo()) {
			System.err.println("저장된 회원정보가 존재하지 않습니다.");
			return;
		}
		for (Member list : dao.memberlist) {
			System.out.println(list);
		}
	}

}
