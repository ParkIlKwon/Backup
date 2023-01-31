package 문자열;

public class 문자열_02 {

	public static void main(String[] args) {

		//만나이
		String jumin1 = "890101-2012932";
		String jumin2 = "040101-3012932";
		String result1 ="";
		String result2 ="";
		String temp;
		// 문제1) 주민1 성별 출력 -> 여성
		
		String x = jumin1.substring(7,8);
		String y = jumin2.substring(7, 8);
		
		if(Integer.parseInt(x) == 2) {
			temp="여성";
		}else {
			temp="남성";
		}
		result1+=temp;
		result1+="  ";
		x=jumin1.substring(0,2);
		y=jumin2.substring(0,2);
		
		int xx=Integer.parseInt(x);
		int yy =Integer.parseInt(y);
		// 문제2) 주민1 나이 출력 -> 34세(성인)
		
		result1+=2022-(1900+xx);
		
		if(Integer.parseInt(y) == 2) {
			temp = "여성";
		}else {
			temp="남성";
		}
		result2+=temp;
		result2+=" ";
		
		result2+=2022-(2000+yy);
		
		if(2022-(2000+yy) < 20){
			result2+=" (청소년) ";
		}
		// 문제3) 주민2 성별 출력 -> 남성
		
		// 문제4) 주민2 나이 출력 -> 18세(청소년)
		
		
		System.out.println(result1);
		System.out.println(result2);
		
		
		
		
		
	}

}
