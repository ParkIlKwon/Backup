package 메서드2;

import java.util.Arrays;

class Return2{
		
		boolean chk(String str) {
				int num = Integer.parseInt(str);
				if (num < 0 || num > 100) {
					return false;
				}else {
					if (num >= 60 ) {
						return true;
					}else {
						return false;
					}
				}
		}
		
		int [] run(String [][] data) {
			int result[] = null;
			int temp [] = null;
			int idx = 0;
			for (int i = 0; i < data.length; i++) {
				if (chk(data[i][1])) {
					temp = new int [idx+1];
					for (int j = 0; j < idx; j++) {
						temp[j] = result[j];
					}
						
					temp[idx] = Integer.parseInt(data[i][0]);
					
					idx ++ ; 
				}
				result = temp;
			}
			
			return result;
		}
			
	}

public class 리턴문제2 {

	public static void main(String[] args) {

				/*
				[문제]
					아래 main() 메서드 안에 data배열은
					학생의 번호와 점수를 문자열 타입으로 저장한 것이다.
					번호는 1001부터 1004까지 있고
					점수는 0~100점 사이이며, 60점 이상이면 합격이다.
					오로지 합격생의 번호만 result배열에 담아서 리턴해주는
					run 메서드를 구현하시오.
			 */
				Return2 re = new Return2();
				
				String data[][] = {
						{"1001","34"},
						{"1002","46"},
						{"1003","81"},
						{"1004","100"},
				};
				
				int result[] = re.run(data); // 
				
				// 완성된 result 출력 // [1003,1004] 
				
				System.out.println(Arrays.toString(result));
				
				
				
				
			}

		}





















