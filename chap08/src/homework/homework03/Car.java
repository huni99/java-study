package homework.homework03;

public class Car {
	private Engine engine;
	
	Car(Engine engine){
		this.engine=engine;
	}
	public void startEngine() {
		engine.start();
	}
}
