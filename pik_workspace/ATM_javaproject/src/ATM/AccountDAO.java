package ATM;

import java.util.ArrayList;
import java.util.Random;

public class AccountDAO {
	
	int index;
	Account data;
	
	static ArrayList<Account>Acclist = new ArrayList<Account>();
	
	//해당되는 고객의 계좌리스트만 가져옴.
	ArrayList<Account>tempAcclist(int ClientNum){
		ArrayList<Account>data = new ArrayList<Account>();
		for (Account account : Acclist) {
			if (account.getClientNo() == ClientNum) {
				data.add(account);
			}
		}
		return data;
	}
	
	//계좌개설
	void addAccount(){
		System.out.println();
		int sel = -1;
		while (sel  == -1) {
			sel =  Util.getValue("계좌를 개설하시겠습니까...?[1] yes [2] no"
					, 1, 2);
		}
		if (sel == 1) {
			Acclist.add(Acc());
		} 
		for (Account account : Acclist) {
			if (account.getClientNo() == ClientDAO.Clientlist.get(BankController.log).getClientNo()) {
				System.out.print(account);
			}
		}
	}
	
	//계좌삭제
	void delAccount() {
		ArrayList<Account>temp = 
		tempAcclist(ClientDAO.Clientlist.get(BankController.log).getClientNo());
		if(temp.isEmpty()) {
			System.err.println("저장된 계좌가 없습니다.");
			return;
		}
		printAccount(temp);
		
		int num = Util.getValue("삭제하실 계좌를 선택하세요.", 1 , temp.size()) -1;
		String accountNumber =  temp.get(num).getAccountNumber();
		Acclist.remove(getindex(accountNumber));
		
		System.out.println(Acclist);
		
		
	}
	
	//계좌입금
	void addmoney() {
		data = data ("입금",1);
		Acclist.set(index, data);
	}
	
	//계좌출금
	void withdraw() {
		data = data ("출금",2);
		Acclist.set(index, data);
		
	}
	
	//계좌이체
	void transferAccount() {
		data = data("이체",2);
		printAccount(Acclist);		
		int sel = -1;
		
		while (sel == -1) {
			sel = Util.getValue("송금하실 계좌를 입력하세요. ", 1, Acclist.size());
		}sel --;
		
		if(Acclist.get(sel).getAccountNumber() == data.getAccountNumber()) {
			System.err.println("자신의 계좌에는 송금하실수 없습니다,.");
			return;
		}
		int calmoney = Acclist.get(sel).getMoney() + (Acclist.get(index).getMoney() - data.getMoney()); 
		Acclist.set(index, data);
		Account acctemp = new Account(Acclist.get(sel).getClientNo(), Acclist.get(sel).getAccountNumber(), calmoney);
		Acclist.set(sel, acctemp);
	}
	
	
	Account data (String msg,int cos) {
		ArrayList<Account>temp = 
				tempAcclist(ClientDAO.Clientlist.get(BankController.log).getClientNo());
				if(temp.isEmpty()) {
					System.err.println("저장된 계좌가 없습니다.");
					return null;
				}
		printAccount(temp);	
		int num = -1;
		while (num == -1) {
			num = Util.getValue(msg + "하실 계좌를 선택하세요.", 1 , temp.size()) ;
			}num --;
		String accountNumber =  temp.get(num).getAccountNumber();
		int clientnum = temp.get(num).getClientNo();
		Account tempdata = temp.get(num);
		System.out.println("현재 잔액 : " + (num = Acclist.get(index = getindex(accountNumber)).getMoney()));
		 int money = Util.getValue("얼마" + msg + " 하시겠습니까 ?", 100, Acclist.get(getindex(accountNumber)).getMoney());
		 if(money == - 1) return tempdata;
		 num = cos == 1 ? num + money : num - money ;
		return new Account(clientnum, accountNumber, num);
	}
	
	//클래스이름가져옴.
	static String getClassName() {
		return new File().getClass().getName();
	}
	
	
	//해당하는 계좌의 인덱스 번호를 가져옴
	int getindex(String accountNumber) {
		for (int i = 0; i < Acclist.size(); i++) {
			if (Acclist.get(i).getAccountNumber().equals(accountNumber)) {
				return i;
			}
		}
		return -1;
	}
	
	void printAccount(ArrayList<Account>temp) {
		for (int i = 0; i < temp.size(); i++) {
			System.out.print("[" + (i+1)+ "]" + temp.get(i));
		}
	}
	
	
	Account Acc() {
		int log = BankController.log;
		return new Account(ClientDAO.Clientlist.get(log).getClientNo() , producenumber(), Util.getValue("초기입금자본을 입력하세요.", 
				100, 1000000));
	}
	
	
	String producenumber() {
		Random rd = new Random();
		String numdata  = "";
		for (int i = 0; i < 3; i++) {
			numdata+= rd.nextInt(8999)+1000+"-";
		}
		return numdata.substring(0, numdata.length()-1);
	}

	public static void dataSetting(String accountdata) {
		String tempData[] = accountdata.split("\n");
		int cnt = 0;
		for (String string : tempData) {
			int number = -1;
			String temparr[] = string.split("/");
			for (Client client : ClientDAO.Clientlist) {
				if (client.getId().equals(temparr[0])) {
					number= client.getClientNo();
					break;
				}
			}
			if (number != -1) {
				Account acc = new Account(number, temparr[1],Integer.parseInt(temparr[2]));
				Acclist.add(acc);
			}
		}
		
		System.out.println(Acclist);
		
	}

	//탈퇴
	void deleteClient() {
		int sel = -1;
		while (sel == -1) {
			sel = Util.getValue("정말로 탈퇴하시겠습니까 ??? [1] yes [2] no", 1, 2);
		}
		if (sel == 1) {
			for (int i = 0; i < Acclist.size(); i++) {
				if (Acclist.get(i).getClientNo() == 
						ClientDAO.Clientlist.get(BankController.log).getClientNo()) {
					Acclist.remove(i);
				}
			}
			ClientDAO.Clientlist.remove(BankController.log);
			System.out.println("탈퇴완료 안녕히가십시오.");
			BankController.log = -1;
			return;
		}
		return;
		
	}

	//마이페이지
	void mypage() {
		System.out.println("현재 갖고 있는 자신의 계좌를 전부 출력합니다.");
		for (Account account : Acclist) {
			if (account.getClientNo() == ClientDAO.Clientlist.get(BankController.log).getClientNo()) {
				System.out.print(account);
			}
		}
		int sel = Util.getValue("[0]뒤로가기 [1]비밀번호 변경", 0, 1);
		if (sel == 1) {
			sel = -1;
			while (sel == -1) {
				sel = Util.getValue("변경하실 비밀번호 ", 0, 9999);
			}
			Client temp = ClientDAO.Clientlist.get(BankController.log);
			temp.setPw(sel+"");
		 	ClientDAO.Clientlist.set(BankController.log, temp);
		 	System.out.println("변경완료.");
			return;
		}
		
		return;
	}
	
	
	
	
}
