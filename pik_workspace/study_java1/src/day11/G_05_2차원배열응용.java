package day11;

public class G_05_2�����迭���� {

	public static void main(String[] args) {
		int [][] arr = {
				{10,20,30},
				{10,20,30,40,50},
				{10,20,30,40}
		};
		
		//���Ͱ��� �� ���� ũ�Ⱑ �ٸ� 2�����迭�� �ݺ������� �����
		
		int low = 3;
		int [][] test = new int[low][];
		
		int []list = {3,5,4};
			
		for(int i = 0 ; i < low ; i++) {
			test[i] = new int[list[i]];
				for(int k = 0 ; k < test[i].length ; k++) {
					test[i][k] = arr[i][k];
				}
		}
	
			
		
		
		
		
		
	}

}
