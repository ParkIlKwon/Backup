package 문자열;

import java.util.Arrays;

public class 문자열_17 {

	public static void main(String[] args) {
			String str = "aaa/bbbb/ccc";
			
			// String[] temp = str.split("/");
		
			 String splitD = "/"; // 구분자 
			
			// split은 자동으로 문자열을 배열로 만들어준다.
			// split을 사용하지않고 직접 잘라서 배열어 넣어보자.
			
			
			//문제)   구분자를 기준으로 str 의 내용을 잘라내서 temp2 배열에 저장
			 int idx = 0;
			 int cnt =0;
			 
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) != splitD.charAt(0)) {
					cnt++;
				}
			}
			char arr[] = new char [cnt];
			cnt =0;
			
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) != splitD.charAt(0)) {
					arr[idx] = str.charAt(i);
					idx++;
				}
			}
			
			
			 System.out.println(Arrays.toString(arr));
			 String temp2[] =new String[3];
			 for (int i = 0; i <temp2.length; i++) {
				temp2[i] = "";
			}
			 
			idx=0; 		
			
			 for (int i = 0; i < arr.length-1; i++) {
				 temp2[idx] += arr[i]+"";
				 
				 if(arr[i] != arr[i+1] ) {
					 idx++;
				 }
			}
			 
			 temp2[temp2.length-1] += arr[arr.length-1];
			 
			 
			 System.out.println(Arrays.toString(temp2));
			 
			 

	}


}
