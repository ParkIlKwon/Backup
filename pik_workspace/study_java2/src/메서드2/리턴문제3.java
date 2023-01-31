package 메서드2;

import java.util.Arrays;


class Return3{
		
		String avg(int sum) {
			String avg = (double)sum / 3 +"";
			avg = avg.substring(0,5);
			
			return avg ;
		}
	
	
		/*
		 * 
			[정답]
			String[][] result = {
				[1001, 김철만, 신촌, 20, 65, 43, 128, 42.67], 
				[1002, 오상덕, 강남, 50, 15, 90, 155, 51.67], 
				[1003, 민철이, 대치, 60, 80, 30, 170, 56.67], 
				[1004, 유재석, 강동, 17, 70, 70, 157, 52.33]
				}
		 * 
		 */
	
		
			String [][] run(String [][] student,String[][] score){
			String arr[][] = new String [student.length][8];
			String subjec[] = {"국어","수학","영어"};
			int subidx = 0;
			
			for (int i = 0; i < arr.length; i++) {
				int idx = 0;
				int sum = 0;
				arr[i][0] = student[i][2]; arr[i][1] = student[i][0];
				arr[i][2] = student[i][1]; 
				for (int k = 3; k < 6; k++) {
					for (int j = 0; j < score.length; j++) {
						if (arr[i][0].equals(score[j][0]) && 
							subjec[k-3].equals(score[j][1])) {
							arr[i][k] = score[j][2];
							sum += Integer.parseInt(score[j][2]);
						}
					}
				}
				arr[i][6] = sum + "";
//				arr[i][7] = (float)sum / 3 +"";	//소수점 2재 자리까지 자르는걸 모르겠습니다 !
//				arr[i][7] = arr[i][7].substring(0, 5);
				arr[i][7] = avg(sum);
				
				
			}
			
			return arr;
		}
		
	}
public class 리턴문제3 {

	public static void main(String[] args) {
		
		/*
			[문제]
				아래 main() 메서드 내의 student배열은
				순서대로 이름, 지역, 번호를 의미한다.
				score배열은 번호 과목, 점수를 의미한다. 
				
				이러한 데이터를 아래 순서대로 result배열에 저장하여 리턴해주는
				run메서드를 구현하시오.
				
				[학생번호] [이름] [지역] [국어] [수학] [영어] [총합] [평균] 
		
		
		 */
		
	  Return3 re = new Return3();
		
		String [][] student = {
				{"김철만","신촌","1001"}, 
				{"오상덕","강남","1002"},
				{"민철이","대치","1003"} ,
				{"유재석","강동","1004"}};
		String[][] score = {
				{"1001" ,"국어","20"},
				{"1002" ,"국어","50"},
				{"1003" ,"국어","60"},
				{"1004" ,"국어","17"},
				{"1001" ,"수학","65"},
				{"1002" ,"수학","15"},
				{"1003" ,"수학","80"},
				{"1004" ,"수학","70"},
				{"1001" ,"영어","43"},
				{"1002" ,"영어","90"},
				{"1003" ,"영어","30"},
				{"1004" ,"영어","70"}
		};
		
		
		String[][] result = re.run(student,score); // ;
		
		/* 두 이차원 배열 합쳐서 result 이차원 배열에 넣기 
		 * 
		[1001, 김철만, 신촌, 20, 65, 43, 128, 42.67], 
		[1002, 오상덕, 강남, 50, 15, 90, 155, 51.67], 
		[1003, 민철이, 대치, 60, 80, 30, 170, 56.67], 
		[1004, 유재석, 강동, 17, 70, 70, 157, 52.33]

		*/
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(Arrays.toString(result[i]));
		}//소수점 2재 자리까지 자르는걸 모르겠습니다 !
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}