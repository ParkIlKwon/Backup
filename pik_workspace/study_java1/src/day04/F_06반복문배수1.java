package day04;

public class F_06�ݺ������1 {
	public static void main(String[] args) {
		/*
		 * [����] 
		 * 	7�� �����  150���� �������� ����ū�� ����Ͻÿ�. 
		 *  (� ���� ����� �� ���� ������ ���� ���̴�.) 
		 *  �� : 147
		 */
		int i=1,min=i;
		while (i<150) {
			if(i%7==0) {
				min=i;
				if (min>i) {
					min=i;
				}
			}
			i++;
		}
		System.out.println(min);
	}

}
