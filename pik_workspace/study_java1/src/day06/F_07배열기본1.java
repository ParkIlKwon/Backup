package day06;

import java.util.Arrays;
import java.util.Scanner;

public class F_07배열기본1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[]arr =	{10,20,30}  ;
			//heap 메모리방에 int 방 3개 생성을 하고 arr에 저장
		int i=0,sum=0;
		arr[0]=100;
		sum=Arrays.stream(arr).sum();
		System.out.println(sum);
		

	}

}
