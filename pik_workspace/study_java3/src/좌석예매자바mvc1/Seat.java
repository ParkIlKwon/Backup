package 좌석예매자바mvc1;

public class Seat {
	String userID;
	int number;
	boolean check;
	
	void showNum() {
		System.out.print(number + " ");
	}
	void showData() {
		
		if(check == true) {
			System.out.print("■ ");
		}
		else {
			System.out.print("□ ");
		}
	}
	
	public Seat() {
		// TODO Auto-generated constructor stub
	}
	
	public Seat(String userID, int number, boolean check) {
		super();
		this.userID = userID;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Seat [userID=" + userID + ", number=" + number + ", check="
				+ check + "]";
	}	
	
	
}