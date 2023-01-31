package day11;

public class G_07그래프 {

	public static void main(String[] args) {

		int scoreList[] = { 31, 76, 54, 2, 100, 23 };
		int cnt;

		for (int i = 0; i < scoreList.length; i++) {
			System.out.print(scoreList[i] + "==> ");
			cnt = scoreList[i] / 10;

			for (int k = 0; k < cnt; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("== 세로 == "); // ( ? 오 ? ;;;)
	
		for (int i = 10; i > 0; i--) {
		
			for (int k = 0; k < scoreList.length; k++) {
				if(i*10<=scoreList[k]) {
					System.out.print("   *   ");
				}else {
					System.out.print("        ");
				}
				
		
			}
			System.out.println("");

		}
		System.out.println(" 31  76   54   2   100   23");
	}

}
