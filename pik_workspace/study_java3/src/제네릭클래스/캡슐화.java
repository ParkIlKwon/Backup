package 제네릭클래스;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		setName(name);
		setAge(age);
	}
	
	void setName(String name) {
		int cnt=0;
		for(int i =0; i <name.length();i++) {
			if(name.charAt(i) >='0' &&name.charAt(i) <='9' ) {
				cnt++;
			}
		}
		if(cnt >0) {
			System.out.println("이름에는 숫자값이 들어오면 안됩니다 ");
			return;
		}
		this.name = name;
		
	}
	
	void setAge(int age) {
		if(age <0 || age >=100) {
			System.out.println("나이 오류 ");
			return;
		}
		this.age = age;
	}
	
	int getAge() {
		return age;
	}

	void PrintName() {
		System.out.println(name);
	}
	void printAge() {
		System.out.println(age);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class 캡슐화 {

	public static void main(String[] args) {

		// 접근제어자 : 접근을 제어 .(~안에 들어간다 )
		// public : 프로젝트 단위 
		// private : 클래스 범위 : 같은 클래스 안에서만 사용할 수 있다 
		// protected: 부모클래스 - 자식클래스 범위 
		// default : 패키지 단위 
		
		Person jamse = new Person("제임스" , 44);
		//System.out.println(jamse.name);
		jamse.PrintName();
		//jamse.name="톰"; // . 접근 직접 접근 : private 하면 직접적 접근 막는다 
		
		
		System.out.println(jamse.getAge());
		
	}

}
