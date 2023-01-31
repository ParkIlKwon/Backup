package 파일입출력;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 읽기쓰기연습 {

	public static void main(String[] args) {
		String filename = "src/파일입출력/읽기쓰기연습.txt";
		
		FileWriter fw = null;
		
		
		try {
			fw = new FileWriter(filename);
			for (int i = 0; i < 10; i++) {
				if (i != 3) {
					fw.write(i+"");
				}
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("파일" + filename + "생성완료");
		}
		
		FileReader fr = null;
				
		try {
			fr = new FileReader(filename);
			String data = "";
			int log = 0;
			
			for (int i = 0; i < 100; i++) {
				System.out.println(log = fr.read() - 48);
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("파일 읽어오기 완료.");
		}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
