package programers;

class Solution {
    public int solution(String[] babbling) {
    	String [] chk = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for (int i = 0; i < babbling.length; i++) {
        	int idx = 0;
        	int cnt = babbling[i].length();
        	boolean check = false;
        	
        	for (int j = 0; j < chk.length; j++) {
        		for (int k = idx; k < babbling[i].length(); k++) {
        			
        			if (chk[j].charAt(0) == babbling[i].charAt(k) && k < babbling[i].length()-1) {
						for (int k2 = 0; k2 < chk[j].length(); k2++) {
							if (chk[j].charAt(k2) == babbling[i].charAt(k)) {
								cnt--;
								idx++;
								k++;
								if (k > babbling[i].length()-1) {
									break;
								}
							}
						}
					}
        		}
        	//	System.out.println(cnt);
        		if(cnt == 0) {
        			check = true;
        		}
			}
        	if (check) {
				answer++;
			}
		}
        
        
        
        return answer;
    }
}

public class 옹알이 {

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		String [] babbling1 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}; // 1;
		
		System.out.println(sol.solution(babbling1));
		
		
	}

}
