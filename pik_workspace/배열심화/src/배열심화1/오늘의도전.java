package �迭��ȭ1;

public class �����ǵ��� {

	public static void main(String[] args) { 
		/*
		[����]

		10�� 28�ϳ� ���� ������ �츮 ���� 11�� 30�� ���� �� ���� �ϼ��� ���Ͻÿ�
		11�� 30�� ���ϵ� �Բ� ���Ͻÿ� 

		*/

		int months[] =
		                { 31, 28, 31, 30,
		                  31, 30, 31, 31,
		                   30, 31, 30, 31 };

		        int startMonth = 10;
		        int startDay = 28;
		        int endMonth = 11;
		        int endDay = 30;
		        String weeks[] = { "��", "ȭ", "��", "��", "��", "��", "��" };
		        int week = 4; // ���ۿ���
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
		        
		        System.out.println("����: "+cnt + "��");
		        System.out.println(endMonth+"��"+endDay+"��"+weeks[week] + "����");
		        System.out.printf("����:%d��",cnt-sum);
			
			
			
		        
		        
		        

	}

}
