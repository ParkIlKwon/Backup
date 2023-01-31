package study_java3;

import java.util.Arrays;

class Subject {
		String name;
		String stuNo;
		int score;
		
		Subject(){
		}
		
		public Subject(String name, String stuNo, int score) {
			super();
			this.name = name;
			this.stuNo = stuNo;
			this.score = score;
		}

		@Override
		public String toString() {
			return "Subject [name=" + name + ", stuNo=" + stuNo + ", score="
					+ score + "]";
		}
	}
	
	class Student {
		String stuNo;
		Subject[] subjects;
		String name;
		
		@Override
		public String toString() {
			return "Student [stuNo=" + stuNo + ", subjects="
					+ Arrays.toString(subjects) + ", name=" + name + "]";
		}

		public Student() {
			// TODO Auto-generated constructor stub
		}
		
		public Student(String stuNo, Subject[] subjects, String name) {
			super();
			this.stuNo = stuNo;
			this.subjects = subjects;
			this.name = name;
		}
	}
	
	class StudentDAO {
		
		void init() {
			String stuData = "1001/이만수\n";
			stuData += "1002/김철만\n";
			stuData += "1003/오수정\n";
			String stuarr [] = stuData.split("\n");
			Student[] list2= new Student[stuarr.length];
			String stuArr[][] = new String[stuarr.length][];
			
			System.out.println("==============================");
			
			for (int i = 0; i < stuarr.length; i++) {
				stuArr[i] = stuarr[i].split("/");
			}
			
			String subData = "";
			subData += "1001/국어/10\n";
			subData += "1001/수학/32\n";
			subData += "1002/국어/23\n";
			subData += "1002/수학/35\n";
			subData += "1002/영어/46\n";
			subData += "1003/수학/60\n";
			subData += "1003/영어/100\n";
			
			String subarr [] = subData.split("\n");
			String subArr[][] = new String[subarr.length][];
			int cnt [] = new int [stuarr.length];
			int index = 0;
			
			for (int i = 0; i < subArr.length; i++) {
				subArr[i] = subarr[i].split("/");
			}
			
			String str = subArr[0][0];
			
			for (int i = 0; i < subArr.length; i++) {
				if (!str.equals(subArr[i][0])) {
					index++;
				}
				str = subArr[i][0];
				cnt[index]++;
			}
			
			System.out.println(Arrays.toString(stuarr));
			index = 0;
			
			for (int i = 0; i < list2.length; i++) {
				String temp[]  = stuarr[i].split("/");
				
				String stuNo = temp[0]; 
				String name = temp[1];
				
				Subject subj[] = new Subject[cnt[index]];
				int idx = 0;
				
			 for (int j = 0; j < subj.length; j++) {
				 for (int k = idx; k < subArr.length; k++) {
					 if (subArr[k][0].equals(stuNo)) {
						 subj[j] = new Subject(subArr[k][0],subArr[k][1],
								 Integer.parseInt(subArr[k][2]));
						 idx ++; break;
					 }
					 idx ++;
				 }
			}
			 
			 	list2[i] = new Student(stuNo,subj,name);
			 	list2[i].subjects = new Subject[cnt[index]];
				
				for (int k = 0; k < subj.length; k++) {
					list2[i].subjects[k] = new Subject();
					list2[i].subjects[k] = subj[k];
					System.out.println(subj[k]);
				}
				
				System.out.println(subj.length);
				index++;
				
			}
		}

		void run() {
			init();
		}
	}
public class 학생컨트롤러3 {

	public static void main(String[] args) {


				StudentDAO dao = new StudentDAO();
				dao.run();
				
				
	}

}