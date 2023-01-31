package day09;

import java.util.Arrays;

public class F_01배열컨트롤러 {

	public static void main(String[] args) {
		
		//깊은복사	(순수하게 값을 복사)
		int num1 = 10 ;
		int num2 = num1;
		num2+=1;
		System.out.println(num2);
		
		//얕은복사
		
		int[] arr = {10,20,30,40,50};
		int[] copyArr = arr;			//같은 주소값 메모리방 사용 , 공유
		
		copyArr[2] = 300;
		
		System.out.println(arr[2]);
		System.out.println((copyArr[2]));
		

	}

}
