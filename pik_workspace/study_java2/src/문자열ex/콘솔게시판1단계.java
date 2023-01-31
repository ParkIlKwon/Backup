package 문자열ex;

import java.util.Scanner;

public class 콘솔게시판1단계 {

	public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
		
				int count = 14; // 전체 게시글 수
				int pageSize = 5; // 한 페이지에 보여줄 게시글 수
				int curPageNum = 1; // 현재 페이지 번호
				int pageCount = 0; // 전체 페이지 개수
				int startRow = 0; // 현재 페이지의 게시글 시작 번호
				int endRow = 0; // 현재 페이지의 게시글 마지막 번호
				
		  while(true){
			  
						
						pageCount = 14/ pageSize +1;
						
					
						
						if (curPageNum == 0 ) {
							System.err.println("페이지를 넘길수 없습니다.");
							curPageNum = 1;
							continue;
						}
						
						if (curPageNum > pageCount ) {
							System.err.println("페이지를 넘길수 없습니다.");
							curPageNum = pageCount;
							continue;
						}
						
						
						startRow =1 + pageSize*(curPageNum-1); 
						endRow = curPageNum * pageSize;
						if (endRow > count) {
							endRow -= endRow - count;
						}
						
						System.out.printf("페이지( %d  /  %d )\n",curPageNum,pageCount);
						
						for (int i = 0; i < (endRow - startRow) +1; i++) {
							System.out.printf("(%d)\n",startRow+i);
						}
						
					   	System.out.println("[이전 1]"); // 페이지 이동
						System.out.println("[이후 2]");
						System.out.println("선택 >> ");
						
						
						int choice = sc.nextInt();
						
						curPageNum += choice == 1 ? -1 : +1 ;
						
						
						
		}
				
		

	}

}
