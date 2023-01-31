package 문자열ex;

import java.util.Arrays;
import java.util.Scanner;

public class 쇼핑몰관리자프로젝트 {

	public static void main(String[] args) {
		/*
		 * # 쇼핑몰 [관리자]
		 * 1. 카테고리와 아이템을 입력받아 아래의 예시와 같이 저장한다.
		 * 2. 카테고리는 각 행의 첫번째 열에 저장한다.
		 * 3. 아이템은 각 행의 두번째 열에 저장한다.
		 *    단, 아이템은 여러개를 추가할 수 있도록 슬러시(/)를 구분자로 연결해준다.
		 * 예)
		 * {
		 * 		{"과일", "사과/포도/"},
		 * 		{"과자", "홈런볼/쪼리퐁/"},
		 * 		{"음료", "콜라/"},
		 * 		{"육류", "소고기/"}
		 * 		...
		 * } 
		 */
			
		String data = "과일,사과/포도\n";
		data+= "과자,홈런볼/조리퐁\n";
		data+= "음료,콜라/사이다/나랑드\n";
		data+= "육류,소고기/돼지고기/오리고기/닭고기\n";

		System.out.println(data);



		Scanner sc = new Scanner(System.in);
		int caCnt = 0; // 카테고리수
		int iCnt = 0; // 아이템 수


		String[][] items = new String[100][2];
		for(int i=0; i<items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		String temp [] = data.split("\n");

		for (int i = 0; i < temp.length; i++) {
			items[i] = temp[i].split(",");
			caCnt++;

		}




		while(true) {

			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리"); // 카데고리 추가 삭제 구현 
			System.out.println("[2]아 이 템  관리"); // 아이템 추가 삭제 구현 
			System.out.println("[3]전체품목 출력");

			System.out.println("카테고리수:" + caCnt);
			System.out.print(": ");
			int sel = sc.nextInt();

			if(sel == 1) {
				while (true) {
					boolean flag = true;
					for (int i = 0; i < caCnt; i++) {
						System.out.printf("[%d] %s\n" , (i +1), items[i][0] );
					}
					System.out.println("[1]추가 [2]삭제[3]뒤로");
					sel = sc.nextInt();

					if (sel == 1) {
						System.out.println("[추가]카테고리입력:");
						String str = sc.next();
						for (int i = 0; i < caCnt; i++) {
							if (str.equals(items[i][0])) {
								flag = false;
								break;
							}
						}

						if (flag) {
							items[caCnt][0] = str;
							caCnt++;
							break;
						}else {
							System.err.println("이미 있는 카테고리입니다...:ㅇ");
						}

					}else if (sel == 2) {
						if (caCnt < 1) {
							System.err.println("삭제할 카테고리가 없습니다,,,");
							continue;
						}
						System.out.println("삭제번호입력");
						sel = sc.nextInt();
						if (sel < 1 || sel > caCnt) {
							System.err.println("번호입력오류");
							continue;
						}

						for (int i = sel-1; i < caCnt; i++) {
							items[i] = items[i+1];
						}
						caCnt--;
					}else if (sel == 3) {
						break;
					}else {
						System.err.println("번호입력오류");
						continue;
					}
				}


			}
			else if(sel == 2) {
				
					
					iCnt = 1;
					if (caCnt == 0) {
						System.err.println("카테고리가 존재하지 않습니다...:o");
						continue;
					}
					System.out.println("카테고리 입력: ");
					String cs = sc.next();
					int idx = -1;
					for (int i = 0; i < caCnt; i++) {
						if (items[i][0].equals(cs)) {
							idx = i;
							break;
						}
					}
					if (idx == -1) {
						System.err.println("그 카테고리는 존재하지 않습니다...:(");
						continue;
					}
					
					for (int i = 0; i < items[idx][1].length(); i++) {
						if (items[idx][1].charAt(i)== '/') {
							iCnt++;
						}
					}
					
					String stemp[] = new String [iCnt];
					stemp = items[idx][1].split("/"); 
					
					for (int i = 0; i < stemp.length; i++) {
						System.out.printf("[%d] %s \n" ,(i+1) ,stemp[i]);
					}	
					
						
						System.out.println("[1]추가 [2]삭제[3]뒤로");
						sel = sc.nextInt();
						
						
						if (sel == 1) {
							
							System.out.println("[추가]아이템 입력: ");
							String str = sc.next();
							boolean chk = false;
							
							for (int i = 0; i < stemp.length; i++) {
								if (stemp[i].equals(str)) {
									chk = true;
								}
							}
							
							if (chk) {
								System.err.println("그거는 이미 있는 아이템입니다.:U");
								continue;
							}
							
							
							if (iCnt ==0) {
								items[idx][1] += str ;
							}else {
								items[idx][1] +=  "/"+ str ;
							}
							
							
							
						}else if (sel == 2) {
							if (iCnt == 1) {
								System.err.println("삭제할 아이템이 없습니다.");
								continue;
							}
							items[idx][1]="";
							System.out.println("삭제할번호를 입력");
							sel = sc.nextInt();
							for (int i = 0; i < stemp.length; i++) {
								if (sel-1 != i) {
									items[idx][1]+=stemp[i]+"/";
								}
							}
							items[idx][1] = items[idx][1].substring(0, items[idx][1].length()-1);		
							
						}else if (sel == 3) {
							continue;
						}
						else {
							System.err.println("번호오류");
							continue;
						}


			}
			else if(sel == 3) {
				if (caCnt == 0) {
					System.err.println("카테고리가 존재하지 않습니다...:o");
					continue;
				}
				for (int i = 0; i < caCnt; i++) {
					System.out.println(Arrays.toString(items[i]));
				}


			}else {
				System.err.println("번호오류");
			}

		}
				
				
				
				
				
				

			}

	}


