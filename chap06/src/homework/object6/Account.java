package homework.object6;

public class Account {
	private String accountNumber;
	private int balance;
	
	
	public Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		System.out.println("계좌번호가" + accountNumber+"이고,"+ " 잔액이 "+balance+
				"원인 계좌 생성");
	}
	public Account() {
	}
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	public int getBalance() {
		return this.balance;
	}
	public void deposit(int amount) {
		this.balance+=amount;
		System.out.println(this.accountNumber+" 계좌에"+amount+"원 입금");
	}
	public void withdraw(int amount) {
		this.balance-=amount;
		System.out.println(this.accountNumber+" 계좌에서"+amount+"원 출금");
	}
	
	
	
}
