import java.util.Scanner;

import com.sun.source.tree.Tree;

public class variable {
	Scanner sc = new Scanner(System.in);
	int a,b;
	
	
	
	void input() {
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		this.a = a;
		this.b = b;
			
	}
	
	
	int sum() {
		return a+b;
	}
	 int chk() {

		return  sum() < -100 ? -9999 : 0 ;
	}
	
	void Output() {
		if (sum()<-100) {
			System.out.println("종료합니다.");
			return;
		}
		System.out.println(a+b);
	}
	
	static int  function() {	
		
		int temp = 1;
		
		return temp;
	}
	
	
	
	
	public static void main(String[] args) {

		variable v = new variable();
		int chk =0;
		while (true) {
			v.input();
			v.sum();
			v.chk();
			v.Output();
			
			if(chk > -8888) {
				break;
			}
		}
		
		//System.out.println(function());	
		
		
		
	}

}
