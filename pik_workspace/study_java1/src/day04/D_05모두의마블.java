package day04;

import java.util.Random;

public class D_05����Ǹ��� {
	public static void main(String[] args) {
		/*
		 * [����] 1. ö���� ���� ����� ���� ������ �ϰ��ִ�. 2. ������ 0 ~ 20���� �̵��� �� �ִ� �Ÿ��� �ִ�. 3. ���� ö����
		 * �����̴�. 4. ö���� ��ġ�� ���������κ��� 9��ŭ �̵��� �����̴�. 5. 1 ~ 6�� ���ڰ� �ִ� �ֻ��� 2���� ������. 6. �ֻ���
		 * ������ �ո�ŭ �̵��� �� �ִ�. 7. ���� �̵��� ö���� ��ġ�� ����Ͻÿ�.
		 * 
		 * 8. ���� 1) �� �ֻ��� ���ڰ� ���� �ٸ� ��쿡�� ���� ��ġ���� �ֻ��� ������ �ո�ŭ �̵��Ѵ�. ��) 3, 5 => 8��ŭ �̵� 2)
		 * �� �ֻ����� ���ڰ� ���� ��� ���ʽ��� �̵��Ÿ� 6�� �߰��ȴ�. ��) 2, 2 => 4 + 6 ��ŭ �̵� 3) 14, 15, 16 ����
		 * ��ġ�� ������ �ִ�. ������ �ɸ��� �ٽ� �ֻ��� 2���� ������ �� ���� 6�����̸� [�г�Ƽ] ó�� ��ġ(0)�� �̵��Ѵ�. �� ����
		 * 7�̻��̸� [�г�Ƽ ����] ������ Ż���Ѵ�.(�����ڸ� ����) 4) 20 �̻��� ���� ������ "�¸�"�� ����Ѵ�.
		 */
		Random rd = new Random();
		int location, dice1, dice2;
		dice1 = rd.nextInt(6) + 1;
		dice2 = rd.nextInt(6) + 1;
		System.out.printf("�ֻ���(1),(2) %d  %d\n", dice1, dice2);
		boolean eqr = dice1 == dice2;
		if (!eqr) {
			location = dice1 + dice2 + 9;
		} else {
			location = dice1 + dice2 + 15;
		}
		if (location == 14 || location == 15 || location == 16) {	//boolean trap ó��
			System.out.println("�����ɸ�");
			dice1 = rd.nextInt(6) + 1;
			dice2 = rd.nextInt(6) + 1;
			location = dice1 + dice2;
			if (location <= 6) {
				System.out.println("�г�Ƽ ó����ġ�� �̵�");
				location = 0;
			} else {
				System.out.println("�г�Ƽ ���� ������ġ����");
			}
		}
		if (location >= 20) {	//�����̼� 0 start , 20 end ó��
			System.out.println("�¸�");
		}
		System.out.printf("����������ġ: %d", location);

	}

}
