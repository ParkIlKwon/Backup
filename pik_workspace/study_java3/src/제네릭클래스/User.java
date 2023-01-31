package 제네릭클래스;

public class User {

	   String name;
	   int age;
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "" + name + ":" + age + "\n";
	}
	   

}
