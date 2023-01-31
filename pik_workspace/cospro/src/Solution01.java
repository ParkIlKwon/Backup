
import java.util.Arrays;

/*

	#����1
	A �б������� ��ü Ƽ������ �ֹ��ϱ� ���� 
	�л����� ���ϴ� Ƽ���� ����� �����߽��ϴ�. 
	������ �� �ִ� Ƽ���� ������� ���� ������� 
	"XS", "S", "M", "L", "XL", "XXL" �� 6������ �ֽ��ϴ�.
	
	�л����� ���ϴ� Ƽ���� ����� ������ ����� ����ִ� 
	�迭 shirtSize�� �Ű������� �־��� ��, 
	������� Ƽ������ �� ���� �ʿ����� ���� ���� ��������� ������� 
	�迭�� ��� return �ϵ��� solution �޼ҵ带 �ϼ����ּ���.
	---
	##### �Ű����� ����
	�л����� ���ϴ� ����� ������ ����� ����ִ� �迭 shirtSize�� 
	solution �޼ҵ��� �Ű������� �־����ϴ�.
	* shirtSize �� ���̴� 1 �̻� 100 �����Դϴ�.
	* shirtSize ���� ġ���� ��Ÿ���� ���ڿ� "XS", "S", "M", "L", "XL", "XXL" �� ����ֽ��ϴ�.
	---
	##### return �� ����
	Ƽ������ ������� �� ���� �ʿ����� ���� ���� ��������� 
	������� �迭�� ��� return ���ּ���.
	* return �ϴ� �迭���� 
	* [ "XS" ����, "S" ����, "M" ����, "L" ����, "XL" ����, "XXL" ����] ������ ����־�� �մϴ�.
	
	---
	##### ����
	
	| shirtSize                        | return        |
	|----------------------------------|---------------|
	| ["XS", "S", "L", "L", "XL", "S"] | [1, 2, 0, 2, 1, 0] |
	
	##### ���� ����
	* "XS"�� "XL"�� ���� �� �� ��û�߽��ϴ�.
	* "S"�� "L"�� ���� �� �� ��û�߽��ϴ�.
	* "M"�� "XXL"�� ��û�� �л��� �����ϴ�.
	
	���� ������� [1, 2, 0, 2, 1, 0]�� �迭�� ��� return �ϸ� �˴ϴ�.
	*/

public class Solution01 {
	public int[] solution(String[] shirtSize) {
		// Write code here.
		String Slist [] = {"XS", "S", "M", "L", "XL", "XXL"};
		int total[] = new int [Slist.length];
		
 	     for (int i = 0; i < shirtSize.length; i++) {
 		     for (int k = 0; k < Slist.length; k++) {
			if (Slist[k] == shirtSize[i]) {
				total[k]++;
			}
 			     
		}
		     
	}
		
		
		int[] answer = total;
		return answer;
	}

	// The following is main method to output testcase.
	public static void main(String[] args) {
		Solution01 sol = new Solution01();
		String[] shirtSize = {"XS", "S", "L", "L", "XL", "S"};
		int[] ret = sol.solution(shirtSize);

		// Press Run button to receive output.  
		System.out.println("Solution: return value of the method is " + Arrays.toString(ret) + " .");
        
        
        
        
        
    }
}
