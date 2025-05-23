package homework.object6;

public class Main {
	public static void main(String[] args) {
		Account a =new Account("123-456-789",100000);
		Account b =new Account("987-654-321",50000);
		a.withdraw(30000);
		b.deposit(100000);
		
		Bank bank = new Bank();
		bank.transfer(a, b, 50000);
		System.out.println(a.getBalance());
		System.out.println(b.getBalance());
	
		
	}
}
