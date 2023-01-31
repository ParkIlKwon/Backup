package 클래스배열;

import java.util.Scanner;

	class Member1{
			int number;
			String id;
			String name;
		}
	
	class Account{
		String accountNumber;
		String password;
		int money;
		String memberId;
	}
	
public class 클배_ATM {
	public static void main(String[] args) {
	String[][] memberData = {
			{"1001" , "qwer" , "김철수"},
			{"1002" , "mmkk11" , "이영희"},
			{"1003" , "javaking123" , "최민수"}			
		};	
		String[][] accountData = {
			{"111111111" , "1234" ,"100000" , "qwer"},
			{"222222222" , "1234" ,"200000" , "mmkk11"},
			{"333333333" , "1234" ,"300000" , "mmkk11"},
			{"444444444" , "1234" ,"400000" , "javaking123"},
			{"555555555" , "1234" ,"500000" , "qwer"},
			{"666666666" , "1234" ,"600000" , "qwer"},
		};
		
		Member1[] memberList = new Member1[memberData.length];
		Account[] accountList = new Account[accountData.length];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < memberData.length; i++) {
			Member1 mem = new Member1();
			mem.number = Integer.parseInt(memberData[i][0]);
			mem.id = memberData[i][1];
			mem.name = memberData[i][2];
			memberList[i] = mem;
		}
		
		for (int i = 0; i < accountData.length; i++) {
			Account acc = new Account();
			acc.accountNumber = accountData[i][0];
			acc.password = accountData[i][1];
			acc.money = Integer.parseInt(accountData[i][2]);
			acc.memberId = accountData[i][3];	 
			accountList[i] = acc;
		}
		
		
		while(true) {
			String menu = "";
			menu += "[0] 종료 \n";
			menu += "[1] 위data배열들의 값들을 클래스배열에 저장후 출력 \n";
			menu += "[2] 회원아이디를 입력받고 계좌별 잔액출력  \n";
			menu += "[3] 222222222 계좌에서 444444444 계좌로 5000원송금후 전체출력 \n";
			System.out.println(menu);
			int sel = sc.nextInt();
			
			
			
			
			
			if(sel == 0) {
				break;
			} else if(sel == 1) {
				for (int i = 0; i < memberList.length; i++) {
					System.out.print(memberList[i].number +" ");
					System.out.print(memberList[i].id+" ");
					System.out.println(memberList[i].name);
				}
				for (Account account : accountList) {
					System.out.print(account.accountNumber + "\t");
					System.out.print(account.password + "\t");
					System.out.print(account.money + "\t");
					System.out.println(account.memberId);
				}

			} else if(sel == 2) {
				System.out.println("회원아이디를 입력하여주세요.");
				String str = sc.next();
				boolean chk = false;
				for (Account account : accountList) {
					if (str.equals(account.memberId)) {
						System.out.print(account.accountNumber +" : ");
						System.out.println(account.money);
						
						
						chk = true;
					}
				}
				if (chk == false) {
					System.err.println("아이디를 잘못 입력하셨습니다... :(");
					continue;
				}
				System.out.printf("환영합니다. %s 님 계좌를 조회하였습니다.\n",str );
				
				
			} else if(sel == 3) {
				System.out.println("222222222 계좌에서 444444444 계좌로 5000원송금후 전체출력하겠습니다.");
				System.out.println("------------------------------------------");
				
				for (Account account : accountList) {
					if (account.accountNumber.equals("222222222")) {
						account.money-=5000;
					}else if (account.accountNumber.equals("444444444")) {
						account.money+=5000;
					}
				}
				
				for (Account account : accountList) {
					System.out.print(account.accountNumber + "\t");
					System.out.print(account.password + "\t");
					System.out.print(account.money + "\t");
					System.out.println(account.memberId);
				}
				
				
				
				
			}
			
		}
		}
}