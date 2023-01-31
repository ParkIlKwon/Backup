package 클래스배열메서드;
//가변배열로 만들기 

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Stream;

class User {
	String id;
	String pw;
	int money;
	
	void printInfo() {
		System.out.printf("%s \t %s \t %d \t \n",id,pw,money);
	}

	public User(String id, String pw, int money) {
		super();
		this.id = id;
		this.pw = pw;
		this.money = money;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", money=" + money + "]\n";
	}
	
	
}

class UserController{
	static int log = -1;
	UserDAO dao;
	
	void init() {
		dao = new UserDAO();
		dao.init();
	}
	
	void run(){
		
		while (true) {
			printMenu(log);
			int sel = getValue("[메뉴입력]", 0 , 4);
			
			if (sel == 1) {
				dao.adduserlist();
			}
		}
	}
	
	int getValue(String msg,int n , int m) {
		Scanner sc = null;
		int num;
	    while (true) {
	    	sc = new Scanner(System.in);
	    	try {
	    		System.out.println(msg);
	    		num = sc.nextInt();
	    		
	    		if (num < n || num > m) {
					throw new Exception("입력오류 :( ");
				}
	    		
	    	} catch (InputMismatchException e) {
	    		System.err.println("문자열은 입력될수 없습니다.");
	    		continue;
			} catch (Exception e) {
	    		System.err.println(e.getMessage());
	    		continue;
	    	}
	    	return num;
		}
	}
	
	
	
	void printMenu(int numberOfCase) {
		
		if (UserDAO.list.size() == 0) {
			System.out.println("[0]종료 [1]회원가입 ");
		}else if (numberOfCase == -1) {
			System.out.println("[0]종료 [1]회원가입 [2]로그인 ");
		}else {
			System.out.println("[0]종료 [1]탈퇴 [2]로그아웃 [3]전체회원목록");
		}
	}
	
//	enum Gender{7
//		male,female;	??
//	}
	
}

class UserDAO{
	static ArrayList<User>list ;
	
	void init(){
		list = new ArrayList<User>();
	}
	
	void adduserlist(){
		User user = new User(getString("아이디 입력."), getString("비밀번호 입력."),
				getval("초기돈입력"));
		list.add(user);
		System.out.println(list);
	}
	
	int getval(String msg) {
		Scanner sc;
		System.out.println(msg);
		while (true) {
			sc = new Scanner(System.in);
			int num = 0;
			try {
				num = sc.nextInt();
				
			} catch (InputMismatchException e) {
				System.err.println("문자열은 입력될 수 없습니다.");
			} 
			return num;
		}
	}
	
	String getString(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		return sc.next(); 
	}
	
	
}


public class 클래스배열회원관리 {

	public static void main(String[] args) {
		
		UserController ctrl = new UserController();
		ctrl.init();
		ctrl.run();
		
		

	}

}
