package day11;

import java.util.Scanner;

public class G_01이차원배열 {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];
		Scanner sc = new Scanner(System.in);
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		System.out.print("인덱스 1 입력 : ");
		int idx1 = sc.nextInt();
		System.out.print("인덱스 2 입력 : ");
		int idx2 = sc.nextInt();
		
		System.out.println(arr[idx1][idx2]);
		System.out.println("==================");
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		
		System.out.println("값 입력 : ");
		int data = sc.nextInt();
	
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				if(data==arr[i][j]) {
					System.out.println("인덱스1: "+i+"인덱스2: "+j);
				}
				
			}
			
		}
		
		
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		System.out.println("==================");
		int max = arr[0][0];
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				if(arr[i][j]>max) {
					idx1 = i;
					idx2 = j;
					
				}
			}
			
		}
		System.out.println(idx1 + "  "+ idx2);
		
		
		
		// 문제 4) 값 2개를 입력받아 값 교체
		System.out.print("값 1 입력 : ");
		idx1 = sc.nextInt();
		System.out.print("값 2 입력 : ");
		idx2 = sc.nextInt();
		int a=-1,b=-1,c=-1,d=-1;
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				if(idx1 == arr[i][j]){
					a=i;
					b=j;
				}
				if(idx2 == arr[i][j]){
					c = i ;
					d = j;
				}
				
			}
			
		}
		int temp = arr[a][b];
		arr[a][b] = arr[c][d];
		arr[c][d] = temp;
		
		

	}

}
