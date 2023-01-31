package 이동연습;

public interface Classes {
	abstract void print();
		
	
}

class cl_a implements Classes{

	@Override
	public void print() {
		System.out.println("A 클래스 입니다.");
		System.out.println("앞으로가기 2 , 뒤로가기 1?");
	}
	
}

class cl_b implements Classes{

	@Override
	public void print() {
		System.out.println("B 클래스 입니다.");
		System.out.println("뒤로가기 1?");
	}
	
}