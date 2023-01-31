package day04;

public class D_01ifelse {
	public static void main(String[] args) {
		/*
	     () => 소괄호 
	     {} => 중괄호
	     [] => 대괄호 
	 */

			// if(조건식){ }
			// 만약에 조건식이 true 라면 { }을 실행해 
			
			int a = 10;
			int b = 10;
			
			if(a == b) {
				System.out.println("a와 b가 같다");
				System.out.println(a);
			}
			
			// if 영역 안이 한줄이면 { }(중괄호 ) 생략가능 하다 => 비추 
			if(a != b) System.out.println("a와 b는 다르다");
					   System.out.println("dd");
			
					   
			// if(조건식){ } else{ } 		   
			// 만약에 조건식이 true면 if 영역 실행
		    // else 그렇지않으면 else 영역을 실행 
		    
						// 아래는 오류를 발생시킨다.
						System.out.println(">>> 자판기 <<<");
						System.out.println("[1.과자 2.음료수 3.라면]");
						System.out.println("번호를 입력하세요 : 1");
						int select = 2;
						
						if(select == 1) { System.out.println("1.과자"); }
						if(select == 2) { System.out.println("2.음료수"); }
						if(select == 3) { System.out.println("3.라면"); }
						else { System.out.println("오류"); }
						
						System.out.println("-------------------------------");
						
						System.out.println(">>> 자판기 <<<");
						System.out.println("[1.과자 2.음료수 3.라면]");
						
						System.out.println("번호를 입력하세요 : 1");
						select = 1;
						
						if(select == 1) { System.out.println("1.과자"); }
						else if(select == 2) { System.out.println("2.음료수"); }
						else if(select == 3) { System.out.println("3.라면"); }
						else { System.out.println("오류"); }		   
					   

	}

}
