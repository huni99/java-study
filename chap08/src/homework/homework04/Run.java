package homework.homework04;

public class Run {
	public static void main(String[] args) {
		SmartPhone[] smt = new SmartPhone[2];
		smt[0]=new GalaxyS24();
		smt[1]= new Iphone15();
		GalaxyS24 tt= new GalaxyS24();
		tt.name="dd";
		for(SmartPhone sm : smt) {
			sm.printMaker();
			sm.makeCall();
			sm.takeCall();
			sm.charge();
			sm.touch();
			sm.picture();
			
		}
		
	}
}
