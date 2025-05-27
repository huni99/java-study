package homework.homework01;

public class Food extends Product{
	private int expirationDays;
	
	Food(){}
	Food(String name , int price, int expirationDays){
		super(name,price);
		this.expirationDays=expirationDays;
	}
	public int getExpirationDays(){
		return expirationDays;
	}
	public int calucateDiscountRate() {
		if(expirationDays<=1) {
			return (int)(super.getPrice()*0.2);
		}else if(expirationDays<=5) {
			return (int)(super.getPrice()*0.5);
		}else if(expirationDays<=8) {
			return (int)(super.getPrice()*0.8);
		}
		return super.getPrice();
	
	}
	public int calculatePrice() {
		return calucateDiscountRate();
	}
}
