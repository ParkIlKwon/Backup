package 제네릭클래스;

class whatthe{
	
	void sum(int []arr){
		arr[0]++;
	}
	
}



public class 뭐지 {

	public static void main(String[] args) {
		whatthe w = new whatthe();
		int arr[] = {1};
		w.sum(arr);
		System.out.println(arr[0]);
	}

}
