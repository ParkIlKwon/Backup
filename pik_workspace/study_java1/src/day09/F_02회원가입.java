package day09;

import java.util.Arrays;
import java.util.Scanner;

public class F_02ȸ������ {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] ids = {1001, 1002, 1002, 1004, 5555};
		int[] pws  = {1111, 2222, 3333, 4444, 5555};
	
		int id,pass;		//	���̵� �н����� �Է½� ���� ����
		int cnt = 5;		//�迭�� ����� �ε��� ��
		boolean run = true;
		while(run) {
			System.out.println("����Ǿ��ִ� ���̵�� ��й�ȣ ����");
			System.out.println(Arrays.toString(ids));
			System.out.println(Arrays.toString(pws));
			
			System.out.println("1.����");
			System.out.println("2.Ż��");
			System.out.println("3.�ý��� ����");
			System.out.println("4.�ߺ� Ż��");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			if(sel<1||sel>4) {
				System.err.println("�޴����ÿ���");
				continue;
			}
			
			if(sel == 1) {
				if(cnt >= 5) {
					System.err.println("�ε��� �뷮�ʰ� !!! ");		//�迭�� 5���� ����� ������ �뷮�ʰ�.
					continue;
				}
				int log = -1;	//���̵� �ߺ��� sel1 ���ǹ� Ż��� ���� ����
				System.out.print("���� �� ���̵� �Է��Ͻÿ�.");
				id = scan.nextInt();
				for(int i = 0 ; i < ids.length ; i++) {
					if(id == ids[i]) {
						System.err.println("���̵� �ߺ��˴ϴ�. �ٽ� �Է��Ͽ� �ּ���.");
						log = 1;		break;				
					}
					
				}
				if(log != -1) {continue;}
				
				System.out.println("���� �� ��й�ȣ�� �Է��Ͻÿ�.");
				pass = scan.nextInt();
				
					System.out.println("���̵� & ��й�ȣ �Է� ���ԿϷ�");
				ids[cnt] = id;
				pws[cnt] = pass;
				cnt ++;
				
			}
			else if(sel == 2) {
				int val=-1;		// ������ ���̵� �Է��Ҷ� �ε��� ��ġ ã���� ���� ����
				if(cnt == 0) {
					System.err.println("������ ���̵� �����ϴ�.");
					continue;
				}
				System.out.println("������ ���̵� �Է����ּ��� !");
				id = scan.nextInt();
				
				for(int i = 0 ; i < cnt ; i++) {
				if(id == ids[i])	{
					val = i ;
				}
				}
				if(val == -1) {			//���̵� �� ã������ �ʱ�val �������� �ɷ���.
					System.err.println("������ ���̵� �߸��Է��Ͽ����ϴ�.");
					continue;
				}
				int index = 0;
				ids[val] = 0;
				pws[val] = 0;			//�� �ش�Ǵ� ���̵�� ��й�ȣ ����
				
				for(int i = 0 ; i<cnt ; i++) {	//������ ���� �ε��� �������� ����� �۾�
				
				if(val != i) {
					ids[index] = ids[i]; 
					pws[index] = pws[i];	
					
					index ++;		
					
				}
				
				}
			
			cnt --;	
			ids[cnt] = 0;
			pws[cnt] = 0;
			}
			else if(sel == 3) {
				
				break;
			}
			
		}
	}

}











