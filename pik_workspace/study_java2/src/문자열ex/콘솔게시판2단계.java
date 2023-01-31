package 문자열ex;

import java.util.Arrays;
import java.util.Scanner;

public class 콘솔게시판2단계 {

	public static void main(String[] args) {

		/*
		 * # 콘솔 게시판
		 *  1. [이전] 또는 [이후] 버튼을 누르면 페이지 번호가 변경된다. 
		 *    // 이전 버튼은 이전페이지가 있을때만 보여주고 
		 *    // 이후 버튼은 이후페이지가 있을때만 보여준다 
		 *  2. 현재 페이지 번호에 해당되는 게시글만 볼 수있다.
		 *  3. 2차원 배열 board에 0열에는 제목을 1열에는 게시글의 내용을 저장한다. 
		 *  4. 게시글을 추가하고 삭제할 때마다 실제 배열의 길이가 변한다 
		 *  
		 */
		
		Scanner sc = new Scanner(System.in);

		String[][] board = null;
		int count = 0; // 전체 게시글 수
		int pageSize = 3; // 한 페이지에 보여줄 게시글 수
		int curPageNum = 0; // 현재 페이지 번호
		int pageCount = 0; // 전체 페이지 개수
		int startRow = 0; // 현재 페이지의 게시글 시작 번호
		int endRow = 0; // 현재 페이지의 게시글 마지막 번호
		String str = "";
		
		String[] test= {"rank1","rank2","rank3","rank4"}; 
		//String [] test = {};
		board = new String[test.length][2];
		for (int i = 0; i < test.length; i++) {
			board[i][0] = test[i];
			board[i][1] = "";
			count++;
		}
		
		
		while (true) {
			
			pageCount = count/pageSize;
			pageCount += count%pageSize != 0 ? 1:0;
			if (count == 0) {
				curPageNum = 0;
			}else if (count > 0 && curPageNum ==0) {
				curPageNum ++;
			}
			
			
			System.out.printf("( %d  /  %d )\n" , curPageNum ,pageCount);
			
			startRow = 1+pageSize*(curPageNum-1);
			endRow = curPageNum * pageSize;
			if (endRow > count) {
				endRow -= endRow - count;      
			}
			
			if (count != 0) {
				for (int i = 0; i < (endRow-startRow) +1; i++) {
					System.out.printf("[ %d ] %s\n",i+1,board[startRow+i-1][0]);
					
				}
			}
			
			
			System.out.println("현재카운트" + count);
			if (count !=  0) {
				System.out.print("[0]게시글 내용확인");
			}
			System.out.println("[1]게시글추가 [2]게시글삭제 [3]게시글내용수정");
			if (curPageNum == 1 && count != 0 && pageCount > 1) {
				System.out.println("[5]다음 ");
			}else if (curPageNum == count /pageSize +1 
					&& pageCount > 1) {
				System.out.println("[4]이전 ");
			}else if (count != 0 && pageCount > 1) {
				System.out.println("[4]이전 [5]다음");
			}
			
			
			int sel = sc.nextInt();
			
			if (sel == 1) {
				while (true) {
					System.out.println("[1]추가 [2]종료");
					sel = sc.nextInt();
					if (sel == 2) {
						break;
					}else if (sel ==1) {
						System.out.println("추가할 게시글 제목을 입력하시오.");
						str = sc.next();
						count++;
						String temp[][] = new String[count-1][2];
						
						for (int i = 0; i < count-1; i++) {
							temp[i][0] = board[i][0];
						}
						 
						if (count<2) {
							board = new String[count][2];
							board[0][0] = str;
						}else {
							board = new String[count][2];
							for (int i = 0; i < count-1; i++) {
								board[i][0]  =  temp[i][0]  ;
							}
							board[count-1][0] = str;
							
						}
						
						
					}else {
						System.err.println("잘못된접근 :/");
						continue;
					}
					
				}
				
				
			}
			else if (sel == 4 && curPageNum != 1 ) {
				curPageNum --;
			} else if (sel == 5 && curPageNum != pageCount) {
				curPageNum ++;
			}else if (sel ==2  ) {
				if (count == 0) {
					System.err.println("삭제할 게시판이 없습니다:/");
					continue;
				}
				System.out.println("삭제하실 번호를 입력하세요.");
				int nsel = sc.nextInt()-1;
				nsel += (curPageNum-1)*pageSize; 	// 0 3 6 
				if (nsel >= endRow) {
					System.err.println("잘못입력하였습니다 :D");
					continue;
				}
				
				String temp[][] = new String [count-1][2];
					int idx = 0;
					
					for (int i = 0; i < board.length; i++) {
						if (nsel != i) {
							temp[idx] = board[i];
							idx++;
						}
					}
					
					board = temp;
					count--;
				if (count%pageSize == 0 && curPageNum == pageCount) {
					curPageNum --;
				}
				
			}else if (sel == 3 ) {
				if (count == 0) {
					System.out.println("수정할 게시글이 없습니다.");
					continue;
				}
				
				System.out.println("수정할 게시글 번호를 입력하세요.");
				int nsel = sc.nextInt()-1;
				nsel += (curPageNum-1)*pageSize;
				if (nsel >= endRow) {
					System.err.println("잘못입력하였습니다 :D");
				}
				System.out.println(nsel + "가리키는 게시글 인덱스...");
				System.out.println(" ===== > "+board[nsel][0] + "게시글 내용수정");
				str = sc.next();
				board[nsel][1] += str;
				
				
			}else if (sel == 0) {
				System.out.println("확인하고자 하는 게시글 번호를 입력하시오.");
				int nsel = sc.nextInt()-1;
				nsel += (curPageNum-1)*pageSize;
				if (nsel >= endRow) {
					System.err.println("잘못입력하였습니다 :D");
				}
				if (board[nsel][1] == "") {
					System.err.println("아무내용이 존재하지 않습니다.");
					continue;
				}
				System.out.println(board[nsel][1]);
				
				
			}
			
			else {
				System.err.println("잘못된접근 :( ");
			}
			
			
		}
	
		
	}

}
