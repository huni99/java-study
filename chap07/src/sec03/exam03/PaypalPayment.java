package sec03.exam03;
//자식 클래스 : 페이팔 결제
public class PaypalPayment extends PaymentService {
	@Override
	public void pay(int amount) {
		System.out.println("Paypal 결제 선택됨");
		System.out.println("Paypal 서버 연결 요청중 ...");
		System.out.println("Paypal" + amount +"원 결제 완료");
	}
}
