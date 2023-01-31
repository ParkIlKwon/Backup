package ATM;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class File {
	
	public void save(String className) {
		
		className = className.replace('.', '/');
		String temp [] = className.split("/");
		
		String path = "src" + "\\" + temp[0] + "\\" + temp[1] + ".txt";
		String data = getData(temp[1]);
		
		FileWriter fw = null;
		data = data.replace(", ", "");
		
		try {
			fw = new FileWriter(path);
			fw.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	//파일 불러오기.
	public void load(String className) {
		className = className.replace('.', '/');
		String temp [] = className.split("/");
		
		String path = "src" + "\\" + temp[0] + "\\" + temp[1] + ".txt";
		String data = "";
		FileReader fr = null;
		try {
			fr = new FileReader(path);
			int read = 0;
			while (read != -1) {
				read = fr.read();
				data += (char)read;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		setData(temp[1],data);
	}
	
	//불러온 파일내용 어레이리스트에 다시 적재시키기
	void setData(String path,String data) {
		String temp[] = data.split("\n");
		if (path.equals(getClassName2())) {
			ClientDAO.Clientlist = new ArrayList<Client>();
			for (String string : temp) {
				String arr[] = string.split("/");
				Client cl = new Client();
				cl.setClientNo(Integer.parseInt(arr[0]));
				cl.setId(arr[1]);
				cl.setPw(arr[2]);
				cl.setName(arr[3]);
				ClientDAO.Clientlist.add(cl);
			}
			System.out.println("로드완료");
			
		}else if(path.equals(getClassName())){
			
			AccountDAO.Acclist = new ArrayList<Account>();
			
			temp[temp.length-1] = temp[temp.length-1].substring(0,temp[temp.length-1].length()-1);
			for (String string : temp) {
				String arr[] = string.split("/");
				System.out.println(Arrays.toString(arr));
				
				Account acc = new Account();
				acc.setClientNo(Integer.parseInt(arr[0]));
				acc.setAccountNumber(arr[1]);
				String str = arr[2];
				
				
				System.out.println(str);
				System.out.println(str.length());
				acc.setMoney(Integer.parseInt(str));
				
				AccountDAO.Acclist.add(acc);
			}
			System.out.println("로드완료");
			
		}
	}


	String getData(String className){
		String data = "";
		String Cliname = getClassName2();
		String Accname = getClassName();
		if (className.equals(Cliname)) {
			data = ClientDAO.Clientlist.toString();
		}else if (className.equals(Accname)) {
			data = AccountDAO.Acclist.toString();
		}
		data = data.substring(1, data.length()-2);
		return data;
	}

	static String getClassName() {
        return new Account().getClass().getSimpleName();
    }
	
	static String getClassName2() {
        return new Client().getClass().getSimpleName();
    }
	

	
}
