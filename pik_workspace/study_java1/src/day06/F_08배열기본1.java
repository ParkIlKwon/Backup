package day06;
import java.util.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class F_08배열기본1 {
	public static void main(String[] args) {

		int[] arr = new int[5];
		int sum=0;

		// 문제1) 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50

		// 문제2) 전체 합 출력
		// 정답2) 150
			
		for(int i=0;i<arr.length;i++) {
			arr[i]=(i*10)+10;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(sum=Arrays.stream(arr).sum());
		System.out.println(IntStream.of(arr).max().getAsInt());
	}
	
}
