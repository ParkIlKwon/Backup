package test1;

public class Timer {
	
	long beforeTime = System.currentTimeMillis(); 
	long settime(int size){
		return beforeTime + (size * 10000 );
	}

}
