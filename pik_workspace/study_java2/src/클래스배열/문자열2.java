package 클래스배열;

import java.util.Arrays;

class Test{
			int num; 
			int size;
			char[] data;
			
		}
public class 문자열2 {
	public static void main(String[] args) {
				
				String data ="";
		       //  num/size/data[]
				// num = 0, size =2; data = {a,b}
				data += "0/2/a/b\n";
				data += "1/3/a/b/c\n";
				data += "2/5/a/b/c/d/e\n";
				data += "3/4/a/b/c/d\n";
				data += "4/3/a/b/c\n";
				data += "5/1/a";

		        // data의 정보를 클래스배열에 저장.
				
				String str[] = data.split("\n");
				//System.out.println(Arrays.toString(str));
				String temp[][] = new String[str.length][];
				Test[] t = new Test[str.length];	
				
				for (int i = 0; i < str.length; i++) {
					temp[i] = str[i].split("/");

				}
				for (int i = 0; i < t.length; i++) {
					System.out.println(Arrays.toString(temp[i]));
				}
				System.out.println("===============");
				for (int i = 0; i < str.length; i++) {
					int idx = 0;
					Test test = new Test();
					char Cdata[] = new char[Integer.parseInt(temp[i][1])];
					for (int k = 2; k < Cdata.length+2; k++) {
						Cdata[idx] = temp[i][k].charAt(0);
						idx++;
					}
					test.data = Cdata;
					t[i] = test;
				}
			
				for (Test test : t) {
					System.out.println(test.data);
					
				}
				
				
				
				
				
				
		
		
		
		
		
		
		
	}

}
