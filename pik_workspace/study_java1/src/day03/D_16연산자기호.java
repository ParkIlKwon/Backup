package day03;

import java.util.Random;
import java.util.Scanner;

import day01.b_00����;

public class D_16�����ڱ�ȣ {
	public static void main(String[] args) {
		/*
		 * [����] 1. 10~20 ������ ���� ���� 2���� x, y ������ ���� �����Ѵ�. ��) x = 3, y = 4 2. 1~3 ������ ����
		 * ���� 1���� op ������ �����Ѵ�. ��) op = 3 3. op�� ���� ������ ��ȣ�� �ش�ȴ�. 1. + 2. - 3. * ��) op��
		 * ���� 3�̸� ���ϱ��̴�. 4. ȭ�鿡 ���� 2���� ���� ����Ѵ�. ��, ��ȣ�� ����ϸ� �ȵȴ�. ��) 3 ? 4 = 12 1. + 2. -
		 * 3. * 5. ����ڴ� ��ȣ�� ���߸� �ȴ�. ��) 3 ==> ����
		 */
		int x = 0, solution=0, total = 0;
		int y = 0;
		int op = 0;
		boolean check = true ;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		x = rd.nextInt(11) + 10;
		y = rd.nextInt(11) + 10;
		op = rd.nextInt(3) + 1;
		if (op == 1) {
			total = x + y;
			
		}
		if (op == 2) {
			total = x - y;
		}
		if (op == 3) {
			total = x * y;
			}
		if(op!=solution)check = false;
		System.out.printf("%d ? %d = %d �����Է��Ͻÿ� : 1.+,2.-,3.*\n", x, y, total);
		solution = sc.nextInt();
		System.out.println(check?"����":"����");
		}
	}

