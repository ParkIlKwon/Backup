package day07;

public class ex {

	public static void main(String[] args) {
	    // ���� => ���� �� �ִ� �� : ���Ҵ� ���� 
			// ���� ������ �ڷ����� �� 1���� ���� 
			// 10   10.2   '1'   "10"
			// int  double char  String
			int num = 10;
			num = 20; // ���� �ִ� ���� ������� 20�� �����Ѵ� 
			// �迭(Array)
			// ���� �ڷ����� ������ ������ �� �ִ� �� 
			// 2���� => 0 1 
			// 8���� => 0 1 2 3 4 5 6 7 
			// 10���� => 0 1 2 3 4 5 6 7 8 9 
			// 16���� =>  0 1 2 3 4 5 6 7 8 9 a b c d e f
			/*
			    ���� 
			    int[] arr = new int[�氹��];
			    int arr[] = new int[�氹��];
			 */
			// null = ����ִ� �ּҰ� 
			int[] arr = null; // arr �迭 ���� ����  
			arr = new int[3]; // heap �޸𸮹濡 int �� 3�� ����
			                  // �� �ϰ� �� �ּҰ��� arr�� ���� 
			System.out.println(arr); // �ּҰ� 
			
			// ���ȣ index ==> ������ 0���� ���� ������ ���ȣ ���� - 1
			System.out.println(arr[0]); // arr �ּҷ� ���� 0��° �ִ� ���� ������
			System.out.println(arr[1]); // arr �ּҷ� ���� 1��° �ִ� ���� ������
			System.out.println(arr[2]); // arr �ּҷ� ���� 2��° �ִ� ���� ������
			
			//System.out.println(arr[3]); 3��° ���ȣ�� ���� 
			// ArrayIndexOutOfBoundsException 
			
//			arr[0] = 10;
//			arr[1] = 20;
//			arr[2] = 30;
//			
//			arr[0] = (0+1)*10;
//			arr[1] = (1+1)*10;
//			arr[2] = (2+1)*10;
			// i => index ���� 
			
			for(int i =0; i< 3; i++) {
				arr[i] = (i+1)*10;
				System.out.println(arr[i]);
			}
			
			// �迭 ����� 
			int arr2[] = {100,200,300};
			// new int[3];
			// arr2[0] = 100;
			// arr2[1] = 200;
			// arr2[2] = 300;
			System.out.println(arr2);
			System.out.println(arr2[2]);

	}

}
