package sec02.exam06.quiz;

public class Account {
	private String user;
	private long balance;
	
	public Account () {
		
	}
	public Account (String user , long balance) {
		this.user = user;
		this.balance= balance;
	}
	public long getBalance() {
		return balance;
	}
	public void deposit (int amount) {
	this.balance +=amount;
	System.out.println(amount+"원이 입금되었습니다."+"[잔액: "+this.balance+"원]");
	}
	public void withdraw(int amount) throws InsufficientBalanceException {
	if(amount>this.balance) {
		throw new InsufficientBalanceException("잔액이 "+(amount-this.balance)+"원 부족합니다.") ;
	}
	this.balance-=amount;
	System.out.println(amount+"원이 출금되었습니다."+"[잔액: "+this.balance+"원]");
	
}

}