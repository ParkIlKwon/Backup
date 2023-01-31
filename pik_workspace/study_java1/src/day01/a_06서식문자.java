package day01;

public class a_06서식문자 {

	public static void main(String[] args) {
		System.out.printf("1)",(10+3));
		System.out.println(10+3+"입니다");
		System.out.println("사과가"+(10-3)+"개 남았다");
		System.out.printf("사과가 %d개 남았다.",10-3);
		System.out.printf("%s가 %d개 남았다.","사과",10-3);
		
		System.out.printf("%d\n",10);
		System.out.printf("%.2f\n",10.0);
		
		System.out.printf("200원자리 과자구입후 거스름돈은:%d입니다\n",1000-200);
		System.out.println("거스름돈"+(1000-200)+"입니다");
		
	}

}
