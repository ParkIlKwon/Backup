import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;


	//딴짓장인의 종합장.
	class Extreme_Array{
		
		int[] numbers = {1,2,3};
		int [] arr1 = {10,20,30,40};
		int sum;
		double avg=0;
		Scanner sc =new Scanner(System.in);
		
		Stream<Integer> isteaam = 
				Stream.iterate(10,n -> n+10).limit(5);
		Object[] istream = isteaam.toArray();
		//int arrays = Integer.parseInt(istream.toString());
		
		//Array - String
		void AString() {
			
			String []s = new String[2];
			String str = "아 야";
			str = str.replaceAll("아\s", "");
			System.out.println(str);
			for (int i = 0; i < s.length; i++) {
				s[i] = sc.next();
				System.out.println(str.compareTo(s[i]));
			}
			
			System.out.println(Arrays.toString(s));
			
			
		}
		
		//Array - Stream {sum , avg , n + 2}
		void Stream() {
			
			for(Object ar: istream) {
				System.out.print(ar);
			}
			
			System.err.println();
			
			Stream<Integer> iteratedStream = 
					Stream.iterate(30, n -> n + 2).limit(5); 
			
			iteratedStream.sorted().forEach(System.out::print);	//스트림에 있는 모든 요소 출력
			
			System.out.println();
			sum=Arrays.stream(numbers).sum();		//저장된 모든 어레이 요소 덧셈
			avg=Arrays.stream(numbers ).average().orElse(0);	//저장된 모든 어레이 요소 평균
		
			System.out.println(sum);
			System.out.println(avg);
			
		}
		//Array copy of   -
		void Copy() {
			
		int [] Copy1=  Arrays.copyOf(numbers, 3);
		for (int i : Copy1) {
			System.out.print(i+"  ");
		}
		
		}
		//Array Etc
		void etc() {
			Arrays.sort(arr1);
		}
		//Array Output
		void Output() {
			System.out.println(Arrays.toString(arr1));
			
		}
		
		
	}




public class A_array extends Extreme_Array{
	Extreme_Array exT = new Extreme_Array();

	//Output
	void outPut() {
		System.out.println(Arrays.toString(arr1));
	}

	public static void main(String[] args) {
		
				Extreme_Array EA = new Extreme_Array();
				A_array Ary = new A_array();
		
				EA.Stream();
				EA.Copy();
				EA.Output();
				EA.AString();
				
				
				System.out.println();
				
				
		
				
				
				
				
				
			}

		}