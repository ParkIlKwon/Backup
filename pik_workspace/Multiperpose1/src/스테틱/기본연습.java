package 스테틱;

import java.util.ArrayList;

import javax.security.auth.Subject;

class SubjectDAO{
	
	static ArrayList<Integer> subjectList = new ArrayList<Integer>();
	
}

class test{
	SubjectDAO DAO = new SubjectDAO();
	
	void run(){
		System.out.println(DAO.subjectList);
		
	}
}


public class 기본연습 {

	public static void main(String[] args) {
		SubjectDAO DAO = new SubjectDAO();
		test t1 = new test();
		DAO.subjectList.add(10);
		System.out.println(DAO.subjectList);
		t1.run();
		
	}

}
