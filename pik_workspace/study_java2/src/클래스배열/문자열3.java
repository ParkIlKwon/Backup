package 클래스배열;

import java.util.Arrays;

class Member{
			int no;
			int point;
			String name;
			boolean best;
		}
public class 문자열3 {

	public static void main(String[] args) {
	
		String data1 = "1001/3,1002/1,1001/3,1003/5,1004/1,1002/2";
		String data2 = "1001/이만수,1002/김철수,1003/신민아,1004/박상아";
		String dtemp1[] = data1.split(",");
		String dtemp2[] = data2.split(",");
		// data1 은 사원번호와 판매실적이다.
		// data2 는 사원번호와 이름이다.
		// 판매실적이 4이상인사원은 best를 true로 저장하세요.
		
		System.out.println(Arrays.toString(dtemp1));
		
		System.out.println("==================");
		
		System.out.println(Arrays.toString(dtemp2));
		
		int memt[][] = new int [dtemp2.length][2];
		
		for (int i = 0; i < dtemp1.length; i++) {
			String temp [] = new String [2];
			temp = dtemp1[i].split("/");
			memt[Integer.parseInt(temp[0]) - 1001][0] = Integer.parseInt(temp[0]);
			memt[Integer.parseInt(temp[0]) - 1001][1] += Integer.parseInt(temp[1]);

		}
		System.out.println("=================");
		
		for (int i = 0; i < memt.length; i++) {
			System.out.println(Arrays.toString(memt[i]));
		}
		// 문제1) 위데이터를 참고해서 Member 클래스 배열을 완성후 전체출력해보세요.
	
		Member[] memberList = new Member[memt.length];
		
		for (int i = 0; i < memberList.length; i++) {
			String temp [] = new String [2];
			temp = dtemp2[i].split("/");
			Member m = new Member();
			m.no = memt[i][0];
			m.best = memt[i][1] >= 4 ? true : false;
			m.name = temp[1];
			
			memberList[i]  =  m;
		}
		
		
		for (Member member : memberList) {
			System.out.print(member.no);
			System.out.print("   ");
			System.out.print(member.name);
			System.out.println(member.best);
			
		}
		System.out.println("===========================");
		
		for (Member member : memberList) {
			if (member.best == true) {
				System.out.print(member.no);
				System.out.print("   ");
				System.out.println(member.name);
			}
			
		}
		
		
		
		
		
		
		
		// 문제2) 판매실적이 best 인회원 이름출력 
		
		
		
		
		
		
		
		
		
		


	}

}
