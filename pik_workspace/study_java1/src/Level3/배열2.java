package Level3;

import java.util.Arrays;
import java.util.Scanner;

public class �迭2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * [����] 12:59 - 1:15 arr�迭�� ������ 
		 * ���������� ������ temp1�� �����ϰ� ������ ������ temp1�� ������ ���� ���ں���
		 * ���������� temp2�� �����Ͻÿ�. ��, arr�� �迭�� ���̰� Ȧ���̸�, temp1�� �迭�� ũ�⸦ temp2 ���� ������ �� �� ��ŭ
		 * �� ũ�� ���� ���� �����Ͻÿ�. [����] temp1 = {12, 232, 3123, 14, 25} temp2 = {46, 27, 18,
		 * 569}
		 */
		System.out.println();
		System.out.println("===����1===");	

	int[] arr = {12, 232, 3123, 14, 25, 46, 27, 18,569};	
	int[] temp1 = null;
	int[] temp2 = null;
	
	int size  = arr.length/2;
	
	if(arr.length %2 == 1) {
		size= arr.length/2 + 1;
		
	}

	 temp1 = new int [size];
	
	if(size != arr.length/2) {
		size= arr.length/2;
	}
	temp2= new int [size];	
	
	for(int i = 0 ; i < temp1.length ; i++) {
		temp1[i] = arr[i];
	}
	
	int idx = temp1.length;
	for(int i = 0 ; i < temp2.length ; i++) {
		temp2[i] = arr[idx];
		idx++;
	}
		
		System.out.println(Arrays.toString(temp1));
		System.out.println(Arrays.toString(temp2));
		

		System.out.println();
		System.out.println("===����2===");		// 1:18 - (���ɽð�) -  2:16
		
		/*
		[����]
		�Ʒ��迭 a �� �ȿ� �ִ� ���� �ϳ� �Է¹޴´�.
		b�迭�ȿ� ������ �Է��� ���� �����ϰ� �����Ѵ�.
		[��] 30 ==> b[] = {10,20,40,50};
	 */

	int a[] = { 10, 20, 30, 40, 50 };
	int b[] = null;
	System.out.println(Arrays.toString(a));
	System.out.println("������ ���� �Է��ϼ���.");
	int input = sc.nextInt(); // ����ڰ� �Է� 
	 idx = -1;
	 int chk = 0 ;
	
	b = new int [a.length-1];
	
	for(int i = 0 ; i < a.length ; i++) {
		if(input == a[i]) {
			idx = i;
			break;
		}
		
	}
	
	if(idx == -1) {
		System.err.println("���� �߸��Է��Ͽ����ϴ�. ");
	}
	else{
		for(int i = 0 ; i < a.length ; i++) {
			if(idx != i) {
				b[chk] = a[i];
				chk++;
			}
			
			
		}
		System.out.println(Arrays.toString(b));
		
		
	}
	
	System.out.println();
	System.out.println("===����3===");	//3:30 - 3:42
	
	/*
	[����] 
	�Ʒ� �迭 c�� ��ȣ�� ���� �ѽ��� �迭�̴�. 
	��ȣ�� �ϳ��� �Է¹ް� c�迭�� �ִ� ��ȣ�̸�, 
	�׹�ȣ��  ���� �����ϰ� d�迭�� �����Ѵ�.
	[��]  
		c[] = { 1001, 40, 1002, 65, 1003, 70 };
		�Է� : 1002 
		c[] = {1001, 40, 1003, 70}; 
 */

	int c[] = { 1001, 40, 1002, 65, 1003, 70 };
	int d[] = null;
	
	idx = -1;
	chk= 0;

	
	while(true) {
		
		System.out.println("1001~ 1003������ �Է��Ͻÿ�.");
		input = sc.nextInt();
		
	for(int i = 0 ; i < c.length ; i+=2) {
		if(input == c[i]) {
			idx = i;
		}
	}
	
	if(idx ==-1) {
	System.err.println("���� �߸��Է��Ͽ����ϴ�. ");
	continue;
	}else {
		d = new int[c.length-2];
		
		for(int i = 0 ; i<c.length ;i+=2) {
			if(idx != i) {
				
				d[chk] = c[i];
				d[chk+1] = c[i+1];
				chk+=2;
				
			}
		}
		
		
	}
	
	
	
	System.out.println(Arrays.toString(d));
	break;
	
	}

		System.out.println();
		System.out.println("===����4==="); // 3:43 - 4:20

		/*
		 * [����] �ε��� ��ȣ , ������ �Է¹ް� b�迭�� ������ �Ͻÿ�. 
		 * [��] 1 , 1004 , 60 int b[] = { 1001, 40,
		 * 1004, 60, 1002, 65, 1003, 70};
		 */

		int c1[] = { 1001, 40, 1002, 65, 1003, 70 };
		int b1[] = null;
		 idx = 0;
		 chk = 0;

		b1 = new int[c1.length + 2];
		
		while(true) {
		System.out.println("�ε���  ");
		idx = sc.nextInt();
		
		if(idx >= c1.length/2 || idx < 0) {
			System.err.println("�߸��� �ε����� �Է��Ͽ����ϴ�.");
			continue;
		}
		if(idx != 0) {
			idx++;
		}
		
		break;
		}
		System.out.println("��ȣ ");
		int num = sc.nextInt();
		System.out.println("���� ");
		int score = sc.nextInt();
		
		
		
		for(int i = 0 ; i < c1.length+2 ; i++) {
			
			if(idx != i ) {
				b1[i] = c1[chk] ; 
				chk++;
				
			}else {
				b1[i] = num;
				b1[i+1] = score;
				
				i++;
			}
			
		}
		
		System.out.println(Arrays.toString(b1));
		b1 = null;
	System.out.println();
	System.out.println("===����5==="); //4:  30 - 4: 49
		idx = 0;
	/*
	[����] ���� �Է¹ް� ���� 
	[����] ���࿡ �������� ������ ������ ����ù��°�� ��  �Ѱ��� ���� �� 
			b �� ���������� ���� 
			data =  {5,2,6,8,5,6}
	[��] 2 ==>  b [] = {5,6,8,5,6};
	[��] 6 ==>  b [] = {5,2,8,5,6};
*/
	
	int data[] = {5,2,6,8,5,6};
	b = new int [data.length-1];
	
	System.out.println(Arrays.toString(data));
	System.out.println("������ ���� �Է��Ͻÿ�");
	int sel = sc.nextInt();
	int log = -1 ;
	
	for(int i = 0 ; i < data.length ; i++) {
		if(sel == data[i]) {
			log = i;
			break;
		}
		
	}
	if(log == -1) {
		
	System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");
	
	}else {
		
		for(int i = 0 ; i < data.length ; i++) {
			if(log != i) {
				b[idx] = data[i];
				idx ++;
			}
			
		}
		
		
	}
	
	System.out.println(Arrays.toString(b));
		

		System.out.println();
		System.out.println("===����6==="); // 4 : 50 - 5 : 00

		/*
		 * [����] ���� �Է¹ް� ���� [����] ���࿡ �������� ������ ������ ���� �������ǰ� �Ѱ��� ���� �� b �� ���������� ���� [��] 5
		 * ==> b [] = {5,2,6,8,6}; [��] 6 ==> b [] = {5,2,6,8,5};
		 */
		int [] data1= { 5, 2, 6, 8, 5, 6 };
		b = null;
		b = new int[data.length - 1];
		 log = -1;
		idx = 0;
		System.out.println("������ �迭��Ҹ� �Է��Ͻÿ�:" + Arrays.toString(data));

		 sel = sc.nextInt();

		for (int i = data1.length - 1; i >= 0; i--) {
			if (sel == data1[i]) {
				log = i;
				break;
			}

		}

		if (log == -1) {
			System.out.println("���� �߸��Է��Ͽ����ϴ�. ");
		} else {
			for (int i = 0; i < data1.length; i++) {
				if (log != i) {
					b[idx] = data1[i];
					idx++;
				}

			}

		}

		System.out.println(Arrays.toString(b));

		System.out.println();
		System.out.println("===����7==="); // 5 : 02 - 5:10

		/*
		 * [����] ������ ���� �Է¹ް� data�迭���� ������ b�� ���� int data[] = {5,2,6,8,5,6}; [����] ���࿡ ��������
		 * ������ ������ ���� ���� �� b �� ���������� ���� [��] 5 ==> b [] = {2,6,8,6}; [��] 6 ==> b [] =
		 * {5,2,8,5}; [��] 2 ==> b [] = {5,6,8,5,6};
		 */
		int data2[] = { 5, 2, 6, 8, 5, 6 };
		int b2[] = null;
		int cnt = 0;
		System.out.println("���λ����� �迭��Ҹ� �Է��Ͻÿ�:" + Arrays.toString(data));
		sel = sc.nextInt();

		for (int i = 0; i < data2.length; i++) {
			if (sel == data2[i]) {
				cnt++;
			}
		}

		b2 = new int[data2.length - cnt];
		idx = 0;

		for (int i = 0; i < data2.length; i++) {
			if (sel != data2[i]) {
				b2[idx] = data2[i];
				idx++;
			}

		}

		System.out.println(Arrays.toString(b2));

		System.out.println();
		System.out.println("===����8==="); // 5:11 - ����ߴ�. - 5:40

		/*
		 * [����] 1) seatList �� ���� ��ȭ�� ���Ż�Ȳ �̴�. 2) seatIndex �� ���� �ҷ��� �¼� ��ȣ�̰� 3) userList
		 * �� ȸ����ȣ�̴� 4) seatIndex �� user �� ������ ������ ��ü ���Ż�Ȳ ��� 5) �¼��� ��������� �����Ҽ��ִ�. 6) �¼���
		 * �̹� ���� �Ǿ������� 2���������� �Ѱ������� 7) [���� 1] �̹� ���ŵǾ�������, ȸ����ȣ�� ������ ������� 0���� ���� 8) [����
		 * 2) �̹� ���ŵǾ��ְ� , ȸ����ȣ�� �ٸ��� "x" ��� ��) 1 , 1003 ==> ���� �Ǿ�������, 1003���� ���������Ƿ� ����
		 * ��ҵȴ� ==> seatList[] = {1003,0,0,0,1002,0,1001}; ��) 1 , 1002 ==> ������ ������������Ƿ�
		 * ���� ���� ==> seatList[] = {1003,1002,0,0,1002,0,1001}; ��) 4 , 1005 ==> ���� �Ǿ��ְ�,
		 * ȸ����ȣ�� �ٸ��� ==> "x"
		 */

		int seatList[] = { 1003, 1003, 0, 0, 1002, 0, 1001 };
		int seatIndex[] = { 1, 1, 4 };
		int userList[] = { 1003, 1002, 1005 };

		for (int i = 0; i < seatIndex.length; i++) {

			for (int k = 0; k < seatList.length; k++) {
				if (seatIndex[i] == k) {

					if (seatList[k] == 0) {

						seatList[k] = userList[i];
						System.out.print("���Ű� �� �Ǿ������� ���� ȸ������: ");
						System.out.println(userList[i]);
						break;
					}

					if (userList[i] == seatList[k]) {
						System.out.println("���ŵǾ� ������ ���");
						seatList[k] = 0;
					} else {
						System.out.println("���źҰ�...x");

					}

				}

			}

		}

		System.out.print(Arrays.toString(seatList));

		System.out.println();
		System.out.println("===����9==="); // 11:01 - 11:20

		String[] nameList = { "�����", "���ڱ�", "����" };
		int[] priceList = { 1000, 2100, 3300 };
		int[] countList = { 3, 1, 1 };

		int[] input2 = { 1, 2, 2, 0, 0, 2, 1, 1 };

		int[] sell = { 0, 0, 0 };

		for (int i = 0; i < input2.length; i++) {
			for (int k = 0; k < priceList.length; k++) {
				if (input2[i] == k && countList[k] != 0) {
					countList[k]--;
					sell[k] += priceList[k];
					break;
				}

			}

		}
		int total = 0;

		System.out.println("���� �Ǹ��� ǰ����");
		for (int i = 0; i < 3; i++) {
			System.out.print(nameList[i] + " " + sell[i] / priceList[i] + "�� ");
			total += priceList[i];

		}
		System.out.println("�̴�");
		System.out.println("�Ѹ����� : " + total);

		System.out.println(Arrays.toString(sell));
		System.out.println(Arrays.toString(countList));

		System.out.println();
		System.out.println("===����10==="); // 11:21 - 11:38

		/*
		 * [����] ö���� �μ��� ������������ 6ȸ �Ͽ���. ����(0) , ����(1) , ��(2) �� ���Ѵ�. �Ʒ� �迭�� ���� ������������ ��
		 * ����� �����Ѱ��̴�.
		 * 
		 * ö���� �μ��� ��� 50��° ���� ������ �����Ͽ���. ö���� �μ��� ������ ��� ����ġ�� ���������? [��Ģ] �̱�� 5ĭ �ö󰣴�.
		 * ���� 1ĭ �ö󰣴�. ���� 3ĭ ��������.
		 */

		int clist[] = { 0, 1, 2, 2, 1, 0 };
		int mlist[] = { 2, 1, 1, 2, 0, 1 };
		int cheolsu = 50;
		int minsu = 50;
		int temp = 0;

		for (int i = 0; i < 6; i++) {

			if (clist[i] == 0 && mlist[i] == 2 || clist[i] == 1 && mlist[i] == 0 || clist[i] == 2 && mlist[i] == 1) {

				cheolsu += 5;
				minsu -= 3;

			} else if (clist[i] == mlist[i]) {

				cheolsu += 1;
				minsu += 1;

			} else {

				cheolsu -= 3;
				minsu += 5;

			}

		}

		System.out.println("ö�� :  " + cheolsu + "  �μ�:  " + minsu);
		
		
		
		
		
		
		
		
		

	}

}
