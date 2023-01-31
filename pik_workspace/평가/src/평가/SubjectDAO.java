package 평가;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SubjectDAO {

	private Scanner sc = new Scanner(System.in);
	static ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	
	void insertSubject(){
		
		if (StudentDAO.studentList.size() == 0) {
			System.err.println("저장된 학생정보가 존재하지 않습니다.");
			return;
		}
		
		System.out.println(StudentDAO.studentList.size());
		System.out.println(StudentDAO.studentList);
		int index = chkidx(StudentDAO.studentList, getnum(1001, 9999,"어떤학생의 과목데이터를 추가하시겠습니까? [ 학번 입력 ]"))  ;
		
		String str ="";
		
		while (true) {
			boolean chk = true;
			
			System.out.println("추가할 과목 이름을 입력하세요.");
			str = sc.next();
			
			for (Subject subject : subjectList) {
				if (subject.getSubject().equals(str) && subject.getStudentNum() == 
						StudentDAO.studentList.get(index).studentNum) {
					System.err.println("과목 입력 오류.");
					chk = false;
					break;
				}
			}
			if (chk) {
				break;
			}
		}
		
		
		Subject subData = new Subject(StudentDAO.studentList.get(index).studentNum ,str,getnum(0, 100, "과목점수입력"));
		subjectList.add(subData);
		
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
	
	
	
	private int getnum(int n , int m , String msg) {
		while (true) {
			
			int num =0;
			while (true) {
				System.out.println(msg);
				Scanner sc = new Scanner(System.in);
				try {
					num = sc.nextInt();
					if (num < n || num > m) {
						throw new Exception();
					}
					
				} catch (InputMismatchException e) {
					System.err.println("문자열은 입력될수 없습니다.");
					continue;
				} catch (Exception e) {
					System.err.println("입력범위 에러.");
					continue;
				}
				return num;
			}
		}
	}
	
	//과목삭제
	void deleteSubject(){
		if (StudentDAO.studentList.size() == 0) {
			System.err.println("삭제할 학생데이터가 존재하지 않습니다.");
			return;
		}
		int number = 0;
		int index;
		
		while (true) {
			number = getnum(1001, StudentDAO.num,"어떤학생의 과목데이터를 삭제하시겠습니까? [ 학번 입력 ]");
			index = chkidx(StudentDAO.studentList, number)  ;
			if (index != -1) {
				break;
			}
			System.err.println("학번입력오류");
		}
		
		System.out.printf("[ %s ]학생의삭제하실 과목을 입력하세요 \n", StudentDAO.studentList.get(index).studentId);
		boolean chk = false;
		
		for (Subject subject : subjectList) {
			if (subject.getStudentNum() == number) {
				System.out.println(subject.getSubject() + " : " + subject.getScore());
				chk = true;
			}
		}
		
		if (!chk) {
			return;
		}
		String str = sc.next();
		
		for (int i = 0; i < subjectList.size(); i++) {
			if (subjectList.get(i).getStudentNum() == number && subjectList.get(i).getSubject().equals(str)) {
				System.out.println("삭제완료.");
				subjectList.remove(i);
				return;
			}
		}
		System.err.println("삭제실패 과목데이터 존재하지 않음 .");
		
	}
	
	
	
	
	
	
	
}
