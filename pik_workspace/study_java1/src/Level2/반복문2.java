package Level2;

import java.util.Random;
import java.util.Scanner;


public class �ݺ���2 {

	public static void main(String[] args) {
		/*
		 * ö���� �������� ���� 50�� ������ �ǹ��ְ� �Ǿ���. 
		 * ö���� ������ ���������Ϳ��� ����4�� ���� ���� �ߴ�. 
		 * ���࿡ ������ 4���� ���ٸ� ���� 5�� �������Ѵ�. 
		 * ö���� ������ ����1������ ����50���̰� , ���� ���������Ϳ� �����ִ� ���ڸ� 1������ ������� ����Ͻÿ�. 
		 * [��]
		 * 		1 2 3 5 6 7 8 9 10 11 12 13 15 .... 66
		 * 
		 */
		System.out.println("===����1===");
		int cnt = 0;
		
		for(int i = 1 ; cnt <= 51 ; i++) {
		
			if(i%10 == 4) {
				
				cnt--;
				continue;
			}
		
			System.out.print(i+" ");
			cnt++;
			
		}
		//5��
		
		System.out.println();
		System.out.println("===����2===");
		
		/*
		 * 	ö���� 50�� ������ �������̴�.
		 *  û�Ҹ� ���� û������ 3���� ����ߴ�. 
		 *  û�Ҵ� �ѻ���� �ΰ����� û���ϱ�� �޴�. 
		 *  ������� ����1�� [1�� 2��] û���ϸ�, ����2�� [3�� 4��] , ����3�� [5�� 6��]�� û���Ѵ�.
		 *  �ٽ� ����1�� [7�� 8��], ����2�� [9�� 10��], ����3�� [11�� 12��]�� û���Ѵ�. 
		 *  �̷������� 50���� ���� û���Ѵ�. 
		 * 	���� û��������, ����2�� û���� ���� ���� ����Ͻÿ�.
		 *  [����]
		 *  	3,4,9,10,15,16.....
		 */
		int idx = 1;
		for(int i = 1 ; i <=50 ; i++) {
			i += 2;
			System.out.print(i+" ");
			System.out.print(i+1);
			System.out.print("        ");
			i += 3;
		}
		
		//5��
		
		System.out.println();
		System.out.println("===����3===");
		
		/*
		ö���� ���� �ֽĿ� ������ ���̱� �����ߴ�. 
		�ֽ��� ��°�� �ñ��ϱ� �����ߴ�. 
		�ֱ� �����ִ� �����ֽ��� ���캸��� �ߴ�.
		������ ����ϴ� �Ⱓ�� ���� �� �Ⱓ�� ����غ���. 
	 	[1] �������� 1~8���� ���� 10���� ���������� ����Ѵ�. 
	  	[2] �������ڴ� �ְ� ��ġ�� ���ϰ�  ���ڰ�ũ�� ��� ������ �϶��̴�. 
	  	[����] �Ʒ��Ͱ��� �������ڰ� ���Դٰ��ϸ�
	  		4 8 3 2 6 7 4 5 6 1
	  		
	  		(1) ó�� 4 - 8 �� ����̰� 8 ������ 3 �̱⶧���� �ִ� ��±Ⱓ�� 1�̴�.
	  		(2) �ٽ� 2 - 6 - 7 �� ����̰� 7������ 4�̱� ������ �ִ��±Ⱓ�� 2�̴�. 
	  		(3) 4 - 5 - 6 �� ����̰�  6 ���� 1�̱⶧���� �ִ��±Ⱓ�� 2�̴�. 
	  		(4) ���� ��ġ�� �����̸� ������� ġ���ʴ´�.    
	  	[����]
	  		2��
	 */
		Random rd = new Random();
		 cnt = 0;
		int a=0;
		int temp = 0;
		int max = 0;
		for(int i = 0 ; i < 10 ; i++) {
			
			temp = a;
			System.out.print(a = rd.nextInt(8)+1);
			
			if(temp < a &&temp!=0 && temp != a) {
				
				cnt++;
				
			}else {
				cnt = 0;
			}
	
			if(max < cnt) {
				max = cnt;
			}
			
			
			System.out.print("  ");
			
			
			}
			
		System.out.println(">>>>>>>>>"+ max);	
		
		System.out.println();
		System.out.println("===����4===");
		
		
		/*
		 * �������� count������  4~8������ ���ڸ� �����Ѵ�. 
		 * count ������ ���ڴ� ����������� ���ڰ����̴�. 
		 * count ������ ���ڸ�ŭ ���ϱ� ������ �����ȴ�. 
		 * ��, ���ϱ� ������ ���鶧���ڴ� 1~9������ ���������̸�, ���� ¦�������Ѵ�. 
		 * [���] ���� ����� �Ȱ��� �����ȴ�. ��, ���ڴ� �����̹Ƿ� ����ɼ��ִ�. 
		 	
		 	[����]
					�������� 4~8������ ���ڸ� �Է��ϼ���.
					5
					[���] 4 + 6 + 4 + 2 + 8 = 
		 */
		System.out.print("�������� 4~8���� ���ڸ� �Է��ϼ���.   ");
		int count = rd.nextInt(5)+4;
		System.out.println(count);
		for(int i = 0 ; i < count ; i++) {
			int num = rd.nextInt(9)+1;
			if(num %2 != 0 ) {
				i--;
				continue;
			}
			if(i == count-1)
			{System.out.print(num + " = ");
			break;}
			System.out.print(num+" + ");
			
			
		}
		
		//15��
		

		System.out.println();
		System.out.println("===����5===");
		
		/*
		 * �������� 1~5 �� �Է¹ް�, 
		 * ���������� ���� ��ŭ ���ڸ� ���ϴ� ������ ����� ����Ͻÿ�..
		 * �� ���ϱ��� ���ڵ��� 1~9������ �������ڿ����Ѵ�. 
		 * �Ʒ� [���] �ڿ� ������ ���� �Ȱ��� ������� ����Ѵ�. 
		 * (��, ���ڴ� �����̹Ƿ� ���ڴ� �ٸ��� ���ü��ִ�,)
		 * 
		 * [����1]
		 * 		�������� 1~5�� �Է��Ͻÿ�.
		 * 		3
		 * 		[���] 5 + 3 + 2 = 
		 * 
		 * [����2]
		 * 		�������� 1~5�� �Է��Ͻÿ�.
		 * 		5
		 * 		[���] 6 + 5 + 2 + 7 + 8 = 
		 */
		
		System.out.println("�������� 1~5�� �Է��Ͻÿ�.");
		int ran = rd.nextInt(5)+1;
		System.out.println("�Է�: "+ ran);
		
		for(int i = 0 ; i < ran ; i++) {
			int num = rd.nextInt(9)+1;
			
			if(i == ran-1)
			{System.out.print(num + " = ");
			break;}
			System.out.print(num+" + ");
			
			
		}
		
		//5�� 
		

		System.out.println();
		System.out.println("===����6===");
		
		/*
		ö���� ���ε��� ��鿩 ������ �Ǿ���.
		ö���� ��� �������� �Ⱦ��ؼ� ��7���� ��6�Ϸ� �ٲٰ� �������� �����ߴ�.
		5��1���� �Ͽ������ϰ��Ҷ�, 
		5��1�Ϻ��� 5��31�ϱ��� ��¥�� ������ ���� ����غ���.
		
		 
		 [����]
		 	1 => ��
		 	2 => ȭ
		 	3 => ��
		 	4 => ��
		 	5 => ��
		 	6 => ��
		 	7 => ��
		 	8 => ȭ
		 	.......
	 */
		
		for(int i = 1 ; i <=31 ; i++) {
			System.out.print(i);
			if(i %6 == 1) {
				System.out.print("��");
			}else if(i %6 == 2) {
				System.out.print("ȭ");
			}else if(i %6 == 3) {
				System.out.print("��");
			}else if(i %6 == 4) {
				System.out.print("��");
			}else if(i %6 == 5) {
				System.out.print("��");
			}else {
				System.out.print("��");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("===����7===");
		
		/*
		 * ö���� 30��¥�� ����� �ֻ�ܿ� ���ִ�. 
		 * ���ϾƷ����� ���������� �Ѵ�. 
		 * ö���� �������� ���ʹ߷� ���� ����� ����Ͻÿ�. 
		 * �Ʒ����ǵ��� �����Ͻÿ�.
		 * [����]
		 * [1] ö���� ������ �Ѱ�ܾ� ��������. 
		 * [2] ö���� ù���� ���ʴٸ����� ����� ��������. 
		 * [3] ����� �ټ����Ҷ� ���� �ݴ���ٸ��� �ٲ㼭 ����Ͻÿ�.
		 * 
		 * [����]
		 * 	29 27 25 23 21 
		 *  20 18 16 14 12 
		 *  11 9  7  5  3
		 *  2			 
		 */
		cnt = 0;
		int log = -1;
		for(int i =30 ; i >0 ; i-- ) {
			
			if(i%2!=0 && log == -1) {
				System.out.print(i+" ");
				cnt ++;
				if(cnt==5) {
					
					log =1;
					System.out.println();
					
					
				}
			}
			
			if(i%2==0 && log == 1) {
				System.out.print(i+" ");
				cnt --;
				if(cnt==0) {
					
					log =-1;
					System.out.println();
					
				}
				
			}
		}
		
		System.out.println();
		System.out.println("===����8===");
		
		/* 
		[����]
		[�ݺ�����������]	 	
			ö���� �μ��� ��ܿ��� ������������ �Ѵ�. 	 	
			ö���� �μ��� ���� 0 ~ 2 �� �������� �����Ѵ�.
			0 : ���� , 1 : ���� , 2 : ���� ���Ѵ�.	 
			ö���� �μ��� 50��° ����� ��ġ���� ������ �Ѵ�.
			���� ������ ����.	
			�̱�� 3ĭ�ö󰡱�, ���� 2ĭ�ö󰡱�, ���� 1ĭ�ö󰡱�.	 	
			���� �ƹ��� 100�̻� �����ϰų� �ѻ����� ������ 10�̻��̸� ������ ����ȴ�. 
			������ ����ɶ����� �λ���� �̵���θ� ����Ͻÿ�.
	*/
		int chulCnt = 50;
		int minCnt = 50;
		
		while(true) {
			
		int chul = rd.nextInt(3);
		
		int min = rd.nextInt(3);
		
		System.out.println(chulCnt+" "+minCnt);
		
		boolean draw = chul == min , win = (chul == 0 &&min == 2)||(chul == 1 &&min == 0)||(chul == 2 &&min == 1);
		if(draw) {
			chulCnt ++;
			minCnt ++;
			
		}else if (win) {
			chulCnt+=3;
			minCnt--;
			
		}else {
			chulCnt--;
			minCnt +=3;
		}
		
		if(chulCnt>=100||minCnt>=100||Math.abs(chulCnt-minCnt)>=10) {
			break;
		}
			
		
		}
		
		/*
		[��¡�����]
			ö���� ��¡����ӿ� �����Ͽ���.
			ù��° ������ "����ȭ���� �Ǿ����ϴ�" �̴�.
			��Ģ�� �Ʒ��Ͱ���.	
		[��Ģ]	
			[1] ��ü �Ÿ��� 0 ~ 25���� �Ÿ��� �ִ�.
			[2] ö���� ���� 0�� �ڸ��� �ִ�.
			[3] ö���� ���� 1 ~ 4�� �������ڸ��̴´�. ���ڸ�ŭ �̵��Ѵ�. 
			[4]	�̵��Ÿ��� �����ϸ�, ���� 25�̻��̵Ǹ� �¸��̸� �����Ѵ�.
			[5] ������ ���� 3 ~ 5�� �������ڸ��̴´�. 
			[6] �������� ū ���ڰ������� �����ΰ����� ���ֵǾ� �й��ϸ� �����Ѵ�.
			[7] 10�Ͼȿ� �������ϸ� �ð��ʰ��� �й��ϸ� �����Ѵ�.
			[8] ö���� �̵���θ� ���� ����Ͻÿ�.
	 */
		System.out.println();
		System.out.println("===����9===");
		
		int cntChul = 0;
		 log = -1;
		
		for(int i = 0 ; cntChul <= 25 ; i++) {
			
			int chul = rd.nextInt(4)+1;
			cntChul += chul;
			int doll = rd.nextInt(3)+3;
			System.out.println("ö��: "+chul+"����: "+doll);
			if(doll < chul ||i == 9) {
				log = 1;
				break;
				
			}
			System.out.println(cntChul);
			
		}
		
	if(log == -1) {
		System.out.println("�¸��Ͽ����ϴ�.");
	}else  {
		System.out.println("�й��Ͽ����ϴ�.");
	}
		
		//10��
		
	
	System.out.println();
	System.out.println("===����10===");
	
	
	/* 
	[ö���Ǹ���]
		ö���� ��������� �ϰ��ִ�. 	
		0~20������ ������ �ְ� ö���� 0�� ��ġ�� �ִ�. 
		20�� �Ѿ�� ���������̴�. 
		�ֻ����� 1~6������ ���ڰ� ���´�.	
		3�� ����� �ڸ��� �����̴�.(3,6,9,12,15,18) 
		���������� �ѹ��� �ֻ����� ������ 4�̻��� ���ڰ� ������ ����Ż���̵Ǹ� ��ĭ ������ �����Ѵ�.
		������ �����ϸ� �ڷ� ��ĭ �������Եȴ�. 	
		ö���� ������ ���������� ö���� �̵���θ� ���� ����Ͻÿ�. 	
*/	
	
	cntChul  = 0;
	for(int i = 0 ; cntChul < 20 ; i++) {
		int dice = rd.nextInt(6)+1;
		System.out.println("�ֻ������� ���¼�: "+ dice);
		cntChul+=dice;
		
		if(cntChul%3==0) {
			System.out.println("�����ߵ�");
			dice = rd.nextInt(6)+1;
				if(dice >= 4) {
					System.out.println(" Ż��");
					cntChul ++;
					continue;
				}
				System.out.println("Ż�����");
				cntChul--;
		}
		
		System.out.println("���� ������ "+cntChul);
		
		if(cntChul > 20) {
			break;
		}
		
	}
	//9��
	
	/*
	[�ִ밪 ���ϱ�]
		[1] �ݺ����ȿ��� ����ؼ� ���� �Է¹޴´�.
		[2] �Է¹��������� ����ū���ڸ� ����Ѵ�.
		[3] -1000 �� �Է��ϸ� �����Ѵ�.
	[����]
		�Է� : 6,  ��� : 6
		�Է� : 10, ��� : 10
		�Է� : 3,  ��� : 10
		�Է� : 7,  ��� : 7
*/
	
	System.out.println();
	System.out.println("===����11===");
	System.out.println("�ִ밪���ϱ�: ");
	Scanner sc =new Scanner(System.in);
	int input=0;
	 max = input;
	
	while(input != -1000) {
		input = sc.nextInt();
		
		if(max < input) {
			max = input;
			System.out.println(max);
		}
		
		
	}
	
	//5��
	System.out.println();
	System.out.println("===����12===");
	
	/*
	[ATM�α��ν���]
		[1] [1.�α���]  ���� ���ο�Ŵ� ��� : [1.�ܾ�Ȯ��] [2.�α׾ƿ�]
		[2] �α����� 3�����н� �������� ��Ű�ÿ�. 		
*/
	
	 cnt = 0;
	int dbId = 1111;
	int id = 0;
	log = -1; 
	
	while(cnt!=3) {
		int sel = 0;
		if(log == -1) {
		System.out.println(" [1.�α���] ");
		System.out.println(" ���̵� �Է��Ͽ��ּ���. ");
		 id = sc.nextInt();
		
		}else {
		System.out.println("[1.�ܾ�Ȯ��]  [2.�α׾ƿ�]");
		sel = sc.nextInt();
		}
		
		if(sel == 1) {
			System.out.println("�ܾ�Ȯ�� : ");
			
		}else if(sel ==2){
			System.out.println("�α׾ƿ� �ƽ��ϴ�.");
			log = -1;
			id = 0;
			continue;
		}
		
		if(id == dbId) {
			log =1;
			continue;
		}else {
			System.out.println("�α��ν���");
			cnt++;
			
		}
		
	}
	
		//16��
		
		}
		
		
	}


