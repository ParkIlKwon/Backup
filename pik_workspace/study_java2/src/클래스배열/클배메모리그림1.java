package 클래스배열;

			class AA{
				int a;
				int b;
			}
public class 클배메모리그림1 {

	public static void main(String[] args) {


				AA aa = new AA();
				aa.a = 10;
				aa = new AA();
				aa.b = 20;
				
				// 실행전 예상하기
				System.out.println(aa.a + " ," + aa.b);
				


	}

}
