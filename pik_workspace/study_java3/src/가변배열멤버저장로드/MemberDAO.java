package 가변배열멤버저장로드;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MemberDAO {
	int num; // 학번 1001 시작 
	Member[] memberList;
	
	
	MemberDAO(){
		num = 1001;
	}
	int getValue(String msg , int start , int end) {
		   // 예외처리 적용해보세요 
		int val;
		while (true) {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println(msg +" >> ");
				 val = sc.nextInt();
				 if (val < start || val > end) {
					 throw new Exception("값 입력오류.");
				}
			} catch (InputMismatchException e) {
				System.err.println("문자열은 입력될수 없습니다.");
				continue;
			} catch (Exception e) {
				System.err.println(e.getMessage()); 
				continue;
			}
			return val;
		}
	 }
	
	
	String getString(String msg) {
		String str;
		while (true) {
			Scanner sc = new Scanner(System.in);
			
			try {
				System.out.println(msg +" >> ");
				str = sc.next();
				
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) > '0' && str.charAt(i) < '9') {
						throw new Exception("값 입력오류.");
					}
				}
			} catch (Exception e) {
				System.err.println("숫자는 입력될수 없습니다.");
				continue;
			} 
			return str;
		}
	}
	
	
	void join() {
		
		if (memberList == null) {
			memberList = new Member[1];
			num = 1001;
			memberList[0] = new Member(getString("아이디를 입력하여주세요") , num);
		}else {
			Member temp[] = new Member[memberList.length];
			for (int i = 0; i < temp.length; i++) {
				temp[i] = memberList[i];
			}
			
			
			String str = "";
			
			while (true) {
				str = getString("아이디를 입력하여주세요");
				if (chk(str, -1 , 1) == -1) {
					break;
				} System.err.println("그 아이디는 중복됩니다.");
			}
			
			memberList = new Member[memberList.length+1];
			for (int i = 0; i < temp.length; i++) {
				memberList[i] = temp[i];
			}
			num = memberList[memberList.length-2].num + 1;
			
			memberList[memberList.length-1] = new Member(str, num);
			temp = null;
		}
	}
	
	void remove() {
		if(!isexistMember()) return;
		int idx = chk("",getValue("삭제할 학번입력", 1001, memberList[memberList.length-1].num),2);
		
		if (idx > 1000) {
			System.err.println("일치하는 학번 없음.");
			return;
		}
		
		int index = 0;
		Member temp[] = new Member[memberList.length-1];
		
		for (int i = 0; i < memberList.length; i++) {
			if (idx != i) {
				temp[index] = memberList[i];
				index ++;
			}
		}
		memberList = temp;
		temp = null;
		
	}
	
	int chk(String str , int idx , int pos) {
		if (pos == 1) {
			for (int i = 0; i < memberList.length; i++) {
				if (memberList[i].id.equals(str)) {
					return i;
				}
			}
		} else {
			for (int i = 0; i < memberList.length; i++) {
				if (memberList[i].num == idx) {
					return i;
				}
			}
		}
		
		return idx;
	}
	
	void modify(){
		if(!isexistMember()) return;
		int idx = chk("",getValue("수정할 학번입력", 1001, memberList[memberList.length-1].num),2);
		
		if (idx > 1000) {
			System.err.println("일치하는 학번 없음.");
			return;
		}
		
		System.out.printf("수정할 학생정보 : [학번]%d  [이름]%s" ,memberList[idx].num , memberList[idx].id);
		
		while (true) {
			String str = "";
			int index = chk(str = getString("[ 수정 ] 아이디 입력"),-1,1);
			if (index == -1) {
				memberList[idx].id = str;
				break;
			}
			System.err.println("아이디 중복 :(");
		}
		
	}
	
	
	void printMember(){
		if(!isexistMember()) return;
		for (int i = 0; i < memberList.length; i++) {
			System.out.println(memberList[i]);
		}
	}
	
	void loadData() {
		if(!isexistMember()) return;
		
		String fileName = "src/예외처리/Member01.txt";
		String data = "";
		
		FileWriter fw  = null;
		
		data += memberList.length + "명\n";
		for (Member member : memberList) {
			data += member.num + "," + member.id + "\n";
		}
		
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// 저장패턴 
		// 첫줄은 총몇명인지 저장 
		// 아이디,학번\n 이렇게 한줄로 저장 
		
		// 저장예시
		// 1001,test1 \n l002,test2  
		
	}
	
	boolean isexistMember() {
		if (memberList == null) {
			System.err.println("저장된 정보가 없습니다.");
			return false;
		}return true;
	}
	
	
	void readData() {
		
		String fileName = "src/예외처리/Member01.txt";
		String data = "";
		FileReader fr = null;
		
		try {
			fr = new FileReader(fileName);
			int read =0;
			while(read != -1) {
				read = fr.read();
				data+= (char)read;
			}
			
		} catch (FileNotFoundException e) { // 파일이 존재하지 않으면 에러발생 
			System.out.println("파일이 존재하지 않습니다");
			//e.printStackTrace();
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
		
		System.out.println(data);
		
	}
}
