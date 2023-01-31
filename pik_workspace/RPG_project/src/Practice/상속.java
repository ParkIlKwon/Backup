package Practice;

abstract class funcktionA{
	int a ;
	int b;
	
	abstract void a();
}

interface interA{
	
	abstract void someA();		
	
}

abstract class middle implements interA{
	
	@Override
	public void someA() {
		System.out.println("인터A 접근");
	}
	
}


class funcktionB extends funcktionA implements interA{
	int a = 20;
	int b;
	public funcktionB() {
		super();
	}
	
	@Override
	void a() {
		// TODO Auto-generated method stub
		
	}
	
	void Able() {
		System.out.println(a);
		System.out.println(++this.a );
		System.out.println(++super.a);
		
	}

	@Override
	public void someA() {
		System.out.println("인터A 접근");
	}
}

class funcktionC extends middle{
      //someA();
	
	
}


public class 상속 {
	public static void main(String[] args) {
		funcktionB run = new funcktionB();
		run.Able();
		
	}
}
