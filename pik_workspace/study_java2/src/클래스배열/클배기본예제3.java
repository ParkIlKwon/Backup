package 클래스배열;
import java.util.Arrays;
import java.util.Scanner;

	class Subject{
		int stuNum; // 학번 Student 클래스의 number 랑 같은 값 
		String name;// 과목 이름 
		int score; // 과목 점수
		int rank;// 그 과목 등수 +
		
		
	}

	


public class 클배기본예제3 {

	public static void main(String[] args) {
		
	

			Scanner sc = new Scanner(System.in);	
			
			// 기존에 있는 Student 클래스 학번 이름 점수(총합 )
			String studentSample = "1001/이만수\n";
			studentSample += "1002/김철만\n";		
			studentSample += "1003/오수정\n";
			
			String st [] = studentSample.split("\n");
			Student []stu = new Student[st.length];
			
			String stem [][] = new String [st.length][];
			for (int i = 0; i < stem.length; i++) {
				stem[i] = st[i].split("/");
			}
			
			
			for (int i = 0; i < st.length; i++) {
				Student stul = new Student();
				stul.number = Integer.parseInt(stem[i][0]) ;
				stul.name = stem[i][1];
				stu[i] = stul;

			}
			
			for (int i = 0; i < stem.length; i++) {
				System.out.println(stu[i].number  + "   "  + stu[i].name);
			}
			
			
			
			
			
			String subjectSample = "";
			subjectSample += "1001/국어/100/0\n";
			subjectSample += "1001/수학/32/0\n";
			subjectSample += "1002/국어/23/0\n";
			subjectSample += "1002/수학/35/0\n";
			subjectSample += "1002/영어/46/0\n";
			subjectSample += "1003/수학/60/0";	
			
			//문제1) 위 샘플문자열들을 각각 해당 클래스배열에 저장후 출력		
			//문제1) 점수가 59점이하인 과목은 전부 삭제후 다시 문자열로 저장후 출력 
			
			String str [] = subjectSample.split("\n");
			String darr[][] = new String [str.length][];
			Subject sub[] = new Subject[str.length];
			
			for (int i = 0; i < str.length; i++) {
				darr[i] = str[i].split("/");
			}
			
			System.out.println("========================");
			for (int i = 0; i < sub.length; i++) {
				String temp [] = darr[i];
				for (int k = 0; k < i; k++) {
					if (Integer.parseInt(temp[2]) > Integer.parseInt(darr[k][2]) ) {
						temp = darr[k];
						darr[k] = darr[i];
						darr[i] = temp;
					}
				}
			}
			int r = 1 ;
			for (int i = 0; i < darr.length; i++) {
				darr[i][3] = r + "";
				r++;
			}
			
			for (int i = 0; i < darr.length; i++) {
				System.out.println(Arrays.toString(darr[i]));
			}
			
			System.out.println("========================");
			for (int i = 0; i < str.length; i++) {
				Subject sj = new Subject();
				sj.stuNum = Integer.parseInt(darr[i][0]) ;
				sj.name = darr[i][1];
				sj.score = Integer.parseInt(darr[i][2]);
				sj.rank = Integer.parseInt(darr[i][3]);
				    sub[i] = sj;
			}
			subjectSample = "";
			
			for (int i = 0; i < sub.length; i++) {
				if (sub[i].score > 59) {
					subjectSample+=sub[i].stuNum + "/";
					subjectSample+=sub[i].name+ "/";
					subjectSample+=sub[i].score+ "/";
					subjectSample+=sub[i].rank+ "\n";
				}
			}
			
			System.out.println(subjectSample);
			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
	}

}
