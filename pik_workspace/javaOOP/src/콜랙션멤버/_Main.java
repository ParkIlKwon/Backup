package 콜랙션멤버;


public class _Main {

	public static void main(String[] args) {
   
	Controller con = Controller.getInstance();
	
	while(true) {
		System.out.println("=====메뉴======");
		System.out.println("1) 추가");
		System.out.println("2) 삭제");
		System.out.println("3) 수정");
		System.out.println("4) 출력");
		System.out.println("0) 종료");
		int sel = Util.sc.nextInt();
		if(sel == 1) {
			con.getAction("insert").excute();
		}else if (sel == 2) {
			con.getAction("delete").excute();
		}else if (sel == 3) {
			con.getAction("Update").excute();
		}else if (sel == 4) {
			con.getAction("Print").excute();
		}else {
			System.out.println("종료");
			break;
		}
	}
  }
}
