package day08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class F_051to4_solution {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
			  Random rd = new Random();
				int size = 4;
				int[] arr = new int[size];
				int[] check = new int[size];
				int num = 1;
		
				int i =0;
				while( i < size) {
					int rand = rd.nextInt(size); // 0 - 3
					if(check[rand] == 0) {
						check[rand] = 1;
						arr[i] = rand +1;
						i++;
					}
				}
				
				while(true) {
					System.out.println(Arrays.toString(arr));
					if(num > size) {
						System.out.println("[게임종료]");
						break;
					}
					
					System.out.printf(" %d 위치 >>", num);
					int idx = sc.nextInt();
					//idx--;
					if(idx <0 || idx >= size) {
						System.out.println("입력오류 1- 4");
						continue;
					}
					// idx 0 -4 일때만 밑에 실행 
					
					if(arr[idx] == num) {
						arr[idx] = 9;
						num++;
					}
					
				}

	}

}









