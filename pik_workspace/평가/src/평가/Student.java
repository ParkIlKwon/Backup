package 평가;

public class Student {
	
		int studentNum;
		String studentId;
		
		public Student(int studentNum, String studentId) {
			super();
			this.studentNum = studentNum;
			this.studentId = studentId;
		}

		@Override
		public String toString() {
			return "Student [학번 :  " + studentNum + ", 학생아이디 : "
					+ studentId + "]\n";
		}
		
	
}
