package day10;

import java.util.Arrays;

public class G06석차 {
	public static void main(String[] args) {
	
			String[] name = {"정형돈", "노홍철", "유재석", "박명수", "하하"};
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
