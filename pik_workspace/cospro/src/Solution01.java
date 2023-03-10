
import java.util.Arrays;

/*

	#문제1
	A 학교에서는 단체 티셔츠를 주문하기 위해 
	학생별로 원하는 티셔츠 사이즈를 조사했습니다. 
	선택할 수 있는 티셔츠 사이즈는 작은 순서대로 
	"XS", "S", "M", "L", "XL", "XXL" 총 6종류가 있습니다.
	
	학생별로 원하는 티셔츠 사이즈를 조사한 결과가 들어있는 
	배열 shirtSize가 매개변수로 주어질 때, 
	사이즈별로 티셔츠가 몇 벌씩 필요한지 가장 작은 사이즈부터 순서대로 
	배열에 담아 return 하도록 solution 메소드를 완성해주세요.
	---
	##### 매개변수 설명
	학생별로 원하는 사이즈를 조사한 결과가 들어있는 배열 shirtSize가 
	solution 메소드의 매개변수로 주어집니다.
	* shirtSize 의 길이는 1 이상 100 이하입니다.
	* shirtSize 에는 치수를 나타내는 문자열 "XS", "S", "M", "L", "XL", "XXL" 이 들어있습니다.
	---
	##### return 값 설명
	티셔츠가 사이즈별로 몇 벌씩 필요한지 가장 작은 사이즈부터 
	순서대로 배열에 담아 return 해주세요.
	* return 하는 배열에는 
	* [ "XS" 개수, "S" 개수, "M" 개수, "L" 개수, "XL" 개수, "XXL" 개수] 순서로 들어있어야 합니다.
	
	---
	##### 예시
	
	| shirtSize                        | return        |
	|----------------------------------|---------------|
	| ["XS", "S", "L", "L", "XL", "S"] | [1, 2, 0, 2, 1, 0] |
	
	##### 예시 설명
	* "XS"와 "XL"은 각각 한 명씩 신청했습니다.
	* "S"와 "L"은 각각 두 명씩 신청했습니다.
	* "M"과 "XXL"을 신청한 학생은 없습니다.
	
	따라서 순서대로 [1, 2, 0, 2, 1, 0]을 배열에 담아 return 하면 됩니다.
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
