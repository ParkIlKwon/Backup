
/*
#����8
�տ������� ���� ���� �ڿ������� ���� �� 
�Ȱ��� �ܾ� �Ǵ� ������ �Ӹ����(palindrome)�̶�� �մϴ�. 
���� �� racecar, noon�� �Ӹ���� �ܾ��Դϴ�. 

�ҹ��� ���ĺ�, ����(" "), �׸��� ��ħǥ(".")�� �̷���� ������ 
�Ӹ���� �������� �����Ϸ� �մϴ�. 
���� ������ ���ĺ��� �����Ͽ��� ���� �Ӹ���� �ܾ��̸� 
�Ӹ���� �����Դϴ�. ���� ���, "Never odd or even."�� ���� ������ �Ӹ�����Դϴ�.

�ҹ��� ���ĺ�, ����(" "), �׸��� ��ħǥ(".")�� �̷���� ���� 
sentence�� �־��� �� �Ӹ�������� �ƴ����� return �ϵ��� 
solution �޼ҵ带 �ۼ��߽��ϴ�. 
�׷���, �ڵ� �Ϻκ��� �߸��Ǿ��ֱ� ������, 
��� �Է¿� ���ؼ��� �ùٸ��� �������� �ʽ��ϴ�. 
�־��� �ڵ忡�� _**�� ��**_�� �����ؼ� ��� �Է¿� ���� 
�ùٸ��� �����ϵ��� �������ּ���.

---
##### �Ű����� ����
�ҹ��� ���ĺ�, ����(" "), �׸��� ��ħǥ(".")�� �̷���� ���� 
sentence�� solution �޼ҵ��� �Ű������� �־����ϴ�.

* sentence�� ���̴� 1�̻� 100�����Դϴ�.
* sentence���� ��� �ϳ��� ���ĺ��� ���ԵǾ� �ֽ��ϴ�.
* setntence�� �� ���ڴ� �ҹ��� ���ĺ�, ����(" "), 
* �Ǵ� ��ħǥ(".")�Դϴ�.

---
##### return �� ����
�־��� ������ �Ӹ�������� �ƴ����� return ���ּ���.

---
##### ����

| sentence             	| return 	|
|----------------------	|--------	|
| "never odd or even." 	| true   	|
| "palindrome"         	| false  	|


##### ���� ����
���� #1
���ĺ��� ���ڸ� �����Ͽ� �ҹ��ڷ� ��ȯ�غ��� 
"neveroddoreven"�� �Ǹ� �� �ܾ�� �Ӹ�����Դϴ�.

���� #2
������ �� �� ������ "p"�� �� �� ������ 
"e"�� �ٸ��Ƿ� �Ӹ������ �ƴմϴ�.
 */
import java.util.*;

public class Solution08 {
    boolean solution(String sentence){
        String str = sentence;
        int len = 0;
        str = str.replace(" ", "");
        str = str.replace(".", "");
        for (int i = 0; i < str.length(); i++) {
			len++;
		}
        len = len % 2 == 0 ? len : len-1 ; 
        
        for (int i = 0; i < len/2; i++) {
			if (str.charAt(i) != str.charAt((str.length()-1) - i)) {
				return false;
			}
		}
        
        return true;
        
    }

    // The following is main method to output testcase. 
    // The main method is correct and you shall correct solution method.
    public static void main(String[] args) {
    	Solution08 sol = new Solution08();
        String sentence1 = "never odd or even.";
        boolean ret1 = sol.solution(sentence1);
        
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        
        String sentence2 = "palindrome";
        boolean ret2 = sol.solution(sentence2);
        
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret2+ " .");       
    }
}