package 제네릭클래스;

import java.util.ArrayList;
import java.util.Arrays;


class MyArrayListG <T>{
	// size() add() add() set() remove() clear()
	Object[] list;
	void add(T d) {
		if(list == null) {
			list = new Object[1];
		}else {
			Object[] temp = list;
			list = new Object[list.length+1];
			for(int i = 0; i < temp.length; i++) {
				list[i] = temp[i];
			}
			
		}
		list[list.length-1] = (T)d;
	}
	void add(int idx , T val) {
		if(idx <0 || idx > list.length) {
			throw new IndexOutOfBoundsException();
		}
		Object[] temp = list;
		list = new Object[list.length+1];
		int index =0;
		for(int i =0; i < list.length; i++) {
			if(idx== i) {
				list[i] = (T)val;
			}else {
				list[i] = temp[index];
				index++;
			}
		}
	}
	void set(int idx, T val) {
		if(idx <0 || idx >= list.length) {
			throw new IndexOutOfBoundsException();
		}
		list[idx] = (T)val;
	}
	void remove(int idx) {
		if(idx <0 || idx >= list.length) {
			throw new IndexOutOfBoundsException();
		}
		Object[] temp = list;
		list = new Object[list.length-1];
		int index =0;
		for(int i =0; i < temp.length; i++) {
			if(idx!=i) {
				list[index] = temp[i];
				index++;
			}
		}
	}
	int size() {
		if(list == null) {
			return 0;
		}
		return list.length;
	}
	
	
	@Override
	public String toString() {
		String data="";
		if(list != null) {
			for(Object val : list) {
				data+= val +",";
			}
			data = data.substring(0,data.length()-1);
		}
		return "[" + data +"]";
	}
	void clear() {
		list = null;
	}
}



public class 어레이리스트제네릭 {

	public static void main(String[] args) {
		
	    double num = 12.32;
	    int num2 = (int)num; // 12 : 강제 형변환 

		MyArrayListG myList = new MyArrayListG();
		System.out.println(myList.size());
		myList.add(10.0); // [10]
		myList.add(20.4); // [10, 20]
		System.out.println(myList);
		System.out.println(myList.size());
		myList.add(0, 100);
		System.out.println(myList);
		myList.set(1, 1000);
		System.out.println(myList);
		myList.remove(0);
		System.out.println(myList.size());
		myList.clear();
		System.out.println(myList.size());

		MyArrayListG<User> list = new MyArrayListG(); // 설계도에 있는 T -> User로 자동 변환 된다
		
		list.add(new User("박연미",30));
		list.add(new User("아이유",33));
		list.add(new User("홍길동",13));
		
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		list.set(0, new User("테스트",35));
		System.out.println(list);

		
	}

}