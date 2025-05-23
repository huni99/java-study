package homework.object6;

public class Bank {

	Bank(){
		System.out.println("은행 객체 생성");
	}
	public void transfer(Account sender,Account receiver, int amount ) {
		sender.withdraw(amount);
		receiver.deposit(amount);
		System.out.println(sender.getAccountNumber()+"에서" + receiver.getAccountNumber()+"으로 "+amount+"원 송금");
	}
}
