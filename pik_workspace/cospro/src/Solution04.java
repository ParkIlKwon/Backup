import java.util.Arrays;

/*
#����4
�ڿ����� ����ִ� �迭�� �ֽ��ϴ�. 
�� �迭���� ���� ���� �����ϴ� ������ ������ 
���� ���� �����ϴ� ���� ������ �� ������ ���Ϸ� �մϴ�. 
�̸� ���� ������ ���� ������ ���α׷� ������ �ۼ��߽��ϴ�.

~~~
1�ܰ�. �迭�� ����ִ� �� �ڿ����� ������ ���ϴ�.
2�ܰ�. ���� ���� �����ϴ� ���� ������ ���մϴ�.
3�ܰ�. ���� ���� �����ϴ� ���� ������ ���մϴ�.
4�ܰ�. ���� ���� �����ϴ� ���� ���� ���� �����ϴ� ������ �� �� �� ������ ���մϴ�.
~~~

��, �� �� �� ������ ���� ���� �Ҽ� �κ��� ������ 
���� �κи� ���ϸ� �˴ϴ�.

�ڿ����� ����ִ� �迭 arr�� �Ű������� �־��� ��, 
���� ���� �����ϴ� ���ڰ� ���� ���� �����ϴ� ���ں��� 
�� �� �� ������ return �ϵ��� solution �޼ҵ带 �ۼ��Ϸ� �մϴ�. 
�� ������ �����Ͽ� �ڵ尡 �ùٸ��� ������ �� �ֵ��� 
��ĭ�� �־��� func_a, func_b, func_c �޼ҵ�� 
�Ű������� �˸°� ä���ּ���.

---
##### �Ű����� ����
�ڿ����� ����ִ� �迭 arr�� solution �޼ҵ��� 
�Ű������� �־����ϴ�.
* arr�� ���̴� 3 �̻� 1,000 �����Դϴ�.
* arr���� 1 �̻� 1,000������ �ڿ����� ����ֽ��ϴ�.

---
##### return �� ����
�迭���� ���� ���� �����ϴ� ���ڰ� ���� ���� �����ϴ� ���ں��� 
�� �� �̻� ������ return ���ּ���.

* ���� ���� ����ִ� ���� ������ ���� ���� ����ִ� ���� ������ ���� ��쿡�� 
* 1�� return �մϴ�.

---
##### ����

| arr                   | return |
|-----------------------|--------|
| [1,2,3,3,1,3,3,2,3,2] | 2      |

##### ���� ����
�迭�� 1�� 2��, 2�� 3��, 3�� 5�� ����ֽ��ϴ�.

* ���� ���� ����ִ� ���� : 1 (2��)
* ���� ���� ����ִ� ���� : 3 (5��)

3�� 1���� 2.5�� ���� ���������, �Ҽ� �κ��� ������ 2�� return �ϸ� �˴ϴ�.
 */

public class Solution04 {
    int[] func_a(int[] arr){
        int[] counter = new int[1001];
        for(int i = 0; i < arr.length; i++)
            counter[arr[i]]++;
        return counter;
    }
    
    int func_b(int[] arr){
        int ret = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(ret < arr[i])
                ret = arr[i];
        }
        return ret;
    }
    
    int []func_c(int[] arr){
        final int INF = 1001;
        int idx = 0;
        int ret[] = new int [arr.length];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0 && INF > arr[i]) {
                ret[idx] = arr[i];
            	idx++;
            }
        }
        arr = new int [idx];
        for (int i = 0; i < ret.length; i++) {
		arr[i] = ret[i];	
		}
        
        return ret = arr;
    }
    
    int func_d(int[] arr){
    	
    	for (int i = 0; i < arr.length-1 ; i++) {
			if (arr[i] == 0) {
				arr[i] = arr[i+1];
			}
		}
    	int ret = arr[0];
    	for (int i = 0; i < arr.length; i++) {
    		
			if (ret > arr[i] && arr[i] != 0) {
				ret = arr[i];
			}
		}
    	
    	return ret ;
    }
    
    
    public int solution(int[] arr) {
    	
    	int darr[] = func_c(arr);
    	int[] counter = func_a(darr);
    	int maxCnt = func_b(counter);
    	int minCnt = func_d(counter);
    	int result = maxCnt / minCnt;
    	
    	return result;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution04 sol = new Solution04();
        int[] arr = {1, 2, 3, 3, 1, 3, 3, 2, 3, 2};
        int ret = sol.solution(arr);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret + " .");
        
        
        
        
        
        
    }
}