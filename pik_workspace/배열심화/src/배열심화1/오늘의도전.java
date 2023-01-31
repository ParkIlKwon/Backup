package 배열심화1;

public class 오늘의도전 {

	public static void main(String[] args) { 
		/*
		[문제]

		10월 28일날 부터 시작한 우리 수업 11월 30일 까지 총 수업 일수를 구하시오
		11월 30일 요일도 함께 구하시오 

		*/

		int months[] =
		                { 31, 28, 31, 30,
		                  31, 30, 31, 31,
		                   30, 31, 30, 31 };

		        int startMonth = 10;
		        int startDay = 28;
		        int endMonth = 11;
		        int endDay = 30;
		        String weeks[] = { "월", "화", "수", "목", "금", "토", "일" };
		        int week = 4; // 시작요일
		        int log = -1;
		        int cnt = 1;
		        int sum = 0;
		        
		        for (int i = startMonth; i < months.length; i++) {
				
		        	for (int k = 1; k <= months[i-1]; k++) {
					if(startDay == k) {
						log = 1;
					}
					
					if (endDay == k  && endMonth == i) {
						log =2;
						break;
					}
		        		if (log ==1) {
		        			if(week == 7) {
		        				week=0;
		        			}
		        			week ++;
		        			cnt ++;
		        			if(week == 5 || week == 6) {
		        				sum++;
		        			}
					}
				}
		        	if (log == 2)break;
			}
		        
		        System.out.println("디데이: "+cnt + "일");
		        System.out.println(endMonth+"월"+endDay+"일"+weeks[week] + "요일");
		        System.out.printf("평일:%d일",cnt-sum);
			
			
			
		        
		        
		        

	}

}
