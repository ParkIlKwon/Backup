package day06;
import java.util.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class F_08�迭�⺻1 {
	public static void main(String[] args) {

		int[] arr = new int[5];
		int sum=0;

		// ����1) 10���� 50���� arr �迭�� ����
		// ����1) 10 20 30 40 50

		// ����2) ��ü �� ���
		// ����2) 150
			
		for(int i=0;i<arr.length;i++) {
			arr[i]=(i*10)+10;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(sum=Arrays.stream(arr).sum());
		System.out.println(IntStream.of(arr).max().getAsInt());
	}
	
}
