package 클래스배열;

import java.util.Arrays;

public class 클배_기본예제1 {

	public static void main(String[] args) {
		
		String data = "";
		
		String darr[][] = new String[3][5];
		
		data += "1001,qwer,1234,김철민,10\n";
		data += "1002,asdf,2345,우중현,3\n";
		data += "1003,zxcv,3456,이만수,30";
		String temp[] = data.split("\n");
		
		System.out.println(temp[0]);
		
		for (int i = 0; i < darr.length; i++) {
				darr[i] = temp[i].split(",");
		}
		
		for (int i = 0; i < darr.length; i++) {
			System.out.println(Arrays.toString(darr[i]));
		}
		
	    // stList 클래스배열에 데이터를 넣고 1등 출력 
		
		Student[] stList = new Student[temp.length];
		
		for (int i = 0; i < 3; i++) {
			Student stu = new Student();
			stu.number = Integer.parseInt(darr[i][0]);
			stu.id = darr[i][1];
			stu.pw = darr[i][2];
			stu.name =  darr[i][3];
			stu.score = Integer.parseInt(darr[i][4]);
			stList[i] = stu; 
		}
		
		int tem = stList[0].score;
		for (int i = 0; i < stList.length; i++) {
			System.out.println(stList[i].score);
				if (tem < stList[i].score) {
					tem = stList[i].score;
				}
			}
		System.out.println("1등은 =========== ");
		for (int i = 0; i < stList.length; i++) {
			if (tem == stList[i].score) {
				System.out.println("학번 : " + stList[i].number);
				System.out.println("id : " + stList[i].id);
				System.out.println("pw : " + stList[i].pw);
				System.out.println("이름 : " + stList[i].name);
				System.out.println("점수 : " + stList[i].score);
				System.out.println("=================");
				
			}
		}
			
		
		
		
		
	}

}
