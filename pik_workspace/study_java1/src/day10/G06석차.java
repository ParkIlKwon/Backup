package day10;

import java.util.Arrays;

public class G06���� {
	public static void main(String[] args) {
	
			String[] name = {"������", "��ȫö", "���缮", "�ڸ��", "����"};
			int[] score   = {    87,    42,    100,     11,     98};

			for(int i = 0 ; i < score.length ; i++) {
				for(int k=i ; k < score.length ; k++) {
					if(score[i] < score[k]) {
						int temp = score[k];
						String temps = name[k];
						
						name[k] = name[i];
						name[i] = temps;
						score[k] = score[i];
						score[i] = temp;
						
						
					}
					
					
				}
			}
		System.out.println(Arrays.toString(score));
		for(int i = 0 ; i < name.length ; i++) {
			System.out.println(name[i]);
			
		}
		

	}

}
