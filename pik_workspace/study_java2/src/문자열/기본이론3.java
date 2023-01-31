package 문자열;

public class 기본이론3 {

	public static void main(String[] args) {

		String str = "park";
		char [] cha = {'p','a','r','k'};
		
		System.out.println(str.charAt(2));
		System.out.println(cha[1]);
		
		System.out.println(cha);
		
		char copyName[] = new char[str.length()];
		
		for (int i = 0; i < copyName.length; i++) {
			
			copyName[i] = str.charAt(i);
		}
		
		System.out.println(copyName);
		
	}

}
