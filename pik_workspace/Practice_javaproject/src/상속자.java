import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//interface animal {public abstract void cry();}
//
//class dog{
//	
//	
//}
//
//class cat{
//	
//	
//}


interface vehicle{
	
//	void status(boolean checkstat) {
//		System.out.println(checkstat ? "정상" : "고장");
//	}
	
	abstract void move();
	abstract void des();
}

interface thing{
	
	abstract void width();
	abstract void height() ;
	
}


class train implements vehicle,thing{

	@Override
	public void width() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void height() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void des() {
		// TODO Auto-generated method stub
		
	}
	

	
}




public class 상속자 {

	public static void main(String[] args) {
		
		train t = new train();
		String[] arr = new String[]{"넷", "둘", "셋", "하나"};

		 

		// 배열에서 스트림 생성

		Stream<String> stream1 = Arrays.stream(arr);

		stream1.forEach(e -> System.out.print(e + " "));

		Stream<String> stream2 = Arrays.stream(arr, 1, 3);

		stream2.forEach(e -> System.out.print(e + " "));

		System.out.println();
		
		
		
		
		

	}

}
