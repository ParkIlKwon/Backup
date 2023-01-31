package 메서드2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

	class myclass1{
		int num = 1;
	}
	
	class myclass2{
		
		
		void init(){
		
		}
		
		void function_A(){
			init();
			myclass1 my1[] = new myclass1[1];
			my1[0] = new myclass1();
			int a [] = {1};
			int b [] = {1};
			function_B(my1);
			print(my1);
			
			
			
			
		}

		private void print(myclass1 my[]) {
			System.out.println(my[0].num);
		}
		
		void function_B(myclass1 my[]){
			my[0].num +=1;
		} 
		
		
	}






public class 실험용도 {
	public static void main(String[] args) {
		
//		myclass1 mc1 = new myclass1();
//		myclass2 mc2 = new myclass2();
//		mc2.function_A();

		
		while (true) {
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}