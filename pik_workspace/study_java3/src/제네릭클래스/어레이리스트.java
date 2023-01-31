package 제네릭클래스;

import java.util.ArrayList;
import java.util.Arrays;

class MyArrayList{
	
	// size() add() add() set() remove() clear()
	
	int size(int[] list) {
		if(!chk(list,0));
		if (list == null) {
			return 0;
		}
		return list.length;
	}
	
	int []add(int num, int[] list) {
		if (list == null) {
			list = new int [1];
			list[0] = num;
		}else {
			int temp [] = new int [list.length];
			for (int i = 0; i < temp.length; i++) {
				temp[i] = list[i];
			}
			list = new int [temp.length+1];
			for (int i = 0; i < temp.length; i++) {
				list[i] = temp[i];
			}
			list[list.length-1] = num;
		}
		return list;
	}
	
	int []add(int idx,int val,int[]arr){
		int temp[] = new int [arr.length+1];
		int index = 0;
		for (int i = 0; i < temp.length; i++) {
			
			if (idx == i) {
				temp[i] = val;
			}else {
				temp[i] = arr[index];
				index++;
			}
		}
		
		
		return temp;
	}
	
	int []remove(int idx, int[] list){
		if(!chk(list,idx)) return list;
		list[idx] = 0;
		int index = 0;
		int temp[] = new int [list.length-1];
		for (int i = 0; i < list.length; i++) {
			if (list[i] != 0) {
				temp[index] = list[i];
				index ++;
			}
		}
		
		return temp;
	}
	
	int []clear(int[] list){
		list = new int[0];
		
		return list;
	}
	
	String printList(int [] array) {
		
		return Arrays.toString(array);
	}
	
	boolean chk(int [] list , int idx) {
		if (list == null) {
			System.err.println("null points exception");
			return false;
		}else if (0 > idx || list.length-1 < idx) {
			System.err.println("out of bounds");
			return false;
		}
		return true;
	}
	
	
	
}

public class 어레이리스트 {

	public static void main(String[] args) {
		// 래퍼 클래스 원시타입의 자료형을 감싼 클래스 
		// int 하는 원시타입 : 순수하게 값만 저장 
		// Interger 클래스 : 값 저장 + 기능
		int num = 10;
		
		
			MyArrayList myList = new MyArrayList();
			int[] arr = null;
			System.out.println(myList.size(arr)); // 0 
			arr = myList.add(10, arr); 
			System.out.println(myList.printList(arr)); // [10]
			arr= myList.add(20, arr); 
			System.out.println(myList.printList(arr)); //[10,20]
			System.out.println(myList.size(arr)); //2
			arr= myList.add(2,100, arr); 
			System.out.println(myList.printList(arr)); //[10,20,100]
			arr= myList.add(0,200, arr);
			System.out.println(myList.printList(arr)); //[200,10,20,100]
			arr = myList.remove(0, arr);
			System.out.println(myList.printList(arr)); //[10,20,100]
			arr = myList.clear(arr);
			System.out.println(myList.printList(arr)); //[]
			System.out.println(myList.size(arr)); //0
		
			
		
		
		
		
	}

}
