package homework.homework02;

public class ChocolateController {
	private Chocolate c = new Chocolate();
	
	public String bakeChocolateCake(double flour, double cream , int cherry, int ship) {
		c= new Chocolate(flour, cream, cherry, ship);
		return c.toString();
	}
}
