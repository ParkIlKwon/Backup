package 평가;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentDAO {

	private Scanner sc = new Scanner(System.in);
	static ArrayList<Student> studentList = new ArrayList<Student>();
	static int num = 1001;
	
	//회원가입.
	 void join(){
		 if(studentList.size() == 0) {num = 1001;}
		 else {
			 int max = studentList.get(0).studentNum;
			for (int i = 0; i < studentList.size(); i++) {
				if (max < studentList.get(i).studentNum) {
					max = studentList.get(i).studentNum;
				}
			}
			num = max+1;
		}
		 
		Student studata;
		while (true) {
			boolean chk = true;
			System.out.println("아이디를 입력하시오.");
			String str = sc.next();
			
			for (int i = 0; i < studentList.size(); i++) {
				if (studentList.get(i).studentId.equals(str)) {
					System.err.println("아이디 중복에러");
					chk = false;
				}
			}
			
			if (chk) {
				studata = new Student(num, str);
				break;
			}
		}
		
		studentList.add(studata);
		
			System.out.println(studentList.get(studentList.size()-1).studentNum);
		
	}
	
	//전체출력.
	void printStudentList(){
		
		for (Student stu : studentList) {
			System.out.println(stu.studentNum+ " / " +stu.studentId +" : ");
			
			for (int i = 0; i < SubjectDAO.subjectList.size(); i++) {
				
				if (SubjectDAO.subjectList.get(i).getStudentNum() == stu.studentNum) {
					System.out.printf("%s : %d \n",SubjectDAO.subjectList.get(i).getSubject()
							,SubjectDAO.subjectList.get(i).getScore());
				}
			}
			System.out.println("");
		}
		System.out.println("==========================================");
		
		ArrayList<Integer> numtemp = new ArrayList<Integer>();
		int [] scoretemp = new int [studentList.size()];
		
		for (int i = 0; i < studentList.size(); i++) {
			numtemp.add(studentList.get(i).studentNum);
			int cnt = 0;
			for (Subject Subinfo : SubjectDAO.subjectList) {
				if (Subinfo.getStudentNum() == studentList.get(i).studentNum) {
						scoretemp[i] += Subinfo.getScore();
						cnt++;
				}
			}
			scoretemp[i] /= cnt;
		}

		System.out.println(Arrays.toString(scoretemp));
		
		for (int i = 0; i < scoretemp.length; i++) {
			for (int k = 0; k < i; k++) {
				if (scoretemp[i] > scoretemp[k] ) {
					int temp = scoretemp[i];
					scoretemp[i] = scoretemp[k];
					scoretemp[k] = temp;
					temp = numtemp.get(i);
					numtemp.set(i, numtemp.get(k));
					numtemp.set(k, temp);
				}
			}
		}
							
		System.out.println("성적순 학번출력.");
		System.out.println(numtemp);
		
	}
	
	//학생삭제.
	void deleteStudent(){
		if (!chksize()) return; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삭제하실 학생의 학번을 입력하세요.");
		System.out.printf("입력범위는 %d ~ %d 까지입니다.", 1001 , num);
		int index = chkidx(studentList, getnum(1001, num));
		if (index == -1) {
			System.err.println("학번입력에러.");
			return;
		}else {
			for (int i = 0; i < SubjectDAO.subjectList.size(); i++) {
				if (SubjectDAO.subjectList.get(i).getStudentNum() == studentList.get(index).studentNum) {
					SubjectDAO.subjectList.remove(i); 
				}
			}
			studentList.remove(index);
			System.out.println("삭제 완료");
		}
	}
	
	private int chkidx(ArrayList <Student>stulist,int number) {
		
		int idx = -1;
		
		for (int i = 0; i < stulist.size(); i++) {
			if(stulist.get(i).studentNum == number) {
				idx = i;
			}
		}
		
		return idx ;
		
	}
	
	private boolean chksize() {
		
		if (studentList.size() == 0) {
			System.err.println("저장된 학생정보가 존재하지 않습니다.");
			return false;
		}
		return true;
	}
	
	private int getnum(int n , int m) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			int num =0;
			
			try {
				num = sc.nextInt();
				if (num < n || num > m) {
					throw new Exception();
				}
				
			} catch (InputMismatchException e) {
				System.err.println("문자열은 입력될수 없습니다.");
				
			} catch (Exception e) {
				System.err.println("입력범위 에러.");
			}
			return num;
		}
	}
	
	void saveStudentList(){
		if (studentList.size() == 0) {
			System.err.println("저장된 학생정보 데이터가 없습니다.");
			return;
		}
		
		String filename = "src\\평가\\studentList.txt";
		String filename2 = "src\\평가\\subjectList.txt";
		FileWriter FW  = null;
		FileWriter FW2  = null;
		
		String data = "";
		
		String arr[] = new String [studentList.size()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = studentList.get(i).studentId;
			for (int k = 0; k < i; k++) {
				if (arr[i].charAt(0) < arr[k].charAt(0)) {
					String temp = arr[i] ;
					arr[i] = arr[k];
					arr[k] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < studentList.size(); i++) {
		 	for (int k = 0; k < arr.length; k++) {
				if (studentList.get(k).studentId.equals(arr[i])) {
					data += studentList.get(k).studentId+"/"+studentList.get(k).studentNum + "\n";
				}
			}
		}
		
		try {
		  FW = new FileWriter(filename);
		  FW.write(data);
		  
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				FW.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		data = "";
		 
		for (int i = 0; i < SubjectDAO.subjectList.size(); i++) {
			data += SubjectDAO.subjectList.get(i).getStudentNum()+"/"+
					SubjectDAO.subjectList.get(i).getSubject() +"/" + 
					SubjectDAO.subjectList.get(i).getScore()+"\n";
				
		}
		
		System.out.println(data);
		
		try {
		  FW2 = new FileWriter(filename2);
		  FW2.write(data);
		  
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				FW2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	void loadStudentList(){
		
		String filename = "src\\평가\\studentList.txt";
		String filename2 = "src\\평가\\subjectList.txt";
		
		FileReader fr = null;
		String data="";
		
		try {
			fr = new FileReader(filename);
			int read =0;
			
			while(read != -1) {
				
					read = fr.read();
					data+= (char)read;
			}
			
			fr.close();
		
			
		} catch (FileNotFoundException e) { // 파일이 존재하지 않으면 에러발생 
			System.out.println("파일이 존재하지 않습니다");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fr!= null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		String info[] = data.split("\n");
		info[info.length-1] = null;
		System.out.println(Arrays.toString(info));
		
		String temp [] = new String [info.length-1];
		int idx = 0;
		
		for (int i = 0; i < info.length; i++) {
			if (info[i] != null) {
				temp[idx] = info[i];
				idx++;
			}
		}
		info = temp;
		studentList.clear();
		for (int i = 0; i < temp.length; i++) {
			String t[] = info[i].split("/");
			Student stu = new Student(Integer.parseInt(t[1]) , t[0]);
			studentList.add(stu);
		}
		System.out.println(studentList);
		
		data = "";
		try {
			fr = new FileReader(filename2);
			int read =0;
			
			while(read != -1) {
				
					read = fr.read();
					data+= (char)read;
			}
			
			fr.close();
		
			
		} catch (FileNotFoundException e) { // 파일이 존재하지 않으면 에러발생 
			System.out.println("파일이 존재하지 않습니다");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fr!= null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		info = data.split("\n");
		info[info.length-1] = null;
		System.out.println(Arrays.toString(info));
		
		temp  = new String [info.length-1];
		idx = 0;
		
		for (int i = 0; i < info.length; i++) {
			if (info[i] != null) {
				temp[idx] = info[i];
				idx++;
			}
		}
		info = temp;
		SubjectDAO.subjectList.clear();
		for (int i = 0; i < temp.length; i++) {
			String t[] = info[i].split("/");
			Subject sj = new Subject(Integer.parseInt(t[0]) , t[1] ,Integer.parseInt(t[2]));
			SubjectDAO.subjectList.add(sj);
		}
		System.out.println(SubjectDAO.subjectList);
		
		
		
	}
	
	
	
}
