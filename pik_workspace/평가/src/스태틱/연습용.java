package 스태틱;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class 연습용 {

	public static void main(String[] args) {

		ArrayList<Integer> testnumber = new ArrayList<Integer>();
		ArrayList<Integer> testscore = new ArrayList<Integer>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		testnumber.add(1001);testnumber.add(1002);testnumber.add(1003);
		testscore.add(86);testscore.add(40);testscore.add(70);
		temp.addAll(testscore);
		Collections.sort(testscore,Collections.reverseOrder());
	//	testscore.sort(Comparator.naturalOrder());
		
		System.out.println(testnumber);
		System.out.println("정렬후===>"+testscore);
		System.out.println("고정템프===>"+temp);
		
		
		
	}
	
}
