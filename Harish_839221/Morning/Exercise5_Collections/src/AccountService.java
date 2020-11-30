import java.util.ArrayList;
import java.util.List;

public class AccountService {
	Account ac = new Account();
	List<Account> acc = new ArrayList<>();
	
	public void addAccount(Account a) throws AccountAlreadyException {
		for (Account account : acc) {
		if(account.getAccountnumber() == a.getAccountnumber()) {
			throw new AccountAlreadyException("Account already Exsits");
		}
		}
		acc.add(a);
		
		
	}
	
	public List<Account> removeAccount(int b) throws AccountNotFoundException { 
		for (Account account : acc) {
			if(account.getAccountnumber()!=b) {
				throw new AccountNotFoundException("Account unavailable");
			}
			if(account.getAccountnumber() == b) {
				acc.remove(b);
			}
		}
		return acc;
		
	}
	
	public List<Account> displayall(){
		return acc;
	}
	
	public List<Account> displaybyaccnum(int c) {
		for (Account account : acc) {
			if(account.getAccountnumber() == c) {
				return acc;
			}
			
		}
		return null;
	}
	
	public List<Account> balance(){
		List<Account> bal = new ArrayList<>();
		for (Account account : acc) {
			if(account.getAmount() < 1000) {
				bal.add(account);
			}
			
		}
		return bal;
	}
 
}
