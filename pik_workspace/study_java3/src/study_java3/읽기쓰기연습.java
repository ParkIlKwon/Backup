package study_java3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class 읽기쓰기연습 {

	public static void main(String[] args) {

		String fileName = "E:\\풀스택주간\\pik_workspace\\Project_MineSweeper\\src\\MineSweeper\\mine.txt";
		FileReader fr = null;
		String data="";
		try {
			fr = new FileReader(fileName);
			int read =0;
			
			while(read != -1) {
				
					read = fr.read();
					data+= (char)read;
			}
			
		} catch (FileNotFoundException e) { // 파일이 존재하지 않으면 에러발생 
			System.out.println("파일이 존재하지 않습니다");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fr!= null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		int tarr[][][] = new int [5][5][4];
		String arr [] = data.split("\n");
		System.out.println(Arrays.toString(arr));
		int time = Integer.parseInt(arr[0]);
		System.out.println(time);
		String darr[][] = new String[5][];
		
		
		for (int i = 1; i < arr.length-1; i++) {
			for (int k = 0; k < darr.length; k++) {
				darr[i-1] = arr[i].split("/");
			}
		}
		
		for (int i = 0; i < darr.length; i++) {
			for (int k = 0; k < darr[i].length; k++) {
				for (int j = 0; j < darr[i][k].length(); j++) {
					tarr[i][k][j] = darr[i][k].charAt(j) - '0' ;
				}
			}
		}
		
		
		for (int i = 0; i < darr.length; i++) {
			for (int j = 0; j < darr.length; j++) {
				System.out.print(Arrays.toString(tarr[i][j]));
			}
			System.out.println();
		}
		
		
		
	}

}
