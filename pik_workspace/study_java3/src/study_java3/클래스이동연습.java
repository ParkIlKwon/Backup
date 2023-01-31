package study_java3;

import java.util.Arrays;

class functionA{
	int arr[];
	
	void init(int arr[]) {
		this.arr = arr;
	}
	
	void some(){
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] ++;
		}
		System.out.println();
	}
	
}

class functionB{
	functionA Af = new functionA();
	int arr[] = {1,2,3};
	
	void run(){
		Af.init(arr);
		Af.some();
		System.out.println(Arrays.toString(arr));
		
	}
	

	
}






public class 클래스이동연습 {

	public static void main(String[] args) {
		
		functionB b = new functionB();
		b.run();
		
	}

}
