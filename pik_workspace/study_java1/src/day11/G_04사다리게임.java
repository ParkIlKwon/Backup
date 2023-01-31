package day11;

import java.util.Scanner;

public class G_04��ٸ����� {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		String menu[] = {"�����" , "���" ,"¥���" , "�̸�" , "�����"};
		
		int ladder[][]= {
			//   0 1 2 3 4
				{0,0,0,0,0},
				{1,2,0,1,2},
				{0,1,2,0,0},
				{0,0,1,2,0},
				{1,2,0,0,0},
				{0,1,2,0,0},
				{1,2,0,0,0},
				{0,0,0,1,2},
				{0,0,0,0,0}};
		
		int x = 0; int y = 0;
		for(int i =0; i < 5; i++) {
			System.out.printf("(%d)",i);
		}
		
		System.out.println();
		for(int i =0 ; i < ladder.length; i++) {
			for(int k=0; k < ladder[i].length; k++){
				if(ladder[i][k]==0) {
					System.out.print(" �� ");
				}else if(ladder[i][k]==1) {
					System.out.print(" ����");
				}else {
					System.out.print("���� ");
				}
			}
			System.out.println();
		}
		
        System.out.println("��  ��  ¥  ��  ��");
		
        System.out.println("0-4�� ����");
        int sel = sc.nextInt();
        if(sel < 0 || sel >= ladder[0].length) {
        	System.out.println("�ε��� ����");
        }else {
        	x = sel;
        	for(int i =0; i < ladder.length;i++) {
        		if(ladder[y][x] == 1) {
        			x++;
        		}else if(ladder[y][x]==2) {
        			x--;
        		}
        		y++;
        	}
        	
        	System.out.println("������ ���� :" + menu[x]);
        	
        }

	}

}
