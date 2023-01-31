package 예외처리;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class 파일기본입출력문제 {

	public static void main(String[] args) {
		// ctrl + shift + o 
				Scanner scan = new Scanner(System.in);

				String nameData = "김철수,이만수,이영희";
				String ageData ="20,30,40";
				String fileName = "src/예외처리/file03.txt";
				String data = "";		
				String nameinfo[] = nameData.split(",");
				String ageinfo[] = ageData.split(",");
				
				String arr[] = new String[nameinfo.length];
				
				for (int i = 0; i < arr.length; i++) {
					arr[i] = "";
					arr[i] += nameinfo[i] + "/";
					arr[i] += ageinfo[i] + "\n";
					System.out.print(arr[i]);
				}
				
				FileWriter fw  = null;
				FileReader fr = null;
				
				while(true) {
					
					System.out.println("[0] 종료 [1] 저장 [2] 로드");
					int sel = scan.nextInt();
					if(sel == 0) {
						break;
					}
					else if(sel == 1) {
						try {
							fw = new FileWriter(fileName);
							for (int i = 0; i < arr.length; i++) {
								fw.write(arr[i]);
							}
						} catch (Exception e) {
							e.printStackTrace();
						}finally {
							try {
								fw.close();
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
//						[저장] 김철수/20\n이만수/30\n이영희/40 이렇게 데이터를 만들어 파일 생성후 저장하시오. 
						
					}
					else if(sel == 2) {
						
						String[] nameList = null;
						int [] ageList = null;	
						
						try {
							fr = new FileReader(fileName);
							int read = 0;
							while(read != -1) {
								read = fr.read();
								data+= (char)read;
							}
							
						} catch (Exception e) {
							System.out.println("파일이 존재하지 않습니다");
						}
						finally {
							try {
								fr.close();
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
						
						String info[] = new String [data.length()];
						nameList = new String[arr.length];
						ageList = new int [arr.length];
						info = data.split("\n");
						
						for (int i = 0; i < arr.length; i++) {
							String temp[] = info[i].split("/");
							nameList[i] = temp[0];
							ageList[i] = Integer.parseInt(temp[1]);
						}
						
						System.out.println("네임 리스트" + Arrays.toString(nameList));
						System.out.println("에이지 리스트" + Arrays.toString(ageList));
						
						
//						[로드] 파일을 불러와서 nameList, ageList 배열에 저장하시오 
						
					}
					
				}

	}

}
