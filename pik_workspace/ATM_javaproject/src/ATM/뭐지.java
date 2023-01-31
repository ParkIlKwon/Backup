package ATM;

import java.util.Arrays;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


class User {
	String name;
	String id;
	String pw;
	
	public User(String name, String id, String pw) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
	
	void printUser(User u) {
		System.out.println(u);
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", pw=" + pw + "]";
	}
	
}

public class 뭐지 {

	public static void main(String[] args) {

		String fileName = "src/예외처리/test.txt";

		User yeonmi = new User("박연미", "test", "1234");
	//	System.out.println(yeonmi.getClass().getName());
	//	System.out.println(yeonmi.getClass().getSimpleName());
		System.out.println("===========");

		try {
			Class<?> myClass = Class.forName(yeonmi.getClass().getName()); // 클래스 메타정보 담는 객체 생성 
			for (Method method : myClass.getDeclaredMethods()) {
				System.out.println(method.getName());
			}
			System.out.println("===========");
			for (Field field : myClass.getDeclaredFields()) {
				System.out.println(field.getName());
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		String str = "1,2";
		str = str.replace(",", "");
		System.out.println(str);
		
		
		
	}
}
		

