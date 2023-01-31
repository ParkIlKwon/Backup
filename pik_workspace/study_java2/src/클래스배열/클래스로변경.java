package 클래스배열;
	
	
	
	




public class 클래스로변경 {
	
	public static void main(String[] args) {
		// [부서정보]
				// [부서번호,부서명,지역]
				int deNo1 = 0;
				int deName = 1;
				int loc = 2;
				String[][] deData = { { "10", "ACCOUNTING", "NEW YORK" }, 
						{ "20", "RESEARCH", "DALLAS" },
						{ "30", "SALES", "CHICAGO" }, 
						{ "40", "OPERATIONS", "BOSTON" },
						};
				// [사원정보]
				// 0 1 2 3 4 5 6 7
				// [번호,이름,직책,상사번호,입사일,급여,커미션,부서번호]
				int no = 0;
				int name = 1;
				int title = 2;
				int supNo = 3;
				int date = 4;
				int sal = 5;
				int com = 6;
				int deNo2 = 7;

				String[][] emData = { { "7369", "SMITH", "CLERK", "7902", "17-12-1980", "800", "0", "20" },
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
						{ "7934", "MILLER", "CLERK", "7782", "23-1-1982", "1300", "0", "10" } };

				// 문제 1) # "DALLAS"에서 근무하는 사원의 이름,직급,부서번호,부서명을 조회하시오

				String input = "DALLAS";
				System.out.printf("문제1) \"%s\"에서 근무하는 사원 \n", input);
				String data = "";
				String data2 = "";
				for (String[] department : deData) {
					if (input.equals(department[loc])) {
						data = department[deNo1];
						data2 = department[deName];
						break;
					}
				}
				System.out.printf("%-10s\t %-10s\t %-10s\t %-10s\t \n", "이름", "직급", "부서코드", "부서명");
				for (String[] e : emData) {
					if (data.equals(e[deNo2])) {
						System.out.printf("%-10s\t %-10s\t %-10s\t %-10s\t \n", e[name], e[title], e[deNo2], data2);
					}
				}
				System.out.println();
				// 문제 2) # ALLEN과 같은 부서에 근무하는 사원의 이름, 부서번호를 조회하시오.
				input = "JONES";
				System.out.printf("문제2) \"%s\"과 같은 부서에 근무하는 사원 \n", input);
				data = "";
				for (String[] e : emData) {
					if (input.equals(e[name])) {
						data = e[deNo2];
						break;
					}
				}

				System.out.printf("%-10s\t %-10s\t \n", "이름", "부서코드");
				for (String[] e : emData) {
					if (!input.equals(e[name]) && data.equals(e[deNo2])) {
						System.out.printf("%-10s\t %-10s\t \n", e[name], e[deNo2]);
					}
				}

				// # 문제 3) 부서별 최대 급여와 최소 급여를 구하시오.
				System.out.println();
				System.out.println("문제 3) 부서별 최대 급여와 최소 급여");
				System.out.printf("%-10s\t %-10s\t  %-10s\t \n", "부서명", "최대 급여", "최소 급여");
				for (String[] d : deData) {
					int max = 0;
					int min = 100000;
					for (String[] e : emData) {
						if (d[deNo1].equals(e[deNo2])) {
							int money = Integer.parseInt(e[sal]) + Integer.parseInt(e[com]);
							if (max < money) {
								max = money;
							}
							if (min > money) {
								min = money;
							}

						}
					}
					if (max > 0) {
						System.out.printf("%-10s\t %-10s\t  %-10s\t \n", d[deName], max + "", min + "");
					} else {
						System.out.printf("%-10s\t %-10s\t  %-10s\t \n", d[deName], "no data", "no data");
					}

				}

				// # 문제 4) 부서별로 급여 평균 (단, 부서별 급여 평균이 2000 이상만)

				System.out.println();
				System.out.println("문제 4) 부서 급여 평균이 2000 급여부서 ");
				System.out.printf("%-10s\t %-10s\t  \n", "부서명", "평균 급여");
				for (String[] d : deData) {
					int cnt = 0;
					int sum = 0;
					double avg = 0;
					for (String[] e : emData) {
						if (d[deNo1].equals(e[deNo2])) {
							int money = Integer.parseInt(e[sal]) + Integer.parseInt(e[com]);
							sum += money;
							cnt++;
						}
					}
					avg = sum * 1.0 / cnt;
					if (avg > 2000) {
						System.out.printf("%-10s\t %.2f\t \n", d[deName], avg);
					}

				}
				System.out.println();
				// # 문제 5) 부서번호가 30번인 사원들의 이름, 직급, 부서번호, 부서위치를 조회하시오.
				input = "30";
				System.out.printf("문제 5) 부서번호가 %s번인 사원들의 이름, 직급, 부서코드, 부서위치\n", input);
				data = "";
				for (String[] d : deData) {
					if (input.equals(d[deNo1])) {
						data = d[loc];
						break;
					}
				}

				System.out.printf("%-10s\t %-10s\t %-10s\t %-10s\t \n", "이름", "직급", "부서코드", "부서위치");
				for (String[] e : emData) {
					if (input.equals(e[deNo2])) {
						System.out.printf("%-10s\t %-10s\t %-10s\t %-10s\t \n", e[name], e[title], e[deNo2], data);
					}
				}

				System.out.println();
				// # 문제 6) 이름에 A 가 들어가는 사원의 이름,부서명을 조회하시오.
				input = "A";

				System.out.printf("문제 6) 이름에 %s 가 들어가는 사원의 이름,부서명을 조회하시오 \n", input);
				System.out.printf("%-10s\t %-10s\t  \n", "이름", "부서명");
				for (String[] e : emData) {
					data = "";
					for (int i = 0; i < e[name].length(); i++) {
						if (input.equals(e[name].charAt(i) + "")) {
							data = e[deNo2];
							break;
						}
					}

					for (String[] d : deData) {
						if (data.equals(d[deNo1])) {
							data = d[deName];
							break;
						}
					}
					if (!data.equals("")) {
						System.out.printf("%-10s\t %-10s\t \n", e[name], data);
					}

				}

				System.out.println();

				// # 문제 7) 사원명 'JONES'가 속한 부서명을 조회하시오.
				input = "JONES";
				System.out.printf("문제 7) 사원명 'JONES'가 속한 부서명을 조회\n", input);
				System.out.printf("%-10s\t %-10s\t  \n", "이름", "부서명");
				for (String[] e : emData) {
					data = "";
					if (input.equals(e[name])) {
						data = e[deNo2];
					}

					for (String[] d : deData) {
						if (data.equals(d[deNo1])) {
							data = d[deName];
							break;
						}
					}
					if (!data.equals("")) {
						System.out.printf("%-10s\t %-10s\t \n", e[name], data);
					}
				}
				System.out.println();

				// # 문제 8) 10번 부서에서 근무하는 사원의 이름과 10번 부서의 부서명을 조회하시오.

				input = "10";
				System.out.printf("문제 8) %s번 부서에서 근무하는 사원의 이름과 %s번 부서의 부서명을 조회\n", input, input);
				System.out.printf("%-10s\t %-10s\t  \n", "이름", "부서명");

				for (String[] d : deData) {
					if (input.equals(d[deNo1])) {
						data = d[deName];
						break;
					}
				}

				for (String[] e : emData) {

					if (input.equals(e[deNo2])) {
						System.out.printf("%-10s\t %-10s\t \n", e[name], data);
					}

				}
				System.out.println();

				// 문제 9) 1987년생의사원의 이름과 직책과 부서명 조회

				input = "1987";
				System.out.printf("문제 9) %s년생의사원의 이름과 직책과 부서위치 조회\n", input);
				System.out.printf("%-10s\t %-10s\t %-10s\t \n", "이름", "직책", "부서위치");

				for (String[] e : emData) {
					data = "";
					String temp[] = e[date].split("-");
//					System.out.println(temp[2]);
					if (input.equals(temp[2])) {
						data = e[deNo2];
					}

					for (String[] d : deData) {
						if (data.equals(d[deNo1])) {
							data = d[loc];
							break;
						}
					}

					if (!data.equals("")) {
						System.out.printf("%-10s\t %-10s\t %-10s\t \n", e[name], e[title], data);
					}

				}
				System.out.println();

	}

}
