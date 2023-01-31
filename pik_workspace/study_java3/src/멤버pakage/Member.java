package 멤버pakage;
public class Member {
	String id;
	String pw;
	String name;
	
	void printMember() {
		System.out.println(id + " : " + pw + " : " + name);
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	
}
