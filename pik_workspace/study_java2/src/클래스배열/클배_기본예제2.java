package 클래스배열;

import java.util.Random;
import java.util.Scanner;

public class 클배_기본예제2 {

	public static void main(String[] args) {

		   int max = 10;
			Student[] stList = new Student[max];
			int cnt =0; // 현재 생성한 학생 숫자 
			int hak = 1001;
			String num = "";
			
			Scanner sc = new Scanner(System.in);
			Random rd = new Random();
			String str = "";
			
			
			while(true) {
				System.out.println("[1]학생추가 [2]학생 삭제 [3]수정 [4]검색 [5] 전체출력 [0]종료");
				
				int sel = sc.nextInt();
				if(sel == 0) {
					break;
				}else if(sel == 1) {
					
					if (cnt == 0) {
						hak = 1001;
					}else {
							hak = stList[cnt-1].number + 1;
					}
				
					
					Student stu = new Student();
					
					stu.number = hak ;
					
					while (true) {
					
						// 최대학번 + 1 로 자동으로 학번값 넣어주기 : 학번은 입력받지 않는다
						
						
						
						System.out.println("[추가]아이디");
						int idx = -1;
						str = sc.next();
						
						for (int i = 0; i < cnt ; i++) {
							if (stList[i].id.equals(str)) {
								idx=i;
							}
						}
						if (idx == -1) {
							break;
						}
						
						System.err.println("중복된 아이디입니다. :)");
						System.err.println(stList[idx].id);
					}
					
					stu.id = str;
					
					System.out.println("[추가]이름");
					
					
					// 이름 아이디(중복 금지) 비번 점수(30-100 랜덤하게 가져오기 )
					System.out.println("이름을 입력하여주시오.");
					str = sc.next();
					stu.name = str;
					
					System.out.println("비번을 입력하여주시오.");
					num = sc.next();
					
					stu.pw = num;
					
					System.out.println("점수는 랜덤하게 가져오기.");
					stu.score = rd.nextInt(71)+30;
					
					
					
					stList[cnt] = stu;
					System.out.println("학번 : " + stList[cnt].number);
					System.out.println("id : " + stList[cnt].id);
					System.out.println("pw : " + stList[cnt].pw);
					System.out.println("이름 : " + stList[cnt].name);
					System.out.println("점수 : " + stList[cnt].score);
					System.out.println("=================");
					
					cnt ++;
					
					// 추가
				}else if(sel == 2 && cnt != 0) {
					System.out.println("삭제할 아이디를 입력하세요.");
					str = sc.next();
					int idx = -1;
					
					for (int i = 0; i < cnt; i++) {
						if (stList[i].id.equals(str)) {
							idx = i;
							break;
						}
					}
					if (idx == -1) {
						System.err.println("그 아이디는 존재하지 않습니다.");
						continue;
					}
					
					for (int i = idx; i < stList.length-1; i++) {
						stList[i] = stList[i+1];
					}
					cnt --;
					
					// 삭제
				}else if(sel == 3 && cnt != 0) {
					// 수정 학생 이름 => 점수 수정 
					System.out.println("점수수정할 학생이름을 입력하시오.");
					str = sc.next();
					int idx = -1;
					
					for (int i = 0; i < cnt; i++) {
						if (stList[i].name.equals(str)) {
							idx = i;
							break;
						}
					}
					if (idx == -1) {
						System.err.println("그 이름은 존재하지 않습니다.:(");
						continue;
					}
					
					System.out.println("[1]전체수정모드 [2]선택적수정모드");
					int  nsel = sc.nextInt();
					if (nsel == 1) {
						System.err.println("-주의- 같은 이름인 사람들 모두 수정됨.");
						System.out.print(stList[idx].score + "점수입력===>");
						sel = sc.nextInt();
						
						for (int i = 0; i < cnt; i++) {
							if (str.equals(stList[i].name)) {
								stList[i].score = sel;
							}
						}
					}else if (nsel == 2) {
						idx = -1;
						for (int i = 0; i < cnt; i++) {
							if (str.equals(stList[i].name)) {
							System.out.println(stList[i].name + "   "
									+stList[i].number);
							}
						}
						while (true) {
							System.out.println("어떤 학생의 점수를 수정하시겠습니까 ? 학번으로 입력");
							nsel = sc.nextInt();
							
							for (int i = 0; i < cnt; i++) {
								if (nsel == stList[i].number) {
									idx = i;
									break;
								}
							}
							if (idx != -1) {
								break;
							}
						System.err.println("잘못입력하였습니다.");	
						}
						
						System.out.println("점수입력===>");
						sel = sc.nextInt();
						
						stList[idx].score = sel;
						
						
					}
					
				}else if(sel == 4 && cnt != 0) {
					int idx = -1;
					sel = sc.nextInt();
					for (int i = 0; i < cnt; i++) {
						if (stList[i].number == sel) {
							idx = i;
							break;
						}
					}
					if (idx == -1) {
						System.err.println("그 학번은 존재하지 않습니다.:(");
						continue;
					}
					System.out.println(" 이름 : "+stList[idx].name );
					System.out.println(" 점수 : "+stList[idx].score );
					
					
					//검색 -> 학번 검색 이름, 점수 출력 
				}else if(sel == 5 && cnt != 0) {
					for (int i = 0; i < cnt; i++) {

						System.out.println("학번 : " + stList[i].number);
						System.out.println("id : " + stList[i].id);
						System.out.println("pw : " + stList[i].pw);
						System.out.println("이름 : " + stList[i].name);
						System.out.println("점수 : " + stList[i].score);
						System.out.println("=================");

					}
					
				}else {
					System.err.println("잘못된 접근 ... :<");
				}
			}
			
			
			
		
		
		
		
	}

}
