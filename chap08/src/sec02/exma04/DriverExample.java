package sec02.exma04;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver= new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(taxi);
		driver.drive(bus);
	}
}
