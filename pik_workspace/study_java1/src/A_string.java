
public class A_string {

	public static void main(String[] args) {
		String[] a = {"1","2","3","4"};
		int cnt =0;
		
//		String str = a.substring(4);
//		String str2 = a.substring(1,4);
//		
//		System.out.println(str);
//		System.out.println(str2);
		for(int i=0;i<a.length;i++) {
			if(a[i]=="4") {
				cnt ++;
			}
		}
		System.out.println(cnt);
	}

}
