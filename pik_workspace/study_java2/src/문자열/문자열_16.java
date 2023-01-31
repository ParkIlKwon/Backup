package 문자열;

import java.util.Arrays;

public class 문자열_16 {

	public static void main(String[] args) {

		String str = "김철수/87,이만수/42,이영희/95";
		
		// 위 데이터에서 꼴등을 삭제후 다시 문자열로 변경
		
		//1) 문자열을 잘라서 배열에 저장한다.
		
		//2) 배열에서 꼴등을 삭제한다
		//3) 삭제한배열을 다시 문자열로 만든다.
		
		// str = "김철수/87,이영희/95";
		
		str = str.replace(",", "/");
		String arr [] = str.split("/");
		int idx = 0;
		System.out.println(Arrays.toString(arr));
		int temp = 0;
		
		temp = Integer.parseInt(arr[1]);
		
		for (int i = 1; i < arr.length; i+=2) {
			
			if(temp > Integer.parseInt(arr[i])) {
				temp = Integer.parseInt(arr[i]);
				idx=i;
			}
			
		}
		
		String arr2[] = arr;
		
		arr = new String [arr.length-2];
		int idx2=0;
		
		for (int i = 0; i < arr.length+2; i++) {
			if(idx != i &&idx-1!=i) {
				arr[idx2] = arr2[i];
				idx2++;
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
