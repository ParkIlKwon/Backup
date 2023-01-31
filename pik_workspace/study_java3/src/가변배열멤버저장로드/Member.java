package 가변배열멤버저장로드;

public class Member {

	String id;
	int num;
	
	public Member(String id, int num) {
		super();
		this.id = id;
		this.num = num;
	}
	
	
	@Override
	public String toString() {
		return "num : " + num + ", id : " + id;
	}

	
}