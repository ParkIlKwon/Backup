package ATM;

public class BankController {
	String name="우리은행";
	static int log = -1;
	ClientDAO dao ;
	AccountDAO acc;
	File fi;
	
	BankController(){
		dao = new ClientDAO();
		acc = new AccountDAO();
		fi = new File();
	}
	
	public void setSampleData() {
		String clientData = "test01/1111/김철수\n";
		clientData += "test02/2222/이영희\n";
		clientData += "test03/3333/신민수\n";
		clientData += "test04/4444/최상민";
				
		String accountdata = "test01/1111-1111-1111/8000\n";
		accountdata += "test02/2222-2222-2222/5000\n";
		accountdata += "test01/3333-3333-3333/11000\n";
		accountdata += "test03/4444-4444-4444/9000\n";
		accountdata += "test01/5555-5555-5555/5400\n";
		accountdata += "test02/6666-6666-6666/1000\n";
		accountdata += "test03/7777-7777-7777/1000\n";
		accountdata += "test04/8888-8888-8888/1000";		
		// 1) test01 김철수는 계좌를 3개 가지고있다.
		// 2) test02 이영희는 계좌를 2개 가지고있다.
		// 3) test03 신민수는 계좌를 2개 가지고있다.
		// 4) test04 최상민은 계좌를 1개 가지고있다. 
		
		ClientDAO.dataSetting(clientData);
		AccountDAO.dataSetting(accountdata);		
	}
	
	
	void run() {
		setSampleData();
		while (true) {
			
			int sel = -1;
			while (sel == -1 && log == -1) {
				printmenu(1);
				sel = Util.getValue("[관리자/사용자]메뉴 ", 0, 2);
			}
			if(sel == 0) break;
			while (true) {
				if (log  != -1) { //로그인시
					printmenu(1);
					sel = -1;
					while (sel == -1) {
						sel = Util.getValue("메뉴", 0, 7);
					}
					if (sel == 0) {
						log = -1;
						break;
					}else if (sel == 1) { // 계좌추가
						acc.addAccount();
					}else if (sel == 2) {
						acc.delAccount();
					}else if (sel == 3) {
						acc.addmoney();
					}else if (sel == 4) {
						acc.withdraw();
					}else if (sel == 5) {
						acc.transferAccount();
					}else if (sel == 6) {
						acc.deleteClient();
						break;
					}else if (sel == 7) {
						acc.mypage();
					}
					
					
				}else if (sel == 1) { // 관리자 모드
						printmenu(3);
						sel = -1;
						while (sel == -1) {
							sel = Util.getValue("메뉴 ", 0, 5);
						}
						if (sel == 0) {
							break;
						}else if (sel == 1) {
							dao.printClient();
						}else if (sel == 2) {
							dao.editClient();
						}else if (sel == 3) {
							dao.deleteClient();
						}else if (sel == 4) {
							String str = ClientDAO.Clientlist.get(0).getClass().getName();
							fi.save(str);
							str = AccountDAO.Acclist.get(0).getClass().getName();
							fi.save(str);
						}else if (sel == 5) {
							String str = ClientDAO.Clientlist.get(0).getClass().getName();
							fi.load(str);
							str = AccountDAO.Acclist.get(0).getClass().getName();
							fi.load(str);
						}
						
					break;
					
					
				}else if (sel == 2) { //사용자 모드
					printmenu(2);
					sel = -1;
					while (sel == -1) {
						sel = Util.getValue("메뉴 ", 0, 2);
					}
					if (sel == 0) break; 
					else if (sel == 1) {
						dao.addClient();
						break;
					}else if (sel == 2) {
						dao.login();
						break;
					}
				}
				
			}
		}
		
		
		
	}
	
	void printmenu(int cos){
		if (log != -1) {
			System.out.println("[1] 계좌 추가\n[2] 계좌 삭제\n[3] 입금\n[4] 출금\n"
					+ "[5] 이체 \n[6] 탈퇴 \n[7] 마이페이지: 전체 계좌, 금액 (회원정보: 비밀번호 수정)\n"
					+ "[0] 뒤로가기");
		}else if(cos == 1) {
			System.out.println("[1] 관리자 \n[2] 사용자 \n[0] 종료");
		}else if (cos == 2) {
			System.out.println("[1] 회원가입 \n[2] 로그인 \n[0] 뒤로가기");
		}else if (cos == 3) {
			System.out.println("[1] 회원목록 - 전체회원 목록 \n[2] 회원정보 수정 \n[3] 회원정보 삭제\n"
					+ "[4] 회원정보 저장\n[5] 회원정보 불러오기\n[0] 뒤로가기");
		}
	}
	
	
}
