package day06;

import java.util.Arrays;
import java.util.Scanner;

public class F_07�迭�⺻1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[]arr =	{10,20,30}  ;
			//heap �޸𸮹濡 int �� 3�� ������ �ϰ� arr�� ����
		int i=0,sum=0;
		arr[0]=100;
		sum=Arrays.stream(arr).sum();
		System.out.println(sum);
		

	}

}
