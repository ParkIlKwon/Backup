package 문자열ex;

import java.util.Arrays;
import java.util.Scanner;


public class 레벨5테스트 {

	public static void main(String[] args) {

		//[부서정보]
		//[부서번호,부서명,지역]
		String[][] departData = { 
				{ "10", "ACCOUNTING", "NEW YORK" }, 
				{ "20", "RESEARCH", "DALLAS" },
				{ "30", "SALES", "CHICAGO" }, 
				{ "40", "OPERATIONS", "BOSTON" }, 
			};
		// [사원정보]
		// [번호,이름,직책,상사번호,입사일,급여,커미션,부서번호]
		String[][] empData = { 
				{ "7369", "SMITH", "CLERK", "7902", "17-12-1980", "800", "0", "20" },
				{ "7499", "ALLEN", "SALESMAN", "7698", "20-2-1981", "1600", "300", "30" },
				{ "7521", "WARD", "SALESMAN", "7698", "22-2-1981", "1250", "500", "30" },
				{ "7566", "JONES", "MANAGER", "7839", "2-4-1981", "2975", "0", "20" },
				{ "7654", "MARTIN", "SALESMAN", "7698", "28-9-1981", "1250", "1400", "30" },
				{ "7698", "BLAKE", "MANAGER", "7839", "1-5-1981", "2850", "0", "30" },
				{ "7782", "CLARK", "MANAGER", "7839", "9-6-1981", "2450", "0", "10" },
				{ "7788", "SCOTT", "ANALYST", "7566", "13-7-1987", "3000", "0", "20" },
				{ "7839", "KING", "PRESIDENT", "NULL", "17-11-1981", "5000", "0", "10" },
				{ "7844", "TURNER", "SALESMAN", "7698", "8-9-1981", "1500", "0", "30" },
				{ "7876", "ADAMS", "CLERK", "7788", "13-7-1987", "1100", "0", "20" },
				{ "7900", "JAMES", "CLERK", "7698", "3-12-1981", "950", "0", "30" },
				{ "7902", "FORD", "ANALYST", "7566", "3-12-1981", "3000", "0", "20" },
				{ "7934", "MILLER", "CLERK", "7782", "23-1-1982", "1300", "0", "10" }
				};	
		
		int empSize = empData[0].length-1;

		
		Scanner sc = new Scanner(System.in);
		System.out.println("문제1) # \"DALLAS\"에서 근무하는 사원의 이름,직급,부서번호,부서명을 조회하시오");
		String test1[] = {"DALLAS"} ;
		String num = "";
		String str = "";
		
		System.out.println("이름\t    직급    \t   부서번호\t부서명");
		
		for (int i = 0; i < departData .length; i++) {
			if (departData[i][2].equals(test1[0])) {
				num =departData[i][0];
				str = departData[i][1];
				break;
			}
		}
		
		for (int i = 0; i < empData.length; i++) {
			if (num.equals(empData[i][empSize])) {
				System.out.printf("%5s\t%8s\t %7s\t\t%8s\n",
						empData[i][1],empData[i][2],empData[i][empSize],str);
			}
		}
		//////////////////////////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println("문제2) # ALLEN과 같은 부서에 근무하는 사원의 이름, 부서번호를 조회하시오.");
		str = "ALLEN";			
		//str = sc.next();			//가변		이름입력해서 검색기능
		for (int i = 0; i < empData.length; i++) {
			if (str.equals(empData[i][1])) {
				str = empData[i][empSize];
				break;
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > '9' ) {						//이름 잘못입력했을때 예외처리.
				System.err.println("이름을 잘못입력하셨습니다. : <");
				break;
			}
		}
		
		System.out.println("이름 \t 부서번호");
		for (int i = 0; i < empData.length; i++) {
			if (empData[i][empSize].equals(str)) {
				System.out.printf("[%s] \t%s\n",empData[i][1] , empData[i][empSize]);
			}
		}
		///////////////////////////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println("문제3)# 부서별 최대 급여와 최소 급여를 구하시오.");
	
		System.out.println("부서명                           최대급여                         최소급여");
		
		int max = 0 , min = 0;
		
		for (int i = 0; i < departData.length; i++) {
			boolean chk = true;
		
			
			
			for (int k = 0; k < empData.length; k++) {
				if (chk == true&& departData[i][0].equals(empData[k][empSize])) {
					max = Integer.parseInt(empData[k][empSize-2]) ;
					min = Integer.parseInt(empData[k][empSize-2]);
					chk = false;
				}else if (departData[i][0].equals(empData[k][empSize])) 
				{
					if (max < Integer.parseInt(empData[k][empSize-2])) {
						max = Integer.parseInt(empData[k][empSize-2]);
					}
					if (min > Integer.parseInt(empData[k][empSize-2])) {
						min = Integer.parseInt(empData[k][empSize-2]);
					}
				}
			}
			if (chk) {
				System.out.printf("%s          nodata                      nodata",departData[i][1]);
			}else {
				System.out.printf("%-20s\t%-10d\t\t\t%-25d",departData[i][1],max,min);
				System.out.println();
			}
			
			
		}
		
		
		
		/////////////////////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println(	"\n문제4)#부서별로 급여 평균 (단, 부서별 급여 평균이 2000 이상만");
		
		for (int i = 0; i < departData.length; i++) {
			int total = 0;
			double cnt = 0.0;
			
			
			for (int k = 0; k < empData.length; k++) {
				 if (departData[i][0].equals(empData[k][empSize])) 
					{
					 total += Integer.parseInt( empData[k][empSize-2]);
					 cnt ++;
					}
				
			}
			double avg = total/cnt ;
			if (avg >=2000) {
				
				System.out.printf("%s\t\t%.2f",departData[i][1],avg);
			}
			System.out.println();
			
		}
		
/////////////////////////////////////////////////////////////////////////////////
	System.out.println(	"문제5)#부서번호가 30번인 사원들의 이름, 직급, 부서번호, 부서위치를 조회하시오.");
		
		String number = "30";
		System.out.println("이름                 직급                부서번호              부서위치");
		
		for (int i = 0; i < empData.length; i++) {
			if (number.equals(empData[i][empSize])) {
				System.out.printf("%-10s\t %-10s %s\t",empData[i][1],
						empData[i][2],number);
				for (int j = 0; j < departData.length; j++) {
					if (number.equals(departData[j][0])) {
						System.out.println(departData[j][2]);
					}
				}
			}
		}
		/////////////////////////////////////////////////////////////////////////////
		System.out.println(	"\n문제6)# 이름에 A 가 들어가는 사원의 이름,부서명을 조회하시오.");
		System.out.println("이름                  부서명");
		for (String string[] : empData) {
			for (int i = 0; i < string[1].length(); i++) {
				if (string[1].charAt(i) == 'A') {
					System.out.printf("%-10s",string[1]);
					for (int k = 0; k < departData.length; k++) {
						if (departData[k][0].equals(string[empSize])) {
							System.out.println(departData[k][1]);
						}
					}
				}
			}
			
		}
/////////////////////////////////////////////////////////////////////////////
	System.out.println(	"\n문제7)# 사원명 'JONES'가 속한 부서명을 조회하시오.");
		str = "JONES";
		System.out.println("이름           부서명");
		for (String string[] : empData) {
			if (string[1].equals(str)) {
				System.out.print(str);
				for (int i = 0; i < departData.length; i++) {
					if (departData[i][0].equals(string[empSize])) {
						System.out.println("    "+departData[i][1]);
						break;
					}
				}
			}
		}
/////////////////////////////////////////////////////////////////////////////
		System.out.println(	"\n문제8)#10번 부서에서 근무하는 사원의 이름과 10번 부서의 부서명을 조회하시오.");
		
		System.out.println("이름         부서명");
		str = "10";
		int index = 0;
		
		for (int i = 0; i < departData.length; i++) {
			if (departData[i][0].equals(str)) {
				index = i;
				break;
			}
		}
		
		for (String string[] : empData) {
			if (str.equals(string[empSize])) {
				System.out.printf("%-10s",string[1]);
					System.out.println(departData[index][1]);
				}
			}
/////////////////////////////////////////////////////////////////////////////
System.out.println(	"\n문제9) 1987년생의사원의 이름과 직책과 부서위치 조회");

		str = "1987";
		String [][] temp = new String[empData.length][3];
		int idx [] = new int [empData.length];
		int cnt =0;
		
		index = 0;
		for (String[] strings : empData) {
			temp[index] = strings[4].split("-");
			if (temp[index][2].equals(str)) {
				idx[cnt] = index;
				cnt ++;
			}
			index++;
		}
		
		System.out.println(Arrays.toString(idx));
		System.out.println("이름          직책       부서위치");
		
		for (int i = 0; i < cnt; i++) {
			for (int k = 0; k < empData.length; k++) {
				if (idx[i] == k) {
					System.out.printf("%-10s%-10s",empData[k][1],empData[k][2]);
					for (int j = 0; j < departData.length; j++) {
						if (empData[k][empSize].equals(departData[j][0])) {
							System.out.printf("%-20s",departData[j][2]);
						}
						
					}
				}
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
