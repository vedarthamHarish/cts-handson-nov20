import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws AccountAlreadyException, AccountNotFoundException {
		int a = 0;
		AccountService accser = new AccountService();
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.Add account\r\n"
					+ "2.Remove account by account number\r\n"
					+ "3.Display account by account number\r\n"
					+ "4.Display all account by account number\r\n"
					+ "5.Display those account having the balance less than 1000\r\n"
					+ "6.Exit");
		    a = sc.nextInt();
		    switch(a) {
		    case 1: accser.addAccount(new Account(sc.nextInt(),sc.next(),sc.nextLong()));
		    break;
		    case 2: accser.removeAccount(sc.nextInt());
		    break;
		    case 3: System.out.println(accser.displayall());
		    break;
		    case 4:System.out.println(accser.displaybyaccnum(sc.nextInt()));
		    break;
		    case 5:System.out.println(accser.balance());
		    break;	
		    }
			
		}while(a!=6);
	}

}
