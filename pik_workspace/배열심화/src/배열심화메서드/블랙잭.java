package �迭��ȭ�޼���;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


class blackJack{
		int total = 52;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int card[] = new int [total];
		int arr[] = new int [total];
		int dealer[] = new int [2];
		int user[] = new int [2];
		int idx;
	
	void run() {
		int tuser[] = new int[2];
		int tdealer[] = new int[2];	//����ī�� ��� ���� ����ϴ°� 
		 // 0 ~ 12 ,13 ~ 25, 
		String fig[] = {"��","��","��","��"};
		String fig2[] = {"A","2","3","4","5","6","7","8","9","10","K","Q","J"};
		int index = 0;
		
		
		for (int i = 0; i < fig.length; i++) {
			for (int k = 0; k < fig2.length; k++) {
				card[index] = k+1; index ++;
			}
		}
			 System.out.println(Arrays.toString(card));
		for (int i = 0; i < dealer.length; i++) {
			pickCard();
			tdealer[i] = idx;
			dealer[i] = card[idx];
			pickCard();
			tuser[i] = idx;
			user[i] = card[idx];
		}
		
		
		while (true) {
			System.out.println(Arrays.toString(tdealer));
			System.out.println(Arrays.toString(tuser));
			
			System.out.println(Arrays.toString(dealer));
			System.out.println(Arrays.toString(user));
			System.out.println(Arrays.toString(arr));
			System.out.println("======================================");
			System.out.println("���� ������ ������ �ִ� ī�� : ");
			System.out.println(fig[tuser[0]/13]+" "+fig2[(tuser[0])%13]);
			System.out.println(fig[tuser[1]/13]+" "+fig2[(tuser[1])%13]);
			
			System.out.println("�����Ͻðڽ��ϱ� ? 1.yes 2.no");
			int sel = sc.nextInt();
			
			if (sel == 2) {
				break;
			}else if (sel == 1) {
				System.out.println("������� �ٲٽðڽ��ϱ�? 1 or 2");
				sel = sc.nextInt()-1;
				pickCard();
				user[sel] = card[idx];
				tuser[sel] = idx;
				
				if (dealer[0] + dealer[1] <= 16) {
					pickCard();
					if (dealer[0] > dealer[1]) {
						dealer[1] = card[idx];
					}else {
						dealer[0] = card[idx];
					}
				}
				
				
			}

		}
		
		iswin(dealer, user);
		
	}
	
	//ī�� �̱� - ī�� �ߺ�üũ set
	void pickCard(){
		while (true) {
			int idx = rd.nextInt(total);
			if (chk(idx) == false) {
				continue;
			}
			arr[idx] = -1;
			this.idx = idx;
			break;
		} 
	}
	
	boolean chk(int idx) {
		if (arr[idx] == -1) {
			return false;
		}
		return true;
	}
	
	
	//����
	void iswin(int arr1[] , int arr2[]) {
		int dealer=0; int user = 0;
		for (int i = 0; i < arr2.length; i++) {
			dealer += arr1[i];
			user += arr2[i];
		}
		System.out.println(dealer + " " + user);
		if ((dealer > 21 && user <=21) || 
				(dealer <= 21 && user <=21 && (user - dealer > 0))) {
			massage(1);
		}else if ((dealer <= 21 && user > 21) || 
				(dealer <= 21 && user <= 21 && user - dealer < 0)) {
			massage(2);
		}else {
			massage(3);
		}
		
		
	}
	
	
	void massage(int num) {
		if (num == 1) {
			System.out.println("������ �̰���ϴ� :D");
		}else if (num == 2) {
			System.out.println("������ �̰���ϴ� :(");
		}else {
			System.out.println("�����ϴ� :/");
		}
	}
	
	
	
	
	
}
		
		/* ������� 
		�ڽ��� ���� ī���� ���� ���� 21�� ��������ϰ� �� ���ڰ� ���� ī���� ���� ���� ������ �̱�� �����̴�.
		
		���� ��Ģ
		������ ���̸� �� 2�� ����
		ī��� ��Ŀ�� ������ 52���̴�. (ī��� ���̾�, ��Ʈ, �����̵�, Ŭ�ι� ���̸� ���� A,2~10,K,Q,J���� �̷���� �ִ�.)
		2~13�� ���� �״�� ������ J,Q,K�� �� 11, 12, 13������ A�� 1�� ����Ѵ�.
		 (���� ��Ģ�� A�� 1�� 11 �Ѵ� ���������� ���⼱ 1�θ� ���)
		������ ���̸Ӵ� ���������� ī�带 �ϳ��� �̾� ���� 2���� ī�带 �����Ѵ�.
		���̸Ӵ� �󸶵��� ī�带 �߰��� ���� �� �ִ�.
		������ 2ī���� �հ� ������ 16�� �����̸� �ݵ�� 1���� �߰��� �̰�, 17�� �̻��̸� �߰� �� �� ����.
		���� �� �߰� �̱� ���� ī�带 ���� �ϸ� ������ ���̸� �� ������ ī���� ���� 21�� ���� ����� ���� �¸��Ѵ�.
		�� 21�� �ʰ��ϸ� �ʰ��� ���� ����.
		*/ 
		
		


public class ���� {

	public static void main(String[] args) {
		
		blackJack bj = new blackJack();
		bj.run();
		
		
		
		
	}

}
