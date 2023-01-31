package day07;

public class ex {

	public static void main(String[] args) {
	    // 변수 => 변할 수 있는 수 : 재할당 가능 
			// 변수 선언한 자료형의 값 1개가 들어간다 
			// 10   10.2   '1'   "10"
			// int  double char  String
			int num = 10;
			num = 20; // 기존 있는 값이 사라지고 20을 저장한다 
			// 배열(Array)
			// 같은 자료형을 여러개 저장할 수 있는 것 
			// 2진수 => 0 1 
			// 8진수 => 0 1 2 3 4 5 6 7 
			// 10진수 => 0 1 2 3 4 5 6 7 8 9 
			// 16진수 =>  0 1 2 3 4 5 6 7 8 9 a b c d e f
			/*
			    사용법 
			    int[] arr = new int[방갯수];
			    int arr[] = new int[방갯수];
			 */
			// null = 비어있는 주소값 
			int[] arr = null; // arr 배열 변수 생성  
			arr = new int[3]; // heap 메모리방에 int 방 3개 생성
			                  // 을 하고 그 주소값을 arr에 저장 
			System.out.println(arr); // 주소값 
			
			// 방번호 index ==> 무조건 0부터 시작 마지막 방번호 갯수 - 1
			System.out.println(arr[0]); // arr 주소로 가서 0번째 있는 값을 가져와
			System.out.println(arr[1]); // arr 주소로 가서 1번째 있는 값을 가져와
			System.out.println(arr[2]); // arr 주소로 가서 2번째 있는 값을 가져와
			
			//System.out.println(arr[3]); 3번째 방번호가 없다 
			// ArrayIndexOutOfBoundsException 
			
//			arr[0] = 10;
//			arr[1] = 20;
//			arr[2] = 30;
//			
//			arr[0] = (0+1)*10;
//			arr[1] = (1+1)*10;
//			arr[2] = (2+1)*10;
			// i => index 약자 
			
			for(int i =0; i< 3; i++) {
				arr[i] = (i+1)*10;
				System.out.println(arr[i]);
			}
			
			// 배열 축약형 
			int arr2[] = {100,200,300};
			// new int[3];
			// arr2[0] = 100;
			// arr2[1] = 200;
			// arr2[2] = 300;
			System.out.println(arr2);
			System.out.println(arr2[2]);

	}

}
