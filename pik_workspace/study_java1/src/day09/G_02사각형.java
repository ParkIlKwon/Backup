package day09;

public class G_02�簢�� {
	public static void main(String[] args) {
		System.out.println("====����1====");
		/*
		 * ���� 1) # ## ###
		 */
		int cnt = 1;
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < cnt; j++) { // cnt����
				System.out.print("#");
			}
			cnt++;
			System.out.println();

		}

		/*
		 * ���� 2) ### ## #
		 */
		System.out.println("====����2====");
		cnt = 3;
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < cnt; j++) {
				System.out.print("#");
			}
			cnt--;
			System.out.println();

		}

		/*
		 * ���� 3)
		 * 
		 * @##
		 * 
		 * @@#
		 * 
		 * @@@
		 */
		System.out.println("====����3====");
		cnt = 1;
		int cnt2 = 2;
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < cnt; j++) {

				System.out.print("@");

			}
			for (int k = 0; k < cnt2; k++) {
				System.out.print("#");
			}
			cnt2--;
			cnt++;
			System.out.println();

		}

		/*
		 * ���� 4) # ### #####
		 */
		System.out.println("====����4====");
		cnt = 1;
		cnt2 = 4;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < cnt2; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < cnt; k++) {
				System.out.print("#");

			}
			System.out.println();
			cnt2 -= 2;
			cnt += 2;
		}

	}

}
