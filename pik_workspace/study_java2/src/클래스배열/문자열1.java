package 클래스배열;

import java.util.Arrays;

//class Student{
//	String name;
//	int score;
//	
//}

 
public class 문자열1 {

	public static void main(String[] args) {
				
				String data = ""; 
				data +="김영희/30\n";
				data += "이만수/40\n";
				data += "이철민/60";

				String temp[] =  data.split("\n");
				Student[] studentList = new Student [temp.length];
				String stemp[][] = new String[temp.length][];
				for (int i = 0; i < stemp.length; i++) {
					stemp[i] = temp[i].split("/");
				}
				
				//문제1)data에 있는 내용을 잘라서  studentList 에 저장후 전체출력 
				
				for (int i = 0; i < temp.length; i++) {
					Student stu = new Student();
					        stu.name  = stemp[i][0];
					        stu.score  = Integer.parseInt(stemp[i][1]) ;
					        studentList[i] = stu;
				}
				
				for (Student student : studentList) {
					System.out.print(student.name);
					System.out.println(student.score);
				}
			
				
				//문제2)꼴등 삭제후 다시 data에 저장	
				System.out.println("==========================");
				
				for (int i = 0; i < studentList.length; i++) {
					String atemp [] = stemp[i];
					for (int k = 0; k < i; k++) {
						if (Integer.parseInt(atemp[1]) > Integer.parseInt(stemp[k][1]) ) {
							temp = stemp[k];
							stemp[k] = stemp[i];
							stemp[i] = temp;
						}
					}
				}
				
				data = "";
				for (int i = 0; i < stemp.length-1; i++) {
					data += stemp[i][0];
					data += "/";
					data += stemp[i][1];
					data += "\n";
				}
				
				
			System.out.println(data);				
				
				
				
				
				
	

	}

}
