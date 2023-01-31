package 연습용;

public class _main {

	public static void main(String[] args) {

		Controller ctrl = Controller.getinstance();
		
		while (true) {
			System.out.println("[1]추가");
			System.out.println("[2]출력");
			int sel = Util.sc.nextInt();
			if (sel == 1) {
				ctrl.getAction("insert");
			}else if (sel == 2) {
				ctrl.getAction("Print");
				
			}
		}
	}
}
