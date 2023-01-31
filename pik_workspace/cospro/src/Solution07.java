
/*
#����7
A ���п����� ���غ� ���� ���Ǹ� �����ϰ� �ֽ��ϴ�. 
�ʱ� ���� ���Ǵ� ���ͽ��迡�� 650�� �̻� 800�� �̸���
������ ����� �л����� ����������� �ϰ� �ֽ��ϴ�. 
�ʱ� ���� ���ǿ� ������û�� ����� 10���� ��, 
�� �߿��� ����� ���� ��� �ش��ϴ��� Ȯ���Ϸ��մϴ�.

������û�ڵ��� ���� ������ ����ִ� �迭 scores�� �Ű������� �־��� ��, 
���� ����ڵ��� �ο����� return �ϵ��� solution �޼ҵ带 �ۼ��߽��ϴ�. 
�׷���, �ڵ� �Ϻκ��� �߸��Ǿ��ֱ� ������, 
��� �Է¿� ���ؼ��� �ùٸ��� �������� �ʽ��ϴ�. 
�־��� �ڵ忡�� _**�� ��**_�� �����ؼ� 
��� �Է¿� ���� �ùٸ��� �����ϵ��� �������ּ���.

---
#####�Ű����� ����
������û�ڵ��� ���� ������ ����ִ� �迭 scores�� 
solution �޼ҵ��� �Ű������� �־����ϴ�.
* scores�� ���Ҵ� 500 �̻� 990 ������ �����Դϴ�.
* scores�� ���̴� 10�Դϴ�.
---
#####return �� ����
���� ����ڵ��� �ο����� return ���ּ���.
---
#####����
| scores                                             | return |
|----------------------------------------------------|--------|
| [650, 722, 914, 558, 714, 803, 650, 679, 669, 800] | 6      |

#####���� ����
|����        | 650 | 722 | 914 | 558 | 714 | 803 | 650 | 679 | 669 | 800 |
|------ |-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|
|���� ��� | O   | O   | X   | O   | X   | O   | O   | O   | X   |

650�� �̻� 800�� �̸��� ������ ����� �л��� ��������̹Ƿ�, 
800���� ����� �л��� ��������� �ƴմϴ�.
����, 6���� ���� ����Դϴ�.
 */

public class Solution07 {
    public int solution(int[] scores) {
        int count = 0;
        System.out.println("|����        | 650 | 722 | 914 | 558 | 714 | 803 | 650 | 679 | 669 | 800 |");
        System.out.println("|------     |-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|");
        System.out.print("|���� ���    ");
        for (int i = 0; i < scores.length; i++) {
            if (650 <= scores[i] && scores[i] < 800) {
            	System.out.print("| O   ");
            	count += 1;}
            else {
				System.out.print("| X   ");
			}
                
                }
        System.out.println();
        
        
        return count;
    }

    // The following is main method to output testcase. The main method is correct and you shall correct solution method.
    public static void main(String[] args) {
    	Solution07 sol = new Solution07();
        int[] scores = {650, 722, 914, 558, 714, 803, 650, 679, 669, 800};
        int ret = sol.solution(scores);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}

























