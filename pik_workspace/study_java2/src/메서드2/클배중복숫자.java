package 메서드2;

import java.util.Arrays;
import java.util.Random;

class RanNum{
			int num;
			boolean check;
			
			
			
		}
		class RanBNumManger{
			Random rd = new Random();
			RanNum[] arr = new RanNum[5];
			
			
			// 랜덤 숫자 생성 
			
			// 중복체크 
			
			// 랜덤 숫자 출력 
			void mix() {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = new RanNum();
				int rannum = rd.nextInt(arr.length)+1;
				for (int j = 0; j < i; j++) {
					if (arr[j].num == rannum) {
						arr[i].check  = true;
					}
				}
				if (arr[i].check == true) {
					i--;
				}else {
					arr[i].num = rannum;
					
				}
			}
				
			}
			
			
			void pinrt() {
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i].num);
				}
			}
			
			
		}

		
		
public class 클배중복숫자 {

	public static void main(String[] args) {
		
		RanBNumManger mag = new RanBNumManger();
		
		mag.mix();
		mag.pinrt();
		
		
		

	}

}
