package day04;

public class F_09�ݺ������4 {
	public static void main(String[] args) {
		/*
		 * [����]
		 *  28�� ��� �߿��� ���� ū ���ڸ� ���� ����Ͻÿ�.
		 *  �� : 980 
		 */
		int i=950,min=0;
		while(i<1000) {
			if(i%28==0) {
				min=i;
			}
			i++;	//���ҿ����� �ᵵ�� . i --
		}
		System.out.println(min);
	}

}
