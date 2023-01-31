package 클래스배열;

import java.util.Arrays;
import java.util.Scanner;

public class 클래스배열학생컨트롤러2단계 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String stuData = "1001/이만수\n";
		stuData += "1002/김철만\n";		
		stuData += "1003/오수정\n";
		
		String st [] = stuData.split("\n");
		Student []stu = new Student[st.length];
		int cnt[] = new int [st.length];
		
		String stem [][] = new String [st.length][];
		for (int i = 0; i < stem.length; i++) {
			stem[i] = st[i].split("/");
		}
				
		String subData = "";
		subData += "1001/국어/10/0\n";
		subData += "1001/수학/32/0\n";
		subData += "1002/국어/23/0\n";
		subData += "1002/수학/35/0\n";
		subData += "1002/영어/46/0\n";
		subData += "1003/수학/60/0\n";	
		subData += "1003/영어/100/0";
		
				String str [] = subData.split("\n");
		String darr[][] = new String [str.length][];
		Subject sub[] = new Subject[str.length];
		
		for (int i = 0; i < str.length; i++) {
			darr[i] = str[i].split("/");
		}
		String Tarr[][] = new String [darr.length][darr[0].length]; 
		
		for (int i = 0; i < darr.length; i++) {
			for (int k = 0; k < darr[i].length; k++) {
				Tarr[i][k] = darr[i][k];
			}
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
		
		for (int i = 0; i < darr.length; i++) {
			System.out.println(Arrays.toString(Tarr[i]));
		}
		System.out.println("========================");
		for (int i = 0; i < str.length; i++) {
			Subject sj = new Subject();
			sj.stuNum = Integer.parseInt(Tarr[i][0]) ;
			sj.name = Tarr[i][1];
			sj.score = Integer.parseInt(Tarr[i][2]);
			sj.rank = Integer.parseInt(Tarr[i][3]);
			   sub[i] = sj;
		}
		
		String subjec [] = {"국어","수학","영어"};
	
		
		for (int i = 0; i < st.length; i++) {
			int sum =0;
			Student stul = new Student();
			stul.number = Integer.parseInt(stem[i][0]) ;
			stul.name = stem[i][1];
			
			for (int k = 0; k < Tarr.length; k++) {
				if (stul.number == Integer.parseInt(Tarr[k][0])) {
					stul.score+= Integer.parseInt(Tarr[k][2]);
					cnt[i]++;
				}
			}
			
			stu[i] = stul;
			
		}
		
		System.out.println(Arrays.toString(cnt));
				
		while(true) {
			System.out.println("[0] 종료 ");
			System.out.println("[1] 학생 정보 출력 ");
			System.out.println("[2] 과목 정보 출력 ");
			System.out.println("[3] 과목별 랭킹 저장 ");
			System.out.println("[4] 과목별 랭킹 + 이름 출력");
			System.out.println("[5] 과목별 랭킹 1등의 이름 과목 점수 출력 ");
			System.out.println("[6] 학생별 평균 점수 높은순으로 이름 점수 출력 ");
			
			
			int sel = sc.nextInt();
			if(sel == 0) {
				break;
			}else if(sel == 1) {
				System.out.println("학번    이름   총점");
				System.out.println("=================");
				for (int i = 0; i < stem.length; i++) {
					System.out.println(stu[i].number  + "   "  + stu[i].name+"    "+
							stu[i].score);
				}
				
			}else if(sel == 2) {
				System.out.println("번호    과목  점수 랭크");
				for (Subject subject : sub) {
					System.out.printf("%-7s",subject.stuNum);
					System.out.printf("%-4s",subject.name);
					System.out.printf("%-5s",subject.score);
					System.out.printf("%-4s",subject.rank);
					System.out.println();
				}
				
			
			}else if(sel == 3) {
				
				for (int i = 0; i < subjec.length; i++) {
					int rank = 1 ;	
					for (int k = 0; k < darr.length; k++) {
						if (darr[k][1].equals(subjec[i])) {
							darr[k][3] = rank + "";
							rank ++;
						}
					}
				}
			
				
				for (int i = 0; i < darr.length; i++) {
					for (int k = 0; k < darr.length; k++) {
						if (darr[i][2].equals(Tarr[k][2])) {
							Tarr[k][3] = darr[i][3];
						}
					}
				}
				
				System.err.println("랭킹등록완료 .");
				
				for (int i = 0; i < str.length; i++) {
					Subject sj = new Subject();
					sj.stuNum = Integer.parseInt(Tarr[i][0]) ;
					sj.name = Tarr[i][1];
					sj.score = Integer.parseInt(Tarr[i][2]);
					sj.rank = Integer.parseInt(Tarr[i][3]);
					   sub[i] = sj;
				}
				
//				for (int i = 0; i < Tarr.length; i++) {
//					System.out.println(Arrays.toString(Tarr[i]));
//				}
				
			
			}else if(sel == 4) {
				System.out.printf("%-4s  %-4s%-2s %-4s %-5s\n","학번","과목","점수","랭킹","이름");
				System.out.println("===========================");
				for (int i = 0; i < sub.length; i++) {
					
					System.out.printf("%-7s",sub[i].stuNum);
					System.out.printf("%-4s",sub[i].name);
					System.out.printf("%-5s",sub[i].score);
					System.out.printf("%-4s",sub[i].rank);
					
					for (Student string : stu) {
						if (string.number == sub[i].stuNum) {
							System.out.print(string.name);
						}
					}
					
					System.out.println();

				}
				
				
			}else if(sel == 5) {
				if (sub[0].rank == 0) {
					System.err.println("랭크를 저장 안 했습니다.:(");
					continue;
				}
				System.out.printf("%-4s  %-4s%-2s %-4s %-5s\n","학번","과목","점수","랭킹","이름");
				for (Subject subject : sub) {
					if (subject.rank == 1) {
						System.out.printf("%-7s",subject.stuNum);
						System.out.printf("%-4s",subject.name);
						System.out.printf("%-5s",subject.score);
						System.out.printf("%-4s",subject.rank);
						
						for (Student string : stu) {
							if (string.number == subject.stuNum) {
								System.out.print(string.name);
							}
						}System.out.println();
					}
				}
				
				
				
			}else if(sel == 6 ) {
				double avg [] = new double[cnt.length]; 
				int index [] = {0,1,2}; 
				
				for (int i = 0; i < avg.length; i++) {
					avg[i] = stu[i].score / (double)cnt[i];
				}
				
				Student sj[] = new Student[sub.length];
				
				for (int i = 0; i < index.length; i++) {
					double temp = avg[i];
					for (int k = 0; k < i; k++) {
						if (temp > avg[k]) {
							temp = avg[i];
							int tix = index [i] ;
							avg[i] = avg[k];
							avg[k] = temp;
							index[i] = index[k];
							index[k] = tix;
						}
					}
				}
				
				for (int i = 0; i < 3; i++) {
					Student stemp = new Student();
					stemp.number = stu[index[i]].number;
					stemp.name = stu[index[i]].name;
					stemp.score = stu[index[i]].score;
					sj[i] = stemp;
				}
				stu = sj;
																				
				
				System.out.println("학번   이름   총점    평균");
				
				for (int i = 0; i < index.length; i++) {
					System.out.print(stu[i].number  + "   "  + stu[i].name+"    "+
							stu[i].score+"     ");
					System.out.printf("%.2f",avg[i]);	 
					System.out.println();
					
				}
				System.out.println(Arrays.toString(index));
				
			
				
				
			}else {
				System.err.println("잘못된 입력입니다... :o");
			}
				
			
		}
	}

}
