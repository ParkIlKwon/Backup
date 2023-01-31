
/*
#����10
����� �ڷ��� ���� �ڷ��� ������ ���� ���� �ǹ��մϴ�. 
�ڿ����� ����ִ� �迭�� ����� ���ϰ�, 
��� ������ ���ڴ� �� �� �ִ��� ���Ϸ��մϴ�.

���� ��� �־��� �迭�� [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]�̶��, 
����� 5.5�̹Ƿ� �迭���� ��� ������ ���� 5���Դϴ�.

�ڿ����� ����ִ� �迭 data�� �Ű������� �־��� ��, 
�迭�� ��� ������ ���� �� ������ return �ϵ���
 solution �޼ҵ带 �ۼ��߽��ϴ�. 
 �׷���, �ڵ� �Ϻκ��� �߸��Ǿ��ֱ� ������, 
 ��� �Է¿� ���ؼ��� �ùٸ��� �������� �ʽ��ϴ�.
 �־��� �ڵ忡�� _**�� ��**_�� �����ؼ� ��� �Է¿� ���� 
 �ùٸ��� �����ϵ��� �����ϼ���.

---

#####�Ű����� ����
�ڿ����� ����ִ� �迭 data�� 
solution �޼ҵ��� �Ű������� �־����ϴ�.
* data�� ���̴� 10 �̻� 100 ���� �����Դϴ�.
* data�� ���Ҵ� 1 �̻� 1,000 ������ �ڿ����Դϴ�.

---

#####return �� ����
��պ��� ���� ���� �ڿ����� ����� return ���ּ���.

---
#####����

| data                            | return |
|---------------------------------|--------|
| [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] | 5      |
| [1, 1, 1, 1, 1, 1, 1, 1, 1, 10] | 9      |

---
#####���� ����
���� #1
�ڷ��� ���� 55�̸�, �ڷ��� ������ 10���Դϴ�. 
���� ����� 55 / 10 = 5.5�Դϴ�.
�־��� �迭���� 5.5���� ���� ���ڴ� �� 5���Դϴ�.

���� #2
�ڷ��� ���� 19�̸�, �ڷ��� ������ 10���Դϴ�. 
���� ����� 19 / 10 = 1.9�Դϴ�.
�־��� �迭���� 1.9���� ���� ���ڴ� �� 9���Դϴ�.

 */

public class Solution10 {
    public int solution(int[] data) {
        double total = 0;
        int len = data.length;
        for(int i = 0; i < len; i++)
            total += data[i];
        int cnt = 0;
        double average =  total / len;
        for(int i = 0; i < len; i++)
            if (data[i] <= average)
                cnt += 1;
        return cnt;
    }
    
    // The following is main method to output testcase. 
    // The main method is correct and you shall correct solution method.
    public static void main(String[] args) {
    	Solution10 sol = new Solution10();
        int[] data1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ret1 = sol.solution(data1);
        
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        int[] data2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 10};
        int ret2 = sol.solution(data2);
        
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret2 + " .");
        
        
        
    }
}


