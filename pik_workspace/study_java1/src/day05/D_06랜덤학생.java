package day05;
import java.util.Random;

public class D_06�����л� {
	public static void main(String[] args) {
		/*
		 * # �����л� 1. 10ȸ �ݺ��� �Ѵ�. 2. 1~100 ������ ���� ���ڸ� �����Ѵ�.(�л��� ����) 3. ������ 60�� �̻��̸�
		 * �հݻ��̴�. --------------------------------------- . ������(10��)�� ������ ����� ����Ѵ�. .
		 * �հ��� ���� ����Ѵ�. . 1�� �л��� ��ȣ�� ������ ����Ѵ�.
		 */
		int i = 0, num, max = 0, cnt = 0, total = 0, first = 0;
		Random rd = new Random();

		while (i < 10) {
			i++;
			num = rd.nextInt(100) + 1;
			System.out.println(i + ")" + num);
			total += num;
			if (num >= 60) {
				System.out.println("->�հ�");
				cnt++;
			}
			if (num > max) {
				max = num;
				first = i;
			}

		}
		double avg = total / 10.0;
		System.out.println("==============");
		System.out.printf("[����] %d [���] %.2f\n", total, avg);
		System.out.println("�հ��ڼ�: " + cnt);
		System.out.println("1���л��� ����: " + max);
		System.out.println("1���л��� ��ȣ: " + first);

	}

}
