import java.util.Arrays;

	class ex{
		
		void f1(int arr[]) {
			arr[0] = 1;
		}
		
		int []f2(int arr[]) {
			arr[1] = 1;
			return arr;
		}
		
		
		
	}
	


public class 연습용종합장_보조 {

	public static void main(String[] args) {
		int arr[] = new int [5];
		ex e = new ex() ;
		e.f1(arr);
		System.out.println(Arrays.toString(arr));
		e.f2(arr);
		System.out.println(Arrays.toString(arr));
		
		
	
	}
}