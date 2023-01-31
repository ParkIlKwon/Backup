package 추상화;
// 클래스 AA BB CC는 느슨한 관계 

// 인터페이스 타입을 가져왔기때문에 다른 인터페이스 구현한 클래스 어떤거가 들어와도 상관이 없다 
interface I{
	void methodI();
}

class AA{
	public void methodA(I b) {
		b.methodI();
	}
}

class BB implements I{

	@Override
	public void methodI() {
		System.out.println("메서드 i 를 bb에서 구현 호출");
	}
	
}
class CC implements I{

	@Override
	public void methodI() {
		System.out.println("메서드 i 를 cc에서 구현 호출");
	}
}

public class 인터페이스사용후 {

	public static void main(String[] args) {
		
		AA test = new AA();
		test.methodA(new BB());
		test.methodA(new CC());
		
	}

}